package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.TipoIva;
import ar.edu.itec.Proyecto_EMSA.repository.TipoIvaRepository;
import ar.edu.itec.Proyecto_EMSA.service.TipoIvaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoIvaServiceImpl implements TipoIvaService {

    private final TipoIvaRepository tipoIvaRepository;

    public TipoIvaServiceImpl(TipoIvaRepository tipoIvaRepository) {
        this.tipoIvaRepository = tipoIvaRepository;
    }

    @Override
    public TipoIva save(TipoIva tipoIva) {
        return tipoIvaRepository.save(tipoIva);
    }

    @Override
    public List<TipoIva> findAll() {
        return tipoIvaRepository.findAll();
    }

    @Override
    public Optional<TipoIva> findById(Integer id) {
        return tipoIvaRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        tipoIvaRepository.deleteById(id);
    }
}
