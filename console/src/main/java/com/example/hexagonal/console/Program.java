package com.example.hexagonal.console;

import com.example.hexagonal.application.MembershipManager;
import com.example.hexagonal.common.MembershipRepository;
import com.example.hexagonal.persistence.InMemoryMembershipRepository;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        MembershipRepository repository = new InMemoryMembershipRepository();
        MembershipManager manager = new MembershipManager(repository);

        Scanner scanner = new Scanner(System.in);
        int option;
        do {

            System.out.println("1. Add new member\n2. Exit");
            option = scanner.nextInt();

            if(option == 1) {
                System.out.println("Member ID:");
                int memberId = scanner.nextInt();
                System.out.println("Member Name:");
                String name = scanner.next();

                boolean memberAdded = manager.registerNewMember(memberId, name);
                System.out.println("Member added: " + memberAdded);
            }

        } while (option == 1);

    }

}
