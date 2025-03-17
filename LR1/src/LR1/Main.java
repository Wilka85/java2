package LR1;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        String task;
        Scanner input = new Scanner(System.in);
        task = input.nextLine();
        switch (task)
        {
            case "1":
                first();
                break;
            case "2":
                second();
                break;
            case "3":
                third();
                break;
            case "4":
                fourth();
                break;
            case "5":
                fifth();
                break;
            default:
                System.out.println("Incorrect");
                break;
        }
        input.close();
    }

    public static void first() {
        System.out.println(4 / 2 + Math.pow(3, 2));
    }

    public static void second() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int size;
        while (true) {
            if ((Integer.parseInt(s)) > 0) {
                size = Integer.parseInt(s);
                break;
            } else {
                System.out.println("Once again");
            }
        }
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 20);
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
            if (arr[i] % 10 == 5) {
                temp.add(1);
            }
        }
        int[] second = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            second[i] = temp.get(i);
        }
        System.out.println();
        System.out.println(Arrays.toString(second));
        in.close();
    }

    public static void third() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int size;
        while (true) {
            if ((Integer.parseInt(str) > 0) && (Integer.parseInt(str) % 2 != 0)) {
                size = Integer.parseInt(str);
                break;
            } else {
                System.out.println("Incorrect");
            }
        }
        int[][] magic = new int[size][size];
        int number = 1;
        int row = 0;
        int col = size / 2;

        while (number <= size * size) {
            magic[row][col] = number++;
            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;
            if (magic[newRow][newCol] != 0) {
                row = (row + 1) % size;
            } else {
                row = newRow;
                col = newCol;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
        in.close();
    }

    public static void fourth() {
        Scanner input = new Scanner(System.in);
        String task = input.nextLine();
        switch (task) {
            case "3":
                String tempTask = input.nextLine();
                switch (tempTask) {
                    case "1":
                        System.out.println("Monday");
                        break;
                    case "2":
                        System.out.println("Tuesday");
                        break;
                    case "3":
                        System.out.println("Wednesday");
                        break;
                    case "4":
                        System.out.println("Thursday");
                        break;
                    case "5":
                        System.out.println("Friday");
                        break;
                    case "6":
                        System.out.println("Saturday");
                        break;
                    case "7":
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Error");

                }
                break;
            case "4":
                tempTask = input.next();
                switch (tempTask) {
                    case "Moscow":
                        System.out.println("Russia");
                        break;
                    case "London":
                        System.out.println("GB");
                        break;
                    case "Madrid":
                        System.out.println("Spain");
                        break;
                    case "Managua":
                        System.out.println("Nicaragua");
                        break;
                    case "Rome":
                        System.out.println("Italy");
                        break;
                    default:
                        System.out.println("Error");

                }
                break;
            case "5":
                String n = input.nextLine();
                int size;
                while (true) {
                    if (Integer.parseInt(n) > 0) {
                        size = Integer.parseInt(n);
                        int summa = 0;
                        for (int i = 1; i <= size; i++) {
                            if (i % 2 != 0) {
                                summa += i;
                            }
                        }
                        System.out.println(summa);
                        break;
                    } else {
                        break;
                    }
                }
                break;
            default:
                System.out.println("Error");

        }
        input.close();
    }

    public static void fifth() {
        for (int i = 1; i <= 20; i++) {
            if (i >= 2 && i <= 5) {
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
