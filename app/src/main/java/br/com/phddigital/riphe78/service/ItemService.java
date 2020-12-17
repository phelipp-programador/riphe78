package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.config.RetrofitConfig;
import br.com.phddigital.riphe78.data.ItemResources;
import br.com.phddigital.riphe78.domain.Item;

public class ItemService implements Service<Item> {
    private final ItemResources resources;

    public ItemService() {
        resources = RetrofitConfig.factory().create(ItemResources.class);
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
