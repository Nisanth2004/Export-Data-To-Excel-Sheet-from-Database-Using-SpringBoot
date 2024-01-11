package com.nisanth.exportdatabase.domain;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService
{
    private final CustomerRepository customerRepository;

    // fetch customer from the database
    public List<Customer> exportCustomerToExcel(HttpServletResponse response) throws IOException
    {
        List<Customer> customers=customerRepository.findAll();
        ExcelExportUtils exportUtils=new ExcelExportUtils(customers);
        exportUtils.exportDataToExcel(response);
        return customers;
    }
}
