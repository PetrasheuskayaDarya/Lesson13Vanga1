package by.htp.vanga.entity;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;

public class FortuneTeller {

	private NavigableSet<Client> waitingList;
	private Map<Integer, Client> listOfClients;
	
	
	public void deletedFromWaitingList(Client client) {
		waitingList.remove(client);
	}
	public static Map<Prediction, Queue<Answer>> listOfPredictions() {
		Queue<Answer> number1 = new LinkedList<>();
		number1.add(new Answer("You will live in a bid house"));
		number1.add(new Answer("You will see a sunrise every day"));
		number1.add(new Answer("You will live on the beach"));
		Queue<Answer> number2 = new LinkedList<>();
		number2.add(new Answer("You will live with your wife 100 years"));
		number2.add(new Answer("You will get merried in one year"));
		number2.add(new Answer("You will have 5 children"));
		Queue<Answer> number3 = new LinkedList<>();
		number3.add(new Answer("You will have a great job"));
		number3.add(new Answer("You will have salary 10000 $ per month"));
		number3.add(new Answer("Your house will located near Leonardo Dicaprio's"));
		Queue<Answer> number4 = new LinkedList<>();
		number4.add(new Answer("You had 4 husbands"));
		number4.add(new Answer("You always lived with 5 dogs"));
		number4.add(new Answer("You have never lived in one country more than 1 year"));
		Queue<Answer> number5 = new LinkedList<>();
		number5.add(new Answer("You like sleap on the beach"));
		number5.add(new Answer("Every New Year you send your neighbors post cards"));
		number5.add(new Answer("You don't like your boss"));
        Map<Prediction, Queue<Answer>> predictions = new LinkedHashMap<>();
		predictions.put(new Prediction(1, "Number 1: Your Future"), number1);
		predictions.put(new Prediction(2, "Number 2: Your private life"), number2);
		predictions.put(new Prediction(3, "Number 3: Your oppotunity in life"), number3);
		predictions.put(new Prediction(4, "Number 4: Something about your past life"), number4);
		predictions.put(new Prediction(5, "Number 5: One secret about you"), number5);

		for (Prediction nameOfPrediction : predictions.keySet()) {
			System.out.println(nameOfPrediction);
		}

		return predictions;
		
	}
	public FortuneTeller() {
		super();
	}
	public FortuneTeller(String name, NavigableSet<Client> waitingList, Map<Integer, Client> clientList) {
		super();
		this.waitingList = waitingList;
		this.listOfClients = listOfClients;
	}
	

}
