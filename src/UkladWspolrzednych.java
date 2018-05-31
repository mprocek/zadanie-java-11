import java.util.Scanner;

public class UkladWspolrzednych {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj X");
        double x = scan.nextDouble();
        System.out.println("Podaj Y");
        double y = scan.nextDouble();

        if(x>0 && y>0){
            System.out.printf("Punkt (%.1f, %.1f) leży w I ćwiartce układu współrzędnych.",x,y);
        }

        if(x<0 && y>0){
            System.out.printf("Punkt (%.1f, %.1f) leży w II ćwiartce układu współrzędnych.",x,y);
        }

        if(x<0 && y<0){
            System.out.printf("Punkt (%.1f, %.1f) leży w III ćwiartce układu współrzędnych.",x,y);
        }

        if(x>0 && y<0){
            System.out.printf("Punkt (%.1f, %.1f) leży w IV ćwiartce układu współrzędnych.",x,y);
        }
    }



}
