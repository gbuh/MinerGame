package domain;

/**
 * Describe board behavior
 * @author Igor Lipko
 * @since 17.01.2018
 */
public interface Board {

    /**
     * Draw board with input parameters of cells
     * @param cells Massive of cells
     */
    void drawBoard(Cell[][] cells);

    /**
     * Draw cell
     * @param x width position of cell
     * @param y height position of cell
     */
    void drawCell(int x, int y);

    /**
     * Draw all bomb`s bang
     */
    void drawBang();

    /**
     * Draw congratulation, when the game will be win
     */
    void drawCongratulate();
}
