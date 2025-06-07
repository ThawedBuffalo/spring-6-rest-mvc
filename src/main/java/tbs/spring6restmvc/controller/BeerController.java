package tbs.spring6restmvc.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tbs.spring6restmvc.model.BeerStyle;

@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerStyle beerStyle;


}
