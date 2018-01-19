package domain;

/**
 * Describe cell behavior
 * @author Igor Lipko
 * @since 17.01.2018
 */
public interface Cell<T> {

    /**
     * Is the cell a bomb
     */
    boolean isBomb();

    /**
     * Is the cell suggest a bomb
     */
    boolean isSuggestBomb();

    /**
     * Is the cell suggest a empty
     */
    boolean isSuggestEmpty();

    /**
     * Set empty cell
     */
    void suggestEmpty();

    /**
     * Set cell with bomb
     */
    void suggestBomb();

    /**
     * Draw cell
     * @param paint Type to draw
     * @param real board or user choice cell
     */
    void draw(T paint, boolean real);
}
