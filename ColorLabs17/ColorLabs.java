
/**
 * Ayush
 * Color Lab
 * @author (Ayush)
 */
import java.awt.Color; // Import the correct Color class

public class ColorLabs {
    public static void main(String[] args) {
        Picture p = new Picture("images/butterfly1.jpg");
        Picture p2 = new Picture("images/butterfly1.jpg");

        int width = p.getWidth();
        int height = p.getHeight();
        
        //grayscale

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Pixel pixel = p.getPixel(x, y);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                int gray = (red + green + blue) / 3;
                pixel.setColor(new Color(gray, gray, gray));
            }
        }
        p.explore();
        
        
        Pixel[] Mpixels;
        Mpixels = p2.getPixels();
        
        for (Pixel spot1 : Mpixels){
        
            int blue = spot1.getBlue();
            blue = (int)(blue*0.25);
            spot1.setRed(blue);
        
        }
        
        p2.explore();
    }
}



     
     
     
     