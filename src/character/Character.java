/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.ApplicationStarter;

/**
 *
 * @author Zaira
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Spongebob Squarepants", new CharacterEnvironment());
    }

}
