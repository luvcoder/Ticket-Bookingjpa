package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class TrainService {
    private final JdbcTemplate jdbcTemplate;
    public Map <String, Object> save(Map<String, Object> train ){
          jdbcTemplate.update("insert into train(trainID,trainName) values(?,?) ",
                Integer.parseInt((String) train.get("trainID")),
                 train.get("trainName"));
        return train;
    }
}
