import java.util.Arrays;

public class pairsinarrayprogm {
    public static void printPairs(int num[]){
        for(int i = 0; i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                System.out.println(num[i] +" " + num[j]);
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};

        printPairs(num);
    }

}
