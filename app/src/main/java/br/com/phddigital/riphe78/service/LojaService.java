package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.LojaResources;
import br.com.phddigital.riphe78.domain.Loja;

public class LojaService implements Service<Loja> {
    private final LojaResources resources;

    public LojaService() {
        resources = RetrofitConfig.factory().create(LojaResources.class);
    }


    @Override
    public Optional<List<Loja>> select() {
        return get(resources.select());
    }

    @Override
    public Optional<List<Loja>> select(String value) {

        return get(resources.select(value));
    }
}
