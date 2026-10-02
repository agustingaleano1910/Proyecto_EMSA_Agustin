package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.LineaConsumo;
import ar.edu.itec.Proyecto_EMSA.repository.LineaDeConsumoRepository;
import ar.edu.itec.Proyecto_EMSA.service.LineaConsumoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LineaConsumoServiceImpl implements LineaConsumoService {

    private final LineaDeConsumoRepository lineaDeConsumoRepository;

    public LineaConsumoServiceImpl(LineaDeConsumoRepository lineaDeConsumoRepository) {
        this.lineaDeConsumoRepository = lineaDeConsumoRepository;
    }

    @Override
    public LineaConsumo save(LineaConsumo lineaConsumo) {
        return lineaDeConsumoRepository.save(lineaConsumo);
    }

    @Override
    public List<LineaConsumo> findAll() {
        return lineaDeConsumoRepository.findAll();
    }

    @Override
    public Optional<LineaConsumo> findById(Integer id) {
        return lineaDeConsumoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        lineaDeConsumoRepository.deleteById(id);
    }
}
