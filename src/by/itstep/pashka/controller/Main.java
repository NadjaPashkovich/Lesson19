package by.itstep.pashka.controller;

import by.itstep.pashka.model.StudentManager;
import by.itstep.pashka.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of student ");
        int count = scanner.nextInt();


        int[] marks = new int[count];

        System.out.println("Input student's marks ");

        for (int i = 0; i < marks.length; i++) {
            marks[i]= scanner.nextInt();
        }

        double avg = StudentManager.calcAvgStudentMark(marks);
        String msg = String.format("Student's average mark is %.2f", avg);
        Printer.print(msg);
    }
}
