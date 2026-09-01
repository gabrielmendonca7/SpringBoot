package br.edu.faculdade.formula1.controller;

import br.edu.faculdade.formula1.model.Piloto;
import br.edu.faculdade.formula1.service.PilotoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PilotoController {

    private final PilotoService pilotoService;

    public PilotoController(PilotoService pilotoService) {
        this.pilotoService = pilotoService;
    }

    @GetMapping("/boas-vindas")
    public String boasVindas() {

        return "API de pilotos da F1 no ar!";
    }

    @GetMapping("/destaque")
    public Piloto pilotoDestaque() {

        return pilotoService.buscarDestaque();
    }

    @GetMapping("/pilotos")
    public List<Piloto> pilotos() {

        return pilotoService.buscarTodos();
    }
}