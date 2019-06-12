package tasks;
import java.util.ArrayList;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber rn = new ReverseNumber();
        System.out.println(rn.reverse1(1389774) +" \n");
        System.out.println(rn.reverse2(1389774) +" \n");
    }

    int reverse1(int n){
        ArrayList<Integer> temp = new ArrayList<>();

        while(n != 0){
            temp.add(n % 10);
            n /= 10;
        }
        int ans = 0, size = temp.size() - 1;
        for(int i = size; i >= 0; --i){
            ans += (temp.get(size-i)*Math.pow(10, i));
        }
        return ans;
    }

    int powerOf10(int n){
        int power = 0;
        while((n/=10) != 0){
            ++power;
        }
        return power;
    }
    int reverse2(int n){
        int q = 0;
        int p = powerOf10(n);
     //   System.out.println(p);
        int ans = 0;
        while(n != 0){
            ans += ((n % 10)*Math.pow(10, p--));
            n /= 10;
        }
        return ans;
    }
}
