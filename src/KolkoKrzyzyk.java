import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KolkoKrzyzyk {
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b31;
    private JButton b32;
    private JButton b33;
    private JPanel panelGlowny;
    private JPanel panelGorny;
    private JPanel panelSrodkowy;
    private JPanel panelDolny;

    private int[][] tab = {
            {-10, -10, -10},
            {-10, -10, -10},
            {-10, -10, -10}
    };

    private String wstaw = "X";

    private int ileWybranych = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("KolkoKrzyzyk");
        frame.setContentPane(new KolkoKrzyzyk().panelGlowny);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public KolkoKrzyzyk() {
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b11.getText().isBlank()) {
                    b11.setText(wstaw);
                    tab[0][0] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b12.getText().isBlank()) {
                    b12.setText(wstaw);
                    tab[0][1] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b13.getText().isBlank()) {
                    b13.setText(wstaw);
                    tab[0][2] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b21.getText().isBlank()) {
                    b21.setText(wstaw);
                    tab[1][0] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b22.getText().isBlank()) {
                    b22.setText(wstaw);
                    tab[1][1] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b23.getText().isBlank()) {
                    b23.setText(wstaw);
                    tab[1][2] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b31.getText().isBlank()) {
                    b31.setText(wstaw);
                    tab[2][0] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b32.getText().isBlank()) {
                    b32.setText(wstaw);
                    tab[2][1] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });

        b33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b33.getText().isBlank()) {
                    b33.setText(wstaw);
                    tab[2][2] = wstaw.equals("X") ? 1 : -1;
                    wstaw = wstaw.equals("X") ? "O" : "X";
                    ileWybranych++;
                    switch (czyWygrana()) {
                        case -1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: X");
                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Wygral gracz: O");
                            break;

                        case 2:
                            System.out.println("Remis");
                            break;
                    }
                }
            }
        });
    }

    public int czyWygrana() {
        int w1 = tab[0][0] + tab[0][1] + tab[0][2];

        if (w1 == -3) {
            return 1;
        }

        if (w1 == 3) {
            return -1;
        }

        int w2 = tab[1][0] + tab[1][1] + tab[1][2];

        if (w2 == -3) {
            return 1;
        }

        if (w2 == 3) {
            return -1;
        }

        int w3 = tab[2][0] + tab[2][1] + tab[2][2];

        if (w3 == -3) {
            return 1;
        }

        if (w3 == 3) {
            return -1;
        }

        int k1 = tab[0][0] + tab[1][0] + tab[2][0];

        if (k1 == -3) {
            return 1;
        }

        if (k1 == 3) {
            return -1;
        }

        int k2 = tab[0][1] + tab[1][1] + tab[2][1];

        if (k2 == -3) {
            return 1;
        }

        if (k2 == 3) {
            return -1;
        }

        int k3 = tab[0][2] + tab[1][2] + tab[2][2];

        if (k3 == -3) {
            return 1;
        }

        if (k3 == 3) {
            return -1;
        }

        int p1 = tab[0][0] + tab[1][1] + tab[2][2];

        if (p1 == -3) {
            return 1;
        }

        if (p1 == 3) {
            return -1;
        }

        int p2 = tab[0][2] + tab[1][1] + tab[2][0];

        if (p2 == -3) {
            return 1;
        }

        if (p2 == 3) {
            return -1;
        }

        if (ileWybranych == 9) {
            return 2;
        }

        return 0;
    }
}
