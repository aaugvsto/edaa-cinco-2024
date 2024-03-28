package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        System.out.println("Atividade 1");

        int[] arr = Util.GetArrayAtividadeUm();
        int left1 = 0;
        int right1 = arr.length - 1;
        int[] numbersToFind1 = { 415, 545, 390, 609, 296 };

        for (int key : numbersToFind1) {
            int index = Util.buscaBinariaRecursiva(arr, key, left1, right1);
            Util.ShowMessageConsole(index, key);
        }

        System.out.println("\nAtividade 2");

        int[] arr2 = Util.GetArrayAtividadeDois();

        int left2 = 0;
        int right2 = arr2.length - 1;
        int[] numbersToFind2 = { 824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 143, 421, 422 };

        for (int key: numbersToFind2){
            int index = Util.buscaBinariaRecursiva(arr2, key, left2, right2);
            Util.ShowMessageConsole(index, key);
        }

        System.out.println("\nAtividade 3");

        int[] arr3 = Util.GetArrayAtividadeTres();

        int left3 = 0;
        int right3 = arr3.length - 1;
        int[] numbersToFind3 = {1860, 1440, 1521, 1040, 1225, 1370, 1579, 1901, 1515, 1770, 1620, 1095, 1263, 1105};

        System.out.println("Registro: " + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")) + "\n");
        for (int key: numbersToFind3){
            int index = Util.buscaBinariaRecursiva(arr3, key, left3, right3);
            Util.ShowMessageConsoleAtividade3(index, key);
        }

        System.out.println("\nAtividade 4");

        int[] arr4 = Util.GetArrayAtividadeQuatro();

        int left4 = 0;
        int right4 = arr4.length - 1;
        int[] numbersToFind4 = { 285964, 199976, 323739 };

        for (int key: numbersToFind4){
            int index = Util.buscaBinariaRecursiva(arr4, key, left4, right4);

            switch (key){
                case 285964:
                    System.out.println("Andrômeda está no " + (index + 1) + "º guarda volume.");
                    break;
                case 199976:
                    System.out.println("Galáxia do Olho Negro está no " + (index + 1) + "º guarda volume.");
                    break;
                case 323739:
                    System.out.println("Objeto de Hoag está no " + (index + 1) + "º guarda volume.");
                    break;
                default:
                    System.out.println("Galáxia informada não está em nenhum guarda volume");
                    break;
            }
        }
    }
}