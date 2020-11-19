package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class TrainService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> save(Map<String, Object> train) {
        Map<String, Object> trMap = jdbcTemplate.queryForMap("insert into train(trainID,trainName) values(?,?) RETURNING trainID",
                Integer.parseInt((String) train.get("trainID")),
                Integer.parseInt((String) train.get("trainID")));
        train.put("ticketID", trMap.get("ticketID"));
        return train;
    }
}
