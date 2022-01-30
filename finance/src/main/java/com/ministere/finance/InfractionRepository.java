package com.ministere.finance;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InfractionRepository extends JpaRepository<Infraction,Integer> {
    List<Infraction> findByCin(String cin);
}
