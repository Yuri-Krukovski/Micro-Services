package com.example.stockclient.repository;

import com.example.stockclient.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    @Query(value = "select * from company order by latest_price desc limit 5", nativeQuery = true)
    List<Company>findTopFiveOrderByPrice();
}
