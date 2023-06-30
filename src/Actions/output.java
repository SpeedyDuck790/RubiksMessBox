package Actions;

import RubicCube.Cube;

public class output {

    int side;
    int L;
    int H;

    public void TestOutput(String[][][] cube) {

        for (side = 0; side < 6; side++) {
            for (L = 0; L < 3; L++) {
                for (H = 0; H < 3; H++) {
                    System.out.println("side: " + side + " L: " + L + " H: " + H + " color: " + cube[side][L][H]);
                }
            }
        }

    }

}
