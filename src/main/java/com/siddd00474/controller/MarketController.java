package com.siddd00474.controller;

import com.siddd00474.entity.JsonResponse;
import com.siddd00474.entity.Market;
import com.siddd00474.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/markets")
public class MarketController {
    @Autowired
    private MarketService marketService;

    //Them market
    @PostMapping()
    public ResponseEntity<Object> addMarket(@RequestBody Market market){
        return new ResponseEntity<>(new JsonResponse()
                .setData(marketService.register(market))
                .setMessage("save success!!")
                .setStatus(HttpStatus.CREATED.value())
                ,HttpStatus.CREATED);
    }
    //list market
    @GetMapping()
    public ResponseEntity<Object> listMarket(){
        return new ResponseEntity<>(new JsonResponse()
                .setData(marketService.getList())
                .setMessage("get list success!")
                .setStatus(HttpStatus.OK.value())
                ,HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{name}")
    public ResponseEntity<Object> listByName(@PathVariable String name){
        return new ResponseEntity<>(new JsonResponse()
                .setData(marketService.getByName(name))
                .setMessage("get list theo detail ok")
                .setStatus(HttpStatus.OK.value())
        ,HttpStatus.OK);
    }
}
