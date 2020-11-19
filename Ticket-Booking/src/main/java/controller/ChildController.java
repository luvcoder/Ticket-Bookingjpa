package controller;
import org.springframework.web.bind.annotation.*;
import service.ChildService;
import models.Passenger;
import org.springframework.http.MediaType;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "child")
public class ChildController {
    private final ChildService childService;
    private Object Child;
    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> savePassenger(@RequestBody Map<String, Object> Passenger){ return childService.save(Passenger);}
    @PostMapping(path = "create/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Passenger createPassenger(@RequestBody Passenger passenger) {return passenger; }
    @PutMapping(path="update",consumes=MediaType.APPLICATION_JSON_VALUE)
    public Passenger updatePassenger(@RequestBody Passenger passenger){return passenger;}
}

