//Задача: вызов лифта
//В доме два лифта.
//Реализовать алгоритм отправки ближайшего лифта на вызывающий этаж.
//Алгоритм будет применяться в домах разной этажности.
//*Алгоритм будет применяться в домах с количеством >= 2 лифтов

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Elevator {
    private int elevatorOnFloor;
    private int callingFloor;
    public Elevator() {
    }

    public int getElevatorOnFloor() {
        return elevatorOnFloor;
    }

    public void setElevatorOnFloor(int elevatorOnFloor) {
        this.elevatorOnFloor = elevatorOnFloor;
    }

    public int getCallingFloor() {
        return callingFloor;
    }

    public void setCallingFloor(int callingFloor) {
        this.callingFloor = callingFloor;
    }

    public int getDifference() {
        return Math.abs(callingFloor - elevatorOnFloor);
    }


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество этажей в доме: ");
        int numberOfFloors = scanner.nextInt();
        System.out.print("Введите количество лифтов в доме: ");
        int numberOfElevators = scanner.nextInt();

        List<Elevator> listOfElevators = new ArrayList<>();

        for (int i = 0; i < numberOfElevators; i++) {
            listOfElevators.add(new Elevator());
        }


        for (int i = 0; i < numberOfElevators; i++) {
            while (true) {
                System.out.print("На каком этаже находится лифт " + (i+1) + "?: ");
                int elevatorOnFloor = scanner.nextInt();
                if (elevatorOnFloor <= numberOfFloors && elevatorOnFloor >= 1) {
                    listOfElevators.get(i).setElevatorOnFloor(elevatorOnFloor);
                    break;
                } else {
                    System.out.println("Введенный этаж не соответствует количеству этажей в доме. Попробуйте еще раз");
                }
            }
        }


        while (true) {
            System.out.print("На какой этаж вызывается лифт ?: ");
            int callingFloor = scanner.nextInt();
            if (callingFloor <= numberOfFloors && callingFloor >= 1) {
                for (int i = 0; i < numberOfElevators; i++) {
                    listOfElevators.get(i).setCallingFloor(callingFloor);
                }
                break;
            } else {
                System.out.println("Введенный этаж не соответствует количеству этажей в доме. Попробуйте еще раз");
            }
        }

        listOfElevators.stream()
                .sorted(Comparator.comparingInt(Elevator::getDifference)
                        .thenComparing((elevator1, elevator2) -> elevator2.getElevatorOnFloor() - elevator1.getElevatorOnFloor())).wait();

        System.out.println("Ближайший лифт к вызывающему этажу " + listOfElevators.get(0).getCallingFloor() + " находится на этаже " + listOfElevators.get(0).getElevatorOnFloor());

    }
}
