package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int valinta;
        do 
        { //valikko ensi
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            valinta = scanner.nextInt(); //muista sulkea skanneri

            switch (valinta) //pitäiskö olla englanniksi tho
            {
                case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    int kulkuneuvoValinta = scanner.nextInt();
                    scanner.nextLine();
                    switch (kulkuneuvoValinta) 
                    {
                        case 1:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String autoValmistaja = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String autoMalli = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int autoHuippunopeus = scanner.nextInt();
                            vehicles.add(new Car(autoValmistaja, autoMalli, autoHuippunopeus));
                            break;
                        case 2:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String lentokoneValmistaja = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String lentokoneMalli = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int lentokoneHuippunopeus = scanner.nextInt();
                            vehicles.add(new Plane(lentokoneValmistaja, lentokoneMalli, lentokoneHuippunopeus));
                            break;
                        case 3:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String laivaValmistaja = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String laivaMalli = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int laivaHuippunopeus = scanner.nextInt();
                            vehicles.add(new Ship(laivaValmistaja, laivaMalli, laivaHuippunopeus));
                            break;
                        default:
                            System.out.println("Virheellinen valinta!");
                            break;
                    }
                    break;
                case 2:
                    for (Vehicle vehicle : vehicles) 
                    {
                        System.out.println(vehicle.type + ": " + vehicle.manufacturer + " " + vehicle.model);
                        System.out.println("Moottori: " + vehicle.engine.name + " " + vehicle.engine.power + "kW");
                        System.out.println("Huippunopeus: " + vehicle.maxSpeed + "km/h\n");
                    }
                    break;
                case 3:
                    for (Vehicle vehicle : vehicles) 
                    {
                        if (vehicle instanceof Car) 
                        {
                            ((Car) vehicle).drive();
                        }
                    }
                    break;
                case 4:
                    for (Vehicle vehicle : vehicles) 
                    {
                        if (vehicle instanceof Plane) 
                        {
                            ((Plane) vehicle).fly();
                        }
                    }
                    break;
                case 5:
                    for (Vehicle vehicle : vehicles) 
                    {
                        if (vehicle instanceof Ship) 
                        {
                            ((Ship) vehicle).sail();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    break;
                default:
                    System.out.println("sos tilaisuus");
                    break;
            }
        } while (valinta != 0);
     scanner.close();
    }
   
}