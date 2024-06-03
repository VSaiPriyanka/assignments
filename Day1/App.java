package com.example;

import com.example.Models.Address;
import com.example.Models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address studentAddr = new Address();
        String city;
        studentAddr.setCity(city:"Hyderabad");
        String country;
        studentAddr.setCountry(country:"India");
        int postalcode;
        studentAddr.setPostalcode(postalcode:248112);
        String state;
        studentAddr.setState(state : "Uk");

        Student s = new Student();
        s.setAddr(studentAddr);

        System.out.println( s.getAddr() );
    }
}
