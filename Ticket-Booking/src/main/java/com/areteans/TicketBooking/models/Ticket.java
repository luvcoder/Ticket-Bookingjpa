package com.areteans.TicketBooking.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time;
@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private long ticketID;
    private  String status;
    private long trainID;
    private long stationID_D;
    private long stationID_A;
    private int berthnumber;
    Time DepartureTime;
}
