package ch.jee.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Application destinée à observer l'évolution du travail du GC de Java
 */
public class Main {

	static final List<TestObject> objects = new ArrayList<>();
	private static final int UN_MILLION = 1000000;
	private static final long MAX_TIME_EXECUTION = 1000 * 30; //30s
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(5000);
		
		start();

	}
	
	static void start() {
		
		Date startDate = new Date();
		
		while(true) {
			TestObject to = new TestObject(1, 1);
			objects.add(to);
			if(objects.size() == UN_MILLION) {
				objects.clear();
			}
		
			checkTimeToKill(startDate);
		}
	}

	private static void checkTimeToKill(Date startDate) {
		if(new Date().getTime() - startDate.getTime() > MAX_TIME_EXECUTION) {
			System.exit(0);
		}
	}

	
	
}

class TestObject {
	private int a;
	private int b;
	
	public TestObject(int a, int b){
		this.a = a;
		this.b = b;
	}
}