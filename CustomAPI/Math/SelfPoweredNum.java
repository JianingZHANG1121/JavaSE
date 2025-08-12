public class SelfPoweredNum 
{
    public static void main(String[] args) {
        System.out.println(calculateAllSelfPoweredNum(1));
        System.out.println(calculateAllSelfPoweredNum(2));
        System.out.println(calculateAllSelfPoweredNum(3));
        System.out.println(calculateAllSelfPoweredNum(4));
        System.out.println(calculateAllSelfPoweredNum(5));
        System.out.println(calculateAllSelfPoweredNum(6));
        System.out.println(calculateAllSelfPoweredNum(7));
        System.out.println(calculateAllSelfPoweredNum(8));
        System.out.println(calculateAllSelfPoweredNum(9));
        System.out.println(calculateAllSelfPoweredNum(10));
    }

    public static int calculateAllSelfPoweredNum(int n)
    {
        int count = 0;

        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++)
        {
            int[] digitNum = new int[n];
            for (int j = 0; j < n; j++)
            {
                digitNum[j] = (int) ((i / Math.pow(10, j)) % 10);
            }
            
            int sum = 0;
            for (int idx = 0; idx < n; idx++)
            {
                sum += (int) Math.pow(digitNum[idx], n);
            }

            if (sum == i){
                count++;
                System.out.println(i);
            }
        }

        return count;
    }

}
