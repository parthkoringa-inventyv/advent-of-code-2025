import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AOC_d1_p2 {
    public static void main(String[] args) {
        int dial_point = 50;
        int zero_counter = 0;
        File inp = new File("./input.txt");
        
        try {
            Scanner sc = new Scanner(inp);
            while (sc.hasNextLine()) {
                String rotation = sc.nextLine();
                char direction = rotation.charAt(0);
                int steps = Integer.parseInt(rotation.substring(1));
                
                zero_counter += steps / 100;
                steps = steps % 100;
                
                int new_position;
                if (direction == 'L') {
                    if(dial_point==0)
                    {
                        zero_counter--;
                    }
                    new_position = dial_point - steps;
                } else {
                    new_position = dial_point + steps;
                }
                
                if (new_position > 99) {
                    zero_counter++;
                } 
                if (new_position <= 0) {
                    zero_counter++;
                    new_position = (new_position + 100) ;
                }
                
                dial_point = new_position%100;
            }
            System.out.println("Zero crossings: " + zero_counter);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

