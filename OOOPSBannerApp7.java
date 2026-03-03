 
public class OOPSBannerAppUC7 {
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
 
        public char getCharacter() {
            return character;
        }
        public String[] getCharacterPattern() {
            return pattern;
        }
    }
    public static String[] buildOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }
    public static String[] buildPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }
    public static String[] buildSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }
    public static void main(String[] args) {
        CharacterPatternMap letterO =
                new CharacterPatternMap('O', buildOPattern());

        CharacterPatternMap letterP =
                new CharacterPatternMap('P', buildPPattern());

        CharacterPatternMap letterS =
                new CharacterPatternMap('S', buildSPattern());
        CharacterPatternMap[] letters = {
                letterO, letterO, letterP, letterS
        };
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                lineBuilder
                        .append(letter.getCharacterPattern()[row])
                        .append("  ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}