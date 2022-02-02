package com.ministere.finance;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/infraction")
@AllArgsConstructor

public class InfractionController {

    private final InfractionService infractionService;

   // @CrossOrigin(origins = "http://localhost:3000/")

    @GetMapping
    public List<Infraction> getAvis(){
        // log.info("nouveau avis de recherche {}",avisRegistrationRequest);
        return infractionService.getAll();
    }
    //@CrossOrigin(origins = "http://localhost:3000/")

    @GetMapping(path = "{cin}")
    public List<Infraction> getAvis(
            @PathVariable("cin") String cin) {
        return infractionService.getByCin(cin);
    }
}
