import java.util.Timer;


public class SchedulerMain {
	
	public static void main(String args[]){
		
		Timer timer = new Timer();
		Schuduler schuduler = new Schuduler();
		timer.schedule(schuduler, 0, 1000);
		
		
	}

}
