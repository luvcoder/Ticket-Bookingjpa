package com.areteans.TicketBooking.service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class StationService {
    private final JdbcTemplate jdbcTemplate;
    public Map<String, Object> save(Map<String, Object> station) {
        Map<String, Object> sMap = jdbcTemplate.queryForMap("insert into station(stationID,stationName) values(?,?) RETURNING stationID",
                station.get("stationID"),
                Integer.parseInt((String) station.get("stationName")));
        station.put("stationID", sMap.get("stationID"));
        return station;
    }
}

