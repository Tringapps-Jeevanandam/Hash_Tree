package hashtree;

import java.util.Scanner;
import java.util.logging.*;
public class App 
{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main( String[] args )
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        boolean flag =true;
        while(flag){
            Log.info("1.Treeset 2.Hashmap 3.Hashset 4.exit");

            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    treeset t = new treeset();
                    t.tree();
                }break;
                case 2:{
                    HashMapp map = new HashMapp();
                    map.hashmap();
                }break;
                case 3:{
                    Hashset set = new Hashset();
                    set.hset();
                }break;
                case 4: flag=false; break;
                default: break;
            }
        }


    }
}
