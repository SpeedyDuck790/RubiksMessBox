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
                                                { "W", "O", "W" },
                                                { "Y", "G", "B" },
                                                { "W", "R", "W" },
                                },
                                {
                                                { "W", "G", "W" },
                                                { "Y", "B", "O" },
                                                { "W", "R", "W" },
                                },
                                {
                                                { "W", "G", "W" },
                                                { "Y", "O", "B" },
                                                { "W", "R", "W" },
                                },
                                {
                                                { "W", "G", "W" },
                                                { "Y", "R", "B" },
                                                { "W", "O", "W" },
                                },
                                {
                                                { "W", "G", "W" },
                                                { "Y", "W", "B" },
                                                { "W", "R", "W" },
                                },
                                {
                                                { "W", "G", "W" },
                                                { "G", "Y", "B" },
                                                { "W", "R", "W" },
                                },
                };
                return testingRotation;

        }
}