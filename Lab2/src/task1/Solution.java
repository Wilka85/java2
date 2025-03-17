package task1;

import java.util.Random;

public class Solution {
    private int[] znach;
    private  int[] vesa;
    private Random random;
    private int total;

    public Solution(int[] val, int[]weight)
    {
        if (val.length != weight.length)
        {
            throw new IllegalArgumentException("Массивы должны иметь одинаковую длину");
        }
        this.znach=val;
        this.vesa = weight;
        this.random = new Random();
        total=0;
        for (int i:vesa)
        {
            total+=i;
        }

    }

    public  int getRandomValue()
    {
        int num = random.nextInt(total);
        int summa = 0;

        for (int i=0;i< vesa.length;i++)
        {
            summa+=vesa[i];
            if(num<summa)
            {
                return znach[i];
            }
        }
        return 0;
    }
}
