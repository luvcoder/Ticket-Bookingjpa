package controller;
import service.ChildService;
import models.Passenger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "child")
public class ChildController {
    private final ChildService childService;
    private Object Child;

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> savePassenger(@RequestBody Map<String, Object> Passenger){
   return childService.createPassenger(Passenger);
}
    @PostMapping(path = "create/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Passenger createPassenger(@RequestBody Passenger passenger) {return passenger; }
}

