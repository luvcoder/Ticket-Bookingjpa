package models;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
@Getter
@Setter
@RequiredArgsConstructor
public class Card {
    private String cardholderName;
    private long cardNo;
    private int cvv;
    private int amount;
}
