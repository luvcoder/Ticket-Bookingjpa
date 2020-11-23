package com.areteans.TicketBooking.models;
import com.areteans.TicketBooking.enums.PassengerType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class General extends Passenger {
    public General(String name, int age, String address, int idCard, Long contact) {
        super(name, age, address, idCard, contact, PassengerType.GENERAL);
    }
}
       /* public General(String name,int age, String address,int idCard,long contact ){
            this.setName(name);
            this.setAge(age);
            this.setContact(contact);
            this.setAddress(address);
            this.setIdCard(idCard);
        }
        @Override
        public com.areteans.TicketBooking.enums.PassengerType getPassengerType() {return  PassengerType.GENERAL;}
    }*/

