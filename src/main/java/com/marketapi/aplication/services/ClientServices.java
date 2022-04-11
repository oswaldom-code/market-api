package com.marketapi.aplication.services;

import java.util.List;

import com.marketapi.domain.useCases.ClientUserCase;
import com.marketapi.domain.models.Client;

public class ClientServices implements ClientUserCase {

	@Override
	public Client getClient(String id) {
		// PersistencePort persistencePort = new PersistencePort();
		// return persistencePort.getClient(id);
		return null;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client createClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(String id) {
		// TODO Auto-generated method stub

	}

}
