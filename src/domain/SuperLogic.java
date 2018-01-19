package domain;

/**
 * Describe game logic
 * @author Igor Lipko
 * @since 17.01.2018
 */
public interface SuperLogic {

    /**
     * Load board
     * @param cells Massive of cells
     */
    void loadBoard(Cell[][] cells);

    /**
     * Is the game will be failure and display a bang
     * @param x width position of cell
     * @param y height position of cell
     */
    boolean shouldBang(int x, int y);

    /**
     * Is the game will be win and display finish
     */
    boolean finish();

    /**
     * Set suggest of user about cell
     * @param x width position of cell
     * @param y height position of cell
     * @param bomb suggest of user about cell
     */
    void suggest(int x, int y, boolean bomb);
}
