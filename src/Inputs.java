
import java.util.Scanner;

public class Inputs {

    public static String askString(){
        return new Scanner(System.in).nextLine();
    }

    public static Sexo askSexo(){
        String check = new Scanner(System.in).nextLine().toUpperCase();
        if (!check.equals("HOMBRE") && !check.equals("MUJER")) check = "NO";

        return Sexo.valueOf(check);
    }

    public static double askDouble(){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()){
            System.out.println("dime un numero valido");
            return askDouble();
        }
        return sc.nextDouble();
    }
    public static boolean askBoolean(){
        Scanner sc = new Scanner(System.in);
        String aux = sc.nextLine().toLowerCase();
        return aux.equals("si");
    }
    public static int askInt(){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()){
            System.out.println("dime un numero valido");
            return askInt();
        }
        return sc.nextInt();
    }



}
