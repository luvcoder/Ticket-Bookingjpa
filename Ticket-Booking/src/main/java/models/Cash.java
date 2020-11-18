package models;
import enums.Denomination;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Cash {
    private int amount;
    private  int noteNumber;
    private Denomination Denomination;
}
