/*
 *課題３
アメダスで観測される気温などの情報を取得して
その結果を表示するプログラムをObserverパターンを
使って実現しなさい。
複数の観測地点に対応すること
 */
package WeatherReport;



/**
 *気象観測
 * @author c16310
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new DigitObserver2();
        //Observer observer2 = new GrapObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        //generator.addObserver(observer2);
        generator.execute();
    }
}
