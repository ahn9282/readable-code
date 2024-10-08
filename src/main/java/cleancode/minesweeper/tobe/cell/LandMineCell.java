package cleancode.minesweeper.tobe.cell;

public class LandMineCell extends Cell2 {

    private static final String LAND_MINE_SIGN = "☼";


    @Override
    public void turnOnLandMine() {

    }

    @Override
    public void updateNearbyLandMineCount(int count) {
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return LAND_MINE_SIGN;
        }
        if(isFlagged){
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
        return true;
    }
}
