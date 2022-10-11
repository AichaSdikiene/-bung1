package org.hbrs.s1.ws22.uebung1.Test;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;package org.hbrs.s1.ws22.uebung1.control.*;
package org.hbrs.s1.ws22.uebung1.view.*;


public class Assembler {
    private Client Client = null;
    private Translator translator = null;
    public Assembler() {
        Client = new Client();
        translator = new GermanTranslator();
        Client.setTranslator( translator );
}
    public void test(){
// Positivtests
        Client.display( 1 ); // Äquivalenzklasse AK (1 <= x <=10)
// Negativtests
        Client.display ( 11 ); // Äquivalenzklasse AK (x > 10)
        Client.display ( -1 ); // Äquivalenzklasse AK (x < 0)
        Client.display ( 0 ); // Spezial-Testfall
    }
    public static void main(String[] args) {
        Assembler ass = new Assembler();
        ass.test();
    }
    public void display( int arg ){
        System.out.println("Das Ergebnis zu: " + arg + ": "
                + this.translator.translateNumber(arg) );
    }
    public void testAutomatisiert() {
        String ergebnis = this.translator.translateNumber(1);
        if ( ergebnis.equals("eins") ) {
            System.out.println("Test erfolgreich!");
        } else {
            System.out.println("Test nicht erfolgreich!");
        }
        }
}