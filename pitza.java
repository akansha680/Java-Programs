public class PitzaProblem_hashCode2020 {

    static int MAX;
    static ArrayList<Integer> Input, Output;
    static int Num;
    static int score = 0;

    static ArrayList<Integer> Solve(int Max, ArrayList<Integer> input) {
        ArrayList<Integer> BestSolution = new ArrayList<Integer>();
        score = 0;
        int j, i = input.size() - 1;
        boolean test1 = true, test2 = true;
        while (i >= 0 && test1) {
            ArrayList<Integer> TempBestSolution = new ArrayList<Integer>();
            j = i;
            int sum = 0;
            while (j >= 0 && test2) {

                int temp = input.get(j);
                if (sum + temp < Max) {
                    sum = sum + temp;
                    TempBestSolution.add(j);
                } else if (sum + temp == Max) {
                    sum = sum + temp;
                    TempBestSolution.add(j);
                    test2 = false;
                    test1 = false;
                }
                j--;
            }
            if (score < sum) {
                score = sum;
                BestSolution = TempBestSolution;
            }
            if (BestSolution.size() == input.size()) {
                test1 = false;

            }

            i--;
        }

        return BestSolution;
    }
public static void main(String[] args) throws FileNotFoundException {

        String[] fileNames = {"a_example", "b_small", "c_medium", "d_quite_big", "e_also_big"};
        for (int i = 0; i < fileNames.length; i++) {
            getInputFromFile(fileNames[i]);
            Output = Solve(MAX, Input);
            Collections.reverse(Output);

            writeIntoFile(fileNames[i]);
            System.out.println("\nSCORE : " + score);
        }

    }
