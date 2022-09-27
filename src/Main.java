package src;

public class Main {

    public static void main(String[] args) {
        Lexico arquivo = new Lexico("src\\AnalisadorLexico\\arquivo.txt");
        Token token = new Token("inicio", 0);
        while(99 != token.getTipo()){
            token = arquivo.nextToken();
            System.out.println(arquivo);
        }
    }
}