public class Start {

    Start() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new TicTacToe();
    }
}
