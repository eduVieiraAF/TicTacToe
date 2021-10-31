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

    TicTacToe(){
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(800,800);
        board.getContentPane().setBackground(new Color(45,45,45));
        board.setLayout(new BorderLayout());
        board.setVisible(true);

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
