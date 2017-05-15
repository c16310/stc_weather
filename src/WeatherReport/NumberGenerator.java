/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author c16310
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList(); //集約has-a関係
    
    //観察者の追加
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    //観察者の削除
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    //登録されている観察者にupdateするようにメッセージを送る
    public void notifyObservers(){
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer)it.next();
            o.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
    public abstract int getNumber2();
    public abstract void execute2();
}
