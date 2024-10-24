package com.programming.techie.model;

import lombok.*;
import lombok.experimental.FieldNameConstants;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class Inventory {
    private Long id;
    private String skuCode;
    private Integer stock;
}