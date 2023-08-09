package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        // Реализовать консольное приложение, которое принимает строки и запоминает их.
        // Если введено print, то нужно вывести в консоль строки так, что последняя введенная является первой в списке.
        // Если введено revert, то удаляет последнюю строку

        Scanner scanner = new Scanner(System.in);
        Deque<String> storage = new ArrayDeque<>();


        while(true) {
            String input = scanner.nextLine();
            if("exit".equals(input)) {
                break;
            }

            if("print".equals(input)) {
                System.out.println(storage);
            } else if("revert".equals(input)) {
                // TODO: 03.08.2023 - удаляем последнюю
                storage.poll();

            } else {
                storage.addFirst(input);

            }


        }
        System.out.println("Программа завершена!");
    }
}
