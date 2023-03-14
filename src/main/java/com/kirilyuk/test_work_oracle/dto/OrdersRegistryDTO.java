package com.kirilyuk.test_work_oracle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersRegistryDTO {

    private Long id;

    private int quantity;

    private double price;
}
