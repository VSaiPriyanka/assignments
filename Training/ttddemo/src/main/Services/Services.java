package com.example.Models.Services;
import com.example.Models.Address;
import com.example.Models.Person;

public class Services {
    public boolean isAddressSet(Person p, Address addr){
        return p.getAddr().equals(addr)? true : false;
    }
    
}
