package ObserverPattern.Obsevers;

import ObserverPattern.model.LoginStatus;
import ObserverPattern.model.User;

public class Protector implements Observer{

    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid." +
                    "IP " + user.getIp() + " is blocked");
        }
    }
}
