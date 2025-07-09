public class Stringexample {
    public static void main(String[] args) {
        String sentence = "This program shows how can be split a string into multiple Strings.we need to find sentence,word and letter count in a string";
        String words[] = sentence.split("\\."); 
         System.out.println("Number of lines: " + words.length);
         String word[] = sentence.split("\\."); 
            System.out.println("Number of words: " + word.length);
            int letterCount = 0;
            for (String w : word) {
                letterCount += w.replaceAll("\\s+", "").length(); // Remove spaces and count letters


                }
            }

        
        }