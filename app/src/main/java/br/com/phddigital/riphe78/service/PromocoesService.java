package br.com.phddigital.riphe78.service;

import java.util.List;
import java.util.Optional;

import br.com.phddigital.riphe78.domain.Promocao;

public class PromocoesService implements Service<Promocao> {
    @Override
    public Optional<List<Promocao>> select() {

        return Optional.empty();
    }

    @Override
    public Optional<List<Promocao>> select(String value) {
        return Optional.empty();
    }
}
