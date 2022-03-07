package softwaredesign.designpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Invoker {

    Timer timer;

    List<Command> commandList;

    public Invoker(Timer timer) {
        commandList = new ArrayList<>();
        this.timer = timer;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (Command command : commandList) {
                    command.execute();
                }
            }
        }, 0, 2000);
    }

    public Invoker(ConcreteCommand concreteCommand) {
        this(new Timer());
        commandList.add(concreteCommand);
    }

    public Invoker(List<ConcreteCommand> concreteCommands) {
        this(new Timer());
        commandList.addAll(concreteCommands);
    }

    boolean addCommand(ConcreteCommand concreteCommand) {
        if (concreteCommand !=null) {
            commandList.add(concreteCommand);
            return true;
        } else return false;
    }

    void invoke() {
        for (Command command : commandList) {
            command.execute();
        }
    }

}
