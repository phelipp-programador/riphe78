package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.DestaqueResources;
import br.com.phddigital.riphe78.domain.Item;

public class DestaqueService implements Service<Item> {
    private final DestaqueResources resources;

    public DestaqueService() {
        resources = RetrofitConfig.factory().create(DestaqueResources.class);

    }

    @Override
    public Optional<List<Item>> select() {
       return get(resources.select());


    }

    @Override
    public Optional<List<Item>> select(String value) {

        return get(resources.select(value));
    }
}
