package controller;
import models.Card;
import service.CardService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.Map;
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "card")
public class CardController {
    private final CardService cardService;
    private models.Card Card;
    @PostMapping(path = "paid", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> payment(@RequestBody Map<String, Object> Card){
        return cardService.payment(Card);
    }
    @PostMapping(path = "paid/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Card payment(@RequestBody Card card) {return Card; }
}

