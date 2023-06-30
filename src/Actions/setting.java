package Actions;

import RubicCube.Cube;

public class setting {

    int side;
    int L;
    int H;

    public String[][][] CubesetTest(String[][][] cube) {

        for (side = 0; side < 6; side++) {
            for (L = 0; L < 3; L++) {
                for (H = 0; H < 3; H++) {
                    cube[side][L][H] = "W";
                }
            }
        }
        return cube;
    }

    public String[][][] CubesetDefault(String[][][] cube) {

        for (side = 0; side < 6; side++) {
            for (L = 0; L < 3; L++) {
                for (H = 0; H < 3; H++) {
                    if (side == 0) {
                        cube[side][L][H] = "W";
                    } else if (side == 1) {
                        cube[side][L][H] = "R";
                    } else if (side == 2) {
                        cube[side][L][H] = "G";
                    } else if (side == 3) {
                        cube[side][L][H] = "B";
                    } else if (side == 4) {
                        cube[side][L][H] = "Y";
                    } else if (side == 5) {
                        cube[side][L][H] = "O";
                    }

                }
            }
        }
        return cube;
    }
}
