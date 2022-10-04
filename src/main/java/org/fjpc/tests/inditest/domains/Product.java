package org.fjpc.tests.inditest.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
@Data
public class Product {
    @Id
    private Long id;
    private String name;
}
