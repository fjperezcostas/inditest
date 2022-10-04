package org.fjpc.tests.inditest.rest;

import org.fjpc.tests.inditest.consts.Server;
import org.fjpc.tests.inditest.domains.Price;
import org.fjpc.tests.inditest.rest.dto.ApplicablePriceDto;
import org.fjpc.tests.inditest.services.PriceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class PriceController {

    private PriceService priceService;

    public PriceController( PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/v1/prices")
    public ApplicablePriceDto getPrice(@RequestParam Long brand, @RequestParam Long product, @RequestParam @DateTimeFormat(pattern = Server.DATE_TIME_FORMAT) Date date) {
        Price price = priceService.getApplicablePrice(brand, product, date);
        return ApplicablePriceDto.builder()
                .brandId(price.getBrand().getId())
                .productId(price.getProduct().getId())
                .priceId(price.getPriceList())
                .price(price.getPrice())
                .date(new SimpleDateFormat(Server.DATE_TIME_FORMAT).format(date))
                .build();
    }

}
