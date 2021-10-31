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
        board.getContentPane().setBackground(new Color(45,45,45));
        board.setLayout(new BorderLayout());
        board.setTitle("TIC TAC TOE");
        board.setResizable(false);
        board.setLocationRelativeTo(null);
        board.setIconImage(icon.getImage());
        board.setVisible(true);

        textField.setBackground(new Color(45,45,45));
        textField.setForeground(new Color(0,158,158));
        textField.setFont(new Font("Ink Free", Font.BOLD,55));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC TAC TOE");
        textField.setOpaque(true);

        tittle.setLayout(new BorderLayout());
        tittle.setBounds(0,0,800,10);

        tittle.add(textField);
        board.add(tittle);

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
