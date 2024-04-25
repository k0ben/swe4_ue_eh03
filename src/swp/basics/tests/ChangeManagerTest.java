package swp.basics.tests;

import swp.basics.observer.push.impl.TimerObservableObserver;

public class ChangeManagerTest {
    public static void main(String[] args) throws InterruptedException {
        TimerObservableObserver timer = new TimerObservableObserver(10, 100);
        TimerObservableObserver obsObs1 = new TimerObservableObserver(11, 100);
        TimerObservableObserver obsObs2 = new TimerObservableObserver(12, 100);
        TimerObservableObserver obs1 = new TimerObservableObserver(13, 100);

        timer.registerObserver(obsObs1);
        timer.registerObserver(obsObs2);
        obsObs1.registerObserver(obs1);
        obsObs2.registerObserver(obs1);

        // cycle

        System.out.println("==================");
        timer.runTimer();
        System.out.println("==================");

    }
}
