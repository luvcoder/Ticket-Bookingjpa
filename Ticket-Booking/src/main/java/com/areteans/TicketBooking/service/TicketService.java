package com.areteans.TicketBooking.service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class TicketService {
    private final JdbcTemplate jdbcTemplateOfTicket;
    public Map<String, Object> save(Map<String, Object> ticket) {
        Map<String, Object> tiMap = jdbcTemplateOfTicket.queryForMap("insert into ticket(ticketID,status,trainID,stationID_D,stationID_A,berthnumber,DepartureTime) values(?,?,?,?,?,?,?) RETURNING ticketID",
                Integer.parseInt((String) ticket.get("ticketID")),
                Integer.parseInt((String) ticket.get("trainID")),
                Integer.parseInt((String) ticket.get("stationD_D")),
                Integer.parseInt((String) ticket.get("stationD_A")),
                Integer.parseInt((String) ticket.get("berthnumber")),
                Integer.parseInt((String) ticket.get("DepartureTime")));
                 ticket.put("ticketID" ,tiMap.get("ticketID"));
                  return ticket;
    }
}
