package com.mindhub.homebanking.controller;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

     ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @RequestMapping("/clients")
    public Client getClient(@RequestParam String email){
        return clientService.findByEmail(email);
    }
}
