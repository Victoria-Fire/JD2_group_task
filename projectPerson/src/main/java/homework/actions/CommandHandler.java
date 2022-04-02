package homework.actions;

import homework.actions.enums.CommandNames;
import homework.actions.impl.*;
import homework.actions.interfaces.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 12:10
 */
public class CommandHandler {

    private final Map<CommandNames, Command> repository = new HashMap<>();

    public CommandHandler() {
        repository.put(CommandNames.SELECT, new SelectFromDB());
        repository.put(CommandNames.UPDATE, new UpdateDB());
        repository.put(CommandNames.DELETE, new DeleteFromDB());
        repository.put(CommandNames.INSERT, new InsertIntoDB());
        repository.put(CommandNames.WRONG_REQUEST, new WrongRequest());
    }

    public Command getCommand(String name) {
        CommandNames commandName;
        Command command;
        try {
            commandName = CommandNames.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandNames.WRONG_REQUEST);
        }
        return command;
    }
}
