package com.br.crud.pibape.controller;


import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/policies")
@CrossOrigin("http://localhost:4200")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Policy save(@RequestBody @Valid  Policy policy){
        return this.policyService.createOrUpdate(policy);
    }


    @GetMapping("{id}")
    public Policy obterPorId(@PathVariable String id){
        return this.policyService
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        this.policyService
                .findById(id)
                .map(policy -> {
                    this.policyService.delete(policy.getId());
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualiza(@PathVariable String id, @RequestBody Policy policyAtualizada) {
        this.policyService
                .findById(id)
                .map(policy -> {
                    policyAtualizada.setId(policy.getId());
                    return this.policyService.createOrUpdate(policyAtualizada);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


}
