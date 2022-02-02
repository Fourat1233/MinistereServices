package com.ministere.intern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/avis")
public record AvisDeRechercheController(AvisService avisService) {
    @PostMapping
    public void registerAvis(@RequestBody AvisRegistrationRequest avisRegistrationRequest){
        log.info("nouveau avis de recherche {}",avisRegistrationRequest);
        avisService.register(avisRegistrationRequest);
    }
    //@CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping
    public List<AvisDeRecherche> getAvis(){
       // log.info("nouveau avis de recherche {}",avisRegistrationRequest);
        return avisService.getAll();
    }
    //@CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "{cin}")
    public List<AvisDeRecherche> getAvis(
            @PathVariable("cin") String cin) {
        return avisService.getByCin(cin);
    }
}
