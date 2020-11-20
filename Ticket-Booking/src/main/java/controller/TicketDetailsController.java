/*package controller;
import service.TicketDetailsService;
import service.TrainDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "enquire")
public class TicketDetailsController {
    private final TicketDetailsService ticketDetailsService;
    private final TrainDetailsService trainDetailsService;
    @GetMapping(path = "ticket")
    public Map<String, Object> GetTicketAttributes(@RequestParam(value = "ticketID")Integer ticketID){
        return this.ticketDetailsService.TicketAttributes(ticketID);
    }
    @GetMapping(path = "train")
    public Map<String, Object> GetTrainDetails(@RequestParam(value = "trainID")String trainID
    ){
        return this.trainDetailsService.TrainAttributes(trainID);
    }
}*/
