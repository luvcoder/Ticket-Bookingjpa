package com.areteans.TicketBooking.service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class GeneralService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> save(Map<String, Object> general) {
        Map<String, Object> gMap = jdbcTemplate.queryForMap("insert into General(idCard,name,age,address,contact) values(?,?,?,?,?) RETURNING passengerID",
                Long.parseLong((String) general.get("idCard")),
                general.get("name"),
                Integer.parseInt((String) general.get("age")),
                general.get("address"),
                Long.parseLong((String) general.get("contact")));
        general.put("passengerID", gMap.get("passengerID"));
        return general;
    }
}