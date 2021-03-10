package com.osworks.apiosworks.api.controller;

import java.util.Arrays;
import java.util.List;

import com.osworks.apiosworks.domain.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Daisuke");
        cliente1.setEmail("daisuke@email.com");
        cliente1.setTelefone("11 99999-1111");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Fidelis");
        cliente2.setEmail("fidelis@email.com");
        cliente2.setTelefone("11 99999-1111");

        return Arrays.asList(cliente1, cliente2);
    }
}
