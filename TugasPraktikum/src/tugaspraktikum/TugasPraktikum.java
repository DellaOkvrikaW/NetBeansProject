package tugaspraktikum;
import java.io.*;
public class TugasPraktikum {
    public static void main(String[] args) 
        throws IOException{
        System.out.println("*********************************");
        System.out.println("        WARNING : ");
        System.out.println("Input yang dimasukkan Wajib Angka");
        System.out.println("*********************************\n");
        System.out.println("Masukkan Sebuah Bilangan : ");
        String temp; 
        double num = 0;
        
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader baca = new BufferedReader (input);
        temp = baca.readLine();
        try{
            num = Double.parseDouble(temp);
        }
        catch(NumberFormatException nfe) {
            System.out.println("Maaf, Data yang anda masukkan bukan bilangan");
        }
        finally{
            System.out.println("Input yang dimasukkan sudah dicek");
        }
        System.out.println("Bilangan yang dimasukkan" +"adalah "+num);
    }
    }
    

