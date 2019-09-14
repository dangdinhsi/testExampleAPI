package com.siddd00474.repository;

import com.siddd00474.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoinRepository extends JpaRepository<Coin,Long> {
    List<Coin> findAllByStatus(int status);
   List<Coin> findAllByName(String name);
}
