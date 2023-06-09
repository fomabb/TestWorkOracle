package com.kirilyuk.test_work_oracle.dto;

import java.util.Objects;

public class QuantityUpdateDTO {

    private Long id;

    private int quantity;

    public QuantityUpdateDTO() {
    }

    public QuantityUpdateDTO(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "QuantityUpdate{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityUpdateDTO that = (QuantityUpdateDTO) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }
}
