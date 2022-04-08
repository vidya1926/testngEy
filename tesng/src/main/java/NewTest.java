import org.testng.annotations.Test;

public class NewTest {
	
  @Test(priority=1)
  public void runCreateLead() {
	  System.out.println("Createlead");
  }
    
  @Test(priority=2,invocationCount=6,threadPoolSize=3)
  public void editLead() {
	  System.out.println("editLead");
  }
  
  @Test(enabled=false)
  public void deleteLead() {
	  System.out.println("deleteLead");
  }
}
