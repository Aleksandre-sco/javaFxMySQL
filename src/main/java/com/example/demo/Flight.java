package com.example.demo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Flight {

    private String city;
    private String date;
    private int seats;
    private int price;

}
