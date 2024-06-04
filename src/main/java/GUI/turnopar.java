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
import java.util.logging.Level;
import java.util.logging.Logger;
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
            String pokeunoPath = pokemon(match.getJugador1().getListaMounstritos().obtener(0).getSprite());
            pokeunoshow.setIcon(new ImageIcon(pokeunoPath));
            String pokedosPath = pokemon(match.getJugador2().getListaMounstritos().obtener(0).getSprite());
            pokedosshow.setIcon(new ImageIcon(pokedosPath));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelzon = new javax.swing.JLayeredPane();
        background = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        poke1 = new javax.swing.JLayeredPane();
        pokedosshow = new javax.swing.JLabel();
        poke2 = new javax.swing.JLayeredPane();
        pokeunoshow = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 570));

        jLabel1.setText("TURNO X");

        jLabel2.setText("Que vas a querer hacer?");

        jButton5.setText("Bolsa con cositas mágicas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("fichero");

        jProgressBar1.setString("100%");

        panelzon.setLayer(background, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelzon.setLayer(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelzon.setLayer(jProgressBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelzonLayout = new javax.swing.GroupLayout(panelzon);
        panelzon.setLayout(panelzonLayout);
        panelzonLayout.setHorizontalGroup(
            panelzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelzonLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(panelzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelzonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelzonLayout.setVerticalGroup(
            panelzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelzonLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addGroup(panelzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(panelzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelzonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        poke1.setBackground(new java.awt.Color(200, 200, 200));

        pokedosshow.setBackground(new java.awt.Color(0, 0, 0));

        poke1.setLayer(pokedosshow, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout poke1Layout = new javax.swing.GroupLayout(poke1);
        poke1.setLayout(poke1Layout);
        poke1Layout.setHorizontalGroup(
            poke1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(poke1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pokedosshow, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );
        poke1Layout.setVerticalGroup(
            poke1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(poke1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pokedosshow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );

        poke2.setBackground(new java.awt.Color(200, 200, 200));

        pokeunoshow.setBackground(new java.awt.Color(0, 0, 0));

        poke2.setLayer(pokeunoshow, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout poke2Layout = new javax.swing.GroupLayout(poke2);
        poke2.setLayout(poke2Layout);
        poke2Layout.setHorizontalGroup(
            poke2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(poke2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(poke2Layout.createSequentialGroup()
                    .addComponent(pokeunoshow, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        poke2Layout.setVerticalGroup(
            poke2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(poke2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pokeunoshow, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );

        jButton6.setText("CAMBIAR CLASHER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Usar Ultimate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(208, 208, 208)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(poke1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(300, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(poke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 512, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton5))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(6, 6, 6))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addComponent(poke1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(329, Short.MAX_VALUE)
                    .addComponent(poke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(panelzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // bolsa de items


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        // cambiar clasher

        // pues otro gui

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            
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
        } catch (Exception ex) {
            Logger.getLogger(turnopar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:

            
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
        } catch (Exception ex) {
            Logger.getLogger(turnopar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            
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
        } catch (Exception ex) {
            Logger.getLogger(turnopar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:

            
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
        } catch (Exception ex) {
            Logger.getLogger(turnopar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(turnopar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(turnopar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(turnopar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(turnopar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLayeredPane panelzon;
    private javax.swing.JLayeredPane poke1;
    private javax.swing.JLayeredPane poke2;
    private javax.swing.JLabel pokedosshow;
    private javax.swing.JLabel pokeunoshow;
    // End of variables declaration//GEN-END:variables
}
