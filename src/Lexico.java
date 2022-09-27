package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lexico {
    private char[] conteudo;
    private int indiceConteudo;
    
    public Lexico(String caminhoCodigoFonte){
        try {
            String conteudoStr;
            conteudoStr = new String(Files.readAllBytes(Paths.get(caminhoCodigoFonte)));
            this.conteudo = conteudoStr.toCharArray();
            this.indiceConteudo = 0;                        
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }
    
    private char nextChar(){
        return this.conteudo[this.indiceConteudo++];
    }
    
    private boolean hasNextChar(){
        return indiceConteudo < this.conteudo.length;
    }
    
    private void back(){
        this.indiceConteudo--;
    }
       
    private boolean isLetra(char c){
        return (c >= 'a') && (c <= 'z');
    }

    private boolean isDigito(char c){
        return (c >= '0') && (c <= '9');
    }

    private boolean isSpace(char c){
        return c == ' ' || c == '\r' || c == '\n';
    }

    private boolean isEquals(char c){
        return c == '=';
    }

    private boolean 

    public Token nextToken(){

        if(!hasNextChar()){
            return new Token("", 99);
        }
        char c = nextChar();
        while(isSpace(c)){
            if(!hasNextChar()){
                break;
            }
            c = nextChar();
        }
        if(isSpace(c)){
            return new Token("", 99); 
        }




        if(hasNextChar(c)){

        }

        Token token = null;
        
        c = this.nextChar();

        return token;
    }   
}
