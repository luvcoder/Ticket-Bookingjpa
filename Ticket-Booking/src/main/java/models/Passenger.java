package models;
import enums.PassengerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public abstract class Passenger {
    private String name;
    private  int age;
    private String address;
    private int idCard;
    private long contact;
    private PassengerType PassengerType;
   /* public String getAddress(){return  address;}
    public void setAddress(String address){this.address=address;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getIdCard(){return  idCard;}
    public void setIdCard(int idCard){this.idCard=idCard;}
    public long getContact(){return  contact;}
    public void setContact(long contact){this.contact=contact;}
    public int getAge(){return  age;}
    public void setAge(int age){this.age=age;}
    public abstract PassengerType getPassengerType();*/
}
