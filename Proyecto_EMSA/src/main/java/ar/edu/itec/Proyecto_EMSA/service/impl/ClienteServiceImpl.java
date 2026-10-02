package ar.edu.itec.Proyecto_EMSA.service.impl;

import ar.edu.itec.Proyecto_EMSA.entity.Cliente;
import ar.edu.itec.Proyecto_EMSA.repository.ClienteRepository;
import ar.edu.itec.Proyecto_EMSA.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        clienteRepository.deleteById(id);
    }
}
