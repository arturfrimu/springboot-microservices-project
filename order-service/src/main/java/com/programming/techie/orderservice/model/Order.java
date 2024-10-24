package com.programming.techie.orderservice.model;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class Order {
    private Long id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItems;
}