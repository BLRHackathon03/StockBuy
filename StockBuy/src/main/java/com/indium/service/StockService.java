package com.indium.service;


import com.indium.model.StockUpdateRequestDTO;
import com.indium.model.StockUpdateResponseDO;

public interface StockService {
    public StockUpdateResponseDO updateStatus(StockUpdateRequestDTO stockUpdateRequest);

}
