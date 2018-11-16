package ThreadLearning;

public class Rabbit implements Runnable{

	String name="";
	
	public Rabbit()
	{
		this("Generic constuctor");
	}
	
	public Rabbit(String name) 
	{
		this.name=name;
		System.out.println("In string constructor..."+this.name );
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)// TODO Auto-generated method stub
		{
			System.out.println("in Run method...."+this.name);
		}		
	}
	
}