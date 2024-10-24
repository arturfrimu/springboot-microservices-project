package com.programming.techie.orderservice.model;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class OrderLineItems {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}