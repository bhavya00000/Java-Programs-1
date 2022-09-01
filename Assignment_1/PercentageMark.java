import javax.swing.JOptionPane;

public class PercentageMark {
    public static void main(String args[])
    {
        String s1 = JOptionPane.showInputDialog("Enter Marks of English");
        String s2 = JOptionPane.showInputDialog("Enter Marks of Maths");
        String s3 = JOptionPane.showInputDialog("Enter Marks of SST");
        String s4 = JOptionPane.showInputDialog("Enter Marks of Science");
        String s5 = JOptionPane.showInputDialog("Enter Marks of Comp");
        String s6 = JOptionPane.showInputDialog("Enter Marks of Gujarati");
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int e = Integer.parseInt(s5);
        int f = Integer.parseInt(s6);
        int percent = (a+b+c+d+e+f)/6;
        System.out.println("Percent of Student is : "+percent+"%");

    }
}
