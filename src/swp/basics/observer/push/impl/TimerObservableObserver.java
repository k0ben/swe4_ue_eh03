package swp.basics.observer.push.impl;

import swp.basics.observer.push.Observable;
import swp.basics.observer.push.Observer;

public class TimerObservableObserver extends DefaultObservable implements Observer {

    private int ticks;
    private int interval;

    public TimerObservableObserver(int ticks, int interval) {
        this.ticks = ticks;
        this.interval = interval;
    }

    public void runTimer() throws InterruptedException {
        while (ticks > 0){
            Thread.sleep(interval);
            ticks--;
            this.notifyObserver();
        }
    }

    @Override
    public Object getState() {
        return ticks;
    }

    @Override
    public void update(Observable observable, Object argument) {
        System.out.println("Update of " + this + ":" + observable + "with new state " + argument);

        //ticks = (int) argument;
        //notifyObserver();

        notifyObserver(observable, argument);

    }

    public void registerObserver(TimerObservableObserver observer){
        if (observer != null){
            UpdateOnceChangeManager.getInstance().attachObserver(this, observer);
        }
    }

    //TODO: detach / unregister
}
