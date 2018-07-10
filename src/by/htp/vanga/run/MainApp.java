package by.htp.vanga.run;

import java.util.GregorianCalendar;
import java.util.PriorityQueue;

import by.htp.vanga.entity.Client;
import by.htp.vanga.entity.FortuneTeller;

public class MainApp {

	public static void main(String[] args) {
		
		FortuneTeller vanga = new FortuneTeller();
		
		Client client1 = new Client(new GregorianCalendar(2018, 06, 27),"Markus", 18);
		Client client2 = new Client(new GregorianCalendar(2018, 06, 27),"Kate", 33);
		Client client3 = new Client(new GregorianCalendar(2018, 06, 27),"George",55);
		Client client4 = new Client(new GregorianCalendar(2018, 06, 27),"Karl", 45);
		Client client5 = new Client(new GregorianCalendar(2018, 06, 27),"Massima", 67);
		Client client6 = new Client(new GregorianCalendar(2018, 06, 27),"Maruan", 76);
		
		PriorityQueue<Client> queueOfClients = new PriorityQueue<>();
		
//		queueOfClients.add(client1);
//		queueOfClients.add(client2);
//		queueOfClients.add(client3);
//		queueOfClients.add(client4);
//		queueOfClients.add(client5);
//		queueOfClients.add(client6);
		
		
//		System.out.println("Hello!!!");
//		System.out.println("Lets speak about your future");
//		queueOfClients.peek().chousePredictiongetAnswer();
		
//		vanga.listOfPredictions();
		
		client1.chousePredictiongetAnswer();
	}

}
