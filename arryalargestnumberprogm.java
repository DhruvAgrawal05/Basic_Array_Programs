import java.util.*;
public class arryalargestnumberprogm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        //to get size of array
        int key = sc.nextInt();

        int num[] = new int[key];
        System.out.println("Enter Elements of Array:");
        for (int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i=0;i<num.length;i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);

    }
    
}
