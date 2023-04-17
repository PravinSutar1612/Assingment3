package testclass;

abstract class publishing 
{
	abstract void publish();
}
public class LocalAnnonymous2 
{

	public static void main(String[] args) {
		
 //local annonymous class  
//at line 15 a class is created that inherits publishing and implementing its abstract methods 
// reference of class craeted at line 15 is stored in its parents reference e 		
	publishing e=	new publishing()
		{
			void publish() {System.out.println("local annonymous class");}
			
		};
		e.publish();
		
		
	}

}
