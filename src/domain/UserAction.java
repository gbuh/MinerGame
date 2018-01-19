package domain;

/**
 * Describe user action in game
 * @author Igor Lipko
 * @since 17.01.2018
 */
public interface UserAction {

    /**
     * Begin game action
     */
    void initGame();

    /**
     * User choice action
     * @param x width position of cell
     * @param y height position of cell
     * @param bomb suggest of user about select cell
     */
    void select(int x, int y, boolean bomb);
}
