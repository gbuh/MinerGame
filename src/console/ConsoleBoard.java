package console;

import domain.Board;
import domain.Cell;

public class ConsoleBoard implements Board {
    private Cell[][] cells;

    @Override
    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    @Override
    public void drawCell(int x, int y) {
        System.out.println("****SELECT****");
        this.redraw(false);
    }

    @Override
    public void drawBang() {
        System.out.println("****BANG****");
        this.redraw(true);
    }

    @Override
    public void drawCongratulate() {
        System.out.println("****CONGRATULATE****");
    }

    private void redraw(boolean real) {
        for(Cell[] row : cells) {
            for(Cell cell : row) {
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }
}
