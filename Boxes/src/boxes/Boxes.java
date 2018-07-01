package boxes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class Boxes {
        
    public static void main(String[] args) throws IOException { //IOException needed to get file
        
        
        //Scanner class with File class gets file
        Scanner sc = new Scanner(new File("boxes.dat"));

        int count = sc.nextInt();
        sc.nextLine();
        //loop to go through each set of boxes
        for (int i = 0; i < count; i++) {
            int boxes = sc.nextInt();
            sc.nextLine();
            String Sboxes = sc.nextLine().trim();
            int preL = 0;
            int preW = 0;
            int preH = 0;
            int timesFit = -1;
            String boxArr[] = Sboxes.split(" ");
            //loop to make sure each box is bigger than last
            for (int j = 0; j < boxes; j++) {
                String LWH[] = boxArr[j].split("x");
                int newL = Integer.parseInt(LWH[0]);
                int newW = Integer.parseInt(LWH[1]);
                int newH = Integer.parseInt(LWH[2]);

                if (preL < newL && preW < newW && preH < newH) {
                    preL = newL;
                    preW = newW;
                    preH = newH;
                    timesFit++;
                } else if (preL < newL && preW < newH && preH < newW) {
                    preL = newL;
                    preW = newH;
                    preH = newW;
                    timesFit++;
                } else if (preL < newW && preW < newL && preH < newH) {
                    preL = newW;
                    preW = newL;
                    preH = newH;
                    timesFit++;
                } else if (preL < newW && preW < newH && preH < newL) {
                    preL = newW;
                    preW = newH;
                    preH = newL;
                    timesFit++;
                } else if (preL < newH && preW < newW && preH < newL) {
                    preL = newH;
                    preW = newW;
                    preH = newL;
                    timesFit++;
                } else if (preL < newH && preW < newL && preH < newW) {
                    preL = newH;
                    preW = newL;
                    preH = newW;
                    timesFit++;
                }
                
            }
            System.out.println(timesFit);

        }
    }

}
