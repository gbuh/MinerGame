package test;

import console.ConsoleBoard;
import console.ConsoleCell;
import domain.BaseAction;
import domain.Cell;
import domain.GeneratorBoard;
import logic.Easy;

/**
 * This program imitates the easy type game process
 * @author Igor Lipko
 * @since 17.01.2018
 */
public class BaseActionTest {

    public static void main(String[] args) {
        final BaseAction action = new BaseAction(new Easy(), new ConsoleBoard(), new GeneratorBoard() {
            
            @Override
            public Cell[][] generate() {
                return new Cell[][] {
                {new ConsoleCell(true), new ConsoleCell(false)},
                {new ConsoleCell(true), new ConsoleCell(false)}
                };
            }
        });
        // success result
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, true);
        action.select(0, 1, false);
        action.select(1, 1, false);
        // failure result
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, false);
    }
}
