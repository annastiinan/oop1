package main;
//Annastiina


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog("Pikseli", 5);
        int choose;
    
        do {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            choose = scanner.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                   
                case 1:
                    System.out.print("Mitä siili sanoo:\n");
                    scanner.nextLine();
                    String message = scanner.nextLine();

                    if (message.trim().isEmpty()) {
                        hedgehog.askForInput();
                    } else {
                    hedgehog.speak(message);}
                    break;

                case 2:
                    System.out.println("Anna siilin nimi:");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.println("Anna siilin ikä:");
                    int newAge = scanner.nextInt();
                    hedgehog = new Hedgehog(newName, newAge);
                    break;
                
                case 3:
                    System.out.print("Kuinka monta kierrosta?\n");
                    int rounds = scanner.nextInt();
                    hedgehog.run(rounds);
                    break;

                default:
                    System.out.println("Syöte oli väärä");
                    break;
            }

        } while (choose !=0);
        scanner.close();
    } 
}
