package com.ministere.intern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AvisDeRecherche {
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
    private String reason ;
    private String date ;

}
