package com.br.crud.pibape.repositoty;

import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolicyRepository extends MongoRepository<Policy, String > {

    Policy findByName(String name);
}
