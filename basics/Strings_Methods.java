public class Main {
    public static void main(String[] args) {
        String phrase = "Hello guys welcome to my repository";
        String s1 = phrase.toUpperCase(); //Converting to upper case
        String s2 = phrase.toLowerCase(); //Converting to Lower case
        int s3 = phrase.length(); // Finding the lenght of the string 
        boolean s4 = phrase.contains("welcome"); //checking if the word contains inside the string returns "True or False"
        char s5 = phrase.charAt(6); //returns the letter present at the index 6
        int s6 = phrase.indexOf("H"); // returns the index of the letter "H"
        String s7 = phrase.substring(6,11); // prints the substring form 6 to 11 (till 10th index)

        //Printing the Answers 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
    }
}
