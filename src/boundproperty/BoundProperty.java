/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;


/**
 *
 * @author hatai
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBean mySource = new MyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        Scanner result = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            System.out.print("Enter Score:");
            String input = result.nextLine();
            if(!input.equals("")) {
                {mySource.setFootballValue(input);}
            }
            else {
                break;
            }
        }
    }
}
