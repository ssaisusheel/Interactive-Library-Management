
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chimmu123
 */
public class piedg extends javax.swing.JFrame {

    /**
     * Creates new form piedg
     */
    public piedg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        t1 = new com.toedter.calendar.JDateChooser();
        t2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        t3 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        t4 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COMPARISION OF INFLOW AND OUTFLOW OF BOOKS");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb2);

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb1);

        t1.setDateFormatString("yyyy-MM-dd");

        t2.setDateFormatString("yyyy-MM-dd");

        jLabel1.setText("Date Range From");

        jLabel2.setText("To");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("INFLOW OF BOOKS");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("OUTFLOW OF BOOKS");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("TABULAR ANALYSIS", jPanel1);

        jLabel5.setText("Date Range From");

        jLabel6.setText("To");

        b1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        b1.setText("OK");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel7.setText("* ENTER THE RANGE OF DATES AND PRESS OK TO VIEW THE BAR-GRAPH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("PIE GRAPH ANALYSIS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       // int days = Days.daysBetween(d1, d2).getDays();// TODO add your handling code here:
         java.sql.Date sqlDate ,sqlDate1;
        
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
try
{
     Statement stmt=null;
      stmt = connection.createStatement();
      System.out.println("rough n tough");
      Date d1,d2,d3;
      d1=  t1.getDate();
      System.out.println(d1);
      
      d2=t2.getDate();
        System.out.println(d2);
         if(d1==null ||d2==null)
         {
                System.out.println("hellor eyy!!");
             String q1 ="select sysdate from dual";
               ResultSet r = stmt.executeQuery(q1);
               r.next();
               sqlDate1=r.getDate(1);
                String q2 ="select (sysdate-30) from dual";
               ResultSet r2 = stmt.executeQuery(q2);
               r2.next();
               sqlDate=r2.getDate(1);
               
         }
         else
         {
          sqlDate = new java.sql.Date(d1.getTime());
         System.out.println("sqlDate:" + sqlDate.toString());
         sqlDate1 = new java.sql.Date(d2.getTime());
         System.out.println("sqlDate:" + sqlDate1.toString());
         }
      
      String query = "select bookid,bookname,rdate from inflow2 where rdate between (select to_date('"+sqlDate+"','YYYY-MM-DD') from dual) and (select to_date('"+sqlDate1+"','YYYY-MM-DD') from dual) ";
      ResultSet rs = stmt.executeQuery(query); 
      /*if(rs.next()==false)
      {
          t3.setText("SORRY NO TRANSACATION HAS TAKEN PLACE IN BETWEEN SELECTED DATES");
      }*/
       
      // System.out.println(rs.next());
       //System.out.println("rough");
      //System.out.println(""+rs.getInt(1));
      // System.out.println(rs.first());
    /*  while(rs.next())
      {
          //System.out.println(rs.first());
      System.out.println("rough");
       System.out.println(rs.getInt(1));
      }*/
    //   System.out.println("rough");
      tb1.setModel(DbUtils.resultSetToTableModel(rs));
       String query1 = "select bookid,bookname,ldate from outflow2 where ldate between (select to_date('"+sqlDate+"','YYYY-MM-DD') from dual) and (select to_date('"+sqlDate1+"','YYYY-MM-DD') from dual) ";
      ResultSet rs1 = stmt.executeQuery(query1); 
      tb2.setModel(DbUtils.resultSetToTableModel(rs1));
       //tb1.setModel(DbUtils.resultSetToTableModel(rs));
     /* while(rs.next()){
            System.out.println(rs.getString(2));
      }
      System.out.println(rs.getString(2));*/
      stmt.close();
}
catch(SQLException e){System.out.println(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     java.sql.Date sqlDate,sqlDate1;
       // int days = Days.daysBetween(d1, d2).getDays();// TODO add your handling code here:
        
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
try
{
     Statement stmt=null;
      stmt = connection.createStatement();
         System.out.println("hhiiiii");
         Date d1,d2,d3,f;
      d1=  t3.getDate();
      System.out.println(d1);
      int y=0;
     // String f="";
      d2=t4.getDate();
     // System.out.println(d2);
         System.out.println("hello"+d1.toString().length());
         if(d1==null ||d2==null)
         {
                System.out.println("hellor eyy!!");
             String q1 ="select sysdate from dual";
               ResultSet r = stmt.executeQuery(q1);
               r.next();
               sqlDate1=r.getDate(1);
                String q2 ="select (sysdate-30) from dual";
               ResultSet r2 = stmt.executeQuery(q2);
               r2.next();
               sqlDate=r2.getDate(1);
               
         }
         else
         {
          sqlDate = new java.sql.Date(d1.getTime());
         System.out.println("sqlDate:" + sqlDate.toString());
         sqlDate1 = new java.sql.Date(d2.getTime());
         System.out.println("sqlDate:" + sqlDate1.toString());
         }
        String query = "select sum(count(bookid)) from inflow2 \n" +
"group by rdate\n" +
"having rdate between (select to_date('"+sqlDate+"','YYYY-MM-DD') from dual) and (select to_date('"+sqlDate1+"','YYYY-MM-DD') from dual)" ; 
     ResultSet rs = stmt.executeQuery(query);
     rs.next();
     
        DefaultPieDataset piedataset=  new DefaultPieDataset(); 
     piedataset.setValue("INFLOW", new Integer(rs.getInt(1)));
       String query1 = "select sum(count(bookid)) from outflow2 \n" +
"group by ldate\n" +
"having ldate between (select to_date('"+sqlDate+"','YYYY-MM-DD') from dual) and (select to_date('"+sqlDate1+"','YYYY-MM-DD') from dual)" ; 
     ResultSet rs1 = stmt.executeQuery(query1);
     rs1.next();
      piedataset.setValue("OUTFLOW", new Integer(rs1.getInt(1)));
    //  piedataset.setValue("two", new Integer(78));
      // piedataset.setValue("three", new Integer(45));
       JFreeChart chart= ChartFactory.createPieChart("INFLOW Vs OUTFLOW", piedataset, true, true, true);
      PiePlot p=(PiePlot)chart.getPlot() ;
       ChartFrame frame=new ChartFrame("pie chart",chart);
       frame.setVisible(true);
       frame.setSize(450,500);
}
catch(SQLException e){System.out.println(e);}// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(piedg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(piedg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(piedg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(piedg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new piedg().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JDateChooser t1;
    private com.toedter.calendar.JDateChooser t2;
    private com.toedter.calendar.JDateChooser t3;
    private com.toedter.calendar.JDateChooser t4;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
