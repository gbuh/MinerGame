package console;

import java.io.PrintStream;

import domain.Cell;

/**
 * Describe console cell
 * @author Igor Lipko
 * @since 17.01.2018
 */
public class ConsoleCell implements Cell<PrintStream> {
    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    /**
     * Constructor with parameter. Creates a cell with or without bomb.
     * @param bomb presence
     */
    public ConsoleCell(boolean bomb) {
        this.bomb = bomb;
    }

    @Override
    public boolean isBomb() {
        return this.bomb;
    }

    @Override
    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    @Override
    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    @Override
    public void suggestEmpty() {
        this.suggestEmpty = true;
    }

    @Override
    public void suggestBomb() {
        this.suggestBomb = true;
    }

    @Override
    public void draw(PrintStream paint, boolean real) {
        if(real) {
            if(this.isBomb()) {
                paint.print("[*] ");
            } else {
                paint.print("[ ] ");
            }
        } else {
            if(this.suggestBomb) {
                paint.print("[?] ");
            } else if(suggestEmpty) {
                paint.print("[ ] ");
            } else {
                paint.print("[x] ");
            }
        }
    }
}
