/*  *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learning_management.system;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class LEARNING_MANAGEMENTSYSTEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+\\d+");

        int savedId = 0;
        String enrolledCourses = "";
        String savedName = "";
        String savedPassword = "";

        System.out.println("LEARNING MANAGEMENT SYSTEM");
        int choose;

        do {
            System.out.println("1. Login");
            System.out.println("2. Create an account?");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choose = input.nextInt();

            if (choose == 2) {
                System.out.print("Enter student id (just 3 digit): ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter password: ");
                String pass = input.nextLine();
                Matcher match = pattern.matcher(pass);

                if (match.matches()) {
                    if (id == savedId) {
                        System.out.println("ID already exists!");
                    } else {
                        savedId = id;
                        savedName = name;
                        savedPassword = pass;
                        System.out.println("Account created successfully!");
                    }
                } else {
                    System.out.println("Enter password with alphabets and end with digits.");
                }

            } else if (choose == 1) {
                System.out.print("Enter id (3 digit): ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Enter password: ");
                String pass = input.nextLine();

                if (id == savedId && pass.equalsIgnoreCase(savedPassword)) {
                    int choice;
                    do {
                        System.out.println("1. Courses");
                        System.out.println("2. Quiz");
                        System.out.println("3. Status");
                        System.out.println("4. Exit");
                        System.out.print("choose option: ");
                        choice = input.nextInt();

                        if (choice == 1) {
                            System.out.println("Available Courses:");
                            System.out.println("1. Java\n2. Python\n3. C++\n4. Machine Learning\n5. Artificial Intelligence");
                            System.out.print("Choose course to enroll: ");
                            int course = input.nextInt();

                            switch (course) {
                                case 1:
                                    enrolledCourses += "Java, ";
                                    System.out.println("Enrolled in Java successfully!");
                                    break;
                                case 2:
                                    enrolledCourses += "Python, ";
                                    System.out.println("Enrolled in Python successfully!");
                                    break;
                                case 3:
                                    enrolledCourses += "C++, ";
                                    System.out.println("Enrolled in C++ successfully!");
                                    break;
                                case 4:
                                    enrolledCourses += "Machine Learning, ";
                                    System.out.println("Enrolled in Machine Learning successfully!");
                                    break;
                                case 5:
                                    enrolledCourses += "Artificial Intelligence, ";
                                    System.out.println("Enrolled in Artificial Intelligence successfully!");
                                    break;
                                default:
                                    System.out.println("Invalid course selected.");
                            }

                        } else if (choice == 2) {
                            System.out.println("Quiz Started:");
                            int n=1;
                            char[][] answers = new char[2][5];
                            input.nextLine();
                            for (int i = 0; i < answers.length; i++) {
                                System.out.println("Enter answers for Student "+ (i+1) + ":");
                                
                                for (int j = 0; j < answers[i].length; j++) {
                                    if(j==0){
                                        System.out.print("2+2=?\nA.2\nB. 3 \nC. 6\nD. 4\nanswer:");
                                    }else if(j==1){
                                        System.out.print("2+3=?\nA.2\nB. 5 \nC. 6\nD. 4\nanswer:");
                                    }else if(j==2){
                                        System.out.print("2*8=?\nA.2\nB. 3 \nC. 6\nD. 16\nanswer:");
                                    }else if(j==3){
                                        System.out.print("16/4=?\nA.2\nB. 3 \nC. 4\nD. 8\nanswer:");
                                    }else if(j==4){
                                        System.out.print("27/3=?\nA.9\nB. 3 \nC. 6\nD. 4\nanswer:");
                                    }
//                                    System.out.print("Answer for Question " + (j+1) + ": ");
                                    answers[i][j] = input.next().toUpperCase().charAt(0);
//                                     n=n+1;
                                }
                               
                            }

                            char[] keys = {'D','B','D','C','A'};

                            for (int i = 0; i < answers.length; i++) {
                                int correctCount = 0;
                                for (int j = 0; j < answers[i].length; j++) {
                                    if (answers[i][j] == keys[j])
                                        correctCount++;
                                }
                                System.out.println("Student " + n + "'s correct count is " + correctCount);
                                n+=1;
                            }

                        } else if (choice == 3) {
                            System.out.println("ID: " + savedId);
                            System.out.println("Name: " + savedName);
                            System.out.println("Courses enrolled: " + enrolledCourses);
                        }

                    } while (choice != 4);

                } else {
                    System.out.println("Invalid ID or Password.");
                }
            }

        } while (choose != 3);

        System.out.println("Exiting... Thank you!");
    }
}

