package com.example.demo.repository;
import com.example.demo.enums.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Menu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MenuRepo extends JpaRepository<Menu, Long>{
    @Query("SELECT m FROM Menu m JOIN m.composants c WHERE m.typeMenu = :typeMenu GROUP BY m HAVING SUM(c.prix) > :amount")
    List<Menu> findByTypeMenuAndTotalPriceGreaterThan(@Param("typeMenu") TypeMenu typeMenu, @Param("amount") double amount);

    @Query("SELECT m.libelleMenu FROM Menu m JOIN m.composants c WHERE m.typeMenu = :typeMenu GROUP BY m ORDER BY SUM(c.prix)")
    List<String> findMenuNamesByTypeMenuOrderByTotalPrice(@Param("typeMenu") TypeMenu typeMenu);
}
