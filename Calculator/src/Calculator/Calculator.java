/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author Yavuz Selim Usta
 */
public class Calculator extends javax.swing.JFrame {

    double NumEnter1;
    double NumEnter2; 
    double Result;
    double squareResult;
    String op; 
    
    public Calculator() {
        initComponents();
    }        

     private void EnterNumbers(String q)
     {
         String Nums = jtxtResult.getText() + q; 
         jtxtResult.setText(Nums); 
     }                                                             
   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnPower = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 90));

        jbtnCE.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCE.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 60));

        jbtnBS.setBackground(new java.awt.Color(0, 102, 102));
        jbtnBS.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnBS.setText("<--");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 60));

        jbtnPM.setBackground(new java.awt.Color(16, 132, 132));
        jbtnPM.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, 60));

        jbtnPower.setBackground(new java.awt.Color(0, 102, 102));
        jbtnPower.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnPower.setText("^");
        jbtnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPowerActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 70, 60));

        jbtnDigit7.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit7.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 60));

        jbtnDigit8.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit8.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 60));

        jbtnDigit9.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit9.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 70, 60));

        jbtnPlus.setBackground(new java.awt.Color(16, 132, 132));
        jbtnPlus.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 70, 60));

        jbtnDigit4.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit4.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 60));

        jbtnDigit5.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit5.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 60));

        jbtnDigit6.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit6.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 70, 60));

        jbtnMinus.setBackground(new java.awt.Color(16, 132, 132));
        jbtnMinus.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 70, 60));

        jbtnDigit1.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit1.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 60));

        jbtnDigit2.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 70, 60));

        jbtnDigit3.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit3.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, 60));

        jbtnMult.setBackground(new java.awt.Color(16, 132, 132));
        jbtnMult.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnMult.setText("*");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 70, 60));

        jbtnDigit0.setBackground(new java.awt.Color(0, 204, 204));
        jbtnDigit0.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 60));

        jbtnDot.setBackground(new java.awt.Color(16, 132, 132));
        jbtnDot.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 60));

        jbtnEquals.setBackground(new java.awt.Color(16, 132, 132));
        jbtnEquals.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 70, 60));

        jbtnDiv.setBackground(new java.awt.Color(16, 132, 132));
        jbtnDiv.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
         EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
         EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
         EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
         EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
         EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
         EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
         EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="/";
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="*";
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
       NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
       NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op ="+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPowerActionPerformed
     double value = Double.parseDouble(jtxtResult.getText());
     double squareResult = value * value; 
     jtxtResult.setText(String.valueOf(squareResult));
    }//GEN-LAST:event_jbtnPowerActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
      jtxtResult.setText("");
      
      String Fn, Sn; 
      
      Fn = String.valueOf(NumEnter1); 
      Sn = String.valueOf(NumEnter2); 
     
      Fn = "";
      Sn = "";    
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText())); 
     nums = nums * (-1);
     jtxtResult.setText(String.valueOf(nums)); 
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
      String backSp = null; 
      
      if (jtxtResult.getText().length() > 0)
      {
        StringBuilder sb = new StringBuilder(jtxtResult.getText()); 
        sb.deleteCharAt(jtxtResult.getText().length() -1); 
        backSp = sb.toString();
        jtxtResult.setText(backSp);
      }        
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
      if(! jtxtResult.getText().contains("."))
           {
                jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText()); 
           }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
        NumEnter2 = Double.parseDouble(jtxtResult.getText()); 
          if (op == "+")
          {
            Result = NumEnter1 + NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
          
          else if (op == "-")
          {
              Result = NumEnter1 - NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
          
            else if (op == "*")
          {
              Result = NumEnter1 * NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
           
            else if (op == "/")
          {
              Result = NumEnter1 / NumEnter2; 
            jtxtResult.setText(String.valueOf(Result)); 
          }
    }//GEN-LAST:event_jbtnEqualsActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnPower;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
