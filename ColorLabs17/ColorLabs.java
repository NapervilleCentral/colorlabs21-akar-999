
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
        Picture p3 = new Picture("images/butterfly1.jpg");
        Picture p4 = new Picture("images/butterfly1.jpg");
        Picture p5= new Picture("images/butterfly1.jpg");
        Picture p6 = new Picture("images/jenny-red.jpg");


        p.explore();

        int width = p.getWidth();
        int height = p.getHeight();
        
        Pixel[] Mpixels;
        Mpixels = p2.getPixels();
        
        //adjust blue
        for (Pixel spot2 : Mpixels){
        
            int blue = spot2.getBlue();
            blue = (int)(blue*0.25);
            spot2.setBlue(blue);
        
        }
        
        p2.explore();
        
        
        //negate 
        
        Mpixels = p3.getPixels();
        
        for (Pixel spot3 : Mpixels){
        
            int blue = spot3.getBlue();
            blue = (int)(255-blue);
            spot3.setBlue(blue);
            
            int red = spot3.getRed();
            red = (int)(255-red);
            spot3.setRed(red);
            
            int green = spot3.getGreen();
            green = (int)(255-green);
            spot3.setGreen(green);
        
        }
        p3.explore();
        
        
        
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
        
        
        
        // lighten
                
        Mpixels = p4.getPixels();
        
        for (Pixel spot4 : Mpixels){
            
            int blue = spot4.getBlue();
            blue = (int)(blue+((int)(Math.random()*255)));
            if (blue>255) blue =255;
            spot4.setBlue(blue);
            
            int red = spot4.getRed();
            red = (int)(red+((int)(Math.random()*255)));
            if (red>255) red =255;
            spot4.setRed(red);
            
            int green = spot4.getGreen();
            green = (int)(green+((int)(Math.random()*255)));
            if (green>255) green =255;
            spot4.setGreen(green);
        
        }
        p4.explore();
        
        //change color
        
        Mpixels = p5.getPixels();
        
        //adjust blue
        for (Pixel spot5 : Mpixels){
        
            int blue = spot5.getBlue();
            blue = (int)(blue*0.25);
            
            int red = spot5.getRed();
            red = (int)(red*0.5);
            
            int green = spot5.getGreen();
            green = (int)(green*1.5);
            
            if (green>255) green=255;
            
            spot5.setColor(new Color(red,green,blue));
            
        
        }
        
        p5.explore();
        
        
        //colorify
        

        for (int y = 50; y < 187; y++) {
            for (int x = 101; x < 209; x++) {
                Pixel pixel = p6.getPixel(x, y);
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                pixel.setColor(new Color(255-red, Math.abs(53-green), Math.abs(94-blue)));
                
                
                if (x>=125 && x<=133 && y>=97 && y<=105) {
    pixel.setColor(new Color(Math.abs(32-red),Math.abs(172-green), Math.abs(27-blue)));
}

if (x>=179 && x<=184 && y>=96 && y<=101) {
    pixel.setColor(new Color(Math.abs(32-red),Math.abs(172-green), Math.abs(27-blue)));
}
            
            }   
    }
    
    p6.explore();
}
}



     
     
     
     