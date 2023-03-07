
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        String[] words = in.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String pigLatin = word.substring(1) + word.charAt(0) + "ay";
            sb.append(pigLatin);
            // edge case for sentence not the last word in a sentence
            // if(i < words.length - 1){
            //     sb.append(" ");
            // }
        }
        return sb.toString();
    }
}
