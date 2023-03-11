package Interthreadone;

public class TestProducerConsumer {

	
		// TODO Auto-generated method stub

		public static void main(String[] args) {

			DataBuffer sharedObject = new DataBuffer();
			ProduceInteger producer = new ProduceInteger(sharedObject);
			ConsumerInteger consumer = new ConsumerInteger(sharedObject);
			
			producer.start();
			consumer.start();
			
		}

	

}
