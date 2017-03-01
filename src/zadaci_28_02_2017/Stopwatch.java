package zadaci_28_02_2017;

public class Stopwatch {
	private double startTime;
	private double endTime;
	
	Stopwatch(){
		startTime=System.currentTimeMillis();
	}
	void start(){
		this.startTime=System.currentTimeMillis();
		
	}
	void stop(){
		this.endTime=System.currentTimeMillis();
		
	}
	double getElapsedTime(){
		return endTime-startTime;
		
	}

}
