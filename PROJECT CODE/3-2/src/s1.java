
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chimmu123
 */
public class s1 extends javax.swing.JFrame {
static String m;
String name,coun,g,h;
    /**
     * Creates new form s1
     */
@SuppressWarnings("empty-statement")
    public s1(String a) {
        initComponents();
        m=a;
         Connection connection = null; 
 
String driverName ="oracle.jdbc.driver.OracleDriver"; // for Oracle 
 
 
String serverName = "localhost"; 
String portNumber = "1521"; 
String sid = "home"; 
 
String url="jdbc:oracle:thin:@"+serverName+":"+ portNumber+":"+sid; 

 
String username = "chimmu"; 
String password = "chimmu123"; 
 
 
try { 

 Class.forName(driverName); 
 
 connection = DriverManager.getConnection(url, username, password); 
 
 } catch (ClassNotFoundException e) { 
  
 System.out.println("ClassNotFoundException : "+e.getMessage()); 
 
 } catch (SQLException e) { 

 System.out.println(e.getMessage()); 
 
 } 
  
// int check=0;
System.out.println(m);
//int kl=Integer.parseInt(m);
 //System.out.println(""+kl);
try{
     Statement stmt=null;
     String n="",k="",p="";
     int i=0;
    // String k;
     stmt = connection.createStatement();
     String query = "select * from students1 where  id= '"+m+"'" ; 
    // stmt = connection.createStatement(); 
     //System.out.println("checking.");
     ResultSet rs = stmt.executeQuery(query); 
     //System.out.println(rs.getRow());

     //System.out.println(rs.next());
     //k=rs.getString(3);
     while(rs.next())
     {
         System.out.println("hiiii");
         n=rs.getString(2);
        k=rs.getString(3);
        p=rs.getString(4);
         
         
     }
    
    // System.out.println(n);
   //  t1.setText(n);
     t1.setText(n);
 t2.setText(m);
 t3.setText(k);
t4.setText(p);
try
{
PreparedStatement ps=connection.prepareStatement("select * from imgtable where id='"+m+"'"); 
ResultSet rsg=ps.executeQuery(); 
rsg.next();
Blob b=rsg.getBlob(2); 
byte brr[]=new byte[(int)b.length()]; 
brr=b.getBytes(1,(int)b.length()); 
//String k="ssusheel";
FileOutputStream fs=new FileOutputStream("D:/READ/"+m+".jpg"); 
fs.write(brr);
System.out.println("writtemm");
ImageIcon ii = new ImageIcon("D:/READ/"+m+".jpg"); 
jsp.setViewportView(new JLabel(ii));
fs.close(); 
System.out.println("fasfaef"); 
connection.close(); 
}


catch(Exception e){ 
e.printStackTrace(); }



// t3.setText(k);
 //  int i_deptno = 10;
/* CallableStatement pstmt = connection.prepareCall("{call p_highest_paid_emp(?,?,?,?)}");
 pstmt.setInt(1, kl);
 pstmt.registerOutParameter(2, Types.INTEGER);
 pstmt.registerOutParameter(3, Types.VARCHAR);
 pstmt.registerOutParameter(4, Types.FLOAT);
 pstmt.executeUpdate();

 int o_empno = pstmt.getInt(2);
 String o_ename = pstmt.getString(3);
 float o_sal = pstmt.getFloat(4);
 System.out.print("The highest paid employee in dept "
 +kl+" is: "+o_empno+" "+o_ename+" "+o_sal);*/
/* String query1 ="select  mgr from emp3 where empno= '"+m+"'" ;
 stmt = connection.createStatement(); 
 // stmt.executeUpdate(query);
 /* if(delete == 1){
  System.out.println("Row is deleted.");
  }
  else{
  System.out.println("Row is not deleted.");
  }
  ResultSet rs1 = stmt.executeQuery(query1);
  while (rs1.next()) { 
   check= rs1.getInt(1);
  }*/
    /* PreparedStatement psSelectRecord=null;
     stmt = connection.createStatement();
   String query = "SELECT ename,deptno,sal from emp3 where  mgr= '"+kl+"'" ; 
   int loop=0,l1=0,l2=0,l3=0,i=0;
   int[] p=new int[4];
ResultSet rs = stmt.executeQuery(query); 
System.out.println("hello");
String q1="select count(*)"+"from (SELECT ename,deptno,sal from emp3 where  mgr= '"+kl+"') ";
 psSelectRecord=connection.prepareStatement(q1);
 //System.out.println("hw r u");
ResultSet rsq = psSelectRecord.executeQuery(); 
System.out.println("hw r u");
while(rsq.next())
{
 loop=rsq.getInt(1);
// p[i]=rsq.getInt(1);
 //i=i+1;
}
 
//System.out.println(""+loop);
while (rs.next()) { 
// name = rs.getString(2); 
 //coun= rs.getString(3); 
//g=rs.getString(5);
//h=rs.getString(8);
     p[i]=rs.getInt(2);
 i=i+1;
 double population = rs.getInt(2); 
 double population1 = rs.getInt(3); 
 //System.out.println(" Name : "+name); 
 //System.out.println(" job :  "+coun); 
 //System.out.println(" EMPNO : "+population); 
 t1.setText(population+"");
 t2.setText(population1+"");
// t3.setText(g);
 //t4.setText(h);

 }
System.out.println(""+p[0]);
System.out.println(""+p[1]);
System.out.println(""+p[2]);
System.out.println(""+p[3]);*/
 stmt.close(); 

}
catch(SQLException e){System.out.println(e);}
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jsp = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT PROFILE");

        l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l1.setText("NAME");

        l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l2.setText("ID NUMBER");

        l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l3.setText("ADMN NO.");

        l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l4.setText("BRANCH");

        b1.setText("OK");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("IF YOUR DETAILS ARE CORRECT SELECT OK");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("<HTML>\n<U>CBIT STUDENT LIBRARY MANAGEMENT SYSTEM</U>\n</HTML>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(t3)
                            .addComponent(t1)
                            .addComponent(t2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

String g=t2.getText();
Connection connection = null; 
String driverName ="oracle.jdbc.driver.OracleDriver"; // for Oracle 
 
 
String serverName = "localhost"; 
String portNumber = "1521"; 
String sid = "home"; 
 
String url="jdbc:oracle:thin:@"+serverName+":"+ portNumber+":"+sid; 

 
String username = "chimmu"; 
String password = "chimmu123"; 
 
 
try { 

 Class.forName(driverName); 
 
 connection = DriverManager.getConnection(url, username, password); 
 
 } catch (ClassNotFoundException e) { 
  
 System.out.println("ClassNotFoundException : "+e.getMessage()); 
 
 } catch (SQLException e) { 

 System.out.println(e.getMessage()); 
 
 } 
  
// int check=0;
System.out.println(m);
//int kl=Integer.parseInt(m);
 //System.out.println(""+kl);
try{
     Statement stmt=null;
     String n="",k="",p="";
     int i=0;
     Date d3;
    // String k; 
     int[] f=new int[5];
     stmt = connection.createStatement();
     String kq="select TO_DATE(sysdate,'DD-MON-RRRR') FROM DUAL";
     ResultSet re=stmt.executeQuery(kq);
     re.next();
     d3=re.getDate(1);
     String query = "select * from status1 where  id= '"+m+"'" ; 
      ResultSet rs = stmt.executeQuery(query); 
      while (rs.next()) { 

     f[i]=rs.getInt(2);
 i=i+1;
      }
    System.out.println(""+f[0]);
System.out.println(""+f[1]);
System.out.println(""+f[2]);
System.out.println(""+f[3]);
Date date1,date2;
int y=0,kl=0,po=0,ko=0,kp=0,jk=100;

while(f[y]!=0)
{
    String q1 = "select lendingdate from status1 where  bookid= '"+f[y]+"'" ; 
     ResultSet rs1 = stmt.executeQuery(q1);
     
     rs1.next() ; 
        date1=rs1.getDate(1);
        System.out.println(date1);
      String q3 = "select TO_DATE(sysdate, 'DD-MON-RRRR')"+"-TO_DATE("+"(select lendingdate from"+" status1 where "+" bookid="+" '"+f[y]+"')"+",'DD-MON-RRRR')"+" from dual" ; 
     ResultSet rs3 = stmt.executeQuery(q3);
     System.out.println("namaste");
      rs3.next() ; 
      kl=rs3.getInt(1);
        System.out.println(""+kl);
        if(kl>15)
        {
             String q5 = "select * from fines1 where  bookid= '"+f[y]+"' and id= '"+m+"'" ; 
             ResultSet rs6 = stmt.executeQuery(q5);
            // System.out.println("hello bro"+rs6.next());
            // kp=rs6.getInt(2);
             //System.out.println(""+kp);
             if(rs6.next())
             {
                 po=rs6.getInt(3);
                // String ck="select cdate from temp where bookid= '"+f[y]+"'";
                 //ResultSet rs9 = stmt.executeQuery(ck);
                 //jk=rs9.getString(1);
                 String gt="SELECT TO_DATE(sysdate, 'DD-MON-RRRR')-TO_DATE((select cdate from temp where bookid='"+f[y]+"'),'DD-MON-RRRR') from dual";
                 ResultSet rs9 = stmt.executeQuery(gt);
                 rs9.next();
                 jk=rs9.getInt(1);
                 System.out.println(""+f[y]);
                 if(jk==0)
                 {
                   System.out.println("over for today");
                     break;
                 }
                 else
                 {
                    System.out.println("checking here is awsome");
                 
                 System.out.println(""+po);
                 
                 ko=jk*5;
                 ko=ko+po;
                String q6= "update fines1 set amount= '"+ko+"' where bookid= '"+f[y]+"' and id= '"+m+"'" ; 
                ResultSet rs7 = stmt.executeQuery(q6);
                System.out.println("world war 7");
                String qq="update temp set cdate=sysdate where id= '"+m+"' and bookid= '"+f[y]+"'";
                ResultSet rss=stmt.executeQuery(qq);
                
                System.out.println("checking me is true one behind it");
                 }
                 
             }
             else
             {
                  ko=kl-15;
                 ko=ko*5;
                 ko=ko+po;
            String q2 = "insert into fines1 values('"+m+"','"+f[y]+"','"+ko+"')";
              ResultSet rs4 = stmt.executeQuery(q2);
              System.out.println("hello man");
              String qq="insert into temp values('"+m+"',sysdate,'"+f[y]+"')";
                ResultSet rss=stmt.executeQuery(qq);
             }
        }
      
     y=y+1;
}
}
catch(SQLException e){System.out.println(e);}
options p;
p=new options(g);
p.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(s1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(s1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(s1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(s1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new s1(m).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
