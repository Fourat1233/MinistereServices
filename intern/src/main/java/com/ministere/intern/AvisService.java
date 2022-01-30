package com.ministere.intern;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record AvisService(AvisDeRechercheRepository avisDeRechercheRepository) {
    public void register(AvisRegistrationRequest request) {
        AvisDeRecherche avisDeRecherche = AvisDeRecherche.builder().cin(request.cin())
                .date(request.date()).reason(request.reason()).build();

        avisDeRechercheRepository.save(avisDeRecherche);
    }

    public List<AvisDeRecherche> getAll() {
        return avisDeRechercheRepository.findAll();
    }


    public List<AvisDeRecherche> getByCin(String cin) {
        return avisDeRechercheRepository.findByCin(cin);
    }
}
