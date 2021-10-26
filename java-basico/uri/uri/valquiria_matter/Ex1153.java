package exercicio.uri.valquiria_matter;

    import java.util.Scanner;

    public class Ex1153 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int fat = 1;
            int a = sc.nextInt();

            for (int i = a; i > 1; i--) {
                fat = fat * i;
            }
            System.out.println(fat);
        }
    }

