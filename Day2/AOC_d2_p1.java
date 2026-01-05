import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AOC_d2_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        ArrayList<String> inp = new ArrayList<String>(Arrays.asList(data.split(",")));
        ArrayList<Long> invalids = new ArrayList<Long>();
        // System.out.println(inp);
        for(String token: inp)
        {
            String[] range = token.split("-");
            for(long i=Long.parseLong(range[0]);i<=Long.parseLong(range[1]);i++)
            {
                String num=String.valueOf(i);
                if(num.length()%2==0)
                {
                    if(num.substring(0,num.length()/2).equals(num.substring(num.length()/2)))
                    {
                        // System.out.println(num);
                        invalids.add(Long.parseLong(num));
                    }

                }
            }
        }
        Long sum = 0L;
        for(Long num: invalids)
        {
            sum+=num;
        }

        System.out.println(sum);
        sc.close();
    }
}
