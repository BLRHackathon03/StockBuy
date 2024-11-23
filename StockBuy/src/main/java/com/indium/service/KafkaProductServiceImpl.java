package com.indium.service;

import com.indium.model.StockUpdateRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProductServiceImpl implements KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, StockUpdateRequestDTO> kafkaTemplate;

    private static final String TOPIC = "stock-events-t2";

    @Override
    public void updateStock(StockUpdateRequestDTO stockUpdateRequestDTO) {
        kafkaTemplate.send(TOPIC, stockUpdateRequestDTO);
    }
}
