package softwaredesign.designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        /* Decorator Pattern
        Easy to add layers/wrappers for added functionality without an explosion of subclasses
        Often used in GUI programming, e.g. to add a graphical element like a scrollbar to an existing class without changing its fundamentals
        The following example has a notifier base class that sends an email notification
        In order to extend this to other forms/apps of communication, one could use the decorator approach seen here
        */
        Notifier notifier = new Notifier();
        notifier = new SlackDecorator(notifier);
        notifier = new SmsDecorator(notifier);
        notifier = new TeamsDecorator(notifier);
        notifier.sendMessage("Hello world");
        //OR the shorter way in one line
        notifier = new TeamsDecorator(new SmsDecorator(new SlackDecorator(new Notifier())));
        notifier.sendMessage("Our meeting is at 10");
    }
}
