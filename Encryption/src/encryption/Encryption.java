package encryption;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Clint
 */
public class Encryption {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("encryption.dat"));

        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String tempNum = sc.nextLine();
            String tempNumArry[] = tempNum.split("");
            //add 7 and take mod
            for (int j = 0; j < 16; j++) {
                int temp = Integer.parseInt(tempNumArry[j]);
                temp += 7;
                temp %= 10;
                tempNumArry[j] = "" + temp;
            }
            //switch places
            for (int j = 0; j < 16; j += 4) {
                String a = tempNumArry[j];
                String b = tempNumArry[j + 1];

                tempNumArry[j] = tempNumArry[j + 2];
                tempNumArry[j + 2] = a;

                tempNumArry[j + 1] = tempNumArry[j + 3];
                tempNumArry[j + 3] = b;
            }
            //print
            for (String s : tempNumArry) {
                System.out.print(s);
            }
            System.out.println("");
        }
    }

}
