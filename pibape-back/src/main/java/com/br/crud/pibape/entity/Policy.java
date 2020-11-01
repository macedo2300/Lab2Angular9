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
public class Policy {

    @Id
    private String id;

    @Indexed(unique = true)
    @NotBlank(message = "Nome é requerido")
    private String name;

    @Indexed(unique = true)
    private String idGroup;

    @Indexed(unique = true)
    private String descripition;

    @Indexed(unique = true)
    private String transection;


}
