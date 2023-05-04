package Day1.BT2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ ký tự xuống dòng sau khi đọc số nguyên
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Mark: ");
            double mark = Double.parseDouble(scanner.nextLine());
            scanner.nextLine(); // đọc bỏ ký tự xuống dòng sau khi đọc số thực
            students[i] = new Student(id, name, mark);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("ID: " + students[i].getId());
            System.out.println("Name: " + students[i].getName());
            System.out.println("Mark: " + students[i].getMark());
        }

        double totalMark = 0;
        for (int i = 0; i < students.length; i++) {
            totalMark += students[i].getMark();
        }
        double averageMark = totalMark / students.length;
        System.out.println("Average mark: " + averageMark);
    }
}

