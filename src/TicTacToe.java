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
    boolean player1_turn;
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
        textField.setForeground(new Color(130,197,155));
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
            buttons[i].setBackground(new Color(20,20,20));
            buttons[i].addActionListener(this);

        }
            tittle.add(textField);
            board.add(tittle, BorderLayout.NORTH);
            board.add(button_panel);

            firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<9;i++){
            if (e.getSource()==buttons[i]){
                if (player1_turn){
                    if (buttons[i].getText().equals("")){
                        buttons[i].setForeground(new Color(255,10,170));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O TURN");
                        check();
                    }
                }
                else {
                    if (buttons[i].getText().equals("")){
                        buttons[i].setForeground(new Color(10,185,170));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X TURN");
                        check();
                    }
                }
            }
        }
    }


    public void firstTurn(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(whoseTurn.nextInt(2)==0){
            player1_turn = true;
            textField.setText("X TURN");
        }
        else {
            player1_turn = false;
            textField.setText("O TURN");
        }
    }

    public void check(){
        // Checking if X wins

        if((buttons[0].getText().equals("X")) && (buttons[1].getText().equals("X")) && (buttons[2].getText().equals("X")) ){
            xWins(0,1,2);
        }
        if((buttons[3].getText().equals("X")) && (buttons[4].getText().equals("X")) && (buttons[5].getText().equals("X")) ){
            xWins(3,4,5);
        }
        if((buttons[6].getText().equals("X")) && (buttons[7].getText().equals("X")) && (buttons[8].getText().equals("X")) ){
            xWins(6,7,8);
        }
        if((buttons[0].getText().equals("X")) && (buttons[3].getText().equals("X")) && (buttons[6].getText().equals("X")) ){
            xWins(0,3,6);
        }
        if((buttons[1].getText().equals("X")) && (buttons[4].getText().equals("X")) && (buttons[7].getText().equals("X")) ){
            xWins(1,4,7);
        }
        if((buttons[2].getText().equals("X")) && (buttons[5].getText().equals("X")) && (buttons[8].getText().equals("X")) ){
            xWins(2,5,8);
        }
        if((buttons[0].getText().equals("X")) && (buttons[4].getText().equals("X")) && (buttons[8].getText().equals("X")) ){
            xWins(0,4,8);
        }
        if((buttons[2].getText().equals("X")) && (buttons[4].getText().equals("X")) && (buttons[6].getText().equals("X")) ){
            xWins(2,4,6 );
        }
        //Checking if O wins

        if((buttons[0].getText().equals("O")) && (buttons[1].getText().equals("O")) && (buttons[2].getText().equals("O")) ){
            oWins(0,1,2);
        }
        if((buttons[3].getText().equals("O")) && (buttons[4].getText().equals("O")) && (buttons[5].getText().equals("O")) ){
            oWins(3,4,5);
        }
        if((buttons[6].getText().equals("O")) && (buttons[7].getText().equals("O")) && (buttons[8].getText().equals("O")) ){
            oWins(6,7,8);
        }
        if((buttons[0].getText().equals("O")) && (buttons[3].getText().equals("O")) && (buttons[6].getText().equals("O")) ){
            oWins(0,3,6);
        }
        if((buttons[1].getText().equals("O")) && (buttons[4].getText().equals("O")) && (buttons[7].getText().equals("O")) ){
            oWins(1,4,7);
        }
        if((buttons[2].getText().equals("O")) && (buttons[5].getText().equals("O")) && (buttons[8].getText().equals("O")) ){
            oWins(2,5,8);
        }
        if((buttons[0].getText().equals("O")) && (buttons[4].getText().equals("O")) && (buttons[8].getText().equals("O")) ){
            oWins(0,4,8);
        }
        if((buttons[2].getText().equals("O")) && (buttons[4].getText().equals("O")) && (buttons[6].getText().equals("O")) ){
            oWins(2,4,6 );
        }
    }

    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.WHITE);
        buttons[b].setBackground(Color.WHITE);
        buttons[c].setBackground(Color.WHITE);

        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("X WINS!");
    }

    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.WHITE);
        buttons[b].setBackground(Color.WHITE);
        buttons[c].setBackground(Color.WHITE);

        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("O WINS!");
    }
}

