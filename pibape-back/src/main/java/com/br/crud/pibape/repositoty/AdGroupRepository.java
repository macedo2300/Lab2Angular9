package com.br.crud.pibape.repositoty;

import com.br.crud.pibape.entity.AdGroup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdGroupRepository extends MongoRepository<AdGroup,String> {

    AdGroup findByNome(String nome);

    AdGroup findByDistinquinteName(String distinquinteName);


}
