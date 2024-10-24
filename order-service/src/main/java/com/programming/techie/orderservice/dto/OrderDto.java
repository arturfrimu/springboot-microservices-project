package com.programming.techie.orderservice.dto;

import com.programming.techie.orderservice.model.OrderLineItems;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class OrderDto {
    private List<OrderLineItems> orderLineItemsList;
}