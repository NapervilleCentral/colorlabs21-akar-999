
/**
 * Ayush
 * Color Lab
 * @author (Ayush)
 */
import java.awt.Color; // Import the correct Color class;

public class SheparFaireyLab {
    public static void main(String[] args) {
        Picture p = new Picture("images/mypicture2.jpg");
        Picture p2 = new Picture("images/mypicture2.jpg");
        
                
        p.explore();

        Color color1 = new Color(253,83, 74);
        Color color2 = new Color(247, 244, 215);
        Color color3 = new Color(255, 255, 255);
        Color color4 = new Color(204, 51, 51);
        
        Color color5 = new Color(190, 20, 120);   // magenta
        Color color6 = new Color(255, 220, 60);   // yellow
        Color color7 = new Color(40, 0, 60);      // dark purple
        Color color8 = new Color(210, 80, 0);    // dark orange
        Color color9 = new Color(255, 255, 255);  // white
        
        //Color color5 = new Color(81,45,168);   // magenta
        ///Color color6 = new Color(255,140,0);   // yellow
        //Color color7 = new Color(54, 23, 94);      // dark purple
        //Color color8 = new Color(156,39,176);    // dark orange
        //Color color9 = new Color(255, 214, 0);  // white

        
        //rgb(0,0,0) done
        //rgb(128,0,255)
        //rgb(190,92,255)
        //rgb(0,255,64) done
        ////rgb(0,0,0) done




        
        
        Pixel[] Mpixels;
        Mpixels = p.getPixels();
        
        for (int i = 0; i < Mpixels.length; i++){
            
            
            int r = Mpixels[i].getRed();
            int g = Mpixels[i].getGreen();
            int b = Mpixels[i].getBlue();
            
            int average = (int)((r+g+b)/3);
            
            if (average < 64) {
            
                Mpixels[i].setColor(color1);}
            
            else if (average < 128) {
            
                        Mpixels[i].setColor(color2);}

            else if (average < 192){
            
                        Mpixels[i].setColor(color3);}

            else if (average < 256) {
                        Mpixels[i].setColor(color4);}
        
        
        
        
        }
        p.explore();
        
        Mpixels = p2.getPixels();

        
         for (int i = 0; i < Mpixels.length; i++){
            
            
            int r = Mpixels[i].getRed();
            int g = Mpixels[i].getGreen();
            int b = Mpixels[i].getBlue();
            
            int average = (int)((r+g+b)/3);
            
            if (average < 60)
                Mpixels[i].setColor(color7);   // darkest purple
            else if (average < 110)
                Mpixels[i].setColor(color5);   // magenta
            else if (average < 160)
                Mpixels[i].setColor(color8);   // dark orange
            else if (average < 210)
                Mpixels[i].setColor(color6);   // yellow
            else
                Mpixels[i].setColor(color9);   // white (face highlights)
            
            
        }
        p2.explore();
        p2.write("images/SFFinal.jpg");
        
}
}



     
     
     
     