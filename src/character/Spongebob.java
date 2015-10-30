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
        graphics.fillRect(x + 100, y + 100, 200, 250);

        //pants
        graphics.setColor(new Color(139, 69, 19));
        graphics.fillRect(x + 100, y + 300, 200, 60);
        graphics.fillRect(x + 140, y + 360, 20, 25);
        graphics.fillRect(x + 240, y + 360, 20, 25);

        //legs
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + 140, y + 385, 20, 70);
        graphics.fillRect(x + 240, y + 385, 20, 70);

        //socks
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + 140, y + 410, 20, 45);
        graphics.fillRect(x + 240, y + 410, 20, 45);
        graphics.setColor(Color.RED);
        graphics.fillRect(x + 140, y + 415, 20, 3);
        graphics.fillRect(x + 240, y + 415, 20, 3);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(x + 140, y + 425, 20, 3);
        graphics.fillRect(x + 240, y + 425, 20, 3);

        //shoes
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x + 120, y + 450, 40, 20);
        graphics.fillRect(x + 240, y + 450, 40, 20);

        //shirt
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x + 100, y + 300, 200, 20);
        graphics.fillRect(x + 85, y + 250, 15, 20);
        graphics.fillRect(x + 300, y + 250, 15, 20);

        //arms
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + 85, y + 270, 15, 100);
        graphics.fillRect(x + 300, y + 270, 15, 100);

        //eyes
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + 135, y + 150, 65, 65);
        graphics.fillOval(x + 200, y + 150, 65, 65);
        graphics.setColor(new Color(0, 255, 255));
        graphics.fillOval(x + 155, y + 165, 30, 30);
        
        //tie
        int[] xValues = new int[7];
        xValues[0] = x + (width * 60 / 100); 
        xValues[1] = x + (width * 50 / 100); 
        xValues[2] = x + (width * 60 / 100); 
        xValues[3] = x + (width * 50 / 100); 
        xValues[4] = x + (width * 40 / 100); 
        xValues[5] = x + (width * 60 / 100); 
        xValues[6] = x + (width * 45 / 100); 

        int[] yValues = new int[7];
        yValues[0] = y + (height * 50 / 100); 
        yValues[1] = y + (height * 70 / 100);
        yValues[2] = y + (height * 90 / 100);
        yValues[3] = y + (height * 100 / 100);
        yValues[4] = y + (height * 50 / 100);
        yValues[5] = y + (height * 70 / 100);
        yValues[6] = y + (height * 50 / 100);
        
        
        graphics.setColor(Color.red);
        graphics.fillPolygon(xValues, yValues, 7);
    }

    private int x;
    private int y;
    private int width;
    private int height;

}
