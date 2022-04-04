package homework.controller;


import homework.actions.interfaces.Command;
import homework.actions.CommandHandler;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 11:44
 */
public class Controller {

    private static final Controller INSTANCE = new Controller();
    private final CommandHandler commandHandler = new CommandHandler();

    public static Controller getInstance() {
        return INSTANCE;
    }

    public void executeRequest(String request) {
        String commandName;
        Command executionCommand;
        char delimiter = ' ';
        commandName = request.substring(0, request.indexOf(delimiter));
        executionCommand = commandHandler.getCommand(commandName);
        executionCommand.execute(request);
    }
}

