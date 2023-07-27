package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import com.mindhub.homebanking.service.ClientService;
import com.mindhub.homebanking.service.ClientServiceImpl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PruebasTest extends TestCase {

    ClientRepository repository = mock(ClientRepository.class);
    ClientService service = new ClientServiceImpl(repository);


    public void findByEmail(){
        List<Client> data = Arrays.asList(
                new Client("Ema","Leiva","ema@gmail.com"),
                new Client("Edu","Leiva","edu@gmail.com")
        );

        Client client = data.get(0);

        when(repository.findByEmail("ema@gmail.com")).thenReturn(client);

        Client clientFounded = service.findByEmail("ema@gmail.com");

        assertNotNull(clientFounded);

    }


    public static Test suite(){
        TestSuite suite = new TestSuite();
            suite.addTestSuite(PruebasTest.class);
        return suite;
    }


    public static void main(String args[]){
        junit.textui.TestRunner.run(suite());
    }
}
