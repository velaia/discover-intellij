package de.velaia.intellij.discover;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by velaia on 12.06.16.
 * <p>
 * I use this project to get to know the IntelliJ IDEA IDE key bindings and editor basics.
 * I follow the 'IntelliJ IDEA 2016.1 Help/Discover IntelliJ IDEA' guide as well as the
 * Tips and Tricks YouTube classes.
 *
 * @author velaia
 * @version 0.1
 * @see <a href="http://jetbrains.com">JetBrains website</a>
 */
public class SampleClass {

    /**
     * This is the first string.
     */
    /* Documentation for stringUno */

    private String stringUno;
    /**
     * This is the second string.
     */
    private String secondString;

    /**
     * Demo of using language injection highlighting
     */
    private String languageInjectionEx1;
    private String myRegEx1;

    public SampleClass() {
        stringUno = "whatever";
//        pressing Alt+Enter lets you select the language you want to inject
        languageInjectionEx1 = "{\"name\": \"Hadi\"}";
        /**
         * injecting regular expressions works the same way. After injecting RegExp, you have the ability
         * to 'Check RegExp using Alt+Enter again.'
         */
        myRegEx1 = "^3[0-9]*";

        try {
            BufferedReader anotherReader = new BufferedReader(new FileReader("sample.txt"));
            // pressing Ctrl+Shift+Space twice allows for chained code completion, e.g.
            String lines = anotherReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void checkTelephone() {
        // hippy-completion after first character e.g. press Alt+/ will loop through possible completions
        System.out.println(languageInjectionEx1);
    }

    public static void main(String[] args) {
        SampleClass startsHere = new SampleClass();
        startsHere.doSthToString("change this String");
        startsHere.printlnMyString();
    }

    private void doSthToString(String stringArg) {
        this.stringUno = stringArg;

    }

    private void printlnMyString() {
        System.out.println(stringUno);
        doSthToString("some string");
        System.out.println(stringUno);
    }


    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    /**
     * Place as many cursers as you want using Alt+Shift+Click
     * Place as many cursers as you want using Alt+Shift+Click
     * Place as many cursers as you want using Alt+Shift+Click
     *  cursers as you want using Alt+Shift+ClickPlace as many cursers as you want using Alt+Shift+Click
     *
     *  Great Tips and Tricks Part 1 on YouTube: https://www.youtube.com/watch?v=KsVWdGOnHZU
     */
}

