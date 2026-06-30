import java.util.*;
public class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number To Convert To Binary : ");
        int dec = sc.nextInt();
        int quo,rem;
        quo = dec;
        String bin = "";
        do{
            if(dec == 0 || dec == 1){
                System.out.println(dec+" in Binary is : "+dec);
                System.exit(0);
            }
            rem = quo%2;
            quo/=2;
            bin+=Integer.toString(rem);
        } while(quo!=1);
        bin+="1";
        StringBuilder sb = new StringBuilder(bin);
        System.out.println(dec+" in Binary is : "+sb.reverse());
    }
}