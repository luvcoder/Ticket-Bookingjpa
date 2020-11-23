package com.areteans.TicketBooking.service;
import com.areteans.TicketBooking.enums.PassengerType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
@RequiredArgsConstructor
public class CommonService {
    private final ChildService childService;
    private final SeniorCitizenService seniorCitizenService;
    private final GeneralService generalService;
    public Map<String, Object> save(Map<String, Object> Passenger) {
        switch (PassengerType.valueOf(String.valueOf(Passenger.get("PassengerType")))) {
            case CHILD:
                return childService.save(Passenger);
            case SENIOR_CITIZEN:
                return seniorCitizenService.save(Passenger);
            case GENERAL:
                return generalService.save(Passenger);
            default:
                return null;
        }
    }
}

