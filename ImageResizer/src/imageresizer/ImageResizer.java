/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageresizer;

/**
 *
 * @author caballeroda_sd2081
 */


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizer {

    public static void main(String... args) throws IOException {

        File input = new File("love.jpg");
        BufferedImage image = ImageIO.read(input);

        int height = image.getHeight();
        int width = image.getWidth();

        BufferedImage resized = resize(image, height / 2, width / 2);

        File output = new File("love1.jpg");
        ImageIO.write(resized, "png", output);

        BufferedImage resizedToBig = resize(image, height * 2, width * 2);

        File biggerOutput = new File("love2.jpg");
        ImageIO.write(resizedToBig, "png", biggerOutput);

    }

    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}
