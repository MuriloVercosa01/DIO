
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Board;
import model.Space;
import util.BoardTemplate;

public class Main {

    private final static  Scanner scanner = new Scanner(System.in);
    private static Board board;
    private static final int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        String[] argumentos = {
            "0,0;4,false",
            "1,0;7,false",
            "2,0;9,true",
            "3,0;5,false",
            "4,0;8,true",
            "5,0;6,true",
            "6,0;2,true",
            "7,0;3,false",
            "8,0;1,false",
            "0,1;1,false",
            "1,1;3,true",
            "2,1;5,false",
            "3,1;4,false",
            "4,1;7,true",
            "5,1;2,false",
            "6,1;8,false",
            "7,1;9,true",
            "8,1;6,true",
            "0,2;2,false",
            "1,2;6,true",
            "2,2;8,false",
            "3,2;9,false",
            "4,2;1,true",
            "5,2;3,false",
            "6,2;7,false",
            "7,2;4,false",
            "8,2;5,true",
            "0,3;5,true",
            "1,3;1,false",
            "2,3;3,true",
            "3,3;7,false",
            "4,3;6,false",
            "5,3;4,false",
            "6,3;9,false",
            "7,3;8,true",
            "8,3;2,false",
            "0,4;8,false",
            "1,4;9,true",
            "2,4;7,false",
            "3,4;1,true",
            "4,4;2,true",
            "5,4;5,true",
            "6,4;3,false",
            "7,4;6,true",
            "8,4;4,false",
            "0,5;6,false",
            "1,5;4,true",
            "2,5;2,false",
            "3,5;3,false",
            "4,5;9,false",
            "5,5;8,false",
            "6,5;1,true",
            "7,5;5,false",
            "8,5;7,true",
            "0,6;7,true",
            "1,6;5,false",
            "2,6;4,false",
            "3,6;2,false",
            "4,6;3,true",
            "5,6;9,false",
            "6,6;6,false",
            "7,6;1,true",
            "8,6;8,false",
            "0,7;9,true",
            "1,7;8,true",
            "2,7;1,false",
            "3,7;6,false",
            "4,7;4,true",
            "5,7;7,false",
            "6,7;5,false","7,7;2,true","8,7;3,false","0,8;3,false","1,8;2,false","2,8;6,true","3,8;8,true","4,8;5,true","5,8;1,false","6,8;4,true","7,8;7,false","8,8;9,false"};
        final var positions = Stream.of(argumentos).collect(Collectors.toMap(
            k -> k.split(";")[0],
            v -> v.split(";")[1]
        ));
        var option = -1;

        while(true){
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option){
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione uma das opções do menu");
            }
        }
    }

    private static void startGame(Map<String , String> positions){
        if (Objects.nonNull(board)) {
            System.out.println("o jogo já foi iniciado XD");
            return;
        }

        List<List<Space>> spaces = new ArrayList<>();
        //iterando cada coluna
        for(int i = 0 ; i < BOARD_LIMIT ; i++ ){
            //criando uma List para cada coluna
            spaces.add(new ArrayList<>());
            //iterando cada linha da coluna
            for(int r = 0 ; r < BOARD_LIMIT ; r++){
                //acessando o Map onde a chave é a parte antes do ";", e o valor é separado por virgula
               var positionConfig = positions.get("%s,%s".formatted(i,r));
               var expected = Integer.parseInt(positionConfig.split(",")[0]);
               var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
               var currentSpace = new Space (expected , fixed);
               //criando o Space com o valor corresponde de cada Key e adicionando a coluna lista equivalente a coluna
               spaces.get(i).add(currentSpace);
            }   
        }
        board = new Board(spaces);
        System.out.println("o jogo está pronto para inicio");
    }
    
    private static void inputNumber(){
        if (Objects.nonNull(board)) {
            System.out.println("o jogo já foi iniciado XD");
            return;
        }
        System.out.println("Informe a coluna que em que o número será inserido");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que em que o número será inserido");
        var row = runUntilGetValidNumber(0, 8);
        System.out.printf("Informe o número que vai entrar na posição [%s,%s]\n", col, row);
        var value = runUntilGetValidNumber(1, 9);
        if (!board.changeValue(col, row, value)) {
            System.out.println("a coluna %s , linha %s tem um valor fixo\n".formatted(col , row));
        }
    }
    private static void removeNumber(){
        if (Objects.nonNull(board)) {
            System.out.println("o jogo já foi iniciado XD");
            return;
        }
        System.out.println("Informe a coluna que em que o número será removido");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha que em que o número será removido");
        var row = runUntilGetValidNumber(0, 8);
        if (!board.clearSpace(col, row)) {
            System.out.println("a coluna %s , linha %s tem um valor fixo\n".formatted(col , row));
        }
    }
    private static void showCurrentGame(){

        if (Objects.isNull(board)) {
            System.out.println("o jogo ainda não foi iniciado");
            return;
        }

        var args = new Object[81];
        var argsPos = 0;

        for(int i =0; i < BOARD_LIMIT ; i++){
            for(var col : board.getSpaces()){
                args[argsPos++] = " " + (Objects.isNull(col.get(i).getActual()) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("o jogo se encontra da seguinte forma");
        System.out.printf((BoardTemplate.BOARD_TEMPLATE) + "\n", args);

    }
    private static void showGameStatus(){
        if (!Objects.isNull(board)) {
            System.out.println("o jogo já foi iniciado");
            return;
        }

        System.out.println("o jogo se encontra no status: %s".formatted(board.getStatus().getLabel()));
        if (board.hasErrors()) {
            System.out.println("o jogo contém erros.");
        }else{
            System.out.println("o jogo não contém erros.");
        }
    }
    private static void clearGame(){
        if (!Objects.isNull(board)) {
            System.out.println("o jogo já foi iniciado");
            return;
        }
        System.out.println("tem certeza que deseja resetar o jogo e perder o seu progresso?");
        var confirm = scanner.next();
        while(!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")) {
           System.out.println("informe 'sim' ou 'não' =)"); 
           confirm = scanner.next();
        }
        if (confirm.equalsIgnoreCase("sim")) {
            board.reset();
        }
    }
    private static void finishGame(){
        if (Objects.isNull(board)) {
            System.out.println("o jogo ainda não foi iniciado xd");
            return;
        }
        if (board.gameIsFinished()) {
            System.out.println("parabéns você concluiu o jogo XD");
            showCurrentGame();
            board = null;
        }else if(board.hasErrors()){
            System.out.println("o jogo contém erros verifique-o");
        }else{
            System.out.println("nem todos os espaços foram preenchidos");
        }
    }
    private static int runUntilGetValidNumber(int mini , int max){
        var current = Integer.parseInt(scanner.nextLine());
        while (current < mini && current > max) {
            System.out.println("inform um número entre %s e %s\n".formatted(mini , max));
            current = Integer.parseInt(scanner.nextLine());
        }
        return current;
    }
}
