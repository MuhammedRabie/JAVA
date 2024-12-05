package exammanagementsystem;

/**
 *
 * @author nour
 */
public class email extends NotificationDecorator {

    public email() {
        super();
    }

    @Override
    public String SendNotification() {
        return super.SendNotification()+emailnotif(); //To change body of generated methods, choose Tools | Templates.
    }

    private String emailnotif(){
        return " email sent";
    }
}   