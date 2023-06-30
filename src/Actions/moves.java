package Actions;

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
public class moves {
    public String[][][] U(String[][][] cube, int side) {
        int newside = 0;

        return cube;

    }

    public String[][][] Ur(String[][][] cube, int side) {
        return cube;

    }

    public String[][][] D(String[][][] cube, int side) {
        return cube;

    }

    public void Dr() {

    }

    public void L() {

    }

    public void Lr() {

    }

    public String[][][] R(String[][][] cube, int side) {
        int Nside1 = 0;
        int Nside2 = 0;
        int Nside3 = 0;
        int NsideS = 0;

        if (side == 0) {
            Nside1 = 4;
            Nside2 = 1;
            Nside3 = 5;
            NsideS = 3;
        } else if (side == 1) {
            Nside1 = 5;
            Nside2 = 5;
            Nside3 = 5;
            NsideS = 5;
        } else if (side == 2) {
            Nside1 = 5;
            Nside2 = 5;
            Nside3 = 5;
            NsideS = 5;
        } else if (side == 3) {
            Nside1 = 5;
            Nside2 = 5;
            Nside3 = 5;
            NsideS = 5;
        } else if (side == 4) {
            Nside1 = 5;
            Nside2 = 5;
            Nside3 = 5;
            NsideS = 5;
        } else if (side == 5) {
            Nside1 = 5;
            Nside2 = 5;
            Nside3 = 5;
            NsideS = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        ReplacingCube[side][0][0] = cube[Nside1][0][0];
        ReplacingCube[side][0][1] = cube[Nside1][0][1];
        ReplacingCube[side][0][2] = cube[Nside1][0][2];

        ReplacingCube[Nside1][0][0] = cube[Nside2][0][0];
        ReplacingCube[Nside1][0][1] = cube[Nside2][0][1];
        ReplacingCube[Nside1][0][2] = cube[Nside2][0][2];

        ReplacingCube[Nside2][0][0] = cube[Nside3][0][0];
        ReplacingCube[Nside2][0][1] = cube[Nside3][0][1];
        ReplacingCube[Nside2][0][2] = cube[Nside3][0][2];

        ReplacingCube[Nside3][0][0] = cube[side][0][0];
        ReplacingCube[Nside3][0][1] = cube[side][0][1];
        ReplacingCube[Nside3][0][2] = cube[side][0][2];
        // side
        ReplacingCube[NsideS][0][2] = cube[NsideS][0][2];
        ReplacingCube[NsideS][1][2] = cube[NsideS][1][2];
        ReplacingCube[NsideS][2][2] = cube[NsideS][2][2];

        ReplacingCube[NsideS][0][2] = cube[NsideS][0][2];
        ReplacingCube[NsideS][1][2] = cube[NsideS][1][2];
        ReplacingCube[NsideS][2][2] = cube[NsideS][2][2];

        ReplacingCube[NsideS][0][2] = cube[NsideS][0][2];
        ReplacingCube[NsideS][1][2] = cube[NsideS][1][2];
        ReplacingCube[NsideS][2][2] = cube[NsideS][2][2];

        ReplacingCube[NsideS][0][2] = cube[NsideS][0][2];
        ReplacingCube[NsideS][1][2] = cube[NsideS][1][2];
        ReplacingCube[NsideS][2][2] = cube[NsideS][2][2];

        return ReplacingCube;
    }

    public void Rr() {

    }

    public void x() {

    }

    public void xr() {

    }

    public void y() {

    }

    public void yr() {

    }

    // non priority (*) will be done later
}
