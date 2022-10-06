package exercicio.uri.ana_cruz;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1, word2, word3, animal = "";

        word1 = scanner.next();
        word2 = scanner.next();
        word3 = scanner.next();

        switch (word1){
            case "vertebrado":
                switch (word2){
                    case "ave":
                        if (word3.equals("carnivoro")){
                            animal = "aguia";
                        } else if (word3.equals("mamifero")){
                            animal = "pomba";
                        }
                        break;
                    case "mamifero":
                        if (word3.equals("onivoro")){
                            animal = "homem";
                        } else if (word3.equals("herbivoro")){
                            animal = "vaca";
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "invertebrado":
                switch (word2){
                    case "inseto":
                        if (word3.equals("hematofago")){
                            animal = "pulga";
                        } else if (word3.equals("herbivoro")){
                            animal = "lagarta";
                        }
                        break;
                    case "anelideo":
                        if (word3.equals("hematofago")){
                            animal = "sanguessuga";
                        } else if (word3.equals("onivoro")){
                            animal = "minhoca";
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        System.out.println(animal);

        scanner.close();
    }
}
