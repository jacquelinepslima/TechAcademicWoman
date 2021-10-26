package exercicio.uri.maressa_oliveira;

import java.io.IOException;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) throws IOException {
        double x1,y1,x2,y2,dist;
        Scanner cal = new Scanner(System.in);
        x1=cal.nextDouble();
        y1=cal.nextDouble();
        x2=cal.nextDouble();
        y2=cal.nextDouble();
        dist=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("%.4f%n",dist);
        cal.close();
    }
}