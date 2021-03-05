

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {

        int result = 0;

        if ( value % 10 == 0)
        {
            result = result + 3 ;
        }
        else if ( value % 5 == 0)
        {
            result = result + 2;
        }
        if ( value % 11 == 0)
        {
            result = result + 5;
        }
        if ( result == 0 ) {
            result = 1 ;
        }
        return result;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
