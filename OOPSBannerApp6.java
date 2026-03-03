public class OOPSBannerAppUC6 {
    public static String getOPattern(int line) {
        String[] pattern = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        return pattern[line];
    }
    public static String getPPattern(int line) {
        String[] pattern = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
        return pattern[line];
    }
    public static String getSPattern(int line) {
        String[] pattern = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
        return pattern[line];
    }

    public static void main(String[] args) {
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    getOPattern(i),
                    getOPattern(i),
                    getPPattern(i),
                    getSPattern(i)
            );
        }
        for (String line : banner) {
            System.out.println(line);
        }
    }
}