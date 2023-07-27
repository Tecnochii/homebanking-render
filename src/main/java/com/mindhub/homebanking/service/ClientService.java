package com.mindhub.homebanking.service;

import com.mindhub.homebanking.models.Client;

public interface ClientService {

    Client findByEmail(String email);


}
