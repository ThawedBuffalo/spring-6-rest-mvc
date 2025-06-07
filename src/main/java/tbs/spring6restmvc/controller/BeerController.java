package tbs.spring6restmvc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import tbs.spring6restmvc.model.Beer;
import tbs.spring6restmvc.services.BeerService;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("Get Beer by ID- in controller...");
        return beerService.getBeerById(id);
    }

}
