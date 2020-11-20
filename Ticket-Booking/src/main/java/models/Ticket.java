package models;
import enums.PassengerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private long ticketID;
    private  String status;
    private long trainID;
    private long stationID_D;
    private long sationID_A;
    private int berthnumber;
    private int DepartureTime;
}
