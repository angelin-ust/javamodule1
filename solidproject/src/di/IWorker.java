package di;

public interface IWorker {
public void work();


class Worker implements IWorker{
	public void work() {
		
	}
}

abstract class SuperWorker implements IWorker{
	IWorker worker;
	public void setWorker (IWorker w) {
		worker=w;
		}
	
	
	public void manage() {
		worker.work();
	}
}

}
