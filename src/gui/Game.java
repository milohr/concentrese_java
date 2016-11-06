/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import concentrese.cronometro;
import concentrese.logica;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author camilo
 */
public class Game extends javax.swing.JFrame  {

    private logica lg = new logica();
    private cronometro con;
    private boolean caraUp = false;
    private boolean f=false;
    private boolean bt=false;
    private boolean primerc=false;
   private int par=0;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private int pt=0;
    private String user;
    private String pck;
    private login ln;
    private int cont_turn;
    public Game(login ln) {
        
        this.ln=ln;
        cont_turn=1;
        
        //this.user=ln.getUser();
        pck="pck1";
        initComponents();
        turno_c.setText(Integer.toString(cont_turn));
        nombre.setText(user);
        pun.setText(Integer.toString(pt));
        con = new cronometro(tiempo);
        System.out.println("se creo el juego");
    }
    public Game() {
        cont_turn=1;
        
        pck="pck1";
        initComponents();
        turno_c.setText(Integer.toString(cont_turn));
        pun.setText(Integer.toString(pt));
        con = new cronometro(tiempo);
        System.out.println("se creo el juego");
    }

    public void setTl(String tiempo)
    {
        limite.setText(tiempo);
    }
    
    public void setTn(int turnos)
    {
        tn.setText(Integer.toString(turnos));
    }
    
    public void setPck(String pck)
    {
        this.pck=pck;
    }
    
    public void setUser(String user)
    {
        this.user=user;
        nombre.setText(user);
    }
    
