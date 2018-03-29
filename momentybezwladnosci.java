import java.lang.Math;
import java.util.Random;

public class momentybezwladnosci
{
          public static void main(String[] args)
      {
    
    punktmat dom = new punktmat();       
    punktmat par = new punktmat(2.1);      
    

System.out.printf("%s o masie %f, glownym momencie bezwl. %f i momencie bezw. względem innej osi %f\n", dom.opisobiektu(), dom.getMasa(), dom.momentbezwl(), dom.steiner(2));

System.out.printf("%s o masie %f, glownym momencie bezwl. %f i momencie bezw. względem innej osi %f\n", par.opisobiektu(), par.getMasa(), par.momentbezwl(), par.steiner(2));


dom.setMasa(10.54d);
    

System.out.printf("%s o masie %f, glownym momencie bezwl. %f i momencie bezw. względem innej osi %f\n", dom.opisobiektu(), dom.getMasa(), dom.momentbezwl(), dom.steiner(2));
    
    punktmat[] masy = new punktmat[5];
    Random rand = new Random();
    for(int i = 0; i < masy.length; i++) {
        masy[i] = new punktmat(rand.nextDouble() * 50);
    }
    

    for(int i = 0; i < masy.length; i++) {
        punktmat pm = masy[i];
        System.out.printf("%s o masie %f, glownym momencie bezwl. %f i momencie bezw. względem innej osi %f\n", pm.opisobiektu(), pm.getMasa(), pm.momentbezwl(), pm.steiner(2d));
    }
  }
}
