package Accel.L83;

import java.io.*;
import java.util.concurrent.ExecutionException;
import Accel.L83.NotaInvalidaException;

public class Main {
    /*
    Error vs Exception
    Asemanari:
    - amandoua mostenesc direct clasa Throwable
    Deosebiri:
    - Error: o problema grava la nivelul mediului de executie, care nu se trateaza, unchecked (runtime)
    - Exception: apare o situatie anormala, care se trateaza, checked (compile time) / unchecked (runtime)

    Tipuri de exceptii
    - Checked Exceptions: verificate de compilator; trebuie sa fie tratate: 
                                                    1. try-catch
                                                    2. throws
            Exemple:
            ClassNotFoundException
            FileNotFoundException
            IOException

    - Unchecked Exceptions: exceptii neverificate, apar la runtime, mostenesc RuntimeException, nu este obligatoriu sa fie tratate

            Exemple:
            ArithmeticException
            NullPointerException
            IndexOutOfBoundsException
            ArrayIndexOutOfBoundsException
            IllegalArgumentException
            NumberFormatException


    La momentul tratarii exceptiilor cu blocul try-catch putem folosi mai multe ramuri catch

    try-catch
    try-finally
    try-catch-finally

    Blocurile catch trebuie ordonate de la exceptia cea mai specifica la cea mai generala.
     */

    public static void main(String[] args) {
        // int x = 10 / 0; // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println(x);
        // method(); // Exception in thread "main" java.lang.StackOverflowError
        // int y = 10 // Accel\L83\Main.java:19: error: ';' expected EROARE DE SINTAXA / COMPILARE

        try {
            FileReader file = new FileReader("Accel\\L83\\file.txt");
            file.close();
        } catch (IOException e){
            System.out.println(e); // java.io.FileNotFoundException: file.txt (The system cannot find the file specified)
        }

        System.out.println("done");

        try {
            checkAge(14);
        } catch (Exception e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            int[] arr = {};
            System.out.println(arr[0]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceptie: " + e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException ae) {
            System.out.println("AE: " + ae);
        } catch (NullPointerException npe) {
            System.out.println("NPE: " + npe);
        } finally {
            System.out.println("finally string null");
        }

        try {
            int a = 10;
            int b = 20;
            int c = a / b;
            System.out.println("try primitive");
        } finally {
            System.out.println("finally primitive");
        }

        /*
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("AE: " + e);
        } catch (NullPointerException npe) { // Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception COMPILARE
            System.out.println("NPE: " + npe);
        }
        */

        try {
            String text = "abc";
            int numar = Integer.parseInt(text);

            System.out.println(10 / 0); // instructiunea este umbrita 
        } catch (NumberFormatException | ArithmeticException e){
            System.out.println(e.getCause());
        }
        
        try {
            readFile();
        } catch (IOException e){
            System.out.println(e.toString()); // tipul exceptiei si mesajul atasat
            System.out.println(e.getMessage()); // mesajul atasat
            e.printStackTrace(); // traseul apelurilor care au condus la aparitia exceptiei + tipul exceptiei si mesajul atasat
        }

        try {
            verificaNota(8);
            System.out.println("Nota este valida.");
        } catch (NotaInvalidaException nie) {
            System.out.println(nie.getMessage());
        } 

        System.out.println("OK");

        System.out.println();

        try{
            int x = 10 / 0;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }

        System.out.println();
        
        System.out.println(val());

        
    }

    public static int val() {
        try {
            System.out.println("try val");
            return 5;
        } finally {
            System.out.println("finally val");
        }
    }

    public static void method() {
        method();
    }

    public static void checkAge(int varsta) throws Exception {
        if (varsta < 18) {
            throw new Exception("Minor");
        }
        System.out.println("Major OK");
    }

    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void verificaNota (int nota) throws NotaInvalidaException {
        if (nota < 1 || nota > 10) {
            throw new NotaInvalidaException("Nota invalida.");
        }
    }
}
