package com.br.crud.pibape.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trasaction {

    @Id
    private String id;

    @Indexed(unique = true)
    private String trasaction;
}
