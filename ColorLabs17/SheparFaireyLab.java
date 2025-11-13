
/**
 * Ayush
 * Color Lab
 * @author (Ayush)
 */
import java.awt.Color; // Import the correct Color class

public class SheparFaireyLab {
    public static void main(String[] args) {
        Picture p = new Picture("images/mypicture2.jpg");
                Picture p2 = new Picture("images/mypicture2.jpg");
        
                
        p.explore();

        Color color2 = new Color(253,251, 212);
        Color color1 = new Color(40, 140, 220);
        Color color3 = new Color(0, 25, 51);
        Color color4 = new Color(204, 51, 51);
        
        Color color5 = new Color(10, 15, 30);
        Color color6 = new Color(110, 235, 255);
        Color color7 = new Color(40, 140, 220);
        Color color8 = new Color(0, 25, 51);
        Color color9 = new Color(255, 255, 255);



        
        
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
            
                        if (average < 64)
                Mpixels[i].setColor(color8);
            else if (average < 128)
                Mpixels[i].setColor(color7);
            else if (average < 180)
                Mpixels[i].setColor(color6);
            else if (average < 230)
                Mpixels[i].setColor(color9);
            else
                Mpixels[i].setColor(color5);

                        



        
        
        
        
        
        
        }
        p2.explore();
        p2.write("images/SF2.jpg");
        
}
}



     
     
     
     