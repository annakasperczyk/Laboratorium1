import java.lang.Math;
import java.util.Random;

public class punktmat
{ 
    private double masa;        
        public double getMasa()
        {
            return masa;
        }
    public void setMasa(double m)
        {
            masa = m;
        }
    
      public punktmat()   
        {
            masa = 2d;
        }
      
      public punktmat(double m)         
        {
            masa = m; 
        }
    
    public double momentbezwl()          
        {    
            return 0; 
        }
    
    public double steiner(double x)        
        {
            return momentbezwl() + masa * Math.pow(x, 2);
        }
  
    
      public String opisobiektu()   
        {
             return "Punkt materialny"; 
        }
}

