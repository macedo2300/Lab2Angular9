package com.br.crud.pibape.controller;

import com.br.crud.pibape.entity.AdGroup;

import com.br.crud.pibape.service.AdGroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/adgroups")
public class AdGroupController {

    @Autowired
    private AdGroupService adGroupService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AdGroup cadastrar(@RequestBody @Valid AdGroup adGroup) {
        return this.adGroupService.createOrUpdate(adGroup);

    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public AdGroup obterPorId(@PathVariable String id) {
        return this.adGroupService.findById(id)
                .orElseThrow(()->  new ResponseStatusException(HttpStatus.NOT_FOUND,"Objeto não encontrato"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        this.adGroupService
                .findById(id)
                .map(adGroup -> {
                    this.adGroupService.delete(adGroup);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Objeto não encontrato"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualiza(@PathVariable String id, @RequestBody AdGroup adgroupAtualizada) {
        this.adGroupService
                .findById(id)
                .map(trasaction -> {
                    adgroupAtualizada.setId(trasaction.getId());
                    return this.adGroupService.createOrUpdate(adgroupAtualizada);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Objeto não encontrato"));
    }
}
