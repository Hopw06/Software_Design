package ObserverPattern.Subjects;

import ObserverPattern.model.LoginStatus;
import ObserverPattern.Obsevers.Observer;
import ObserverPattern.model.User;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {

    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        user = new User(email, ip);
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer) && observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed!");
        this.notifyAllObserver();
    }
}
