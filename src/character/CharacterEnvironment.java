/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Zaira
 */
class CharacterEnvironment extends Environment {

    private Spongebob bob, rob;

    public CharacterEnvironment() {
        bob = new Spongebob(50, 50, 150, 200);
        rob = new Spongebob(250, 50, 300, 400);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (bob != null) {
            bob.draw(graphics);
        }
        if (rob != null) {
            rob.draw(graphics);
        }
    }

}
