package ThreadLearning;

public class mainClass {

	public static void main(String[] args) 
	{
		Rabbit r1=new Rabbit();
		Rabbit r2=new Rabbit("Rabit 1");
		Rabbit r3=new Rabbit("Rabit 2");
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
