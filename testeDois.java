import java.util.Scanner;

public class testeDois {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int i = idade.nextInt();

        if(i >= 18){
            System.out.println("Você pode entrar aqui.");
        } else{
            System.out.println("Você é menor de idade, é proibido entrar aqui.");
        }
    }
}
