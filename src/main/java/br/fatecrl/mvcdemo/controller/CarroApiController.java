package br.fatecrl.mvcdemo.controller;
import br.fatecrl.mvcdemo.model.Carro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/api/carros")
public class CarroApiController {

    private static final List<Carro> carros = new ArrayList<Carro>();

    public  CarroApiController (){
        carros.add(new Carro("Ford", "vermelho", "Suv", 80000 ));
        carros.add(new Carro("Chevrolet", "Prata", "Hatch", 65000 ));
        carros.add(new Carro("BMW", "Preto", "Sedan", 130000 ));
        carros.add(new Carro("Honda", "Azul", "Suv", 72000 ));
    }

    @GetMapping
    public List<Carro> getCarros(){
    return carros;
}

}
