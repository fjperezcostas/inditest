package org.fjpc.tests.inditest.domains;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRANDS")
@Data
public class Brand {
    @Id
    private Long id;
    private String name;
}
