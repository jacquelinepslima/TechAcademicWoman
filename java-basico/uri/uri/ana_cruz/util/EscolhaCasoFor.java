package exercicio.uri.ana_cruz.util;

public class EscolhaCasoFor {
    public static void main(String[] args) {
        int dia = 3;
        String diaSemana;

        if (dia == 1)
            diaSemana = "domingo";
        else if(dia == 2)
            diaSemana = "segunda";
        else if(dia == 3)
            diaSemana = "terca";
        else if(dia == 4)
            diaSemana = "quarta";
        else if(dia == 5)
            diaSemana = "quinta";
        else if(dia == 6)
            diaSemana = "sexta";
        else if(dia == 7)
            diaSemana = "sábado";
        else diaSemana = "invalido";

        System.out.println("Hoje é: " + diaSemana);

        System.out.println();
        System.out.println();
        System.out.println();

        switch (dia){
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda";
                break;
            case 3:
                diaSemana = "terca";
                break;
            case 4:
                diaSemana = "quarta";
                break;
            case 5:
                diaSemana = "quinta";
                break;
            case 6:
                diaSemana = "sexta";
                break;
            case 7:
                diaSemana = "sábado";
                break;
            default:
                diaSemana = "invalido";
                break;
        }

        System.out.println("Hoje é: " + diaSemana);
    }
}
