package com.solvd.service.serviceWork;

import com.solvd.service.comp.ChoiceComp;
import com.solvd.service.comp.Comp;
import com.solvd.service.person.Client;
import com.solvd.service.person.Master;
import com.solvd.service.repair.Diagnostics;
import com.solvd.service.repair.Repair;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose the service: " + "\nrepair - 1" + "\ndiagnostics - 2");
        Scanner serviceId = new Scanner(System.in);
        serviceId.nextInt();

        Scanner modelComp = new Scanner(System.in);
        System.out.println("Укажите note OR desk OR mono");

        try {
            Comp comp = new ChoiceComp().choiceCompModel(modelComp.nextLine());
            comp.inputData();
            System.out.println(comp);


            Client client = new Client();
            client.inputClientData(1, "Ivan", "Ivanov", "55544", 6);
            System.out.println(client);

            Master master = new Master("vip");
            System.out.println(master);

            new Diagnostics().diagnoseProcess(3,1);
            new Repair().diagnoseProcess(3,1);

        } catch (NullPointerException e) {
            System.out.println("Error creating object");
        }
    }
}
