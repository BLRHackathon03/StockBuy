package com.indium.service;

import com.indium.model.StockUpdateRequestDTO;

public interface KafkaProducerService {

    public void updateStock(StockUpdateRequestDTO stockUpdateRequestDTO);
}
