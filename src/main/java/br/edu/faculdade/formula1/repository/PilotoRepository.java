package br.edu.faculdade.formula1.repository;

import br.edu.faculdade.formula1.model.Piloto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PilotoRepository {

    public List<Piloto> buscarTodos() {

        return List.of(
                new Piloto(
                        "Max Verstappen",
                        "Red Bull",
                        11,
                        true
                ),
                new Piloto(
                        "Lewis Hamilton",
                        "Ferrari",
                        20,
                        true
                ),
                new Piloto(
                        "Charles Leclerc",
                        "Ferrari",
                        8,
                        false
                ),
                new Piloto(
                        "Kimi Antonelli",
                        "Mercedes",
                        2,
                        false
                )
        );
    }
}