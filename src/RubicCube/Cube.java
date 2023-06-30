package RubicCube;

public class Cube {
    // cube[side][L][H]

    String[][][] cube = {
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
            {
                    { "W", "W", "W" },
                    { "W", "W", "W" },
                    { "W", "W", "W" },
            },
    };
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

    public String getRubikC(int x, int y, int z) {
        return cube[x][y][z];

    }
}