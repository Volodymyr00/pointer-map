import java.util.Scanner;

public class ZooclubManager {
    private static Scanner scanner = new Scanner(System.in);

    static void start(Zooclub zooclub) {
        System.out.println("Choose command" +
                "\n1 - Add person to map" + "\n2 - Add pet to person" + "\n3 - Remove pet from person" + "\n4 - Remove person from map" + "\n5 - Print all persons with pets" + "\n0 - Exit");
        System.out.println("++++++++++++++++");
        int command = scanner.nextInt();
        boolean isStart = true;
        while (isStart) {
            switch (command) {
                case 1:
                    System.out.println("Input person`s name:");
                    String personName = scanner.nextLine();
                    zooclub.addPerson(new Person(personName));
                    System.out.println("+++++++++++++++++++++");
                    break;
                case 2:
                    System.out.println("Input person`s name and pet`s name");
                    String personNameToAdd = scanner.nextLine();
                    String petNameToAdd = scanner.nextLine();
                    zooclub.addPetToPerson(new Person(personNameToAdd), new Pet(petNameToAdd));
                    System.out.println("+++++++++++++++++++++");
                    break;
                case 3:
                    System.out.println("Input person`s name and pet`s name");
                    String personNameToDeletePet = scanner.nextLine();
                    String petNameToDelete = scanner.nextLine();
                    zooclub.removePetFromPerson(new Person(personNameToDeletePet), new Pet(petNameToDelete));
                    System.out.println("+++++++++++++++++++++");
                    break;
                case 4:
                    System.out.println("Input person`s name ");
                    String personNameToDelete = scanner.nextLine();
                    zooclub.deletePerson(new Person(personNameToDelete));
                    System.out.println("+++++++++++++++++++++");
                    break;
                case 5:
                    System.out.println("Input pet`s name: ");
                    String personNameToDeleteAllPets = scanner.nextLine();
                    zooclub.deletePetFromAllPersons(new Pet(personNameToDeleteAllPets));
                    System.out.println("+++++++++++++++++++++");
                    break;
                case 6:
                    zooclub.printZooClub();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
                    break;
                case 0:
                    isStart = false;
                default:
                    System.out.println("EXIT");
                    System.exit(0);
            }
        }
    }
}
