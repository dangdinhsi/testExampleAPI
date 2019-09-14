package com.siddd00474.service;

import com.siddd00474.entity.Market;
import com.siddd00474.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MarketService {
    @Autowired
    private MarketRepository marketRepository;
    //them
    public Market register(Market market){
        market.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        market.setStatus(1);
        marketRepository.save(market);
        return market;
    }
    //list
    public List<Market> getList(){
        return marketRepository.findAllByStatus(1);
    }
    //detail

    public List<Market> getByName(String name){
        return marketRepository.findAllByNameAndStatus(name,1);
    }

}
