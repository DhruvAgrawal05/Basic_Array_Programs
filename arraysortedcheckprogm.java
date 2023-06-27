import java.util.*;
public class arraysortedcheckprogm{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of Array");
    //to get size of array
    int size = sc.nextInt();

    int num[] = new int[size];

    for(int i=0;i<num.length;i++){
        //to get numbers in array
        num[i] = sc.nextInt();
    }

    int a = num[0]; 

    for(int i=0;i<num.length;i++){
        for(int j=1;j<num.length;j++){
            if(num[i]< num[j]){
            
        System.out.println("ture");
        }
        else{
            System.out.println("No");
        }

        }
        
        
    }
}


}