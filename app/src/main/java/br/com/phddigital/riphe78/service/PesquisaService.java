package br.com.phddigital.riphe78.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.PesquisaResources;
import br.com.phddigital.riphe78.domain.Item;
import br.com.phddigital.riphe78.domain.Loja;
import br.com.phddigital.riphe78.domain.ResultPesquisa;
import br.com.phddigital.riphe78.ui.pesquisa.PesquisaContract;

public class PesquisaService implements Service<ResultPesquisa> {
    private final PesquisaResources resources;
    public PesquisaService() {

        resources = RetrofitConfig.factory().create(PesquisaResources.class);
    }


    @Override
    public Optional<List<ResultPesquisa>> select() {

        return Optional.empty();
    }

    @Override
    public Optional<List<ResultPesquisa>> select(String value) {
        return get(resources.select(value));
    }


}
