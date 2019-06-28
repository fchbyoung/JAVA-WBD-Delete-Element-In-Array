import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,26,97,96,5};
        System.out.print("Array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nEnter an element to delete: ");
        int element = scanner.nextInt();

        int indexDelete = 0;

        for (int i = 0; i < array.length; i++) {
            if(element == array[i]) {
                indexDelete = i;
                for (int j = indexDelete; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }

        System.out.print("Array list after to delete: ");
        for (int i = 0; i < array.length -1; i++) {
            System.out.print(array[i] + "\t");
        }

    }

}
