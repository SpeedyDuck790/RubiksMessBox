package Cube;

public class positionSetting {

        public String[][][] Default() {

                String[][][] Default = {
                                {
                                                { "G", "G", "G" },
                                                { "G", "G", "G" },
                                                { "G", "G", "G" },
                                },
                                {
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                },
                                {
                                                { "O", "O", "O" },
                                                { "O", "O", "O" },
                                                { "O", "O", "O" },
                                },
                                {
                                                { "R", "R", "R" },
                                                { "R", "R", "R" },
                                                { "R", "R", "R" },
                                },
                                {
                                                { "W", "W", "W" },
                                                { "W", "W", "W" },
                                                { "W", "W", "W" },
                                },
                                {
                                                { "Y", "Y", "Y" },
                                                { "Y", "Y", "Y" },
                                                { "Y", "Y", "Y" },
                                },
                };

                return Default;

        }

        public String[][][] switched() {

                String[][][] switched = {
                                {
                                                { "G", "B", "G" },
                                                { "B", "G", "B" },
                                                { "G", "B", "G" },
                                },
                                {
                                                { "B", "G", "B" },
                                                { "G", "B", "G" },
                                                { "B", "G", "B" },
                                },
                                {
                                                { "O", "R", "O" },
                                                { "R", "O", "R" },
                                                { "O", "R", "O" },
                                },
                                {
                                                { "R", "O", "R" },
                                                { "O", "R", "O" },
                                                { "R", "O", "R" },
                                },
                                {
                                                { "W", "Y", "W" },
                                                { "Y", "W", "Y" },
                                                { "W", "Y", "W" },
                                },
                                {
                                                { "Y", "W", "Y" },
                                                { "W", "Y", "W" },
                                                { "Y", "W", "Y" },
                                },
                };

                return switched;

        }

        public String[][][] testingRotation() {
                String[][][] testingRotation = {
                                {
                                                { "G", "G", "G" },
                                                { "G", "G", "G" },
                                                { "G", "G", "G" },
                                },
                                {
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                },
                                {
                                                { "X", "W", "X" },
                                                { "B", "O", "G" },
                                                { "X", "Y", "X" },
                                },
                                {
                                                { "X", "W", "X" },
                                                { "G", "R", "B" },
                                                { "X", "Y", "X" },
                                },
                                {
                                                { "W", "W", "W" },
                                                { "W", "W", "W" },
                                                { "W", "W", "W" },
                                },
                                {
                                                { "Y", "Y", "Y" },
                                                { "Y", "Y", "Y" },
                                                { "Y", "Y", "Y" },
                                },
                };
                return testingRotation;

        }

        public String[][][] testingFanB() {
                String[][][] testingRotation = {
                                {
                                                { "X", "W", "X" },
                                                { "O", "G", "R" },
                                                { "X", "Y", "X" },
                                },
                                {
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                                { "B", "B", "B" },
                                },
                                {
                                                { "R", "X", "R" },
                                                { "O", "O", "O" },
                                                { "B", "X", "B" },
                                },
                                {
                                                { "R", "X", "R" },
                                                { "R", "R", "R" },
                                                { "B", "X", "B" },
                                },
                                {
                                                { "R", "W", "B" },
                                                { "X", "W", "X" },
                                                { "R", "W", "B" },
                                },
                                {
                                                { "R", "Y", "B" },
                                                { "X", "Y", "X" },
                                                { "R", "Y", "B" },
                                },
                };
                return testingRotation;

        }
}