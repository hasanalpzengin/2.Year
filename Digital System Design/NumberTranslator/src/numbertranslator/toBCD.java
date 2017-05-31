
package numbertranslator;

import java.util.Scanner;

public class toBCD {
    
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        String result;
        String number = scan.nextLine();
        
        StringBuilder sBuild = new StringBuilder();
        
        try{
            String[] numbers = number.split(",");
            //main,target
            sBuild.append(Integer.toString(Integer.parseInt(numbers[0],10),4));
            //float part
            sBuild.append(",");
            sBuild.append(Integer.toString(Integer.parseInt(numbers[1],10),4));
        
            System.out.println(sBuild.toString());
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(Integer.toString(Integer.parseInt(number, 10), 4));
        }
        
        
    }
}