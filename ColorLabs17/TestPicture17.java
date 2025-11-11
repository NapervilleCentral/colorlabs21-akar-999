
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
<<<<<<< HEAD
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore(); */
=======
      /**/
     //String fileName = FileChooser.pickAFile();
     //Picture pictObj = new Picture(fileName);
     //pictObj.explore();
>>>>>>> a6a21c5a97d24514819e89c9d1add2aaba70509c

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //Know it, Love it, Live it!!!!!!!!!!
     //relative path        dir/folder/file
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     //apic.explore();
     moto.explore();
     
     //makes an array of pixels
     Pixel[] pixels2;
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = moto.getPixels();
     pixels2 = ferris1.getPixels();
     
     
     
     Pixel Mpixels;

     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    
    
    
    
    


    /**/
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = moto.getPixel(17,17);
    
    Pixel fer7 = pixels[17];
    
     
    

    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
<<<<<<< HEAD
=======

    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[24].setColor(Color.blue);
>>>>>>> a6a21c5a97d24514819e89c9d1add2aaba70509c

    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(0,0,0));
    //pixels[500034].setColor(Color.blue);

    moto.explore();
    
    for (int i = 0; i <10000; i++){
    
    
    Pixel yuck = moto.getPixel((int)(Math.random() * 200), (int)(Math.random()*200));
    //pixels.setColor(Color.green);
    
    }
    moto.explore();

    
    //ferris1.getPixels();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/
 int red, blue, green;
  for (Pixel spot1 : pixels){
    //
    red = spot1.getRed();
    
    red = (int)(red * Math.random());
    
    spot1.setRed(red);
    
    blue = spot1.getRed();
    
    blue = (int)(blue * Math.random());
    
    spot1.setBlue(blue);
    
    green = spot1.getGreen();
    
    green = (int)(green * Math.random());
    
    spot1.setGreen(green);
    
    }
    moto.explore();

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
