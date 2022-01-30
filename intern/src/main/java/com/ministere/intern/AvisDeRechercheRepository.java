package com.ministere.intern;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvisDeRechercheRepository extends JpaRepository<AvisDeRecherche,Integer> {
    List<AvisDeRecherche> findByCin(String cin);

}
