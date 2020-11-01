package com.br.crud.pibape.service;

import com.br.crud.pibape.entity.AdGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AdGroupService {

    AdGroup findByNome(String name);

    AdGroup findByDistinquinteName(String distinquinteName);

    AdGroup createOrUpdate(AdGroup adGroup);

    Optional<AdGroup> findById(String id);

    void delete(AdGroup adGroup);

    List<AdGroup> findAll();

    Page<AdGroup> findAll(Pageable pageable);
}
