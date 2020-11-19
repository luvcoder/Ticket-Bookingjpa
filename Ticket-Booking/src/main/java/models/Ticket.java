package models;
import enums.PassengerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Ticket {
    private int ticketID;
    private  String status;
    private int trainID;
    private int stationID_D;
    private int sationID_A;
    private int berthnumber;
    private int DepartureTime;
}
