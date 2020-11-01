package com.br.crud.pibape.controller;

import com.br.crud.pibape.entity.Policy;
import com.br.crud.pibape.entity.Trasaction;
import com.br.crud.pibape.service.TrasactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/trasactions")
public class TrasactionController {

    @Autowired
    private TrasactionService trasactionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Trasaction cadastrar(@RequestBody Trasaction trasaction) {
        return this.trasactionService.createOrUpdate(trasaction);

    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Trasaction obterPorId(@PathVariable String id) {
        return this.trasactionService.findById(id)
                .orElseThrow(()->  new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        this.trasactionService
                .findById(id)
                .map(trasaction -> {
                    this.trasactionService.delete(trasaction);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualiza(@PathVariable String id, @RequestBody Trasaction trasactionAtualizada) {
        this.trasactionService
                .findById(id)
                .map(trasaction -> {
                    trasactionAtualizada.setId(trasaction.getId());
                    return this.trasactionService.createOrUpdate(trasactionAtualizada);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
