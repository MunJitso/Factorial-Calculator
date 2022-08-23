import java.util.Scanner;

public class Main {
    public static int factorialCalculator(int number, int[] list){
        if(!(number <= 0)) {
            int i = 0;
            while (i < list.length){
                if (list[i] == 0) {
                    list[i] = number;
                    factorialCalculator(number - 1, list);
                } else i++;
            }
        }
        int total = 1;
        for (int num: list) total *= num;
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] list = new int[input];

        System.out.println(factorialCalculator(input, list));
    }
}
