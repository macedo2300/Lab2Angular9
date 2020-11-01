package com.br.crud.pibape.repositoty;

import com.br.crud.pibape.entity.Trasaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrasactoinRepository extends MongoRepository<Trasaction, String> {

    Trasaction findByTrasaction(String name);
}
