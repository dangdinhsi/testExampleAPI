package com.siddd00474.service;

import com.siddd00474.entity.Coin;
import com.siddd00474.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class CoinService {
    @Autowired
    CoinRepository coinRepository;
    //xem list coin
    public List<Coin> getList(){
        return coinRepository.findAllByStatus(1);
    }

    //them moi coin
    public Coin register(Coin coin){
        coin.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setStatus(1);
        coinRepository.save(coin);
        return coin;
    }

    // tim theo ten
    public List<Coin> getListByName(String name){
        return coinRepository.findAllByName(name);
    }

}
