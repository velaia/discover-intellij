package de.velaia.intellij.discover;

/**
 * Created by velaia on 12.06.16.
 *
 * I use this project to get to know the IntelliJ IDEA IDE key bindings and editor basics.
 *
 * @see <a href="http://jetbrains.com">JetBrains website</a>
 * @author velaia
 * @version 0.1
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

    public SampleClass() {
        stringUno = "whatever";
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
}

