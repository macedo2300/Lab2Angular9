package com.br.crud.pibape.service;

import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PolicyService {

    Policy findByName(String name);

    Policy createOrUpdate(Policy policy);

    Optional<Policy> findById(String id);

    void delete(String id);

    List<Policy> findAll();

    Page<Policy> findAll(Pageable pageable);
}
