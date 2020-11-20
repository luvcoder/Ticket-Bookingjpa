package controller;
import service.TicketDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "Delete")
public class TicketDeleteController {
    private final TicketDeleteService ticketDeleteService;
    @DeleteMapping(value = "ticket")
    public void TicketDelete(@PathVariable("ticketID") Integer ticketID){
        ticketDeleteService.DeleteTicket(ticketID);
    }
    @DeleteMapping(path = "passenger")
    public Map<String, Object> PassengerDelete(@RequestParam(value = "passenger_id")Integer passenger_id){
        return this.ticketDeleteService.DeleteCommonService(passenger_id);
    }
}
