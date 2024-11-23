package com.indium.controller;

//import com.indium.model.Stock;
import com.indium.model.Stock;
import com.indium.model.StockUpdateRequestDTO;
import com.indium.service.KafkaProducerService;
import com.indium.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
@Slf4j
public class StockController {


    KafkaProducerService kafkaProducerService;
    private static final Logger log = LoggerFactory.getLogger(StockController.class);
    @Autowired
    private StockService stockService;

    @PostMapping("/buy/{stockId}")
    public Stock buyStock(@PathVariable Long stockId, @RequestParam int qty) {
//        log.info("stock buy order placed");
//
//        return "Stock has been bought with quantity "+ qty;
////                stockService.buyStock(id, quantity);
        log.info("stock buy order placed with stockId "+stockId  +" with quantity "+ qty);


        kafkaProducerService.updateStock(new StockUpdateRequestDTO());
        return findStockById(qty);
    }

    private Stock findStockById(int id) {
        Stock stock1 = new Stock();
        stock1.setStockId(101);
        stock1.setStockName("101");

        return stock1;
    }
}
