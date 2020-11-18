package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class CardService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> payment(Map<String, Object> card) {
        Map<String, Object> cardMap = jdbcTemplate.queryForMap("insert into Card(cardholderName,cardNo,cvv,amount) values(?,?,?,?)RETURNING status",
                card.get("cardholderName"),
                Long.parseLong((String) card.get("cardNo")),
                Integer.parseInt((String) card.get("cvv")),
                Integer.parseInt((String) card.get("amount")));
       // card.get("status",cardMap.get("status"));
        return card;
    }
}
