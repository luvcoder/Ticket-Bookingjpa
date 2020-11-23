package com.areteans.TicketBooking.models;
import com.areteans.TicketBooking.enums.PassengerType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Child extends Passenger {
    private static  int maxAge;
    static{maxAge=12;}
    private String guardian;
    public Child(String name, int age, String address, int idCard,Long contact) {
        super(name, age, address,idCard,contact,PassengerType.CHILD);
        this.guardian=guardian;
    }
}
  /*  public Child(String name,int age,String address,int idCard,long contact){
        this.setName(name);
        this.setAge(age);
        this.setContact(contact);
        this.setAddress(address);
        this.setIdCard(idCard);
        this.guardian=guardian;
    }
    public String getGuardian(){return guardian;}
    public void setGuardian(String guardian){this.guardian=guardian;}
    @Override
    public PassengerType getPassengerType(){return PassengerType.CHILD;}
    public void evaluate(int age) {
        if (age > maxAge)
            System.out.println("Book general or senior citizen ticket.");
    }
}*/
