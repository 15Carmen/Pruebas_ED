package clases;

public class Matematica {

    public static double Multiplicar (double x, double y){

        return x*y;
    }

    public static int Suma (int x, int y){
        return x+y;
    }

    public static boolean esPar(int num){

        boolean flag=false;

        if (num%2==0){
            flag=true;
        }

        return flag;
    }

    public static boolean esPar2 (int num){

        return num%2==0;
    }

}


