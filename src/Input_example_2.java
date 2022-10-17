import javax.swing.*;

public class Input_example_2 {
    public static void main(String[] args) {
        // different of getting the date from the user using the method showInputDialog from the method JOptionPane
        // which is also a method of the class Javax.swing
        String name = JOptionPane.showInputDialog("Please enter your name");
        String age = JOptionPane.showInputDialog("Please enter your age");
        // as the above line receives a string, also stores that as a string, in order to use as an integer, we need to
        // change to a integer, this is done using the method parseInt which is a method of the class Integer.
        int age_user = Integer.parseInt(age);
        System.out.println("Hello, your name is " + name + " and your age is " + age_user);
    }
}
