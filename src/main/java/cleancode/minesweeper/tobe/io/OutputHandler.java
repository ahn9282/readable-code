package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;

public interface OutputHandler {
    void showGameStartComments();

    void showBoard(GameBoard board);

    String generateColAlphabets(GameBoard board);

    void printGameWinningComment();

    void printGameLosingComment();

    void printCommentForSelectingCell();

    void printCommentForUserAction();


    void printExceptionMessage(RuntimeException e);

    void printSimpleMessage(String message);
}
