package com.nisanth.exportdatabase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private String firstName;
    private String email;
    @Embedded
    private Address address;

    public Customer(String lastName, String firstName, String email, Address address)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.address = address;
    }
}
