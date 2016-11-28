import org.junit.Test;
//import static org.junit.Assert.*;

public class HaloMundoTested {

	public static void ifHelloWorld (int langID)
    {
           if (langID == 1)
           {
                  System.out.println("Spanish selected");
                  System.out.println("Hola Mundo!");
           }
           else if (langID == 2)
           {
                  System.out.println("German selected");
                  System.out.println("Hallo Welt!");
           }
           else if (langID == 3)
           {
                  System.out.println("French selected");
                  System.out.println("Bonjour le monde!");
           }     
           else
           {
                  System.out.println("English default");
                  System.out.println("Hello world!");            
           }
    }
   
    public static void switchHelloWorld (String lang)
    {
			  switch (lang)
			  {
			         case "Spanish":
			               System.out.println("Hola Mundo!");
			               break;
			         case "German":
			               System.out.println("Hallo Welt!");
			               break;
			         case "French":
			               System.out.println("Bonjour le monde!");
			               break;
			         case "Kiwi":
			         case "Rarotongan":
			               System.out.println("kia ora!");
			               break;
			         default:
			               System.out.println("Hello world! (Eng)");     
			  }
    }
   
    public static void main(String[] args) {
          

    }
    
    @Test
    public void forLoopIt(){
    	System.out.println("**** start forLoopIt");
    	
    	for (int counter=0; counter<10; counter++){
    		switchHelloWorld("French");
    	}
    	
    	System.out.println("**** forLoopIt");
    }
    
    @Test
    public void whileLoopIt () {
    	System.out.println("**** start whileLoopIt");
    	int counter = 0;
    	while (counter<10){
    		switchHelloWorld("American");
    		counter++;
    	}
    	System.out.println("**** end whileLoopIt");

    }
    
    @Test
    public void doWhileLoopIt () {
    	System.out.println("**** start doWhileLoopIt");
    	int counter = 0;
    	do {
    		switchHelloWorld("Spanish");
    		counter++;
    	} while (counter<10);
    	System.out.println("**** end doWhileLoopIt");

    }

    @Test
    public void whileLoopMin() {
    	//the condition is evaluated BEFORE the while statement is entered
    	//so nothing is printed
    	System.out.println("**** start whileLoopMin");
    	int counter = 10;
    	while (counter<10) {
    		switchHelloWorld("German");
    		counter++;
    	}
    	System.out.println("**** end whileLoopMin");

    }
    
    @Test
    public void doWhileLoopMin () {
    	//the condition is evaluated AFTER the while statement is entered
    	//so nothing is printed
    	System.out.println("**** start doWhileLoopMin");
    	int counter = 10;
    	do {
    		switchHelloWorld("German");
    		counter++;
    	} while (counter<10);
    	System.out.println("**** end doWhileLoopMin");

    }
    
    @Test
    public void forWithBreak () {
    	System.out.println("**** start forWithBreak");
    	
    	for (int c=0;c<10;c++){
    		switchHelloWorld("Kiwi");
    		if (c == 3) break;
    	}
    	
    	System.out.println("**** end forWithBreak");
    }
    
}

