/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JFrame;

import static javax.swing.SwingUtilities.paintComponent;

import javax.swing.JOptionPane;

import org.example.ItemsDefinidos.*;
import org.example.*;
import listas.*;
import movimientos.*;
import pokemones.*;
/**
 *
 * @author Rhamses
 */
public class menubien extends javax.swing.JFrame {

        int bg;
        jPanelGradient gradientPanel = new jPanelGradient();
        JFrame frame = new JFrame("Menu");
    /**
     * Creates new form 
     */
    public menubien() {
        initComponents();
        setLocationRelativeTo(null);


    }

    //Agregue el metodo para poner los clasher random
    public void MousntritosMatch(ListaDE<Mounstritos> mons,ListaDE<Mounstritos> monsPlayer1,ListaDE<Mounstritos> monsPlayer2) throws Exception { // Este es el metodo para seleccionar 4 mounstritos al azar para cada juagdor y que no se repitan

        Random random = new Random();
        Set<Integer> mousntritosSeleccionados = new HashSet<>(); // Se usa un Hashset para guaradr los indices de los pokemones ya utilizados

        while(monsPlayer1.size() < 4){

            int index = random.nextInt(mons.size()); // se obtiene un indice random dependiendo del tamaño de la lista

            if(!mousntritosSeleccionados.contains(index)) { // si el indice no esta en el set contunua el codigo
                monsPlayer1.adicionar(mons.obtener(index)); // se adiciona a la lista nueva el mounstrito seleccionado
                mousntritosSeleccionados.add(index); // se guarda el indice para que no se repita
            }

        }

        while(monsPlayer2.size() < 4){

            int index = random.nextInt(mons.size()); // se obtiene un indice random dependiendo del tamaño de la lista del jugador 2

            if(!mousntritosSeleccionados.contains(index)) { // si el indice no esta en el set contunua el codigo
                monsPlayer2.adicionar(mons.obtener(index)); // se adiciona a la lista del jugador 2 el mounstrito seleccionado
                mousntritosSeleccionados.add(index); // se guarda el indice para que no se repita
            }

        }

    }


