package com.model;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class TestMain {

	public static void main(String[] args) {
		

		/*Client client=ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:8080/RestExemple/rest/voitures/add");
		target=target.path("4");
		target=target.path("blanche");
		target=target.path("mazda");
		target.request().post(null);
*/		//target.request().post(Entity.xml(new Voiture(3,"jaune","TOYOTA")));
		//System.out.println(v);
		
		List<Voiture> l=VoitureService.getVoitures();
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		

	}

}
