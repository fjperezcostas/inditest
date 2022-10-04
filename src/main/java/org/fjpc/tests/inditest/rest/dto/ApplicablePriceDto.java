package org.fjpc.tests.inditest.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicablePriceDto {
    private Long priceId;
    private Long brandId;
    private Long productId;
    private Float price;
    private String date;
}
