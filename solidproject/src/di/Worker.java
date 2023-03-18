package di;

public class Worker {

	
	public void work() {
		//...working
	}
	
}
class Manager{
	Worker worker;
	
	
	public void setWorker(Worker w) {
		worker= w;
	}
	public void manage() {
		worker.work();
	}
}


class SuperWorker{
	public void work() {
		
	}
}