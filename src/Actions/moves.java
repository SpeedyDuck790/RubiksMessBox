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

    public String[][][] Dr(String[][][] cube, int side) {
        return cube;

    }

    public String[][][] L(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideS = 2;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideB][0][0];
        b3 = cube[NsideB][1][0];
        c3 = cube[NsideB][2][0];

        a2 = cube[NsideT][0][0];
        b2 = cube[NsideT][1][0];
        c2 = cube[NsideT][2][0];

        a1 = cube[NsideF][0][0];
        b1 = cube[NsideF][1][0];
        c1 = cube[NsideF][2][0];

        a = cube[NsideU][0][0];
        b = cube[NsideU][1][0];
        c = cube[NsideU][2][0];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideT][0][0] = a3;
        ReplacingCube[NsideT][1][0] = b3;
        ReplacingCube[NsideT][2][0] = c3;

        ReplacingCube[NsideF][0][0] = a2;
        ReplacingCube[NsideF][1][0] = b2;
        ReplacingCube[NsideF][2][0] = c2;

        ReplacingCube[NsideU][0][0] = a1;
        ReplacingCube[NsideU][1][0] = b1;
        ReplacingCube[NsideU][2][0] = c1;

        ReplacingCube[NsideB][0][0] = a;
        ReplacingCube[NsideB][1][0] = b;
        ReplacingCube[NsideB][2][0] = c;

        // side
        ReplacingCube[NsideS][0][0] = s6;// Top left
        ReplacingCube[NsideS][0][1] = s7;// top middle
        ReplacingCube[NsideS][0][2] = s8;// top right

        ReplacingCube[NsideS][2][0] = s1;// bottom left
        ReplacingCube[NsideS][2][1] = s2;// bottom middle
        ReplacingCube[NsideS][2][2] = s3;// bottom right

        ReplacingCube[NsideS][1][0] = s5;// left middle
        ReplacingCube[NsideS][1][2] = s4;// right middle

        return ReplacingCube;
    }

    public String[][][] Lr(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideS = 2;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideF][0][0];
        b3 = cube[NsideF][1][0];
        c3 = cube[NsideF][2][0];

        a2 = cube[NsideU][0][0];
        b2 = cube[NsideU][1][0];
        c2 = cube[NsideU][2][0];

        a1 = cube[NsideB][0][0];
        b1 = cube[NsideB][1][0];
        c1 = cube[NsideB][2][0];

        a = cube[NsideT][0][0];
        b = cube[NsideT][1][0];
        c = cube[NsideT][2][0];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideT][0][0] = a3;
        ReplacingCube[NsideT][1][0] = b3;
        ReplacingCube[NsideT][2][0] = c3;

        ReplacingCube[NsideF][0][0] = a2;
        ReplacingCube[NsideF][1][0] = b2;
        ReplacingCube[NsideF][2][0] = c2;

        ReplacingCube[NsideU][0][0] = a1;
        ReplacingCube[NsideU][1][0] = b1;
        ReplacingCube[NsideU][2][0] = c1;

        ReplacingCube[NsideB][0][0] = a;
        ReplacingCube[NsideB][1][0] = b;
        ReplacingCube[NsideB][2][0] = c;

        // side
        ReplacingCube[NsideS][0][0] = s6;// Top left
        ReplacingCube[NsideS][0][1] = s7;// top middle
        ReplacingCube[NsideS][0][2] = s8;// top right

        ReplacingCube[NsideS][2][0] = s1;// bottom left
        ReplacingCube[NsideS][2][1] = s2;// bottom middle
        ReplacingCube[NsideS][2][2] = s3;// bottom right

        ReplacingCube[NsideS][1][0] = s5;// left middle
        ReplacingCube[NsideS][1][2] = s4;// right middle

        return ReplacingCube;
    }

    public String[][][] R(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideS = 3;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideF][0][2];
        b3 = cube[NsideF][1][2];
        c3 = cube[NsideF][2][2];

        a2 = cube[NsideU][0][2];
        b2 = cube[NsideU][1][2];
        c2 = cube[NsideU][2][2];

        a1 = cube[NsideB][0][2];
        b1 = cube[NsideB][1][2];
        c1 = cube[NsideB][2][2];

        a = cube[NsideT][0][2];
        b = cube[NsideT][1][2];
        c = cube[NsideT][2][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideT][0][2] = a3;
        ReplacingCube[NsideT][1][2] = b3;
        ReplacingCube[NsideT][2][2] = c3;

        ReplacingCube[NsideF][0][2] = a2;
        ReplacingCube[NsideF][1][2] = b2;
        ReplacingCube[NsideF][2][2] = c2;

        ReplacingCube[NsideU][0][2] = a1;
        ReplacingCube[NsideU][1][2] = b1;
        ReplacingCube[NsideU][2][2] = c1;

        ReplacingCube[NsideB][0][2] = a;
        ReplacingCube[NsideB][1][2] = b;
        ReplacingCube[NsideB][2][2] = c;

        // side
        ReplacingCube[NsideS][0][0] = s6;// Top left
        ReplacingCube[NsideS][0][1] = s7;// top middle
        ReplacingCube[NsideS][0][2] = s8;// top right

        ReplacingCube[NsideS][2][0] = s1;// bottom left
        ReplacingCube[NsideS][2][1] = s2;// bottom middle
        ReplacingCube[NsideS][2][2] = s3;// bottom right

        ReplacingCube[NsideS][1][0] = s5;// left middle
        ReplacingCube[NsideS][1][2] = s4;// right middle

        return ReplacingCube;
    }

    public String[][][] Rr(String[][][] cube, int side) {
        int Nside1 = 0;
        int Nside2 = 0;
        int Nside3 = 0;
        int NsideS = 0;

        if (side == 0) {
            side = 0;
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
        String a, b, c;

        a = cube[side][0][2];
        b = cube[side][1][2];
        c = cube[side][2][2];

        ReplacingCube[side][0][2] = cube[Nside1][0][2];
        ReplacingCube[side][1][2] = cube[Nside1][1][2];
        ReplacingCube[side][2][2] = cube[Nside1][2][2];

        ReplacingCube[Nside1][0][2] = cube[Nside2][0][2];
        ReplacingCube[Nside1][1][2] = cube[Nside2][1][2];
        ReplacingCube[Nside1][2][2] = cube[Nside2][2][2];

        ReplacingCube[Nside2][0][2] = cube[Nside3][0][2];
        ReplacingCube[Nside2][1][2] = cube[Nside3][1][2];
        ReplacingCube[Nside2][2][2] = cube[Nside3][2][2];

        ReplacingCube[Nside3][0][2] = a;
        ReplacingCube[Nside3][1][2] = b;
        ReplacingCube[Nside3][2][2] = c;

        // // side
        ReplacingCube[NsideS][0][0] = cube[NsideS][0][2];
        ReplacingCube[NsideS][1][0] = cube[NsideS][0][1];
        ReplacingCube[NsideS][2][0] = cube[NsideS][0][0];

        ReplacingCube[NsideS][0][0] = cube[NsideS][0][2];
        ReplacingCube[NsideS][0][1] = cube[NsideS][1][2];
        ReplacingCube[NsideS][0][2] = cube[NsideS][2][2];

        ReplacingCube[NsideS][0][2] = cube[NsideS][2][2];
        ReplacingCube[NsideS][1][2] = cube[NsideS][2][1];
        ReplacingCube[NsideS][2][2] = cube[NsideS][2][0];

        ReplacingCube[NsideS][2][2] = cube[NsideS][2][0];
        ReplacingCube[NsideS][2][1] = cube[NsideS][1][0];
        ReplacingCube[NsideS][2][0] = cube[NsideS][0][0];

        return ReplacingCube;
    }

    public String[][][] x(String[][][] cube, int side) {
        return cube;
    }

    public String[][][] xr(String[][][] cube, int side) {
        return cube;
    }

    public String[][][] y(String[][][] cube, int side) {
        return cube;
    }

    public String[][][] yr(String[][][] cube, int side) {
        return cube;
    }

    // non priority (*) will be done later
}
