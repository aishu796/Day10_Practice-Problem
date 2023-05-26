public class AverageValue {
    public static void main(String args[])

    {
        int []n=new int[] {20,30,40,10,50};
        int sum=0;
        for(int i=0;i<n.length;i++)

            sum=sum+n[i];
        double avg=sum/n.length;
        System.out.println("Average of of an array element"+avg);




    }


}
