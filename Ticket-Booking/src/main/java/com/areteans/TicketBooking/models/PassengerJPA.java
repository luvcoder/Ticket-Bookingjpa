package com.areteans.TicketBooking.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Table(name = "passenger")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private  int age;
    private String address;
    private long idCard;
    private long contact;
}
