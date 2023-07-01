package Actions;

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

    public void ShowSide(int Cside) {
        switch (Cside) {
            case 0:
                System.out.println("Front");
                break;
            case 1:
                System.out.println("Back");
                break;
            case 2:
                System.out.println("left");
                break;
            case 3:
                System.out.println("right");
                break;
            case 4:
                System.out.println("up");
                break;
            case 5:
                System.out.println("down");
                break;
        }

    }

    public void ShowCube(String[][][] cube) {

        for (side = 0; side < 6; side++) {
            for (L = 0; L < 3; L++) {
                for (H = 0; H < 3; H++) {
                    System.out.print(cube[side][L][H]);
                }
                System.out.println("");
            }

            System.out.println("---");
        }

    }

}
