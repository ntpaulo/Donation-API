package com.nt.apiajudars.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @GetMapping
    public ResponseEntity<List<Item>> listar() {
        List<Item> list = repository.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> buscarPeloId(@PathVariable(value = "id") Long id) {
        Item item = repository.findById(id).orElseThrow();

        return ResponseEntity.ok().body(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> atualizar(@RequestBody Item data, @PathVariable(value = "id") Long id) {
        Item item = repository.findById(id).orElseThrow();

        item.setNome(data.getNome());
        item.setQuantidade(data.getQuantidade());
        item.setCategoria(data.getCategoria());

        repository.save(item);

        return ResponseEntity.ok().body(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable(value = "id") Long id) {
        repository.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
