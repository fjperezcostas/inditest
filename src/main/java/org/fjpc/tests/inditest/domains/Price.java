package org.fjpc.tests.inditest.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PRICES")
@Data
public class Price {
    @Id
    private Long priceList;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Product product;
    private Integer priority;
    private Float price;
    private String curr;
}
