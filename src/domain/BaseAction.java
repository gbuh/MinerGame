package domain;

/**
 * Describe base action
 * @author Igor Lipko
 * @since 17.01.2018
 */
public class BaseAction implements UserAction {
    private final SuperLogic logic;
    private final Board board;
    private final GeneratorBoard generator;

    /**
     * Constructor with parameter. Creates a base action with concrete logic and board.
     * @param logic of game
     * @param board for game
     * @param generator of board
     */
    public BaseAction(final SuperLogic logic, final Board board, final GeneratorBoard generator) {
        this.logic = logic;
        this.board = board;
        this.generator = generator;
    }

    @Override
    public void initGame() {
        System.out.println("Game Miner");
        final Cell[][] cells = generator.generate();
        this.board.drawBoard(cells);
        this.logic.loadBoard(cells);
    }

    @Override
    public void select(int x, int y, boolean bomb) {
        this.logic.suggest(x, y, bomb);
        board.drawCell(x, y);
        if(this.logic.shouldBang(x, y)) {
            this.board.drawBang();
        }
        if(this.logic.finish()) {
            board.drawCongratulate();
        }
    }
}
