package Actions;

import RubicCube.Cube;

public class setting {

    int side;
    int L;
    int H;

    public String[][][] CubesetDefault(String[][][] cube) {

        for (side = 0; side < 6; side++) {
            for (L = 0; L < 3; L++) {
                for (H = 0; H < 3; H++) {
                    cube[side][L][H] = "W";
                }
            }
        }
        return cube;
    }
}
