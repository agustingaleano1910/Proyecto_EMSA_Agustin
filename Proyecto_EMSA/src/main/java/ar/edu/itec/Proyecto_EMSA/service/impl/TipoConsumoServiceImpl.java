package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.TipoConsumo;
import ar.edu.itec.Proyecto_EMSA.repository.TipoConsumoRepository;
import ar.edu.itec.Proyecto_EMSA.service.TipoConsumoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoConsumoServiceImpl implements TipoConsumoService {

    private final TipoConsumoRepository tipoConsumoRepository;

    public TipoConsumoServiceImpl(TipoConsumoRepository tipoConsumoRepository) {
        this.tipoConsumoRepository = tipoConsumoRepository;
    }

    @Override
    public TipoConsumo save(TipoConsumo tipoConsumo) {
        return tipoConsumoRepository.save(tipoConsumo);
    }

    @Override
    public List<TipoConsumo> findAll() {
        return tipoConsumoRepository.findAll();
    }

    @Override
    public Optional<TipoConsumo> findById(Integer id) {
        return tipoConsumoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        tipoConsumoRepository.deleteById(id);
    }
}
