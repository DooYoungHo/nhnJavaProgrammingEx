public class Com extends Game {

    public int[] makeRandomCoord() {
        
        int[] randomCoord = new int[2];

        while (true) {

            for (int i = 0; i < 2; i++) {

                double pseudoRandom = Math.random() * 3;
                int convertInt = (int)pseudoRandom;
    
                randomCoord[i] = convertInt;
            }

            if (Game.isSpotFilled(randomCoord)) {
                continue;
            }
            else {
                break;
            }
        }
        return randomCoord;
    }

    @Override
    public void turn() {

        Game.spot.add(makeRandomCoord());

        
    };
}
