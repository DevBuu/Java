import java.util.*;
public class Main{
    public static void main(String[] args){
        float b;
        float h;
        float area;
        Scanner leia = new Scanner(System.in);
        System.out.print("Base: ");
        b = leia.nextFloat();
        System.out.print("Altura: ");
        h = leia.nextFloat();
        area = (b*h)/2;
        System.out.print("Area = "+ area);
    }
}
