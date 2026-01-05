import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AOC_d1_p1 {
    public static void main(String[] args)
    {
        int dial_point=50;
        int zero_counter=0;
        File inp = new File("./input.txt");
        Scanner sc;
        try {
            sc = new Scanner(inp);
            while (sc.hasNextLine()) {
                String rotation = sc.nextLine();
                if(rotation.charAt(0)=='L')
                {
                    dial_point=dial_point-Integer.parseInt(rotation.substring(1));
                }
                else
                {
                    dial_point=dial_point+Integer.parseInt(rotation.substring(1));
                }
                if(dial_point<0 || dial_point>99)
                {
                    dial_point=dial_point%100;
                }
                if(dial_point==0)
                {
                    zero_counter++;
                }
            }

            System.out.println(zero_counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
