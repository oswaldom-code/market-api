package com.marketapi.aplication.ports.out;

import java.util.List;

import com.marketapi.domain.models.Client;

public interface ClientPersistencePort {
	Client getClient(String id);

	List<Client> getClients();

	Client createClient(Client client);

	Client updateClient(Client client);

	void deleteClient(String id);

}
