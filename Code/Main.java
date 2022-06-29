/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
/**
* Creates new form Main
*/
public Main() {
initComponents();
}
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
jCheckBox1 = new javax.swing.JCheckBox();
jLabel1 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jSeparator1 = new javax.swing.JSeparator();
jTextField1 = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
jLabel3 = new javax.swing.JLabel();
jButton2 = new javax.swing.JButton();
jLabel5 = new javax.swing.JLabel();
jCheckBox2 = new javax.swing.JCheckBox();
jButton3 = new javax.swing.JButton();
jPasswordField1 = new javax.swing.JPasswordField();
jLabel7 = new javax.swing.JLabel();
jCheckBox1.setText("jCheckBox1");
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setResizable(false);
getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
jLabel1.setText("Your Perfect Choice ...");
getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 220, 70));
jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
jLabel4.setText("FEUGO SHOPPING");
getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 390, 70));
jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
jSeparator1.setOpaque(true);
getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 450, 2));
jSeparator1.getAccessibleContext().setAccessibleDescription("");
jTextField1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jTextField1ActionPerformed(evt);
}
});
getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 160, 22));
jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
jLabel2.setText("Username :");
getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, 30));
jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
jLabel3.setText("Password :");
getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));
jButton2.setBackground(new java.awt.Color(204, 204, 204));
jButton2.setText("REGISTER ");
jButton2.setToolTipText("");
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});
getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 140, -1));
jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
jLabel5.setText("Dont have an account yet ?");
getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 200, 30));
jCheckBox2.setBackground(new java.awt.Color(153, 153, 153));
jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
jCheckBox2.setText("I Accept the terms and conditions");
jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jCheckBox2ActionPerformed(evt);
}
});
getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));
jButton3.setText("LOGIN");
jButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton3ActionPerformed(evt);
}
});
getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 70, -1));
getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 160, 22));
jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\111 (2).jpg")); //
NOI18N
getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));
pack();
setLocationRelativeTo(null);
}// </editor-fold>
private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
if(jCheckBox2.isSelected()){
jButton2.setEnabled(true);
}
else{
jButton2.setEnabled(false);
}
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
if(jCheckBox2.isSelected()){
this.setVisible(false);
new Register().setVisible(true);
}
else{
JOptionPane.showMessageDialog(null, "Agree terms and conditions !!","Alert",
JOptionPane.CLOSED_OPTION);
}
}
static int user[];
static int pass[];
private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
String userName = jTextField1.getText(); //get user entered username from the textField1
}
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
String userName = jTextField1.getText();
String password = jPasswordField1.getText();
if (userName.trim().equals("Darshan") && new String(jPasswordField1.getPassword()).equals("Gouda")) {
this.setVisible(false);
new Login().setVisible(true);
} else {
JOptionPane.showMessageDialog(null, "Invalid Credentials !!","Alert", JOptionPane.CLOSED_OPTION); }
}
/**
* @param args the command line arguments
*/
public static void main(String args[]) {
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { if
("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(InstantiationException ex) {
java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); }
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Main().setVisible(true);
}
});
}
// Variables declaration - do not modify
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JCheckBox jCheckBox1;
private javax.swing.JCheckBox jCheckBox2;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel7;
private javax.swing.JPasswordField jPasswordField1;
private javax.swing.JSeparator jSeparator1;
private javax.swing.JTextField jTextField1;
// End of variables declaration
}
