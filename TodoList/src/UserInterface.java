/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }


    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scan.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                String added = this.scan.nextLine();
                this.list.add(added);
            } else if (input.equals("list")) {
                this.list.print();
            } else if(input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removeThis = Integer.valueOf(this.scan.nextLine());
                this.list.remove(removeThis);
            }
        }
    }

}