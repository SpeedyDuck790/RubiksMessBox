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
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;
        int NsideS = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideS = 4;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideB][0][0];
        b3 = cube[NsideB][0][1];
        c3 = cube[NsideB][0][2];

        a2 = cube[NsideL][0][0];
        b2 = cube[NsideL][0][1];
        c2 = cube[NsideL][0][2];

        a1 = cube[NsideF][0][0];
        b1 = cube[NsideF][0][1];
        c1 = cube[NsideF][0][2];

        a = cube[NsideR][0][0];
        b = cube[NsideR][0][1];
        c = cube[NsideR][0][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideR][0][0] = a3;
        ReplacingCube[NsideR][0][1] = b3;
        ReplacingCube[NsideR][0][2] = c3;

        ReplacingCube[NsideF][0][0] = a;
        ReplacingCube[NsideF][0][1] = b;
        ReplacingCube[NsideF][0][2] = c;

        ReplacingCube[NsideL][0][0] = a1;
        ReplacingCube[NsideL][0][1] = b1;
        ReplacingCube[NsideL][0][2] = c1;

        ReplacingCube[NsideB][0][0] = a2;
        ReplacingCube[NsideB][0][1] = b2;
        ReplacingCube[NsideB][0][2] = c2;

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

    public String[][][] Ur(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideF][0][0];
        b3 = cube[NsideF][0][1];
        c3 = cube[NsideF][0][2];

        a2 = cube[NsideR][0][0];
        b2 = cube[NsideR][0][1];
        c2 = cube[NsideR][0][2];

        a1 = cube[NsideB][0][0];
        b1 = cube[NsideB][0][1];
        c1 = cube[NsideB][0][2];

        a = cube[NsideL][0][0];
        b = cube[NsideL][0][1];
        c = cube[NsideL][0][2];

        ReplacingCube[NsideR][0][0] = a3;
        ReplacingCube[NsideR][0][1] = b3;
        ReplacingCube[NsideR][0][2] = c3;

        ReplacingCube[NsideF][0][0] = a;
        ReplacingCube[NsideF][0][1] = b;
        ReplacingCube[NsideF][0][2] = c;

        ReplacingCube[NsideL][0][0] = a1;
        ReplacingCube[NsideL][0][1] = b1;
        ReplacingCube[NsideL][0][2] = c1;

        ReplacingCube[NsideB][0][0] = a2;
        ReplacingCube[NsideB][0][1] = b2;
        ReplacingCube[NsideB][0][2] = c2;
        return ReplacingCube;
    }

    public String[][][] D(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;
        int NsideS = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideS = 5;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideF][2][0];
        b3 = cube[NsideF][2][1];
        c3 = cube[NsideF][2][2];

        a2 = cube[NsideR][2][0];
        b2 = cube[NsideR][2][1];
        c2 = cube[NsideR][2][2];

        a1 = cube[NsideB][2][0];
        b1 = cube[NsideB][2][1];
        c1 = cube[NsideB][2][2];

        a = cube[NsideL][2][0];
        b = cube[NsideL][2][1];
        c = cube[NsideL][2][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideR][2][0] = a3;
        ReplacingCube[NsideR][2][1] = b3;
        ReplacingCube[NsideR][2][2] = c3;

        ReplacingCube[NsideF][2][0] = a;
        ReplacingCube[NsideF][2][1] = b;
        ReplacingCube[NsideF][2][2] = c;

        ReplacingCube[NsideL][2][0] = a1;
        ReplacingCube[NsideL][2][1] = b1;
        ReplacingCube[NsideL][2][2] = c1;

        ReplacingCube[NsideB][2][0] = a2;
        ReplacingCube[NsideB][2][1] = b2;
        ReplacingCube[NsideB][2][2] = c2;

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

    public String[][][] Dr(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideF][2][0];
        b3 = cube[NsideF][2][1];
        c3 = cube[NsideF][2][2];

        a2 = cube[NsideR][2][0];
        b2 = cube[NsideR][2][1];
        c2 = cube[NsideR][2][2];

        a1 = cube[NsideB][2][0];
        b1 = cube[NsideB][2][1];
        c1 = cube[NsideB][2][2];

        a = cube[NsideL][2][0];
        b = cube[NsideL][2][1];
        c = cube[NsideL][2][2];

        ReplacingCube[NsideL][2][0] = a3;
        ReplacingCube[NsideL][2][1] = b3;
        ReplacingCube[NsideL][2][2] = c3;

        ReplacingCube[NsideB][2][0] = a;
        ReplacingCube[NsideB][2][1] = b;
        ReplacingCube[NsideB][2][2] = c;

        ReplacingCube[NsideR][2][0] = a1;
        ReplacingCube[NsideR][2][1] = b1;
        ReplacingCube[NsideR][2][2] = c1;

        ReplacingCube[NsideF][2][0] = a2;
        ReplacingCube[NsideF][2][1] = b2;
        ReplacingCube[NsideF][2][2] = c2;
        return ReplacingCube;

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

    public String[][][] M(String[][][] cube, int side) {// M
        int NsideF = 0;
        int NsideB = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideB][0][1];
        b3 = cube[NsideB][1][1];
        c3 = cube[NsideB][2][1];

        a2 = cube[NsideT][0][1];
        b2 = cube[NsideT][1][1];
        c2 = cube[NsideT][2][1];

        a1 = cube[NsideF][0][1];
        b1 = cube[NsideF][1][1];
        c1 = cube[NsideF][2][1];

        a = cube[NsideU][0][1];
        b = cube[NsideU][1][1];
        c = cube[NsideU][2][1];

        ReplacingCube[NsideU][0][1] = a3;
        ReplacingCube[NsideU][1][1] = b3;
        ReplacingCube[NsideU][2][1] = c3;

        ReplacingCube[NsideB][0][1] = a2;
        ReplacingCube[NsideB][1][1] = b2;
        ReplacingCube[NsideB][2][1] = c2;

        ReplacingCube[NsideT][0][1] = a1;
        ReplacingCube[NsideT][1][1] = b1;
        ReplacingCube[NsideT][2][1] = c1;

        ReplacingCube[NsideF][0][1] = a;
        ReplacingCube[NsideF][1][1] = b;
        ReplacingCube[NsideF][2][1] = c;
        return ReplacingCube;
    }

    public String[][][] Mr(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideB][0][1];
        b3 = cube[NsideB][1][1];
        c3 = cube[NsideB][2][1];

        a2 = cube[NsideT][0][1];
        b2 = cube[NsideT][1][1];
        c2 = cube[NsideT][2][1];

        a1 = cube[NsideF][0][1];
        b1 = cube[NsideF][1][1];
        c1 = cube[NsideF][2][1];

        a = cube[NsideU][0][1];
        b = cube[NsideU][1][1];
        c = cube[NsideU][2][1];

        ReplacingCube[NsideT][0][1] = a3;
        ReplacingCube[NsideT][1][1] = b3;
        ReplacingCube[NsideT][2][1] = c3;

        ReplacingCube[NsideF][0][1] = a2;
        ReplacingCube[NsideF][1][1] = b2;
        ReplacingCube[NsideF][2][1] = c2;

        ReplacingCube[NsideU][0][1] = a1;
        ReplacingCube[NsideU][1][1] = b1;
        ReplacingCube[NsideU][2][1] = c1;

        ReplacingCube[NsideB][0][1] = a;
        ReplacingCube[NsideB][1][1] = b;
        ReplacingCube[NsideB][2][1] = c;
        return ReplacingCube;
    }

    public String[][][] E(String[][][] cube, int side) {// E
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideB][1][0];
        b3 = cube[NsideB][1][1];
        c3 = cube[NsideB][1][2];

        a2 = cube[NsideL][1][0];
        b2 = cube[NsideL][1][1];
        c2 = cube[NsideL][1][2];

        a1 = cube[NsideF][1][0];
        b1 = cube[NsideF][1][1];
        c1 = cube[NsideF][1][2];

        a = cube[NsideR][1][0];
        b = cube[NsideR][1][1];
        c = cube[NsideR][1][2];

        ReplacingCube[NsideR][1][0] = a3;
        ReplacingCube[NsideR][1][1] = b3;
        ReplacingCube[NsideR][1][2] = c3;

        ReplacingCube[NsideF][1][0] = a;
        ReplacingCube[NsideF][1][1] = b;
        ReplacingCube[NsideF][1][2] = c;

        ReplacingCube[NsideL][1][0] = a1;
        ReplacingCube[NsideL][1][1] = b1;
        ReplacingCube[NsideL][1][2] = c1;

        ReplacingCube[NsideB][1][0] = a2;
        ReplacingCube[NsideB][1][1] = b2;
        ReplacingCube[NsideB][1][2] = c2;
        return ReplacingCube;
    }

    public String[][][] Er(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideL = 0;
        int NsideR = 0;
        int NsideB = 0;

        if (side == 0) {
            NsideF = 0;
            NsideB = 1;
            NsideL = 2;
            NsideR = 3;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideF][1][0];
        b3 = cube[NsideF][1][1];
        c3 = cube[NsideF][1][2];

        a2 = cube[NsideL][1][0];
        b2 = cube[NsideL][1][1];
        c2 = cube[NsideL][1][2];

        a1 = cube[NsideB][1][0];
        b1 = cube[NsideB][1][1];
        c1 = cube[NsideB][1][2];

        a = cube[NsideR][1][0];
        b = cube[NsideR][1][1];
        c = cube[NsideR][1][2];

        ReplacingCube[NsideR][1][0] = a3;
        ReplacingCube[NsideR][1][1] = b3;
        ReplacingCube[NsideR][1][2] = c3;

        ReplacingCube[NsideF][1][0] = a;
        ReplacingCube[NsideF][1][1] = b;
        ReplacingCube[NsideF][1][2] = c;

        ReplacingCube[NsideL][1][0] = a1;
        ReplacingCube[NsideL][1][1] = b1;
        ReplacingCube[NsideL][1][2] = c1;

        ReplacingCube[NsideB][1][0] = a2;
        ReplacingCube[NsideB][1][1] = b2;
        ReplacingCube[NsideB][1][2] = c2;
        return ReplacingCube;
    }

    public String[][][] S(String[][][] cube, int side) {// s
        int NsideF = 0;
        int NsideB = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideB][0][1];
        b3 = cube[NsideB][1][1];
        c3 = cube[NsideB][2][1];

        a2 = cube[NsideT][1][0];
        b2 = cube[NsideT][1][1];
        c2 = cube[NsideT][1][2];

        a1 = cube[NsideF][0][1];
        b1 = cube[NsideF][1][1];
        c1 = cube[NsideF][2][1];

        a = cube[NsideU][1][0];
        b = cube[NsideU][1][1];
        c = cube[NsideU][1][2];

        ReplacingCube[NsideT][1][0] = a3;
        ReplacingCube[NsideT][1][1] = b3;
        ReplacingCube[NsideT][1][2] = c3;

        ReplacingCube[NsideF][0][1] = a2;
        ReplacingCube[NsideF][1][1] = b2;
        ReplacingCube[NsideF][2][1] = c2;

        ReplacingCube[NsideU][1][0] = a1;
        ReplacingCube[NsideU][1][1] = b1;
        ReplacingCube[NsideU][1][2] = c1;

        ReplacingCube[NsideB][0][1] = a;
        ReplacingCube[NsideB][1][1] = b;
        ReplacingCube[NsideB][2][1] = c;
        return ReplacingCube;
    }

    public String[][][] Sr(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;

        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;

            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3;

        a3 = cube[NsideB][0][1];
        b3 = cube[NsideB][1][1];
        c3 = cube[NsideB][2][1];

        a2 = cube[NsideT][1][0];
        b2 = cube[NsideT][1][1];
        c2 = cube[NsideT][1][2];

        a1 = cube[NsideF][0][1];
        b1 = cube[NsideF][1][1];
        c1 = cube[NsideF][2][1];

        a = cube[NsideU][1][0];
        b = cube[NsideU][1][1];
        c = cube[NsideU][1][2];

        ReplacingCube[NsideU][1][0] = a3;
        ReplacingCube[NsideU][1][1] = b3;
        ReplacingCube[NsideU][1][2] = c3;

        ReplacingCube[NsideF][0][1] = a;
        ReplacingCube[NsideF][1][1] = b;
        ReplacingCube[NsideF][2][1] = c;

        ReplacingCube[NsideT][1][0] = a1;
        ReplacingCube[NsideT][1][1] = b1;
        ReplacingCube[NsideT][1][2] = c1;

        ReplacingCube[NsideB][0][1] = a2;
        ReplacingCube[NsideB][1][1] = b2;
        ReplacingCube[NsideB][2][1] = c2;

        return ReplacingCube;
    }

    public String[][][] F(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;
            NsideS = 0;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideB][0][2];
        b3 = cube[NsideB][1][2];
        c3 = cube[NsideB][2][2];

        a2 = cube[NsideT][2][0];
        b2 = cube[NsideT][2][1];
        c2 = cube[NsideT][2][2];

        a1 = cube[NsideF][0][0];
        b1 = cube[NsideF][1][0];
        c1 = cube[NsideF][2][0];

        a = cube[NsideU][0][0];
        b = cube[NsideU][0][1];
        c = cube[NsideU][0][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideT][2][0] = a3;
        ReplacingCube[NsideT][2][1] = b3;
        ReplacingCube[NsideT][2][2] = c3;

        ReplacingCube[NsideF][0][0] = a2;
        ReplacingCube[NsideF][1][0] = b2;
        ReplacingCube[NsideF][2][0] = c2;

        ReplacingCube[NsideU][0][0] = a1;
        ReplacingCube[NsideU][0][1] = b1;
        ReplacingCube[NsideU][0][2] = c1;

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

    public String[][][] Fr(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;
            NsideS = 0;
            NsideT = 4;
            NsideU = 5;
        }

        String[][][] ReplacingCube = cube;
        // faces
        String a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, s1, s2, s3, s4, s5, s6, s7, s8;

        a3 = cube[NsideB][0][2];
        b3 = cube[NsideB][1][2];
        c3 = cube[NsideB][2][2];

        a2 = cube[NsideT][2][0];
        b2 = cube[NsideT][2][1];
        c2 = cube[NsideT][2][2];

        a1 = cube[NsideF][0][0];
        b1 = cube[NsideF][1][0];
        c1 = cube[NsideF][2][0];

        a = cube[NsideU][0][0];
        b = cube[NsideU][0][1];
        c = cube[NsideU][0][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideT][2][0] = a1;
        ReplacingCube[NsideT][2][1] = b1;
        ReplacingCube[NsideT][2][2] = c1;

        ReplacingCube[NsideF][0][0] = a;
        ReplacingCube[NsideF][1][0] = b;
        ReplacingCube[NsideF][2][0] = c;

        ReplacingCube[NsideU][0][0] = a3;
        ReplacingCube[NsideU][0][1] = b3;
        ReplacingCube[NsideU][0][2] = c3;

        ReplacingCube[NsideB][0][2] = a2;
        ReplacingCube[NsideB][1][2] = b2;
        ReplacingCube[NsideB][2][2] = c2;

        // F' side//neeeeed to test this
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

    public String[][][] B(String[][][] cube, int side) {
        int NsideF = 0;
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;
            NsideS = 1;
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
        b2 = cube[NsideT][0][1];
        c2 = cube[NsideT][0][2];

        a1 = cube[NsideF][0][2];
        b1 = cube[NsideF][1][2];
        c1 = cube[NsideF][2][2];

        a = cube[NsideU][2][0];
        b = cube[NsideU][2][1];
        c = cube[NsideU][2][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideU][2][0] = a3;
        ReplacingCube[NsideU][2][1] = b3;
        ReplacingCube[NsideU][2][2] = c3;

        ReplacingCube[NsideF][0][2] = a;
        ReplacingCube[NsideF][1][2] = b;
        ReplacingCube[NsideF][2][2] = c;

        ReplacingCube[NsideT][0][0] = a1;
        ReplacingCube[NsideT][0][1] = b1;
        ReplacingCube[NsideT][0][2] = c1;

        ReplacingCube[NsideB][0][0] = a2;
        ReplacingCube[NsideB][1][0] = b2;
        ReplacingCube[NsideB][2][0] = c2;

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

    public String[][][] Br(String[][][] cube, int side) {

        int NsideF = 0;// properly reverse this lazy
        int NsideB = 0;
        int NsideS = 0;
        int NsideT = 0;
        int NsideU = 0;

        if (side == 0) {
            NsideF = 3;
            NsideB = 2;
            NsideS = 1;
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
        b2 = cube[NsideT][0][1];
        c2 = cube[NsideT][0][2];

        a1 = cube[NsideF][0][2];
        b1 = cube[NsideF][1][2];
        c1 = cube[NsideF][2][2];

        a = cube[NsideU][2][0];
        b = cube[NsideU][2][1];
        c = cube[NsideU][2][2];

        s1 = cube[NsideS][2][2];// right
        s2 = cube[NsideS][1][2];
        s3 = cube[NsideS][0][2];

        s4 = cube[NsideS][0][1];// top middle
        s5 = cube[NsideS][2][1];// bottom middle

        s6 = cube[NsideS][2][0];// left
        s7 = cube[NsideS][1][0];
        s8 = cube[NsideS][0][0];

        ReplacingCube[NsideU][2][0] = a3;
        ReplacingCube[NsideU][2][1] = b3;
        ReplacingCube[NsideU][2][2] = c3;

        ReplacingCube[NsideF][0][2] = a;
        ReplacingCube[NsideF][1][2] = b;
        ReplacingCube[NsideF][2][2] = c;

        ReplacingCube[NsideT][0][0] = a1;
        ReplacingCube[NsideT][0][1] = b1;
        ReplacingCube[NsideT][0][2] = c1;

        ReplacingCube[NsideB][0][0] = a2;
        ReplacingCube[NsideB][1][0] = b2;
        ReplacingCube[NsideB][2][0] = c2;

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
}
