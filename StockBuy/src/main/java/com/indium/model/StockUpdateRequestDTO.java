package com.indium.model;

import lombok.Data;

@Data
public class StockUpdateRequestDTO {
    private String stockAlias;
    private Double stockPrice;
    private Integer stockQuantity;
}