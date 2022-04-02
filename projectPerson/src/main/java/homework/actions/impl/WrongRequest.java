package homework.actions.impl;

import homework.actions.interfaces.Command;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 12:18
 */
public class WrongRequest implements Command {
    @Override
    public void execute(String request) {
        System.out.println("Некорректный запрос для работы с базой данных, попробуйте еще раз!");
    }
}
