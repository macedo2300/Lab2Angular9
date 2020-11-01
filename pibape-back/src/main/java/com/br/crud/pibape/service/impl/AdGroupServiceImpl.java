package com.br.crud.pibape.service.impl;

import com.br.crud.pibape.entity.AdGroup;
import com.br.crud.pibape.repositoty.AdGroupRepository;
import com.br.crud.pibape.service.AdGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdGroupServiceImpl implements AdGroupService {

    @Autowired
    private AdGroupRepository adGroupRepository;

    @Override
    public AdGroup findByNome(String nome) {
        return this.adGroupRepository.findByNome(nome);
    }

    @Override
    public AdGroup findByDistinquinteName(String distinquinteName) {
        return this.adGroupRepository.findByDistinquinteName(distinquinteName);
    }

    @Override
    public AdGroup createOrUpdate(AdGroup adGroup) {
        return this.adGroupRepository.save(adGroup);
    }

    @Override
    public Optional<AdGroup> findById(String id) {
        return this.adGroupRepository.findById(id);
    }

    @Override
    public void delete(AdGroup adGroup) {
            this.adGroupRepository.delete(adGroup);
    }

    @Override
    public List<AdGroup> findAll() {
        return this.adGroupRepository.findAll();
    }

    @Override
    public Page<AdGroup> findAll(Pageable pageable) {
        return this.adGroupRepository.findAll(pageable);
    }
}
