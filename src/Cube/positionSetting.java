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
                                                { "G", "G", "B" },
                                                { "Y", "G", "B" },
                                                { "Y", "R", "R" },
                                },
                                {
                                                { "G", "G", "B" },
                                                { "Y", "B", "B" },
                                                { "Y", "R", "R" },
                                },
                                {
                                                { "G", "G", "B" },
                                                { "Y", "O", "B" },
                                                { "Y", "R", "R" },
                                },
                                {
                                                { "G", "G", "B" },
                                                { "Y", "R", "B" },
                                                { "Y", "R", "R" },
                                },
                                {
                                                { "G", "G", "B" },
                                                { "Y", "W", "B" },
                                                { "Y", "R", "R" },
                                },
                                {
                                                { "G", "G", "B" },
                                                { "Y", "Y", "B" },
                                                { "Y", "R", "R" },
                                },
                };
                return testingRotation;

        }
}