    private void setCards() {
        switch (pck)
        {
            case "pck1": setPck1(); break;
            case "pck2": setPck2(); break;
            case "pck3": setPck3(); break;
            default: setPck1(); break;
            
        }

    }
    
    
    private void setPck1()
    {
        int[] numbers = lg.getCardNumbers();
        btn1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[0] + ".png")));
        btn2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[1] + ".png")));
        btn3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[2] + ".png")));
        btn4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[3] + ".png")));
        btn5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[4] + ".png")));
        btn6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[5] + ".png")));
        btn7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[6] + ".png")));
        btn8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[7] + ".png")));
        btn9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[8] + ".png")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[9] + ".png")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[10] + ".png")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[11] + ".png")));
        btn13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[12] + ".png")));
        btn14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[13] + ".png")));
        btn15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[14] + ".png")));
        btn16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck1/" + numbers[15] + ".png")));
    }
    
    private void setPck2()
    {
        int[] numbers = lg.getCardNumbers();
        btn1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[0] + ".png")));
        btn2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[1] + ".png")));
        btn3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[2] + ".png")));
        btn4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[3] + ".png")));
        btn5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[4] + ".png")));
        btn6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[5] + ".png")));
        btn7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[6] + ".png")));
        btn8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[7] + ".png")));
        btn9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[8] + ".png")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[9] + ".png")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[10] + ".png")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[11] + ".png")));
        btn13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[12] + ".png")));
        btn14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[13] + ".png")));
        btn15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[14] + ".png")));
        btn16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck2/" + numbers[15] + ".png")));
    }
    
    private void setPck3()
    {
        int[] numbers = lg.getCardNumbers();
        btn1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[0] + ".png")));
        btn2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[1] + ".png")));
        btn3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[2] + ".png")));
        btn4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[3] + ".png")));
        btn5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[4] + ".png")));
        btn6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[5] + ".png")));
        btn7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[6] + ".png")));
        btn8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[7] + ".png")));
        btn9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[8] + ".png")));
        btn10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[9] + ".png")));
        btn11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[10] + ".png")));
        btn12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[11] + ".png")));
        btn13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[12] + ".png")));
        btn14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[13] + ".png")));
        btn15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[14] + ".png")));
        btn16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/pck3/" + numbers[15] + ".png")));
    }
    
    
    private void btnEnabled(JButton btn) {
        if (!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc=false;
        } else {
            btn.setEnabled(false);
            im2=(ImageIcon)btn.getDisabledIcon();
            pbtn[1]=btn;
            primerc=true;
        }
        pt++;
        pun.setText(Integer.toString(pt));

    }

    private void compare()
    {
        if(primerc&&caraUp)
        {
            if(im1.getDescription().compareTo(im2.getDescription())!=0)
            {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
            }else
            {
                System.out.println("cara igual");
                par++;
                //pt++;
                pun.setText(Integer.toString(pt));
            }
            
            if (par==8)
            {               
                System.out.println("end of game");
                cont_turn++;
                turno_c.setText(Integer.toString(cont_turn));
                new info(this,pun.getText(),tiempo.getText(),user).setVisible(true);
                //String aux=tiempo.getText();
                con.pararCronometro();
                jButton1.setText("Iniciar");
                f=false;
              //setCards();
                bt=false;
                //tiempo.setText("argh");
                
            }
            caraUp = false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        tiempo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pun = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tl = new javax.swing.JLabel();
        turnos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        limite = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tn = new javax.swing.JLabel();
        turno_c = new javax.swing.JLabel();

        setTitle("Concentrese");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setFocusable(false);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setFocusable(false);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setFocusable(false);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setFocusable(false);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setFocusable(false);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn10.setBorder(null);
        btn10.setBorderPainted(false);
        btn10.setContentAreaFilled(false);
        btn10.setFocusable(false);
        btn10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn10MouseExited(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn12.setBorder(null);
        btn12.setBorderPainted(false);
        btn12.setContentAreaFilled(false);
        btn12.setFocusable(false);
        btn12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn12MouseExited(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn11.setBorder(null);
        btn11.setBorderPainted(false);
        btn11.setContentAreaFilled(false);
        btn11.setFocusable(false);
        btn11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn11MouseExited(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn13.setBorder(null);
        btn13.setBorderPainted(false);
        btn13.setContentAreaFilled(false);
        btn13.setFocusable(false);
        btn13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn13MouseExited(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn14.setBorder(null);
        btn14.setBorderPainted(false);
        btn14.setContentAreaFilled(false);
        btn14.setFocusable(false);
        btn14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn14MouseExited(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn16.setBorder(null);
        btn16.setBorderPainted(false);
        btn16.setContentAreaFilled(false);
        btn16.setFocusable(false);
        btn16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn16MouseExited(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn15.setBorder(null);
        btn15.setBorderPainted(false);
        btn15.setContentAreaFilled(false);
        btn15.setFocusable(false);
        btn15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn15MouseExited(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setFocusable(false);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setFocusable(false);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setFocusable(false);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who.png"))); // NOI18N
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setFocusable(false);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/who-hover.png"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn8))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn16))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn12))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7)
                    .addComponent(btn8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(btn10)
                    .addComponent(btn11)
                    .addComponent(btn12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn13)
                    .addComponent(btn14)
                    .addComponent(btn15)
                    .addComponent(btn16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tiempo.setFont(new java.awt.Font("Delius Unicase", 1, 12)); // NOI18N
        tiempo.setText("00:00:000");

        jButton2.setText("Puntajes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Movs:");

        jLabel5.setText("t/l:");

        limite.setText("∞");

        jLabel1.setText("turnos:");

        tn.setText("∞");

        turno_c.setText("/0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limite)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(tl)
                                .addGap(80, 80, 80)
                                .addComponent(turnos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pun)
                        .addGap(113, 113, 113)
                        .addComponent(tiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nombre)
                                .addGap(37, 37, 37))
                            .addComponent(turno_c, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tiempo)
                    .addComponent(pun)
                    .addComponent(nombre)
                    .addComponent(turno_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel5)
                    .addComponent(limite)
                    .addComponent(jLabel1)
                    .addComponent(tn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tl)
                    .addComponent(turnos)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void restart()
    {
        pt=0;
        par=0;
         con.pararCronometro();
        pun.setText(Integer.toString(pt));
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
        
    }
    private int logout()
    {
        
        return 1;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!bt)
        {    
        
        setCards();
        f=true;
        jButton1.setText("Reiniciar");
        bt=true;
        con.iniciarCronometro();
        }else
        {
              restart();
              jButton1.setText("Iniciar");
              f=false;
              //setCards();
        bt=false;
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        puntajes pun_win= new puntajes();
        pun_win.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         if(f) 
        btnEnabled(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         if(f) 
        btnEnabled(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         if(f) 
        btnEnabled(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         if(f) 
        btnEnabled(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         if(f) 
        btnEnabled(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         if(f) 
        btnEnabled(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         if(f) 
        btnEnabled(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         if(f) 
        btnEnabled(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         if(f) 
        btnEnabled(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
         if(f) 
        btnEnabled(btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
         if(f) 
        btnEnabled(btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
         if(f) 
        btnEnabled(btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
         if(f) 
        btnEnabled(btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
         if(f) 
        btnEnabled(btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
         if(f) 
        btnEnabled(btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if(f)      
        btnEnabled(btn16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        compare();
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn3MouseExited

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn6MouseExited

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn9MouseExited

    private void btn10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn10MouseExited

    private void btn11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn11MouseExited

    private void btn12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn12MouseExited

    private void btn13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn13MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn13MouseExited

    private void btn14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn14MouseExited

    private void btn15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn15MouseExited

    private void btn16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btn16MouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        ln.setVisible(true);
        System.out.println("llego hatsa donde queria");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        ln.setVisible(true);
        System.out.println("llego hatsa donde queria");
    }//GEN-LAST:event_formWindowClosing

   
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel limite;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pun;
    private javax.swing.JLabel tiempo;
    private javax.swing.JLabel tl;
    private javax.swing.JLabel tn;
    private javax.swing.JLabel turno_c;
    private javax.swing.JLabel turnos;
    // End of variables declaration//GEN-END:variables
}
