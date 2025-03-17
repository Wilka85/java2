package task1;

public class Main
{
    public static void main(String[] args) {
        int[] val = {1,2,3};
        int[] weights ={1,2,10};
        Solution pick = new Solution(val,weights);
        int counter_1=0;
        int counter_2=0;
        int counter_3 =0;
        for (int i=0;i<1000;i++)
        {
            int v=pick.getRandomValue();
            if(v==1)
            {
                counter_1++;
            }
            else if(v==2)
            {
                counter_2++;
            }
            else
            {
                counter_3++;
            }
        }
        System.out.println(counter_1);
        System.out.println(counter_2);
        System.out.println(counter_3);
    }
}
