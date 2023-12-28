package com.hcl.Customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
public class Customer {

    @Id
    private int custId;
    private String custName;
    private String custAdr;
    private long custnum;

    public Customer() {
    }


    public void SetCustadd(String S) {
     custAdr=S;
    }
}
