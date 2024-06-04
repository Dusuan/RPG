/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import movimientos.Ataques;
import org.example.Duelo;
import pokemones.Mounstritos;

import java.util.Random;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

/**
 *
 * @author Rhamses
 */
public class turnopar extends javax.swing.JFrame {
    public int bg;
    public Duelo match;
    int posicion1; // Inicializo las variables
    int posicion2;
    int cantidadDePokemones1;
    int cantidadDePokemones2;
    double damage;
    double dañoAcumulado2;

    public turnopar(int bg, Duelo match) {
        this.bg = bg;
        this.match= match;
        initComponents();
        setLocationRelativeTo(null);

        posicion1 = 0;
        posicion2 = 0;

        cantidadDePokemones1 = match.getJugador1().getListaMounstritos().size();
        cantidadDePokemones2 = match.getJugador2().getListaMounstritos().size();

        damage= 0;
        dañoAcumulado2 = 0;

        String backgroundPath = backgroundChoose(bg);
        background.setIcon(new ImageIcon(backgroundPath));
        try {
            String pokedosPath = pokemon(match.getJugador2().getListaMounstritos().obtener(0).getSprite());
            pokeunoshow.setIcon(new ImageIcon(pokedosPath));
            String pokeunoPath = pokemon(match.getJugador1().getListaMounstritos().obtener(0).getSprite());
            pokedosshow.setIcon(new ImageIcon(pokeunoPath));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Algo mal ocurrió en el constructor e inicializador",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public String pokemon(String img){
     /*   switch (poke) {
                case 1:
                    img = "andy-chad.png";
                    break;
                case 2:
                    img = "many-dormilon.png";
                 break;
                case 3:
                    img = "pepino-white.png";
                 break;
                case 4:
                    img = "blind-guy.png";
                break;
                case 5:
                    img = "sex-guy.png";
                break;
                case 6:
                    img = "white-fellow.png";
                break;
                case 7:
                    img = "helicopter.png";
                break;
                case 8:
                    img = "juan.png";
                break;
                case 9:
                    img = "omni-man.png";
                break;
                case 10:
                    img = "pepina.png";
                break;
                case 11:
                    img = "te-falta-alcohol.png";
                break;
                case 12:
                    img = "no-quema-cuh.png";
                break;
                case 13:
                    img = "kenny.png";
                break;
                case 14:
                    img = "uwu.png";
                break;
                case 15:
                    img = "npc-average.png";
                break;
                case 16:
                    img = "frozono.png";
                break;
                case 17:
                    img = "ting-ling.png";
                break;
                case 18:
                    img = "wilson.png";
                break;
                case 19:
                    img = "i-lost-all-my-money.png";
                break;
                case 20:
                    img = "npc.png";
                break;
                case 21:
                    img = "omg.png";
                break;
                case 22:
                    img = "kikekum.png";
                break;
                case 23:
                    img = "eric-chan.png";
                break;
                case 24:
                    img = "tucan.png";
                break;

                default:
                    img = "kikekum.png";
        }


      */



        String camino = "src\\main\\resources\\"+img;

        return camino;
    }
    public String backgroundChoose(int bg){

        String img = "";

        switch (bg) {
            case 1:
                img = "bosque (bg).png";
                break;
            case 2:
                img = "playabien.png";
                break;
            case 3:
                img = "cuba.png";
                break;
            case 4:
                img = "volcanbien.png";
                break;
            default:
                img = "neutralbien.png";
                // Default secuencia de sentencias.
        }

        String camino = "src\\main\\resources\\"+img;

        return camino;

    }


    public class jPanelGradient extends javax.swing.JPanel {

        public Color color1;
        public Color color2;



        public void setColor(Color c1, Color c2) {
            color1 = c1;
            color2 = c2;
        }


        public void paintComponent(Graphics g){
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 = new Color(102, 102, 102);
            Color color2 = new Color(51, 51, 51);

            if (color1 != null && color2 != null) {
                GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton3.setText("ataque2.3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ataque2.4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Que vas a querer hacer?");

        jButton5.setText("Bolsa con cositas mágicas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("TURNO X");

        jLabel3.setText("TEMPORIZADOR");

        jTextField1.setText("REGISTO DE BATALLA (FICHEROS)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton9.setText("ataque1.1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("ataque1.2");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setText("pp1");

        jLabel6.setText("pp2");

        jLabel7.setText("pp3");

        jLabel8.setText("pp4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(260, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(73, 73, 73)
                .addComponent(jLabel6)
                .addGap(86, 86, 86)
                .addComponent(jLabel7)
                .addGap(84, 84, 84)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 96, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // bolsa de items


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton1ActionPerformed
        // ataque 1


            match.movimientoPLayer2(0, posicion1, posicion2);

            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(0) instanceof Ataques) { //
                damage = ((Ataques) match.ataquePokemon2(0, posicion2)).getDamage();

                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(0)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                    dañoAcumulado2 += damage;

                }
            }

            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                System.out.println("El Clasher a muerto");
                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                cantidadDePokemones1--;
                posicion1 = 0;

            } else {
                System.out.println("Vida del Clasher rival : ");
                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
            }

        if(match.ChecarEquipoVivo(match.getJugador1())) {

            match.nextTurn(); // se le suma al turno

            new turnoimpardos(bg, match).setVisible(true);
            this.dispose();

        }
        else {
            JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!");
            new menubien().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // ataque 2

            match.movimientoPLayer2(1, posicion1, posicion2);

            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(1) instanceof Ataques) { //
                damage = ((Ataques) match.ataquePokemon2(1, posicion2)).getDamage();

                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(1)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                    dañoAcumulado2 += damage;
                }

            }

            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                System.out.println("El Clasher a muerto");
                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                cantidadDePokemones1--;
                posicion1 = 0;

            } else {
                System.out.println("Vida del Clasher rival : ");
                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
            }
        if(match.ChecarEquipoVivo(match.getJugador1())) {

            match.nextTurn(); // se le suma al turno
            new turnoimpardos(bg, match).setVisible(true);
            this.dispose();

        }  else {
            JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!");
            new menubien().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // ataque 3

            match.movimientoPLayer2(2, posicion1, posicion2);

            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(2) instanceof Ataques) { //
                damage = ((Ataques) match.ataquePokemon2(2, posicion2)).getDamage();

                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(2)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                    dañoAcumulado2 += damage;
                }

            }

            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                System.out.println("El Clasher a muerto");
                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                cantidadDePokemones1--;
                posicion1 = 0;

            } else {
                System.out.println("Vida del Clasher rival : ");
                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
            }
        if(match.ChecarEquipoVivo(match.getJugador1())) {

            match.nextTurn(); // se le suma al turno
            new turnoimpardos(bg, match).setVisible(true);
            this.dispose();

        }
        else {
            JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!");
            new menubien().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // ataque 4

            match.movimientoPLayer2(3, posicion1, posicion2);

            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(3) instanceof Ataques) { // Verifica que el movimiento realizado sea un ataque
                damage = ((Ataques) match.ataquePokemon2(3, posicion2)).getDamage();

                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(3)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                    dañoAcumulado2 += damage;
                }

            }


            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                System.out.println("El Clasher a muerto");
                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                cantidadDePokemones1--;
                posicion1 = 0;

            } else {
                System.out.println("Vida del Clasher rival : ");
                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
            }
        if(match.ChecarEquipoVivo(match.getJugador1())) {

            match.nextTurn(); // se le suma al turno
            new turnoimpardos(bg, match).setVisible(true);
            this.dispose();

        }
        else {
            JOptionPane.showMessageDialog(null, "El jugador 2 ha ganado!");
            new menubien().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        // cambiar clasher

        // pues otro gui

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(turnoimpardos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(turnoimpardos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(turnoimpardos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(turnoimpardos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
