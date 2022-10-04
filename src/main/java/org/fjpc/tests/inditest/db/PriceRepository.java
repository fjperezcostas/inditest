package org.fjpc.tests.inditest.db;

import org.fjpc.tests.inditest.domains.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query(value = "SELECT p FROM Price p WHERE p.brand.id = :brand AND p.product.id = :product AND :date BETWEEN p.startDate AND p.endDate ORDER BY p.priority DESC")
    List<Price> findAllApplicablePricesOrderedByPriority(@Param("brand") Long brand, @Param("product") Long product, @Param("date") Date date);

}
