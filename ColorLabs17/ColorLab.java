
/**
 * Ayush
 * Color Lab
 * @author (Ayush)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class ColorLab
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
     //relative path
     Picture p = new Picture("images/butterfly1.jpg");
     Picture p2 = new Picture("images/butterfly1.jpg");
     Picture p3 = new Picture("images/butterfly1.jpg");
     
 
        int width = p.getWidth();
        int height = p.getHeight();

        // Loop through each pixel
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Pixel pixel = p.getPixel(x,y);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                // Average for grayscale
                int gray = (red + green + blue) / 3;

                // Create new gray color
                Color grayColor = new Color(gray, gray, gray);

                // Set the new pixel color
                pixel.setColor(grayColor);
            }
        }
        p.explore();


    }
}

     
     
     
     
