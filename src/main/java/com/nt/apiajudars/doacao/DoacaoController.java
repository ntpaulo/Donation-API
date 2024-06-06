package com.nt.apiajudars.doacao;


import com.nt.apiajudars.doador.Doador;
import com.nt.apiajudars.doador.DoadorRepository;
import com.nt.apiajudars.item.Item;
import com.nt.apiajudars.item.ItemRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void criar(@RequestBody CreateDoacaoDTO data) {
        // Busca o doador usando o ID fornecido no corpo da requisição
        Optional<Doador> optionalDoador = doadorRepository.findById(data.doador_id());

        // Se o doador não for encontrado, lança uma exceção
        Doador doador = optionalDoador.orElseThrow(() -> new EntityNotFoundException("O doador com o ID fornecido não foi encontrado."));

        // Cria a doação com o doador encontrado
        Doacao doacaoCriada = doacaoRepository.save(new Doacao(doador));

        // Para cada item informado no corpo da requisição, cria um novo Item associado à doação criada
        List<Item> itensData = data.itens().stream()
                .map(bodyItem -> new Item(bodyItem.getNome(), bodyItem.getQuantidade(), bodyItem.getCategoria(), doacaoCriada))
                .collect(Collectors.toList());

        // Salva os itens no banco
        itemRepository.saveAll(itensData);
    }
}
