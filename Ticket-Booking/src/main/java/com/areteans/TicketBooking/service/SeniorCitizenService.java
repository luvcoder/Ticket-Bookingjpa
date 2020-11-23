package com.areteans.TicketBooking.service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class SeniorCitizenService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> save(Map<String, Object> seniorcitizen) {
        Map<String, Object> scMap = jdbcTemplate.queryForMap("insert into SeniorCitizen(idCard,name,age,address,contact) values(?,?,?,?,?) RETURNING passengerID",
                Long.parseLong((String) seniorcitizen.get("idCard")),
                seniorcitizen.get("name"),
                Integer.parseInt((String) seniorcitizen.get("age")),
                seniorcitizen.get("address"),
                Long.parseLong((String) seniorcitizen.get("contact")));
        seniorcitizen.put("passengerID", scMap.get("passengerID"));
        return seniorcitizen;
    }
}