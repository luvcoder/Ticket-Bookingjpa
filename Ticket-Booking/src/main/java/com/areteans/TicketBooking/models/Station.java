package com.areteans.TicketBooking.models;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RequiredArgsConstructor
public class Station {
    private String stationName;
    private int stationID;
}