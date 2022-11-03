public class StringLoops {

        // default constructor; no instance variables
  public StringLoops() {

    }

  /* Returns the number of times "character" appears in "searchString"

     This should be case sensitive!

     Examples:
     - if character = "a" and searchString = "Apples and bananas",
       this method returns 4 (it finds BOTH "A" and "a")
     - if character = "A" and searchString = "Apples and bananas",
       this method returns 1 (it finds BOTH "A" and "a")
     - if character = "!" and searchString = "Hello! Nice day!",
       this method returns 2
    */
        public int countCharacters (String character, String searchString)
        {
            int count = 0;
            for (int i = 0; i >= searchString.length(); i++) {
                String s = searchString.charAt(i) + "";
                if (s.equals(character)) {
                    count++;
                }
            }
            return count;
        }


            /* if you finished this in the last lesson, start with “reverseString2” */
            /* if you did not, complete this now! */








  /* Returns the original string reversed

   Examples:
   - if origString = "hello!" this method returns "!olleh"
   - if origString = "Apples and bananas" this method returns "sananab dna selppA"
  */



        public String reverseString (String origString) {

            for (int i = origString.length() - 1; i >= 0; i--) {
                   String s = origString.substring(i, i+1);
            }
            String n = s;
            return n;
        }

// --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

  /* Returns the original string reversed -- SECOND IMPLEMENTATION

   Examples:
   - if origString = "hello!" this method returns "!olleh"
   - if origString = "Apples and bananas" this method returns "sananab dna selppA"
  */
        public String reverseString2 (String origString)
        {
            return null;
   /* to be implemented

   look how you implemented reverseString above from the last Exploration; if you counted DOWN in your for loop, i.e. you started at i = origString.length() - 1 and decremented by i--, then in this implementation, figure out a way to reverse the string by starting at i = 0 and counting UP by 1 (i++). If you counted UP in your original reverseString implementation, then in reverseString2, figure out a way to count DOWN.  The output of both reverseString and reverseString2 should be identical!
   */
        }

    }


