package com.model;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class VoitureService {

	public static List<Voiture> getVoitures()
	{
		Client client=ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:8080/RestExemple/rest/voitures");
		List<Voiture> li=target.request(MediaType.APPLICATION_XML).get(new GenericType<List<Voiture>>(){});
		return li;
	}
	
}
