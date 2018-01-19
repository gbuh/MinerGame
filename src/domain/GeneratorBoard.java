package domain;

/**
 * Describe board creation
 * @author Igor Lipko
 * @since 17.01.2018
 */
public interface GeneratorBoard {

    /**
     * Create board with some complexity
     */
    Cell[][] generate();
}
