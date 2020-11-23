package com.areteans.TicketBooking.service;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class TicketDeleteService {
    private final JdbcTemplate jdbcTemplatedeletion;
    public  void deleteTicket(Integer ticketid) {
        jdbcTemplatedeletion.update("Delete from ticket where ticketid=?", ticketid);
    }
    public void deleteCommonService(Integer passengerid) {
        jdbcTemplatedeletion.update("Delete from passengers where passengerid=?", passengerid);
    }


}
