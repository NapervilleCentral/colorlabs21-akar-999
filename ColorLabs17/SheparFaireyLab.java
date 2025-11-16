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
        Picture p3 = new Picture("images/mypicture2.jpg"); // picture for method 2 (i did method 2 last)
        
        p.explore();

        Color color1 = new Color(28, 39, 57);     // Darkest Blue
        Color color2 = new Color(198, 44, 44);    // Muted Fairey Red
        Color color3 = new Color(100, 133, 152);  // Muted Light Blue
        Color color4 = new Color(245, 245, 240);  // Off-White Highlight
    
        
        Color color5 = new Color(190, 20, 120);   // magenta
        Color color6 = new Color(255, 220, 60);   // yellow
        Color color7 = new Color(40, 0, 60);      // dark purple
        Color color8 = new Color(210, 80, 0);    // dark orange
        Color color9 = new Color(255, 255, 255);  // white
        
        // METHOD 1 - original balanced approach
        Pixel[] Mpixels;
        Mpixels = p.getPixels();
        
        for (int i = 0; i < Mpixels.length; i++){
            int r = Mpixels[i].getRed();
            int g = Mpixels[i].getGreen();
            int b = Mpixels[i].getBlue();
            
            int average = (int)((r+g+b)/3);
            
            if (average < 64) {
                Mpixels[i].setColor(color1);
            } else if (average < 128) {
                Mpixels[i].setColor(color2);
            } else if (average < 192) {
                Mpixels[i].setColor(color3);
            } else if (average < 256) {
                Mpixels[i].setColor(color4);
            }
        }
        p.explore();
        p.write("images/SFMethod1.jpg");

        
        // METHOD 2 - INTENSE APPROACH (Dynamic thresholds based on actual image data)
        Mpixels = p3.getPixels();
        
        // First pass: find min and max grayscale values
        int minGray = 255;  // Start with maximum possible
        int maxGray = 0;    // Start with minimum possible
        
        for (int i = 0; i < Mpixels.length; i++) {
            int r = Mpixels[i].getRed();
            int g = Mpixels[i].getGreen();
            int b = Mpixels[i].getBlue();
            
            int average = (int)((r+g+b)/3);
            
            if (average < minGray) minGray = average;
            if (average > maxGray) maxGray = average;
        }
        
        // Calculate dynamic thresholds
        int range = maxGray - minGray;
        int interval = range / 4;
        
        int threshold1 = minGray + interval;
        int threshold2 = minGray + 2 * interval;
        int threshold3 = minGray + 3 * interval;
        
        System.out.println("Method 2 - Dynamic thresholds:");
        System.out.println("Min: " + minGray + ", Max: " + maxGray);
        System.out.println("Thresholds: " + threshold1 + ", " + threshold2 + ", " + threshold3);
        
        // Second pass: apply colors based on dynamic thresholds
        for (int i = 0; i < Mpixels.length; i++) {
            int r = Mpixels[i].getRed();
            int g = Mpixels[i].getGreen();
            int b = Mpixels[i].getBlue();
            
            int average = (int)((r+g+b)/3);
            
            if (average < threshold1) {
                Mpixels[i].setColor(color1);  // Dark blue equivalent (using your color1)
            } else if (average < threshold2) {
                Mpixels[i].setColor(color2);  // Red equivalent (using your color2)
            } else if (average < threshold3) {
                Mpixels[i].setColor(color3);  // Light blue equivalent (using your color3)
            } else {
                Mpixels[i].setColor(color4);  // Off-white equivalent (using your color4)
            }
        }
        p3.explore();
        p3.write("images/SFMethod2.jpg");
        
        // METHOD 3 - original custom color palette
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
