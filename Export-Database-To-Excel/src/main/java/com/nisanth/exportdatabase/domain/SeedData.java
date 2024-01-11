package com.nisanth.exportdatabase.domain;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component

public class SeedData
{
    private  CustomerRepository customerRepository;

    public SeedData(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }
    private List<Customer> customers= Arrays.asList(
            new Customer("Selvaraj","Nisanth","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Bommanapadi")),
            new Customer("Vijay","Sujith","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Bommanapadi")),
            new Customer("Ranaganthan","Kaaviyan","nisnathselva2004@gmail.com", new Address("Russia","TamilNadu","Padalur","North street,Padalur")),
            new Customer("Siva","Kesavan","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Cheetikulm")),
            new Customer("Modi","Jothi","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Nattarmanagalam")),
            new Customer("Sekar","Praveen","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,chennai")),
            new Customer("Balraju","Hari","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,agaram")),
            new Customer("Anand","Selva","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,agram")),
            new Customer("Sengamalai","pardeep","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,kovai")),
            new Customer("Veera","Sachin","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,mangoon")),
            new Customer("Jai","Sudhakar","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Bommanapadi")),
            new Customer("HariShankar","Neeraj","nisnathselva2004@gmail.com", new Address("India","TamilNadu","Perambalur","North street,Bommanapadi"))
            );
   // @PostConstruct
    public void saveCustomers()
    {
        // it is list so use saveALl
        customerRepository.saveAll(customers);
    }


}
