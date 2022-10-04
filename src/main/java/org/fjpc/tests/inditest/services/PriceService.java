package org.fjpc.tests.inditest.services;

import org.fjpc.tests.inditest.db.PriceRepository;
import org.fjpc.tests.inditest.domains.Price;
import org.fjpc.tests.inditest.exceptions.ApplicablePriceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PriceService {

    private PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public Price getApplicablePrice(Long brand, Long product, Date date) {
        List<Price> prices = priceRepository.findAllApplicablePricesOrderedByPriority(brand, product, date);
        if (prices.size() == 0) {
            throw new ApplicablePriceNotFoundException();
        }
        return prices.get(0);
    }

}
