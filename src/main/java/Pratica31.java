
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
    private static String meuNome = "Marcos Thölken";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1995, 7, 23);
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        
        System.out.println(meuNome.toUpperCase());
        
        String nomeFormatado;
        
        nomeFormatado = meuNome.substring(6, 7).toUpperCase() +
                meuNome.substring(7, 14).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + ". ";
        
        System.out.println(nomeFormatado + "\n");
        
        System.out.println((inicio.getTime() - dataNascimento.getTimeInMillis())
        %(1000*3600*24));
        
        fim = new Date();
        
        long ms = fim.getTime() - inicio.getTime();
        
        System.out.println(ms);
        
    }
}