    public Duelo inicializarJuego() {
        Duelo duelo = null;
        try {

            // Estan en el orden del Docs
            //Movimientos

            //Ataques
            Movimientos num1 = new Ataques("Fuego", "FIREBALL", 75, 5, 50);
            Movimientos num2 = new Ataques("Fuego", "Bucle Infinito", 33, 2, 200);
            Movimientos num3 = new Ataques("Fuego", "Funa Intensiva", 32, 4, 100);
            Movimientos num4 = new Ataques("Fuego", "Try-Catch", 45, 3, 125);
            Movimientos num5 = new Ataques("Fuego", "JS", 15, 1, 500);

            Movimientos num6 = new Ataques("Aire", "Borrar System 32", 10, 1, 500);
            Movimientos num7 = new Ataques("Aire", "Air Pods Pro Max", 75, 4, 70);
            Movimientos num8 = new Ataques("Agua", "Costas Clasistas", 40, 3, 95);
            Movimientos num9 = new Ataques("Agua", "Mago de Hielo", 20, 2, 195);
            Movimientos num10 = new Ataques("Planta", "Mari-IGUANA", 50, 3, 90);

            Movimientos num11 = new Ataques("Roca", "Meteorito Temporada 8", 33, 2, 125);
            Movimientos num12 = new Ataques("Planta", "Lanza-Guisantes", 75, 5, 40);
            Movimientos num13 = new Ataques("Planta", "Cacahuete", 15, 1, 280);
            Movimientos num14 = new Ataques("Agua", "Chorros Chorreantes", 65, 4, 60);
            Movimientos num15 = new Ataques("Roca", "Paris blast", 10, 1, 550);

            Movimientos num16 = new Ataques("Roca", "Backend in JS", 50, 3, 100);
            Movimientos num17 = new Ataques("Aire", "Aniversario Volaris", 20, 3, 95);
            Movimientos num18 = new Ataques("Agua", "Mini Pekka", 11, 1, 500);
            Movimientos num19 = new Ataques("Aire", "ICloud full", 66, 5, 45);
            Movimientos num20 = new Ataques("Roca", "Maze", 80, 5, 55);

            Movimientos num21 = new Ataques("Planta", "Cebolla", 25, 2, 175);
            Movimientos num22 = new Ataques("Aire", "Vientos Vientosos", 21, 2, 155);
            Movimientos num23 = new Ataques("Agua", "Water Fall", 85, 5, 35);
            Movimientos num24 = new Ataques("Planta", "Pasto Fino", 65, 4, 80);
            Movimientos num25 = new Ataques("Roca", "Bowler", 45, 4, 85);

            //Healing
            Movimientos num26 = new Healing("Planta", "Plantitas Planteras", 70, 5, 50);
            Movimientos num27 = new Healing("Agua", "Oleas Oleadas", 50, 4, 100);
            Movimientos num28 = new Healing("Aire", "Aires Clasistas", 40, 3, 150);
            Movimientos num29 = new Healing("Roca", "Rocky", 33, 2, 175);
            Movimientos num30 = new Healing("Fuego", "Fueguitos", 10, 1, 250);

            //Buff and Debuff

            Movimientos num31 = new buff("Agua", "OMG", 50, 3);
            Movimientos num32 = new Debuff("Fuego", "Tacos", 30, 2);

            ListaDE<Movimientos> movimientosPlayers = new ListaDE<>();

            movimientosPlayers.adicionar(num1);
            movimientosPlayers.adicionar(num2);
            movimientosPlayers.adicionar(num3);
            movimientosPlayers.adicionar(num4);
            movimientosPlayers.adicionar(num5);

            movimientosPlayers.adicionar(num6);
            movimientosPlayers.adicionar(num7);
            movimientosPlayers.adicionar(num8);
            movimientosPlayers.adicionar(num9);
            movimientosPlayers.adicionar(num10);

            movimientosPlayers.adicionar(num11);
            movimientosPlayers.adicionar(num12);
            movimientosPlayers.adicionar(num13);
            movimientosPlayers.adicionar(num14);
            movimientosPlayers.adicionar(num15);

            movimientosPlayers.adicionar(num16);
            movimientosPlayers.adicionar(num17);
            movimientosPlayers.adicionar(num18);
            movimientosPlayers.adicionar(num19);
            movimientosPlayers.adicionar(num20);

            movimientosPlayers.adicionar(num21);
            movimientosPlayers.adicionar(num22);
            movimientosPlayers.adicionar(num23);
            movimientosPlayers.adicionar(num24);
            movimientosPlayers.adicionar(num25);

            movimientosPlayers.adicionar(num26);
            movimientosPlayers.adicionar(num27);
            movimientosPlayers.adicionar(num28);
            movimientosPlayers.adicionar(num29);
            movimientosPlayers.adicionar(num30);

            movimientosPlayers.adicionar(num31);
            movimientosPlayers.adicionar(num32);

            //Creacion de Mounstritos

            ListaDE<Mounstritos> pokemones = new ListaDE<>();

            //Mousntritos

            Mounstritos mon1 = new tipoFuego("Andy Chad", 200, 200, movimientosPlayers, 500, 200, "andy-chad.png", true);
            Mounstritos mon2 = new tipoRoca("Many Dormilon", 500, 500, movimientosPlayers, 100, 50, "many-dormilon.png", true);
            Mounstritos mon3 = new tipoAgua("Pepino White", 300, 350, movimientosPlayers, 200, 75, "pepino-white.png", true);
            Mounstritos mon4 = new tipoAire("Blind Guy", 250, 250, movimientosPlayers, 175, 100, "blind-guy.png", true);
            Mounstritos mon5 = new tipoFuego("Huh Guy", 300, 350, movimientosPlayers, 350, 50, "sex-guy.png", true);

            Mounstritos mon6 = new tipoPlanta("White Bro", 200, 200, movimientosPlayers, 300, 150, "white-fellow.png", true);
            Mounstritos mon7 = new tipoAire("Helicopter", 400, 400, movimientosPlayers, 400, 20, "helicopter.png", true);
            Mounstritos mon8 = new tipoRoca("Juan", 450, 450, movimientosPlayers, 90, 50, "juan.png", true);
            Mounstritos mon9 = new tipoRoca("Omni-Man", 350, 350, movimientosPlayers, 400, 25, "omni-man.png", true);
            Mounstritos mon10 = new tipoPlanta("Pepina", 200, 200, movimientosPlayers, 200, 100, "pepina.png", true);

            Mounstritos mon11 = new tipoAgua("Te Falta Alcohol", 350, 350, movimientosPlayers, 1000, 300, "te-falta-alcohol.png", true);
            Mounstritos mon12 = new tipoFuego("No quema Cuh", 250, 250, movimientosPlayers, 350, 120, "no-quema-cu.png", true);
            Mounstritos mon13 = new tipoFuego("Kenny", 1, 1, movimientosPlayers, 300, 100, "kenny.png", true);
            Mounstritos mon14 = new tipoPlanta("Uwu", 200, 200, movimientosPlayers, 275, 150, "uwu.png", true);
            Mounstritos mon15 = new tipoAgua("NPC AVERAGE", 150, 250, movimientosPlayers, 325, 250, "npc-average.png", true);

            Mounstritos mon16 = new tipoAgua("Frozono", 240, 240, movimientosPlayers, 300, 75, "frozono.png", true);
            Mounstritos mon17 = new tipoAire("Ting Ling", 220, 220, movimientosPlayers, 250, 100, "ting-ling.png", true);
            Mounstritos mon18 = new tipoFuego("Wilson", 350, 350, movimientosPlayers, 450, 125, "wilson.png", true);
            Mounstritos mon19 = new tipoAire("Va a ganar el Cruz Azul we", 150, 250, movimientosPlayers, 250, 50, "i-lost-all-my-money.png", true);
            Mounstritos mon20 = new tipoPlanta("NPC", 150, 150, movimientosPlayers, 200, 75, "npc.png", true);

            Mounstritos mon21 = new tipoAire("OMG", 300, 300, movimientosPlayers, 300, 175, "omg.png", true);
            Mounstritos mon22 = new tipoRoca("KikeKun", 500, 500, movimientosPlayers, 200, 20, "kikekum.png", true);
            Mounstritos mon23 = new tipoPlanta("Eric-Chan", 80, 80, movimientosPlayers, 150, 300, "eric-chan.png", true);
            Mounstritos mon24 = new tipoAgua("Tucan", 50, 50, movimientosPlayers, 666, 205, "tucan.png", true);
            Mounstritos mon25 = new tipoRoca("Little Demon", 50, 200, movimientosPlayers, 777, 50, "kikekum.png", true);

            pokemones.adicionar(mon1);
            pokemones.adicionar(mon2);
            pokemones.adicionar(mon3);
            pokemones.adicionar(mon4);
            pokemones.adicionar(mon5);

            pokemones.adicionar(mon6);
            pokemones.adicionar(mon7);
            pokemones.adicionar(mon8);
            pokemones.adicionar(mon9);
            pokemones.adicionar(mon10);

            pokemones.adicionar(mon11);
            pokemones.adicionar(mon12);
            pokemones.adicionar(mon13);
            pokemones.adicionar(mon14);
            pokemones.adicionar(mon15);

            pokemones.adicionar(mon16);
            pokemones.adicionar(mon17);
            pokemones.adicionar(mon18);
            pokemones.adicionar(mon19);
            pokemones.adicionar(mon20);

            pokemones.adicionar(mon21);
            pokemones.adicionar(mon22);
            pokemones.adicionar(mon23);
            pokemones.adicionar(mon24);
            pokemones.adicionar(mon25);

            //Aqui cree 2 listas de 4 mousntritos cada una.
            ListaDE<Mounstritos> mons1 = new ListaDE<>();
            ListaDE<Mounstritos> mons2 = new ListaDE<>();

            MousntritosMatch(pokemones, mons1, mons2); // llamamos al metodo

            //Falta completar los Items
            Items item1 = new Berserk("Berserk", false);
            Items item2 = new LifeTotem("LifeTotem", false);
            Items item3 = new SantoHealing("SantoHealing", false);
            Items item4 = new Tornado("Tornado", false);
            Items item5 = new VidaVoodo("VidaVoodo", false);

            ListaDE<Items> Itemstotales = new ListaDE<>();

            Itemstotales.adicionar(item1);
            Itemstotales.adicionar(item2);
            Itemstotales.adicionar(item3);
            Itemstotales.adicionar(item4);
            Itemstotales.adicionar(item5);

            Jugador jugador1 = new Jugador("Primus", mons1, Itemstotales);
            Jugador jugador2 = new Jugador("Secundo", mons2, Itemstotales);


            duelo = new Duelo(1, jugador1, jugador2);


     

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo mal ocurrió en el constructor e inicializador",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return duelo;
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

        jPanel1 = new jPanelGradient();
        entorno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        aplicar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entorno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija su entorno", "Bosque", "Playa", "Cuba", "Volcan" }));
        entorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entornoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MENU");

        aplicar.setText("APLICAR");
        aplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarActionPerformed(evt);
            }
        });

        jButton1.setText("EMPEZAR DUELO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicar))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(entorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aplicar)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(419, 274));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void entornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entornoActionPerformed

        
        
    }//GEN-LAST:event_entornoActionPerformed

    private void aplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarActionPerformed
        bg = entorno.getSelectedIndex();
    }//GEN-LAST:event_aplicarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton1ActionPerformed

        Duelo duelo = inicializarJuego();
        Duelo.IniciarLogDuelo();

        new turnoimpardos(bg, duelo).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menubien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menubien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menubien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menubien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menubien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicar;
    private javax.swing.JComboBox<String> entorno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
