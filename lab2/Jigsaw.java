/* -*- encoding: utf-8 -*-
'''
@File    :   Jigsaw.java
@Time    :   2020/8/31
@Author  :   Michael
@Version :   1.0
@Contact :   Search username of MichaelForwork at github
@Doc    :    this is for exercise1 in lab2, which just show a line of expression that  a-b c-d.
'''
# -*-*-*-*- here is the beginning of this script -*-*-*-*- */

/**
 * we need to show this information : a-b c-d
 */

public class Jigsaw{
   
    public static String jigsaw() {
        String whatWeExpected = new String();
        int x = 3;
        if (x > 2){
            //System.out.print("a");
            whatWeExpected += "a";
        }

        x = x - 1;

        //System.out.print("-");
        whatWeExpected += "-";
        
        if (x == 2){
            //System.out.print("b c");
            whatWeExpected += "b c";
        }

        x = x - 1;
        //System.out.print("-");
        whatWeExpected += "-";
        if (x == 1){
            //System.out.println("d");
            whatWeExpected += "d";
        }

        return  whatWeExpected;
    }
    
}