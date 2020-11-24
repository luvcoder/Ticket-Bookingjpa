package com.areteans.TicketBooking.controller;
import com.areteans.TicketBooking.service.TicketDetailsService;
import com.areteans.TicketBooking.service.TrainService;
import com.areteans.TicketBooking.models.TrainJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
@RestController

@RequestMapping(path = "enquire")
public class TicketDetailsController {
    private final TicketDetailsService ticketDetailsService;
    private final TrainService trainService;
    public TicketDetailsController (TicketDetailsService ticketDetailsService,TrainService trainService)
    {
        this.ticketDetailsService = ticketDetailsService;
        this.trainService= trainService;

    }
    @GetMapping(path = "ticket")
    public Map<String, Object> GetTicketAttributes(@RequestParam(value = "ticketID")Integer ticketID){
        return this.ticketDetailsService.TicketAttributes(ticketID);
    }

    @GetMapping(path = "trainDetails")
    public TrainJPA getTrainByID(@RequestParam(value = "TrainID") Long trainID) {
        String a;
        return trainService.getTrainByID(trainID);
    }
}