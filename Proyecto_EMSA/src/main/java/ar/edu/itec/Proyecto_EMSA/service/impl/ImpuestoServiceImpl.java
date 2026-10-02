package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Impuesto;
import ar.edu.itec.Proyecto_EMSA.repository.ImpuestoRepository;
import ar.edu.itec.Proyecto_EMSA.service.ImpuestoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpuestoServiceImpl implements ImpuestoService {

    private final ImpuestoRepository impuestoRepository;

    public ImpuestoServiceImpl(ImpuestoRepository impuestoRepository) {
        this.impuestoRepository = impuestoRepository;
    }

    @Override
    public Impuesto save(Impuesto impuesto) {
        return impuestoRepository.save(impuesto);
    }

    @Override
    public List<Impuesto> findAll() {
        return impuestoRepository.findAll();
    }

    @Override
    public Optional<Impuesto> findById(Integer id) {
        return impuestoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        impuestoRepository.deleteById(id);
    }
}
