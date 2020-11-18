package controller;
import models.Cash;
import service.CashService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "cash")
public class CashController {
    private final CashService cashService;
    private models.Cash Cash;
    @PostMapping(path = "paid", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createPassenger(@RequestBody Map<String, Object> cash) {
        return cashService.payment(cash);
    }
    @PostMapping(path = "create/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cash payment(@RequestBody Cash cash) { return Cash; }
}