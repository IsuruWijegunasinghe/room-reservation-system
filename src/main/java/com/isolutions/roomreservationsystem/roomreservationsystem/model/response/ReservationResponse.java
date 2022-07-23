package com.isolutions.roomreservationsystem.roomreservationsystem.model.response;

import lombok.Data;

@Data
public class ReservationResponse {
    private int id;
    private int roomNumber;
    private double price;
    private String link;
}
