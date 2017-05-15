/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.Random;

/**
 *
 * @author c16310
 */
public class RandomNumberGenerator2 extends NumberGenerator {
    private Random random = new Random();
    private int number2;
    public int getNumber2() {
        return number2;
    }
    public void execute2() {
        for (int i = 0; i < 1; i++) {
            number2 = random.nextInt(20);
            notifyObservers();
        }
    }

    @Override
    public int getNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
