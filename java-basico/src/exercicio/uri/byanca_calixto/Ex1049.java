package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String A = "";
        String B = "";
        String C = "";

        A = scanner.next();
        B = scanner.next();
        C = scanner.next();

        if (A.equals("vertebrado")) {
            if (B.equals("ave")) {
                if (C.equals("carnívoro")) {
                    System.out.println("Águia.");
                }
            }
        }

        if (A.equals("vertebrado")) {
            if (B.equals("ave")) {
                if (C.equals("onívoro")) {
                    System.out.println("Pomba.");
                }
            }
        }

        if (A.equals("vertebrado")) {
            if (B.equals("mamífero")) {
                if (C.equals("onívoro")) {
                    System.out.println("Homem.");
                }
            }
        }

        if (A.equals("vertebrado")) {
            if (B.equals("mamífero")) {
                if (C.equals("herbívoro")) {
                    System.out.println("Vaca.");
                }
            }
        }

        if (A.equals("invertebrado")) {
            if (B.equals("inseto")) {
                if (C.equals("hematófago")) {
                    System.out.println("Pulga.");
                }
            }
        }

        if (A.equals("invertebrado")) {
            if (B.equals("inseto")) {
                if (C.equals("herbívoro")) {
                    System.out.println("Lagarta.");
                }
            }
        }

        if (A.equals("invertebrado")) {
            if (B.equals("anelídeo")) {
                if (C.equals("hematófago")) {
                    System.out.println("Sanguessuga.");
                }
            }
        }

        if (A.equals("invertebrado")) {
            if (B.equals("anelídeo")) {
                if (C.equals("onívoro")) {
                    System.out.println("Minhoca.");
                }
            }
        }

        scanner.close();
    }
}
