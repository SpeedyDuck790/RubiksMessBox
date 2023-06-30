package RubicCube;

public class CubeDimensions {
    // cube
    String[][][] cube = new String[6][3][3];
    int side;
    int L;
    int H;

    /*
     * -------------------
     * | 0,0 | 0,1 | 0,2 |
     * -------------------
     * | 1,0 | 1,1 | 1,2 |
     * -------------------
     * | 2,0 | 2,1 | 2,2 |
     * -------------------
     * ....5 more times
     * 
     */
    // colors = red(R), green(G), blue(B), yellow(Y), orange(O), white(W)
    // sides = front(1), back(2), left(3), right(4), top(5), bottom(6)
    // cube[side][L][H]

    public void Cubeset() {

        int sideN;
        int Ln;
        int Hn;

        for (sideN = 0; sideN < 6; sideN++) {
            for (Ln = 0; Ln < 3; Ln++) {
                for (Hn = 0; Hn < 3; Hn++) {
                    cube[side][L][H] = "W";
                }
            }
        }

    }

}
