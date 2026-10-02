package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Zona;
import ar.edu.itec.Proyecto_EMSA.repository.ZonaRepository;
import ar.edu.itec.Proyecto_EMSA.service.ZonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaServiceImpl implements ZonaService {

    private final ZonaRepository zonaRepository;

    public ZonaServiceImpl(ZonaRepository zonaRepository) {
        this.zonaRepository = zonaRepository;
    }

    @Override
    public Zona save(Zona zona) {
        return zonaRepository.save(zona);
    }

    @Override
    public List<Zona> findAll() {
        return zonaRepository.findAll();
    }

    @Override
    public Optional<Zona> findById(Integer id) {
        return zonaRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        zonaRepository.deleteById(id);
    }
}
