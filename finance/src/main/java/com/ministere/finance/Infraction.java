package com.ministere.finance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Infraction {

    @Id
    @SequenceGenerator(
            name = "AvisDeRecherche_id_sequence",
            sequenceName = "AvisDeRecherche_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "AvisDeRecherche_id_sequence")
    private Integer id ;
    private String cin ;
    private String violation ;
    private int montant ;
}
