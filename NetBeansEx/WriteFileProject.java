
package writefileproject;
import java.io.*;
import java.util.*;
/**
 * @author Nemanja Djorovic
 */
public class WriteFileProject {
    
    public static void main(String[] args) throws IOException {
    
   BufferedWriter bw;
   Scanner s_input;
   String input;
   boolean exit = false;
   
       s_input = new Scanner(System.in);
       bw = new BufferedWriter( new FileWriter("Last Entry.txt"));
       
        while (!exit) { 
            input = s_input.nextLine();
            bw.write(input);
            bw.flush();
            bw.newLine();
            if (input.endsWith("exit")) {
                exit = true;
            }
        }
        bw.close();     
        }
    }
    
