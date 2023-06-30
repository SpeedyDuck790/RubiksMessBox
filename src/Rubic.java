import RubicCube.Cube;
import Actions.*;

class Rubic {
    public static void main(String[] args) {

        System.out.println("Hello im RubicMessBox!");

        String[][][] cube = new String[6][3][3];
        System.out.println("Cube created");

        moves move = new moves();
        setting set = new setting();
        output out = new output();

        System.out.println("----------------Cube--------------");

        cube = set.CubesetDefault(cube);

        out.ShowCube(cube);

        System.out.println("----------------Cube R turned--------------");

        move.R(cube, 0);

        out.ShowCube(cube);
        System.out.println("----------------Cube R turned--------------");

        move.R(cube, 0);

        out.ShowCube(cube);
        System.out.println("----------------Cube R turned--------------");

        move.R(cube, 0);

        out.ShowCube(cube);
        System.out.println("----------------back to normal--------------");

        move.R(cube, 0);

        out.ShowCube(cube);

        System.out.println("----------------Cube L turned--------------");

        move.L(cube, 0);
        move.R(cube, 0);

        out.ShowCube(cube);

    }
}