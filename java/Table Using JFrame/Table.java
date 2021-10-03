import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Table {
    JFrame f;
   Table()
    {
        f =new JFrame();
        String rows[][]={{"amit","66%","B"},
                         {"jai","85%","A"},
                         {"Sachin","92%","A+"},          
                         {"Tejas","95%","A+"},          
                         {"Uday","97%","A+"},          
                         {"Sai","72%","B+"},          
                         {"Meet","60%","C"},          
                         {"Sahshikant","62%","C"},          
                         {"Soham","78%","B+"},          
                         {"Shubham","92%","A+"},          
        };
        String columns [] = {"Name","Percentage","Grade"}; 
        JTable jt=new JTable(rows,columns);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {  
     new Table();
    } 
}