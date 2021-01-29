package ObserverPattern;

import ObserverPattern.Obsevers.Logger;
import ObserverPattern.Obsevers.Mailer;
import ObserverPattern.Obsevers.Protector;
import ObserverPattern.Subjects.AccountService;
import ObserverPattern.Subjects.Subject;
import ObserverPattern.model.LoginStatus;

public class Client {
    public static void main(String[] args) {
        AccountService service = new AccountService("Phong", "107.0.0.1");
        service.attach(new Logger());
        service.attach(new Mailer());
        service.attach(new Protector());

        service.changeStatus(LoginStatus.SUCCESS);
        service.changeStatus(LoginStatus.EXPIRED);
        service.changeStatus(LoginStatus.FAILURE);
        service.changeStatus(LoginStatus.INVALID);
    }
}
