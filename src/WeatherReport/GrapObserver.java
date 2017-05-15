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
public class GrapObserver implements Observer{
    public void update(NumberGenerator generator){
        System.out.println("GrapObserver:");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }
    }
}
