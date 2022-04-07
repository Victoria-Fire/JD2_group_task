package homework;

import homework.controller.Controller;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите запрос в базу данных...");
        String request = getInfoFromCommandLine();
        Controller.getInstance().executeRequest(request);
    }

    public static String getInfoFromCommandLine() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
