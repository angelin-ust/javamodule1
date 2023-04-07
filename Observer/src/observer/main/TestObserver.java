package observer.main;

import observer.consumer.NewsPaper;
import observer.consumer.TVChannel;
import observer.subjectimpl.WeatherStation;

public class TestObserver {
	public static void main(String[] args) {
		TVChannel observer1 = new TVChannel(); // subscriber
		NewsPaper observer2 = new NewsPaper(); // subscriber
		TVChannel observer3 = new TVChannel();

		WeatherStation weatherStation=new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);
		
	}

	
}
