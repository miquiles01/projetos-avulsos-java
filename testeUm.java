import java.util.Scanner;

public class testeUm {

    public static void main(String[] args) {

        Scanner teste = new Scanner(System.in);

        System.out.println("Hello, world!");
        System.out.println("esse é apenas um teste, vamos ver se eu ainda sei algumas coisinhas");

        System.out.println("Qual a primeira nota do aluno? ");
        float n1 = teste.nextFloat();

        System.out.println("Qual a segunda nota do aluno? ");
        float n2 = teste.nextFloat();

        float media = (n1 + n2) / 2;


        System.out.println("A média do aluno é: " + media);

    }
}