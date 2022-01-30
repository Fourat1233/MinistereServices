package com.ministere.finance;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InfractionService {
    private final InfractionRepository infractionRepo ;






    public List<Infraction> getAll() {
        return infractionRepo.findAll();
    }

    public List<Infraction> getByCin(String cin) {
        return infractionRepo.findByCin(cin);
    }
}
