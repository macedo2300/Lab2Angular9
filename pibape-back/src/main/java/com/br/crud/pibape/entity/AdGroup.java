package com.br.crud.pibape.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdGroup {

    @Id
    private String id;

    @Indexed(unique = true)
    @NotBlank(message = "Nome é requerido")
    private String nome;

    @Indexed(unique = true)
    @NotBlank(message = "DistinquinteName é requerido")
    private String distinquinteName;


}
