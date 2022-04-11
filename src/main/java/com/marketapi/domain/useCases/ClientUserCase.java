package com.marketapi.domain.useCases;

import java.util.List;

import com.marketapi.domain.models.Client;

public interface ClientUserCase {
	Client getClient(String id);

	List<Client> getClients();

	Client createClient(Client client);

	Client updateClient(Client client);

	void deleteClient(String id);
}
