

public class Alphabet {

      public static final String UpperCase_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      public static final String Number = "1234567890";
      public static final String LowerCases = "abcdefghkyjlmnopqrstuvwxyz";
      public static final String Symbol = "!£$%^&*()_+=,.@:;,";

      private StringBuilder pool;

      public Alphabet(boolean uppercaseIncluded, boolean lowerCaseIncluded, boolean numbersIncluded, boolean specialChara) {

            pool = new StringBuilder();
            if (uppercaseIncluded) {
                  pool.append(UpperCase_Letters);
            }
            if (lowerCaseIncluded) {
                  pool.append(LowerCases);
            }
            if (numbersIncluded) {
                  pool.append(Number);
            }
            if (specialChara) {
                  pool.append(Symbol);
            }
            public String getAlphabet() {
                  return pool.toString();
            }
      }
      //  System.out.println (Str.toUpperCase());


}
