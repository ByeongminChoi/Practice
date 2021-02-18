import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){ // 시간복잡도상 굳이 while문을 사용할 필요가 없다
            if(n%i == 0){
                sum += i;
                //n = n/i; 소인수분해 시 i = 2 시작
            }
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}