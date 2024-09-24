package com.guvi.onlineBusTicketBooking.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BusDto {
    private Long id;

    private String busName;

    private String fromLocation;

    private String toLocation;

    private int seats;

    private int availableSeats;

    private LocalDate departureDate;

    private int price;
}
