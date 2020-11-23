package com.areteans.TicketBooking.repository;
import com.areteans.TicketBooking.models.PassengerJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepository extends JpaRepository<PassengerJPA, Long> {
}
