package com.guvi.onlineBusTicketBooking.dto;

import com.guvi.onlineBusTicketBooking.entities.Passenger;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

    private Long id;

    private String bookingId;

    private String bookingDate;

    private Passenger passenger;

    private String busName;

    private int fee;

    private LocalDate departureDate;


}
