<<<<<<< HEAD
package com.nt.apiajudars.doacao;


import com.nt.apiajudars.doador.Doador;
import com.nt.apiajudars.doador.DoadorRepository;
import com.nt.apiajudars.item.Item;
import com.nt.apiajudars.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("doacoes")
public class DoacaoController {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @Autowired
    private DoadorRepository doadorRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<DoacaoResponseDTO> getAll(){
        List<DoacaoResponseDTO> doacoes = doacaoRepository.findAll().stream().map(DoacaoResponseDTO::new).collect(Collectors.toList());
        return doacoes;
    }

    @PostMapping
    public void criarDoacao(@RequestBody CreateDoacaoDTO data){
        Optional<Doador> doador = doadorRepository.findById(data.doador_id());
        Doacao doacaoData = new Doacao(doador.orElse(null));
        Doacao doacao = doacaoRepository.save(doacaoData);
        List<Item> itensData = data.itens().stream().map((Item item) -> new Item(item.getNome(),  item.getQuantidade(), item.getCategoria(), doacao)).collect(Collectors.toList());
        itemRepository.saveAll(itensData);
    }
    }
=======
package com.nt.apiajudars.doacao;


import com.nt.apiajudars.doador.Doador;
import com.nt.apiajudars.doador.DoadorRepository;
import com.nt.apiajudars.item.Item;
import com.nt.apiajudars.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("doacoes")
public class DoacaoController {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @Autowired
    private DoadorRepository doadorRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<DoacaoResponseDTO> getAll(){
        List<DoacaoResponseDTO> doacoes = doacaoRepository.findAll().stream().map(DoacaoResponseDTO::new).collect(Collectors.toList());
        return doacoes;
    }

    @PostMapping
    public void criarDoacao(@RequestBody CreateDoacaoDTO data){
        Optional<Doador> doador = doadorRepository.findById(data.doador_id());
        Doacao doacaoData = new Doacao(doador.orElse(null));
        Doacao doacao = doacaoRepository.save(doacaoData);
        List<Item> itensData = data.itens().stream().map((Item item) -> new Item(item.getNome(),  item.getQuantidade(), item.getCategoria(), doacao)).collect(Collectors.toList());
        itemRepository.saveAll(itensData);
    }
}
>>>>>>> 7d72da5 (ItemController - Concluído)
