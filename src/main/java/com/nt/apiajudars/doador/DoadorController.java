<<<<<<< HEAD
package com.nt.apiajudars.doador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Doador")
public class DoadorController {

    @Autowired
    private DoadorRepository repository;

    @PostMapping
    public void criarDoador(@RequestBody DoadorRequestDTO data){
        Doador doadorData = new Doador(data);
        repository.save(doadorData);
    }


    @GetMapping
    public List<DoadorResponseDTO> gatAll(){
        List<DoadorResponseDTO> doadores = repository.findAll().stream().map(DoadorResponseDTO::new).collect(Collectors.toList());
        return doadores;
    }
}
=======
package com.nt.apiajudars.doador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doador")
public class DoadorController {

    @Autowired
    private DoadorRepository repository;

    @PostMapping
    public void criarDoador(@RequestBody DoadorRequestDTO data){
        Doador doadorData = new Doador(data);
        repository.save(doadorData);
    }


    @GetMapping
    public List<DoadorResponseDTO> listarTodos(){
        List<DoadorResponseDTO> doadores = repository.findAll().stream().map(DoadorResponseDTO::new).collect(Collectors.toList());
        return doadores;
    }

    @GetMapping("/{id}")
    public DoadorResponseDTO listarPorId(@PathVariable(value = "id") String id) {
        Doador doador = repository.findById(id).orElseThrow();

        return new DoadorResponseDTO(doador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoadorResponseDTO> atualizar(@PathVariable(value = "id") String id, @RequestBody DoadorRequestDTO data) {
        Doador doador = repository.findById(id).orElseThrow();

        doador.setNome(data.nome());
        doador.setInstagram(data.instagram());
        repository.save(doador);

        return ResponseEntity.ok().body(new DoadorResponseDTO(doador));
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
