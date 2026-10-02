package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Medidor;
import ar.edu.itec.Proyecto_EMSA.repository.MedidorRepository;
import ar.edu.itec.Proyecto_EMSA.service.MedidorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedidorServiceImpl implements MedidorService {

    private final MedidorRepository medidorRepository;

    public MedidorServiceImpl(MedidorRepository medidorRepository) {
        this.medidorRepository = medidorRepository;
    }

    @Override
    public Medidor save(Medidor medidor) {
        return medidorRepository.save(medidor);
    }

    @Override
    public List<Medidor> findAll() {
        return medidorRepository.findAll();
    }

    @Override
    public Optional<Medidor> findById(Integer id) {
        return medidorRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        medidorRepository.deleteById(id);
    }
}
