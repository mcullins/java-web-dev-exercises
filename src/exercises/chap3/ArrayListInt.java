package exercises.chap3;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args){
        ArrayList<Integer> randomNum = new ArrayList<>();
        randomNum.add(5);
        randomNum.add(15);
        randomNum.add(51);
        randomNum.add(6);
        randomNum.add(5);
        randomNum.add(56);
        randomNum.add(2);
        randomNum.add(25);
        randomNum.add(30);
        randomNum.add(46);
        System.out.println(SumEvens.sumEvens(randomNum));
    }
}
