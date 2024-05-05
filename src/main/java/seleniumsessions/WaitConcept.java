package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {
		
		
		//IQ:
		//We need a wait to sync b/w application and code. script ----Sync---> app(slow,server slowness,network issue)
		//sync: wait
		//1. static wait: JAVA Thread.sleep(10000): 10 secs: if element loaded in 2 secs but still wasting 10secs that's the drawback
		//2. dynamic wait : 10 secs: if element loaded in 2secs: 8 secs will be cancelled
		
				
		//2.a: Implicitly Wait: global wait for all the webElements
		//2.b: Explicitly Wait: for a specific web element
		//i: WebDriverWait (Class)
		//ii: FluentWait (Class)
				
				
				
		//Wait(Interface) : until(); --> FluentWait(Class): until(){} + other methods --> WebDriverWait (Class)
		

	}

}
