/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

/**
 *
 * @author c16310
 */
public class DigitObserver2 implements Observer{
    public void update(NumberGenerator generator) {
        System.out.println("甲斐市気温" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }
    }
    
    
}
