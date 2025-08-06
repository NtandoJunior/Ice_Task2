

public class Main {
    public static void main(String[] args) {

                String[] months = {
                        "Jan",
                        "Feb",
                        "Mar",
                        "Apr",
                        "May",
                        "Jun"};
                int[][] makeovers = {
                        {8, 2, 5},
                        {7, 4, 5},
                        {5, 5, 2},
                        {2, 2, 3},
                        {7, 7, 9},
                        {7, 8, 5}
                };

                System.out.println("HOME MAKEOVER REPORT");
                System.out.println("------------------------------------------------------");
                System.out.printf("%-10s%-12s%-12s%-10s\n", "", "Bathrooms", "Kitchens", "Garden");


                for (int i = 0; i < months.length; i++) {
                    System.out.printf("%-10s", months[i]);
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("%-12d", makeovers[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("------------------------------------------------------");
                System.out.println("MONTHLY TOTALS\n");


                for (int i = 0; i < months.length; i++) {
                    int total = 0;
                    for (int j = 0; j < 3; j++) {
                        total += makeovers[i][j];
                    }
                    System.out.printf("%-10s%-5d", months[i], total);
                    if (total >= 15) {
                        System.out.print(" ***");
                    }
                    System.out.println();
                }
            }
        }

