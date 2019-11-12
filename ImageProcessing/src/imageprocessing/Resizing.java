/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageprocessing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author caballeroda_sd2081
 */
public class Resizing {

   BufferedImage  image;
   int width;
   int height;
   
   public Resizing() {
   
      try {
         File input = new File("Luhan.jpg");
         image = ImageIO.read(input);
         width = image.getWidth();
         height = image.getHeight();
         
         for(int i=0; i<height; i++) {
         
            for(int j=0; j<width; j++) {
            
               Color c = new Color(image.getRGB(j, i));
               int red = (int)(c.getRed());
               int green = (int)(c.getGreen());
               int blue = (int)(c.getBlue());
               Color newColor = new Color(red,green,blue);
               
               image.setRGB(j/2,i/2,newColor.getRGB());
            }
         }
         
         File output = new File("grayscale.jpg");
         ImageIO.write(image, "jpg", output);
         
      } catch (Exception e) {}
   }
   
   public static void main(String args[]) throws Exception {
      Resizing obj = new Resizing();
   }
}


