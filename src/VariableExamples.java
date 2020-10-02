import java.awt.image.ShortLookupTable;
import java.io.PrintStream;
import java.util.Scanner;

public class VariableExamples {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

     public static void main(String[] args) {

      //Una variable numérica de 16 bits e inicialícela con el máximo valor entero
     // que este tipo de variable puede almacenar.

        short varNum16Bits = Short.MAX_VALUE;

        out.println("El valor máximo de una variable numérica de 16 bits es: " + varNum16Bits);

     //Una variable numérica de 64 bits e inicialícela con un valor que no podría
     // ser almacenado en una variable entera de 32bits debido a su tamaño en memoria.

         long varNum64Bits = Integer.MAX_VALUE+1L;

         out.println("Un valor que no podría ser almacenado en una variable entera de 32bits es: " + varNum64Bits);

      //Una variable no entera de 64 bits e inicialícela con un valor que incluya decimales.

        double varNumNoEntera64Bits = 1257.658;

        out.println("Una variable no entera es: "+varNumNoEntera64Bits);
     }
}

