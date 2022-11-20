import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(("Entre com o peso em kgs:"));
        float peso = entrada.nextFloat();

        System.out.println(("Entre com a altura em mts:"));
        float altura = entrada.nextFloat();

        float imc = peso / (altura*altura);

        System.out.println(" O IMC é: " + imc);


    }
}