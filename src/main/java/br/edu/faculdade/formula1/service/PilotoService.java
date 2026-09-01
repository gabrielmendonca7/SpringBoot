package br.edu.faculdade.formula1.service;

import br.edu.faculdade.formula1.model.Piloto;
import br.edu.faculdade.formula1.repository.PilotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoService {

    private final PilotoRepository pilotoRepository;

    public PilotoService(PilotoRepository pilotoRepository) {
        this.pilotoRepository = pilotoRepository;
    }

    public Piloto buscarDestaque() {

        return pilotoRepository.buscarTodos().get(0);
    }

    public List<Piloto> buscarTodos() {

        return pilotoRepository.buscarTodos();
    }
}