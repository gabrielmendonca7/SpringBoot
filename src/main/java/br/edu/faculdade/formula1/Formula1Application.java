package br.edu.faculdade.formula1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class Formula1Application {

    public static void main(String[] args) {
        SpringApplication.run(Formula1Application.class, args);
    }

    public record Piloto(
            String nome,
            String equipe,
            int temporadas,
            Boolean campeaoMundial){}

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "API de pilotos da F1 no ar!";
    }

    @GetMapping("/destaque")
        public Piloto pilotoDestaque(){

            return new Piloto(
            "Max Verstappen",
            "Red Bull",
            11,
            true
            );
        }

    @GetMapping("/pilotos")
    public List<Piloto> pilotos(){
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
