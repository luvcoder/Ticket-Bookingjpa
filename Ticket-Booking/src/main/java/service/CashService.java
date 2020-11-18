package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class CashService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> payment(Map<String, Object> cash) {
        Map<String, Object> cashMap = jdbcTemplate.queryForMap("insert into Cash(amount,notenumber,denomination) values(?,?,?)",
                Integer.parseInt((String) cash.get("amount")),
                Integer.parseInt((String) cash.get("notenumber")),
                Integer.parseInt((String) cash.get("denomination")));
        //cash.get("status",cashMap.get("status"));
        return cash;
    }
}

