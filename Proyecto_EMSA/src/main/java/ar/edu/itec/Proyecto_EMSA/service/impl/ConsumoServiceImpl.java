package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Consumo;
import ar.edu.itec.Proyecto_EMSA.repository.ConsumoRepository;
import ar.edu.itec.Proyecto_EMSA.service.ConsumoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumoServiceImpl implements ConsumoService {

    private final ConsumoRepository consumoRepository;

    public ConsumoServiceImpl(ConsumoRepository consumoRepository) {
        this.consumoRepository = consumoRepository;
    }

    @Override
    public Consumo save(Consumo consumo) {
        return consumoRepository.save(consumo);
    }

    @Override
    public List<Consumo> findAll() {
        return consumoRepository.findAll();
    }

    @Override
    public Optional<Consumo> findById(Integer id) {
        return consumoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        consumoRepository.deleteById(id);
    }
}
