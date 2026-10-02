package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Dispositivo;
import ar.edu.itec.Proyecto_EMSA.repository.DispositivoRepository;
import ar.edu.itec.Proyecto_EMSA.service.DispositivoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DispositivoServiceImpl implements DispositivoService {

    private final DispositivoRepository dispositivoRepository;

    public DispositivoServiceImpl(DispositivoRepository dispositivoRepository) {
        this.dispositivoRepository = dispositivoRepository;
    }

    @Override
    public Dispositivo save(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    @Override
    public List<Dispositivo> findAll() {
        return dispositivoRepository.findAll();
    }

    @Override
    public Optional<Dispositivo> findById(Integer id) {
        return dispositivoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        dispositivoRepository.deleteById(id);
    }
}
