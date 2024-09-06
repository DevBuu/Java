import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double f;
        double c;
        System.out.print("Digite a temperatura em Farenheit :");
        f = s.nextDouble();
        c = (f - 32)*5/9;
        System.out.printf("A temperatura em celcius é %.2f \n", c);
    }
}
        