import RubicCube.Cube;
import Actions.*;

class Rubic {
    public static void main(String[] args) {

        System.out.println("Hello im RubicMessBox!");

        String[][][] cube = new String[6][3][3];
        System.out.println("Cube created");

        setting set = new setting();
        output out = new output();

        cube = set.CubesetTest(cube);

        out.TestOutput(cube);

        System.out.println("----------------Cube--------------");

        cube = set.CubesetDefault(cube);

        out.TestOutput(cube);

    }
}