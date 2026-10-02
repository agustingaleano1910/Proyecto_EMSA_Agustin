package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.LineaImpuesto;
import ar.edu.itec.Proyecto_EMSA.repository.LineaDeImpuestoRepository;
import ar.edu.itec.Proyecto_EMSA.service.LineaImpuestoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LineaImpuestoServiceImpl implements LineaImpuestoService {

    private final LineaDeImpuestoRepository lineaDeImpuestoRepository;

    public LineaImpuestoServiceImpl(LineaDeImpuestoRepository lineaDeImpuestoRepository) {
        this.lineaDeImpuestoRepository = lineaDeImpuestoRepository;
    }

    @Override
    public LineaImpuesto save(LineaImpuesto lineaImpuesto) {
        return lineaDeImpuestoRepository.save(lineaImpuesto);
    }

    @Override
    public List<LineaImpuesto> findAll() {
        return lineaDeImpuestoRepository.findAll();
    }

    @Override
    public Optional<LineaImpuesto> findById(Integer id) {
        return lineaDeImpuestoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        lineaDeImpuestoRepository.deleteById(id);
    }
}
