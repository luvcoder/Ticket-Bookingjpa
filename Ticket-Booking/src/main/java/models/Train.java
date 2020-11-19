package models;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.Map;
import java.util.HashMap;
@RequiredArgsConstructor
@Getter
@Setter
public class Train {
    private int trainID;
    private String trainName;
    private Map<Station,Double>trainStationsWithFares;
    public Train(int ID,String trainName,Station[] stations) {
        trainStationsWithFares = new HashMap<Station, Double>();
        for (Station s : stations) trainStationsWithFares.put(s, (0.0));
    }
}