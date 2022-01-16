package Demo;

import java.awt.color.CMMException;

class ExceptionHand  extends Exception 
{ 
    public ExceptionHand(String s) 
    { 
        super(s); 
    } 
} 
public class ExceptionHandling 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Exception("temp"); 
        } 
        catch (CMMException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    } 
}

