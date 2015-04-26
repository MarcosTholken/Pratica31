import static java.lang.Character.toUpperCase;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class Pratica31 {
    
    private static String meuNome;
    private static Date inicio;
    private static Date fim;
    private static  GregorianCalendar dataNascimento;
    
    public static void main(String[] args) {
        meuNome = "mArCOs tHöLKen";
        
        inicio = new Date();
        
        String maisculo = meuNome.toUpperCase();
        
        String sobrenome;        
        char inicialNome;
        char inicialSobrenome;
        
        meuNome = meuNome.toUpperCase();
        System.out.println(meuNome);
        
        sobrenome = meuNome.substring(8);
        sobrenome = sobrenome.toLowerCase();
        inicialSobrenome = meuNome.charAt(7);
        inicialSobrenome = toUpperCase(inicialSobrenome);
        inicialNome = meuNome.charAt(0);
        inicialNome = toUpperCase(inicialNome);
        
        System.out.println(inicialSobrenome + sobrenome + ", " + inicialNome + ".");
               
        Calendar dataAtual = Calendar.getInstance();
        
        dataNascimento = new GregorianCalendar(1994, 9, 14);
        long dif = dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis();
        
        dif = dif/1000/60/60/24;
        
        System.out.println("Tempo total em dias: " + dif);
        
        fim = new Date();
        
        long tempo = fim.getTime() - inicio.getTime();
        System.out.println(tempo + "ms");
    }
}