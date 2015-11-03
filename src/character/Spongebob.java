/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Zaira
 */
public class Spongebob {

    public Spongebob(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, width, height);

        //body
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 15 / 100), y, width * 70 / 100, height * 50 / 100);

        //shirt
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + (width * 15 / 100), y + (height * 50 / 100), width * 70 / 100, height * 6 / 100);
        graphics.fillRect(x + (width * 8 / 100), y + (height * 45 / 100), width * 7 / 100, height * 10 / 100);
        graphics.fillRect(x + (width * 85 / 100), y + (height * 45 / 100), width * 7 / 100, height * 10 / 100);

        //arms
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 9 / 100), y + (height * 55 / 100), width * 5 / 100, height * 20 / 100);
        graphics.fillRect(x + (width * 86 / 100), y + (height * 55 / 100), width * 5 / 100, height * 20 / 100);
        
        //pants
        graphics.setColor(new Color(139, 69, 19));
        graphics.fillRect(x + (width * 15 / 100), y + (height * 56 / 100), width * 70 / 100, height * 11 / 100);
        graphics.fillRect(x + (width * 25 / 100), y + (height * 67 / 100), width * 10 / 100, height * 8 / 100);
        graphics.fillRect(x + (width * 65 / 100), y + (height * 67 / 100), width * 10 / 100, height * 8 / 100);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + (width * 20 / 100), y + (height * 60 / 100), width * 11 / 100, height * 2 / 100);
        graphics.fillRect(x + (width * 37 / 100), y + (height * 60 / 100), width * 11 / 100, height * 2 / 100);
        graphics.fillRect(x + (width * 53 / 100), y + (height * 60 / 100), width * 10 / 100, height * 2 / 100);
        graphics.fillRect(x + (width * 68 / 100), y + (height * 60 / 100), width * 10 / 100, height * 2 / 100);

        //legs
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 27 / 100), y + (height * 75 / 100), width * 6 / 100, height * 10 / 100);
        graphics.fillRect(x + (width * 67 / 100), y + (height * 75 / 100), width * 6 / 100, height * 10 / 100);

        //socks
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + (width * 27 / 100), y + (height * 85 / 100), width * 6 / 100, height * 10 / 100);
        graphics.fillRect(x + (width * 67 / 100), y + (height * 85 / 100), width * 6 / 100, height * 10 / 100);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(x + (width * 27 / 100), y + (height * 87 / 100), width * 6 / 100, height * 1 / 100);
        graphics.fillRect(x + (width * 67 / 100), y + (height * 87 / 100), width * 6 / 100, height * 1 / 100);
        graphics.setColor(Color.RED);
        graphics.fillRect(x + (width * 27 / 100), y + (height * 89 / 100), width * 6 / 100, height * 1 / 100);
        graphics.fillRect(x + (width * 67 / 100), y + (height * 89 / 100), width * 6 / 100, height * 1 / 100);
        //shoes
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + (width * 20 / 100), y + (height * 95 / 100), width * 13 / 100, height * 5 / 100);
        graphics.fillRect(x + (width * 67 / 100), y + (height * 95 / 100), width * 13 / 100, height * 5 / 100);

        //eyes
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 25 / 100), y + (height * 12 / 100), width * 25 / 100, height * 19 / 100);
        graphics.fillOval(x + (width * 50 / 100), y + (height * 12 / 100), width * 25 / 100, height * 19 / 100);
        graphics.setColor(new Color(0, 255, 255));
        graphics.fillOval(x + (width * 36 / 100), y + (height * 18 / 100), width * 10 / 100, height * 7 / 100);
        graphics.fillOval(x + (width * 55 / 100), y + (height * 18 / 100), width * 10 / 100, height * 7 / 100);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 38 / 100), y + (height * 19 / 100), width * 6 / 100, height * 4 / 100);
        graphics.fillOval(x + (width * 56 / 100), y + (height * 19 / 100), width * 6 / 100, height * 4 / 100);

        //tie
        int[] xValues = new int[7];
        xValues[0] = x + (width * 46 / 100);
        xValues[1] = x + (width * 49 / 100);
        xValues[2] = x + (width * 45 / 100);
        xValues[3] = x + (width * 50 / 100);
        xValues[4] = x + (width * 55 / 100);
        xValues[5] = x + (width * 51 / 100);
        xValues[6] = x + (width * 54 / 100);

        int[] yValues = new int[7];
        yValues[0] = y + (height * 50 / 100);
        yValues[1] = y + (height * 53 / 100);
        yValues[2] = y + (height * 64 / 100);
        yValues[3] = y + (height * 70 / 100);
        yValues[4] = y + (height * 64 / 100);
        yValues[5] = y + (height * 53 / 100);
        yValues[6] = y + (height * 50 / 100);
        graphics.setColor(Color.red);
        graphics.fillPolygon(xValues, yValues, 7);
        
        //smile
        graphics.setColor(new Color(105, 0, 0));
        graphics.fillOval(x + (width * 30 / 100), y + (height * 31 / 100), width * 40 / 100, height * 15 / 100);
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 27 / 100), y + (height * 31 / 100), width * 45 / 100, height * 6 / 100);
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + (width * 42 / 100), y + (height * 37 / 100), width * 6 / 100, height * 4 / 100);
        graphics.fillRect(x + (width * 52 / 100), y + (height * 37 / 100), width * 6 / 100, height * 4 / 100);
        graphics.setColor(new Color(255, 153, 204));
        graphics.fillOval(x + (width * 43 / 100), y + (height * 43 / 100), width * 13 / 100, height * 4 / 100);

    }

    private int x;
    private int y;
    private int width;
    private int height;

}
