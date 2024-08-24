import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class Polybios extends javax.swing.JFrame {
    public Polybios() {
        initComponents();
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
	List<Integer> intList = Arrays.asList(intArray);
	Collections.shuffle(intList);
	intList.toArray(intArray);
        String randn="";
        for(int i = 0; i<25; i++) {
            randn += intArray[i]+" ";
            //System.out.print(intArray[i]+" ");
        }
        System.out.println(randn);
        jLabel1.setText(randn);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tpA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tcA = new javax.swing.JTextArea();
        cB = new javax.swing.JButton();
        dB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel222 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tpA.setColumns(20);
        tpA.setRows(5);
        jScrollPane1.setViewportView(tpA);

        tcA.setColumns(20);
        tcA.setRows(5);
        jScrollPane2.setViewportView(tcA);

        cB.setText("Cifrar");
        cB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBActionPerformed(evt);
            }
        });

        dB.setText("Descifrar");
        dB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel222.setFont(new java.awt.Font("AR DESTINE", 1, 36)); // NOI18N
        jLabel222.setText("Polybios");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel222, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel222)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dB))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBActionPerformed
        String randn = jLabel1.getText();
        
        int[] intArray = new int[25];
        int cs = 0;
        for(int i=0;i<25;i++) {
            if(randn.charAt(cs+1)!=' ') {
                intArray[i] = (randn.charAt(cs)-48)*10 + (randn.charAt(cs+1)-48);
                //System.out.print((randn.charAt(cs)-48)*10+" "+(randn.charAt(cs+1)-48)+" ");
                cs = cs+3;
            }
            else {
                intArray[i] = randn.charAt(cs)-48;
                //System.out.print(randn.charAt(cs)-48+" ");
                cs = cs+2;
            }    
            //System.out.println(intArray[i]);
        }
        for(int i=0;i<25;i++) {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        
        int c = 0;
        String parTextoClaro = tpA.getText().toUpperCase();
        char[] pTC = parTextoClaro.toCharArray();
        String parTextoCifrado = "";
        String[][] tablaPolybiosLetras = new String[5][5];
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                switch(intArray[c]) {
                    case 1:
                        tablaPolybiosLetras[i][j] = "AA"; 
                    break;
                    case 2:
                        tablaPolybiosLetras[i][j] = "AB"; 
                    break;
                    case 3:
                        tablaPolybiosLetras[i][j] = "AC"; 
                    break;
                    case 4:
                        tablaPolybiosLetras[i][j] = "AD"; 
                    break;   
                    case 5:
                        tablaPolybiosLetras[i][j] = "AE"; 
                    break;
                    case 6:
                        tablaPolybiosLetras[i][j] = "BA"; 
                    break;
                    case 7:
                        tablaPolybiosLetras[i][j] = "BB"; 
                    break;
                    case 8:
                        tablaPolybiosLetras[i][j] = "BC"; 
                    break;
                    case 9:
                        tablaPolybiosLetras[i][j] = "BD"; 
                    break;
                    case 10:
                        tablaPolybiosLetras[i][j] = "BE"; 
                    break;
                    case 11:
                        tablaPolybiosLetras[i][j] = "CA"; 
                    break;
                    case 12:
                        tablaPolybiosLetras[i][j] = "CB"; 
                    break;   
                    case 13:
                        tablaPolybiosLetras[i][j] = "CC"; 
                    break;
                    case 14:
                        tablaPolybiosLetras[i][j] = "CD"; 
                    break;
                    case 15:
                        tablaPolybiosLetras[i][j] = "CE"; 
                    break;
                    case 16:
                        tablaPolybiosLetras[i][j] = "DA"; 
                    break;
                    case 17:
                        tablaPolybiosLetras[i][j] = "DB"; 
                    break;
                    case 18:
                        tablaPolybiosLetras[i][j] = "DC"; 
                    break;
                    case 19:
                        tablaPolybiosLetras[i][j] = "DD"; 
                    break;
                    case 20:
                        tablaPolybiosLetras[i][j] = "DE"; 
                    break;   
                    case 21:
                        tablaPolybiosLetras[i][j] = "EA"; 
                    break;
                    case 22:
                        tablaPolybiosLetras[i][j] = "EB"; 
                    break;
                    case 23:
                        tablaPolybiosLetras[i][j] = "EC"; 
                    break;
                    case 24:
                        tablaPolybiosLetras[i][j] = "ED"; 
                    break;
                    case 25:
                        tablaPolybiosLetras[i][j] = "EE"; 
                    break;
                    default:
                    break;                         
                }
                c++;
            } 
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(tablaPolybiosLetras[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<pTC.length; i++) {
            int codigoAscciiParTextoClaro = (int)(pTC[i]);
            //System.out.println(pTC[i]+" "+(int)(pTC[i]));
            if (codigoAscciiParTextoClaro != 32) {

                int indiceX = (codigoAscciiParTextoClaro - 65) / 5;
                int indiceY = (codigoAscciiParTextoClaro % 5);


                parTextoCifrado += tablaPolybiosLetras[indiceX][indiceY];
            } else {
                parTextoCifrado += " ";
            }
        }


        tcA.setText(parTextoCifrado.toUpperCase());
    }//GEN-LAST:event_cBActionPerformed

    private void dBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBActionPerformed
        String cadenaC = tcA.getText();
        String cadena = "";
        String randn = jLabel1.getText();
        //System.out.println(randn);
        int[] intArray = new int[25];
        int cs = 0;
        for(int i=0;i<25;i++) {
            intArray[i] = i+1;
        }
        for(int i=0;i<25;i++) {
            if(randn.charAt(cs+1)!=' ') {
                intArray[i] = (randn.charAt(cs)-48)*10 + (randn.charAt(cs+1)-48);
                //System.out.print((randn.charAt(cs)-48)*10+" "+(randn.charAt(cs+1)-48)+" ");
                cs = cs+3;
            }
            else {
                intArray[i] = randn.charAt(cs)-48;
                //System.out.print(randn.charAt(cs)-48+" ");
                cs = cs+2;
            }    
            //System.out.println(intArray[i]);
        }
        for(int i=0;i<25;i++) {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        
        int c = 0;
        String[][] tablaPolybiosLetras = new String[5][5];
        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                switch(intArray[c]) {
                    case 1:
                        tablaPolybiosLetras[i][j] = "AA"; 
                    break;
                    case 2:
                        tablaPolybiosLetras[i][j] = "AB"; 
                    break;
                    case 3:
                        tablaPolybiosLetras[i][j] = "AC"; 
                    break;
                    case 4:
                        tablaPolybiosLetras[i][j] = "AD"; 
                    break;   
                    case 5:
                        tablaPolybiosLetras[i][j] = "AE"; 
                    break;
                    case 6:
                        tablaPolybiosLetras[i][j] = "BA"; 
                    break;
                    case 7:
                        tablaPolybiosLetras[i][j] = "BB"; 
                    break;
                    case 8:
                        tablaPolybiosLetras[i][j] = "BC"; 
                    break;
                    case 9:
                        tablaPolybiosLetras[i][j] = "BD"; 
                    break;
                    case 10:
                        tablaPolybiosLetras[i][j] = "BE"; 
                    break;
                    case 11:
                        tablaPolybiosLetras[i][j] = "CA"; 
                    break;
                    case 12:
                        tablaPolybiosLetras[i][j] = "CB"; 
                    break;   
                    case 13:
                        tablaPolybiosLetras[i][j] = "CC"; 
                    break;
                    case 14:
                        tablaPolybiosLetras[i][j] = "CD"; 
                    break;
                    case 15:
                        tablaPolybiosLetras[i][j] = "CE"; 
                    break;
                    case 16:
                        tablaPolybiosLetras[i][j] = "DA"; 
                    break;
                    case 17:
                        tablaPolybiosLetras[i][j] = "DB"; 
                    break;
                    case 18:
                        tablaPolybiosLetras[i][j] = "DC"; 
                    break;
                    case 19:
                        tablaPolybiosLetras[i][j] = "DD"; 
                    break;
                    case 20:
                        tablaPolybiosLetras[i][j] = "DE"; 
                    break;   
                    case 21:
                        tablaPolybiosLetras[i][j] = "EA"; 
                    break;
                    case 22:
                        tablaPolybiosLetras[i][j] = "EB"; 
                    break;
                    case 23:
                        tablaPolybiosLetras[i][j] = "EC"; 
                    break;
                    case 24:
                        tablaPolybiosLetras[i][j] = "ED"; 
                    break;
                    case 25:
                        tablaPolybiosLetras[i][j] = "EE"; 
                    break;
                    default:
                    break;                         
                }
                c++;
            } 
        }
        /*for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(tablaPolybiosLetras[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println();
        for (int k = 0; k < cadenaC.length(); k++) {
            if (cadenaC.charAt(k) != ' ') {
                char primeraLetra = cadenaC.charAt(k);
                char segundaLetra = cadenaC.charAt(k+1);
                String mini = ""+primeraLetra+segundaLetra;
                int num = 0;
                int cont =1;
                String temp = "";
                for(int i=0;i<5;i++) {
                    for(int j=0;j<5;j++) {
                        temp = tablaPolybiosLetras[i][j];
                        System.out.println(mini+" "+temp);
                        
                        if(mini.equals(temp)) {
                            System.out.println("si entró");
                            i=5;
                            j=5;
                            switch(cont) {
                                case 1:
                                    cadena += "A"; 
                                break;
                                case 2:
                                    cadena += "B"; 
                                break;
                                case 3:
                                    cadena += "C";
                                break;
                                case 4:
                                    cadena += "D"; 
                                break;   
                                case 5:
                                    cadena += "E"; 
                                break;
                                case 6:
                                    cadena += "F"; 
                                break;
                                case 7:
                                    cadena += "G"; 
                                break;
                                case 8:
                                    cadena += "H"; 
                                break;
                                case 9:
                                    cadena += "I"; 
                                break;
                                case 10:
                                    cadena += "J"; 
                                break;
                                case 11:
                                    cadena += "K"; 
                                break;
                                case 12:
                                    cadena += "L"; 
                                break;   
                                case 13:
                                    cadena += "M"; 
                                break;
                                case 14:
                                    cadena += "N";
                                break;
                                case 15:
                                    cadena += "O"; 
                                break;
                                case 16:
                                    cadena += "P"; 
                                break;
                                case 17:
                                    cadena += "Q"; 
                                break;
                                case 18:
                                    cadena += "R"; 
                                break;
                                case 19:
                                    cadena += "S"; 
                                break;
                                case 20:
                                    cadena += "T"; 
                                break;   
                                case 21:
                                    cadena += "U"; 
                                break;
                                case 22:
                                    cadena += "V"; 
                                break;
                                case 23:
                                    cadena += "W"; 
                                break;
                                case 24:
                                    cadena += "X"; 
                                break;
                                case 25:
                                    cadena += "Y"; 
                                break;
                                default:
                                    cadena += "Z";
                                break;
                            } 
                            cont=0;
                        }
                        else {
                            System.out.println("NO entró");
                            cont++;
                        }
                    }
                }
                System.out.println("CADENA ACTUAL: "+cadena);
                k++;
            } else {
                cadena += " ";
            }
        }
     
        
        tpA.setText(cadena.toUpperCase());
    }//GEN-LAST:event_dBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tpA.setText("");
        tcA.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polybios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cB;
    private javax.swing.JButton dB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tcA;
    private javax.swing.JTextArea tpA;
    // End of variables declaration//GEN-END:variables
}
