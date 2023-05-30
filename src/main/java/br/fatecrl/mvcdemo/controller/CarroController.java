package br.fatecrl.mvcdemo.controller;
import br.fatecrl.mvcdemo.model.Carro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping ("/Carros")
public class CarroController {
    private static final List<Carro> carros = new ArrayList<Carro>();

            public CarroController(){

        carros.add(new Carro("Ford", "vermelho", "Suv", 80000 ));
        carros.add(new Carro("Chevrolet", "Prata", "Hatch", 65000 ));
        carros.add(new Carro("BMW", "Preto", "Sedan", 130000 ));
        carros.add(new Carro("Honda", "Azul", "Suv", 72000 ));
            }

            @GetMapping
    public String getCarros(Model model){

                model.addAttribute("Carros", carros);
                return "Carros";
            }
}
