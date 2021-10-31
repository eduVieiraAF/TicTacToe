import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random whoseTurn = new Random();
    JFrame board = new JFrame();
    JPanel tittle = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel  textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_trun;
    ImageIcon icon = new ImageIcon("tictactoe.png");

    TicTacToe(){
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(800,800);
        board.getContentPane().setBackground(new Color(35,35,35));
        board.setLayout(new BorderLayout());
        board.setTitle("TIC TAC TOE");
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        board.setIconImage(icon.getImage());
        board.setVisible(true);

        textField.setBackground(Color.black);
        textField.setForeground(new Color(0,158,158));
        textField.setFont(new Font("Comic Sans", Font.BOLD,55));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC TAC TOE");
        textField.setOpaque(true);

        tittle.setLayout(new BorderLayout());
        tittle.setBounds(0,0,800,10);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(60,60,60));

        for (int i=0;i<9;i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("MV BOLI", Font.BOLD, 120));
            buttons[i].setBackground(new Color(60,60,60));
            buttons[i].addActionListener(this);

        }
            tittle.add(textField);
            board.add(tittle, BorderLayout.NORTH);
            board.add(button_panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void firstTurn(){

    }

    public void check(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }
}
