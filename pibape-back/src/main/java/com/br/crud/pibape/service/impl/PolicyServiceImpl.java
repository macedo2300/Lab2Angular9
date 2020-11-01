package com.br.crud.pibape.service.impl;


import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.repositoty.PolicyRepository;
import com.br.crud.pibape.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;


    @Override
    public Policy findByName(String name) {
        return this.policyRepository.findByName(name);
    }

    @Override
    public Policy createOrUpdate(Policy policy) {
        return this.policyRepository.save(policy);
    }

    @Override
    public Optional<Policy> findById(String id) {
        return this.policyRepository.findById(id);
    }

    @Override
    public void delete(String id) {
        Optional<Policy> policy = this.policyRepository.findById(id);

         if(policy.isPresent()){
             this.policyRepository.delete(policy.get());
         }
    }

    @Override
    public List<Policy> findAll() {
        return null;
    }

    @Override
    public Page<Policy> findAll(Pageable pageable) {
        return null;
    }
}
