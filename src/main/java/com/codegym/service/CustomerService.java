package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Province;

public interface CustomerService extends GeneralService<Customer> {
Iterable<Customer> findAllByProvince(Province province);
}
