package service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class TicketDeleteService {
    private final JdbcTemplate jdbcTemplatedeletion;
    public  Map<String, Object> DeleteTicket(Integer ticketID) {
        return jdbcTemplatedeletion.queryForMap("Delete from ticket where ticketID=?", ticketID);
    }
    public Map<String, Object> DeleteCommonService(Integer passenger_id) {
        return jdbcTemplatedeletion.queryForMap("Delete from passengers where passenger_id=?", passenger_id);
    }

}