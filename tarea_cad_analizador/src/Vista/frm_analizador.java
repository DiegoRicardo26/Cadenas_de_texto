/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import Modelo.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
/**
 *
 * @author degodl
 */
public class frm_analizador extends javax.swing.JFrame {

    /**
     * Creates new form frm_analizador
     */
    String path=" ";
    Archivo archivo = new Archivo();
    //Analizador analizador = new Analizador();
    public frm_analizador() {
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_texto = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_murcielago = new javax.swing.JTextArea();
        lbl_longitud = new javax.swing.JLabel();
        lbl_totalpalabras = new javax.swing.JLabel();
        lbl_primeraletra = new javax.swing.JLabel();
        lbl_ultimaletra = new javax.swing.JLabel();
        lbl_letracentral = new javax.swing.JLabel();
        lbl_primerapalabra = new javax.swing.JLabel();
        lbl_palabracentral = new javax.swing.JLabel();
        lbl_ultimapalabra = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbl_impares = new javax.swing.JLabel();
        lbl_pares = new javax.swing.JLabel();
        lbl_repeticionesU = new javax.swing.JLabel();
        lbl_repeticionesO = new javax.swing.JLabel();
        lbl_repeticionesI = new javax.swing.JLabel();
        lbl_repeticionesE = new javax.swing.JLabel();
        lbl_repeticionesA = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_abrir = new javax.swing.JMenuItem();
        menu_guardar = new javax.swing.JMenuItem();
        menu_guardar_como = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_copiar = new javax.swing.JMenuItem();
        menu_cortar = new javax.swing.JMenuItem();
        menu_pegar = new javax.swing.JMenuItem();
        menu_buscar = new javax.swing.JMenuItem();
        menu_reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese un texto o abra un archivo");

        txta_texto.setColumns(20);
        txta_texto.setRows(5);
        jScrollPane1.setViewportView(txta_texto);

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Longitud de Texto:");

        jLabel4.setText("Total de Palabras:");

        jLabel5.setText("Primera letra del texto:");

        jLabel6.setText("Ultima letra del texto:");

        jLabel7.setText("Letra central del texto:");

        jLabel8.setText("Primera palabra:");

        jLabel9.setText("Palabra central:");

        jLabel10.setText("Ultima Palabra:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Traduccion a Clave Murcielago");

        txta_murcielago.setColumns(20);
        txta_murcielago.setRows(5);
        jScrollPane2.setViewportView(txta_murcielago);

        jLabel12.setText("Repeticiones de \"A\", \"a\" o \"??\"");

        jLabel13.setText("Repeticiones de \"E\", \"e\" o \"??\"");

        jLabel14.setText("Repeticiones de \"I\", \"i\" o \"??\"");

        jLabel15.setText("Repeticiones de \"O\", \"o\" o \"??\"");

        jLabel16.setText("Repeticiones de \"U\", \"u\" o \"??\"");

        jLabel18.setText("Palabras con cantidad de caracteres par");

        jLabel19.setText("Palabras con cantidad de caracteres Impar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("MANEJO DE CADENAS ");

        jMenu1.setText("Archivo");

        menu_abrir.setText("Abrir");
        menu_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_abrirActionPerformed(evt);
            }
        });
        jMenu1.add(menu_abrir);

        menu_guardar.setText("Guardar");
        menu_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(menu_guardar);

        menu_guardar_como.setText("Guardar Como");
        menu_guardar_como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_guardar_comoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_guardar_como);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        menu_copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_copiar.setText("Copiar");
        menu_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_copiarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_copiar);

        menu_cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_cortar.setText("Cortar");
        menu_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cortarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_cortar);

        menu_pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_pegar.setText("Pegar");
        menu_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_pegarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_pegar);

        menu_buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_buscar.setText("Buscar");
        menu_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buscarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_buscar);

        menu_reemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_reemplazar.setText("Reemplazar");
        menu_reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_reemplazarActionPerformed(evt);
            }
        });
        jMenu2.add(menu_reemplazar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_palabracentral, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ultimapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_primerapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_letracentral, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ultimaletra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_primeraletra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_totalpalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_repeticionesA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_repeticionesE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_repeticionesI, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_repeticionesO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_repeticionesU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_pares, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_impares, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addComponent(lbl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_procesar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel11))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_procesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lbl_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbl_primeraletra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6))
                                            .addComponent(lbl_ultimaletra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7))
                                    .addComponent(lbl_letracentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(lbl_primerapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(lbl_palabracentral, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(lbl_ultimapalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_totalpalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(lbl_repeticionesA, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(lbl_repeticionesE, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(lbl_repeticionesI, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(lbl_repeticionesO, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(lbl_repeticionesU, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(lbl_pares, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lbl_impares, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_abrirActionPerformed
        try {
            path=abrir();
        } catch (IOException ex) {
            Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_abrirActionPerformed

    private void menu_guardar_comoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_guardar_comoActionPerformed
        try {
            // TODO add your handling code here:
            path=archivo.Guardar_como(txta_texto.getText());
        } catch (IOException ex) {
            Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_guardar_comoActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        txta_murcielago.setText("");
        analizar(txta_texto.getText());
        
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void menu_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_copiarActionPerformed
        // TODO add your handling code here:
        String seleccionar=txta_texto.getSelectedText();
        Clipboard portapapeles = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccionado= new StringSelection(seleccionar);
        portapapeles.setContents(seleccionado, seleccionado);
        JOptionPane.showMessageDialog(null, "texto copiado: ");
    }//GEN-LAST:event_menu_copiarActionPerformed

    private void menu_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cortarActionPerformed
        // TODO add your handling code here:
        String seleccionar=txta_texto.getSelectedText();
        Clipboard portapapeles = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection seleccionado= new StringSelection(seleccionar);
        portapapeles.setContents(seleccionado, seleccionado);
        txta_texto.cut();
        JOptionPane.showMessageDialog(null, "texto cortado: ");
    }//GEN-LAST:event_menu_cortarActionPerformed

    
    private void menu_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_pegarActionPerformed
        // TODO add your handling code here: 
        String pegado="";
        Clipboard portapapeles= Toolkit.getDefaultToolkit().getSystemClipboard();
        //Transferable contenido=portapapeles.getContents(this);
        
            try {  
                pegado = (String) portapapeles.getContents(this).getTransferData(DataFlavor.stringFlavor);
                //pegado = (String) contenido.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        //txta_texto.getMousePosition();
        
        txta_texto.append(" "+pegado);
        JOptionPane.showMessageDialog(null, "texto pegado: ");
        
    }//GEN-LAST:event_menu_pegarActionPerformed

    private void menu_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buscarActionPerformed
        // TODO add your handling code here:
        String buscar = JOptionPane.showInputDialog("Ingrese la palabra que quiere buscar");
        Highlighter.HighlightPainter marcador = new DefaultHighlighter.DefaultHighlightPainter( Color.LIGHT_GRAY );

        txta_texto.getHighlighter().removeAllHighlights();
        int buscando = txta_texto.getText().indexOf(buscar);
        int longitud = buscar.length(); 
        while ( buscando != -1)
        {
            try {
                txta_texto.getHighlighter().addHighlight(buscando, buscando + longitud, marcador);
            } catch (BadLocationException ex) {
                Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
            }
             buscando = txta_texto.getText().indexOf(buscar, buscando+1);
        }
    }//GEN-LAST:event_menu_buscarActionPerformed

    private void menu_reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_reemplazarActionPerformed
        // TODO add your handling code here:
        String prueba=txta_texto.getSelectedText();
        try
        {
            if(!prueba.isEmpty())
            {
                String reemplazo=JOptionPane.showInputDialog("Por que palabra quiere reemplazar?");
                txta_texto.setText(txta_texto.getText().replaceAll(prueba, reemplazo));
            }
        }catch(Exception ex){
            String palabra_reemplazar=JOptionPane.showInputDialog("Que palabra quiere reemplazar?");
            String reemplazo=JOptionPane.showInputDialog("Por que palabra quiere reemplazar?");
            txta_texto.setText(txta_texto.getText().replaceAll(palabra_reemplazar, reemplazo));
        }
    }//GEN-LAST:event_menu_reemplazarActionPerformed

    private void menu_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_guardarActionPerformed
        // TODO add your handling code here:
        try {

            //JOptionPane.showMessageDialog(null, "EL PATH ES: "+path);
            if(path.isBlank())
            {
            path=archivo.Guardar(txta_texto.getText(), path);
            JOptionPane.showMessageDialog(null, "Archivo Guardado");
            }
            else
            {
                path=archivo.Guardar(txta_texto.getText(), path);
                JOptionPane.showMessageDialog(null, "Cambios Guardados");
            }
        } catch (IOException ex) {
            Logger.getLogger(frm_analizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_guardarActionPerformed
    
    
    public String abrir() throws IOException
    {
        String path;
        JFileChooser fileChooser = new JFileChooser("D:\\Codigos\\Proyectos de JAVA\\analizador_cadenas");
        int a = fileChooser.showOpenDialog(null);
        //txta_texto.setText("");
        File abrir = fileChooser.getSelectedFile();
        FileReader leer=new FileReader(abrir);
        BufferedReader br = new BufferedReader(leer);
        String texto="", linea="";
        path =abrir.getPath();
        while((linea=br.readLine())!=null)
        {
            texto +=linea+"\n";
        }
        txta_texto.setText(texto);

        return path;
    }
    
    public void analizar(String texto)
    {
        int longitud = texto.length();
        String primeraletra=texto.substring(0,1);
        String ultimaletra=texto.substring(texto.length()-1);
        char letracentral=texto.charAt(longitud/2);
        
        tokens(texto);
        
        lbl_longitud.setText(String.valueOf(longitud));
        lbl_primeraletra.setText(primeraletra);
        lbl_ultimaletra.setText(ultimaletra);
        lbl_letracentral.setText(String.valueOf(letracentral));
    }
    ////////////////////////////////////////////////////////////////////////
    public void tokens(String texto)
    {
        int palabras=0, i=0, pares=0, impares=0, repeticionA=0, repeticionE=0, repeticionI=0, repeticionO=0, repeticionU=0;
        String[] totalpalabras = new String[50];
        StringTokenizer separador_palabras= new StringTokenizer(texto);
        while(separador_palabras.hasMoreTokens())
        {
            totalpalabras[i]=separador_palabras.nextToken(); 
            palabras++;
            i++;
        }
        
        for(int repeticion=0;repeticion<palabras;repeticion++)
        {
            if(totalpalabras[repeticion].length()%2==0)
            {
                pares++;
            }
            else
            {
            impares++;
            }
        }
        
        for(int comparacion=0;comparacion<palabras;comparacion++)
        {
            for(int comparando=0;comparando<totalpalabras[comparacion].length();comparando++)
            {
                char reducir=totalpalabras[comparacion].charAt(comparando);
                switch (reducir) {
                    case 'A': case '??': case 'a': case '??':
                        repeticionA++;
                        break;
                    case 'E': case '??': case 'e': case '??':
                        repeticionE++;
                        break;
                    case 'I': case '??': case 'i': case '??':
                        repeticionI++;
                        break;
                    case 'O': case '??': case 'o': case '??':
                        repeticionO++;
                        break;
                    case 'U': case '??': case 'u': case '??':
                        repeticionU++;
                        break;
                    default:
                        break;
                }
                
                // SWITCH PARA TRADUCIR A CLAVE MURCIELAGO
                switch(reducir)
                {
                    case 'M': case'm':
                        txta_murcielago.append("0");
                        break;
                    case 'U': case'u':
                        txta_murcielago.append("1");
                    break;
                    case 'R': case'r':
                        txta_murcielago.append("2");
                    break;
                    case 'C': case'c':
                        txta_murcielago.append("3");
                    break;
                    case 'I': case'i':
                        txta_murcielago.append("4");
                    break;
                    case 'E': case'e':
                        txta_murcielago.append("5");
                    break;
                    case 'L': case'l':
                        txta_murcielago.append("6");
                        break;
                    case 'A': case'a':
                        txta_murcielago.append("7");
                    break;
                    case 'G': case'g':
                        txta_murcielago.append("8");
                    break;
                    case 'O': case'o':
                        txta_murcielago.append("9");
                    break;
                    default:
                        txta_murcielago.append(String.valueOf(reducir));
                    break;
                }
               
            }
            txta_murcielago.append(" ");
        }
        
        lbl_primerapalabra.setText(totalpalabras[0]);
        lbl_ultimapalabra.setText(String.valueOf(totalpalabras[i-1]));
        lbl_palabracentral.setText(String.valueOf(totalpalabras[i/2]));
        lbl_totalpalabras.setText(String.valueOf(palabras));
        lbl_pares.setText(String.valueOf(pares));
        lbl_impares.setText(String.valueOf(impares));
        
        lbl_repeticionesA.setText(String.valueOf(repeticionA));
        lbl_repeticionesE.setText(String.valueOf(repeticionE));
        lbl_repeticionesI.setText(String.valueOf(repeticionI));
        lbl_repeticionesO.setText(String.valueOf(repeticionO));
        lbl_repeticionesU.setText(String.valueOf(repeticionU));
    }
    
    
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
            java.util.logging.Logger.getLogger(frm_analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_analizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_impares;
    private javax.swing.JLabel lbl_letracentral;
    private javax.swing.JLabel lbl_longitud;
    private javax.swing.JLabel lbl_palabracentral;
    private javax.swing.JLabel lbl_pares;
    private javax.swing.JLabel lbl_primeraletra;
    private javax.swing.JLabel lbl_primerapalabra;
    private javax.swing.JLabel lbl_repeticionesA;
    private javax.swing.JLabel lbl_repeticionesE;
    private javax.swing.JLabel lbl_repeticionesI;
    private javax.swing.JLabel lbl_repeticionesO;
    private javax.swing.JLabel lbl_repeticionesU;
    private javax.swing.JLabel lbl_totalpalabras;
    private javax.swing.JLabel lbl_ultimaletra;
    private javax.swing.JLabel lbl_ultimapalabra;
    private javax.swing.JMenuItem menu_abrir;
    private javax.swing.JMenuItem menu_buscar;
    private javax.swing.JMenuItem menu_copiar;
    private javax.swing.JMenuItem menu_cortar;
    private javax.swing.JMenuItem menu_guardar;
    private javax.swing.JMenuItem menu_guardar_como;
    private javax.swing.JMenuItem menu_pegar;
    private javax.swing.JMenuItem menu_reemplazar;
    private javax.swing.JTextArea txta_murcielago;
    private javax.swing.JTextArea txta_texto;
    // End of variables declaration//GEN-END:variables
}
