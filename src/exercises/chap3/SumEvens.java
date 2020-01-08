package exercises.chap3;

import java.util.ArrayList;

public class SumEvens {
    public static Integer sumEvens(ArrayList<Integer> arrayListNums){
        Integer sum = 0;
        for (int i = 0; i < arrayListNums.size(); i++){
            if (arrayListNums.get(i) % 2 == 0){
               sum += arrayListNums.get(i);
            }
        }
        return sum;
    }
}
