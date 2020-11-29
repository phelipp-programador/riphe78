package br.com.phddigital.riphe78.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.phddigital.riphe78.data.CategoriaResources;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.Loja;

public class PesquisaService implements ServiceDao<Item> {
    private CategoriaResources categoriaResources;

    @Override
    public Optional<Item> save(Item entity) {

        return null;
    }

    @Override
    public Optional<Item> update(Integer id, Item newEntity) {

        return Optional.empty();
    }

    @Override
    public Optional<List<Item>> select() {
        List<Item> itens = new ArrayList<>();
        Item item = new Item();
        Loja loja1= new Loja();
        loja1.setNome("riphe");
        item.setNome("phelipp");
        item.setLoja(loja1);
        item.setUrlImage("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_1400x540.jpg");
        Item item2 = new Item();
        item2.setNome("phel");
        item2.setLoja(loja1);
        itens.add(item);
        itens.add(item2);

        return Optional.of(itens);
    }

    @Override
    public Optional<Item> select(Integer id) {


        return Optional.empty();
    }

    @Override
    public Optional<Boolean> delete(Integer id) {

        return Optional.empty();
    }

    public Optional<List<Item>> selectWhere(String value) {

        if(select().isPresent()){
            List<Item> itens = select().get().stream().
                    filter(o -> o.getNome().contains(value) )
                    .collect(Collectors.toList());
            if(itens.size()>0){
                return Optional.of(itens);
            }
            else{
                return Optional.empty();
            }
        }
        return Optional.empty();


    }
}
