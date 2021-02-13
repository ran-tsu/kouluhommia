import java.util.ArrayList;
import java.util.List;

class ProxyExample {
   /**
    * Test method
    */
   public static void main(final String[] arguments) {
        List<Image> folder = new ArrayList<Image>();
        folder.add(new ProxyImage("HiRes_10MB_Photo1"));
        folder.add(new ProxyImage("HiRes_10MB_Photo2"));
        folder.add(new ProxyImage("HiRes_10MB_Photo3"));
        
        for (Image image : folder) {
        	image.showData();
        }
        
        System.out.println("");
        
        for (Image image : folder) {
        	image.displayImage();
        }
    }
}