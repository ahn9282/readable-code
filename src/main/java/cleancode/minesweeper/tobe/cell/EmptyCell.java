package cleancode.minesweeper.tobe.cell;

public class EmptyCell extends Cell2 {
    private static final String EMPTY_SIGN = "■";

    private final CellState cellState = CellState.initialize();

    @Override
    public void turnOnLandMine() {
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");

    }

    @Override
    public void updateNearbyLandMineCount(int count) {
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");

    }

    @Override
    public String getSign() {
        if (isOpened) {
            return EMPTY_SIGN;
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }
}
