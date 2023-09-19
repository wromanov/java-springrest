package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller informa que a classe é responsável por receber requisições WEB.
@Controller
public class MeuPrimeiroController {
    @GetMapping("/hello") //@GetMapping indica qual o caminho para chegar no método via web.
    @ResponseBody //@ResponseBody indica que queremos que a String seja devolvida como resposta para requisição.
    public String hello() {
        return "Oi";
    }

}
