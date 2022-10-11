package org.hbrs.s1.ws22.uebung1.control;
import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;

// Factory Pattern

public class TranslatorFactory {
    public static Translator createGermanTranslator() {

        return new GermanTranslator();

    }
    public static Translator createEnglishTranslator() {
        return new EnglishTranslator();

    }

}