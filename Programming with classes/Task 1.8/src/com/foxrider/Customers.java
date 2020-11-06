package com.foxrider;

import java.util.Arrays;
import java.util.Comparator;

public class Customers {
    Customer [] customers;

    Customers(Customer ...cus){
        customers = cus.clone();
    }

    public void printSortedByLastName (){
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });

        for (var customer :
                customers) {
            System.out.println(customer);
        }

    }
    public void printInRangeCreditCard(long beg, long end)throws Exception{
        if(beg>end)throw new Exception("Begin value should be lesser than End value");
        for (var customer :
                customers) {
            if(customer.getCreditCard()>beg && customer.getCreditCard()<end){
                System.out.println(customer);
            }
        }
    }

}
