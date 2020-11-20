package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class TicketDetailsService {
    private final JdbcTemplate jdbctemplateTicketDet;
    public Map<String, Object> TicketAttributes(Integer ticket_id) {
        return jdbctemplateTicketDet.queryForMap("select * from ticket where ticket_id=?", ticket_id);
    }
}
