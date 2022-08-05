package com.schedulingclients.config;

import com.schedulingclients.model.Address;
import com.schedulingclients.model.Client;
import com.schedulingclients.model.dto.ClientDTO;
import com.schedulingclients.model.enums.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.schedulingclients.repositoty.AddressRepository;
import com.schedulingclients.repositoty.ClientRepository;
import java.util.Arrays;
import java.util.List;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private ClientRepository clientReposiroty;

    @Autowired
    private AddressRepository addressReposiroty;

    @Override
    public void run(String... arg0) throws Exception {

        clientReposiroty.deleteAll();
        addressReposiroty.deleteAll();

        Client lucas = new Client(
                (String) null, "Lucas Pereira",
                "lucas@gmail.com",
                "masculino",
                "14/03/1997",
                "83986704633",
                OrderStatus.NOT_SCHEDULED
                );
        Client andre = new Client(
                (String) null, "Andre Araujo",
                "andre@gmail.com",
                "masculino",
                "04/12/1996",
                "83986554498",
                OrderStatus.SCHEDULED
        );
        Client leticia = new Client(
                (String) null, "Leticia Castro",
                "leticia@gmail.com",
                "feminina",
                "02/08/2005",
                "83996456522",
                OrderStatus.NOT_SCHEDULED
        );


        clientReposiroty.saveAll(Arrays.asList(lucas, andre, leticia));

        Address address1 = new Address(null,
                "Oséias Henrique",
                "136",
                "Primavera",
                "PB",
                "58200-000",
                new ClientDTO(lucas)
        );
        Address address2 = new Address(null,
                "Manoel Ferreira de Barros",
                "269",
                "Novo",
                "PB",
                "58200-000",
                new ClientDTO(leticia)
        );

        addressReposiroty.saveAll(Arrays.asList(address1, address2));

        lucas.getAddress().addAll(Arrays.asList(address1));
        leticia.getAddress().addAll(Arrays.asList(address2));

        clientReposiroty.save(lucas);
        clientReposiroty.save(andre);
        clientReposiroty.save(leticia);
    }
}
