package com.siddd00474.repository;

import com.siddd00474.entity.Market;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarketRepository extends JpaRepository<Market,String> {
    List<Market> findAllByStatus(int status);
    List<Market> findAllByNameAndStatus(String name, int status);
}
