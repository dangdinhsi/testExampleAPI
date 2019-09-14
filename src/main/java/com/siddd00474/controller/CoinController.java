package com.siddd00474.controller;

import com.siddd00474.entity.Coin;
import com.siddd00474.entity.JsonResponse;
import com.siddd00474.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/coins")
public class CoinController {
    @Autowired
    CoinService coinService;

    //them
    @PostMapping()
    public ResponseEntity<Object> addCoin(@RequestBody Coin coin){
        return new ResponseEntity<>(new JsonResponse().setData(coinService.register(coin)).setMessage("save ok").setStatus(HttpStatus.CREATED.value()),HttpStatus.CREATED);

    }
    //xem danh sach
    @GetMapping()
    public ResponseEntity<Object> listCoin(){
        return new ResponseEntity<>(new JsonResponse().setData(coinService.getList()).setMessage("get list ok").setStatus(HttpStatus.OK.value()),HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{name}")
    public ResponseEntity<Object> searchCoinByName(String name){
        return new ResponseEntity<>(new JsonResponse()
                .setMessage("detail ok")
                .setStatus(HttpStatus.OK.value())
                .setData(coinService.getListByName(name))
        ,HttpStatus.OK);
    }
}
