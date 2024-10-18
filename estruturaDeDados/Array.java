package estruturaDeDados;

public class Array{
    public static void main(String[] args) {
        int [] num = new int[10];
        System.out.println(num);
        System.out.println(num[3]);
        num[0] = 15;
        num[1] = 8;
        num[2] = 20;
        for (int n = 0;n < num.length; n++)
            System.out.println(num[n]);
        
        System.out.println("Printando os dados de outra forma");
        for(int n =0; n < num.length; n++){

        }

    }
}