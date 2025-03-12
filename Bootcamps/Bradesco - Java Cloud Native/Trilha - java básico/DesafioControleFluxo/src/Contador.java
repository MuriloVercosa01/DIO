import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in);) {
            System.out.println("por favor, digite um número inteiro ");
            int param1 = Integer.parseInt(scan.nextLine());
            System.out.println("digite outro número inteiro");
            int param2 = Integer.parseInt(scan.nextLine());
            contador(param1 , param2);
        } catch (ParametroInvalidoException | NumberFormatException  e) {
            if (e instanceof ParametroInvalidoException) {
                System.out.println("o Primeiro parâmetro deve ser menor que o segunda parâmetro");
            }else{
                System.out.println("Você deve insirir um número inteiro");
            }
            e.printStackTrace();
        }
    }
    public static void contador(int param1 , int param2){
        if (param1 > param2) {
            throw new ParametroInvalidoException();
        }
        System.out.println("----------------");
        System.out.println("contagem:");
        for(int i = param1; i<=param2; i++){
            System.out.println("Número: "+ i);
        }
    }
}
