import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ContaBanco cliente1 = new ContaBanco();
        System.out.println("Por favor digite seu nome");
        cliente1.setCustumerName(scan.nextLine());
        System.out.println("Por favor, digite o número da Agência (4 digitos)");
        cliente1.setAgency(scan.nextLine());
        System.out.println("Por favor, digite o numero da conta (4 digitos)");
        cliente1.setAcountNumber(scan.nextInt());
        System.out.println("Por favor digite seu saldo");
        cliente1.setBalance(scan.nextDouble());
        System.out.println("Olá "+cliente1.getCustumerName()+ " obrigado por criar uma conta em nosso banco, sua agência é "+cliente1.getAgency()+
        " conta "+ cliente1.getAcountNumber() + " e seu saldo: "+cliente1.getBalance()+" já está disponível" );
        scan.close();
    }
}
