
package random_character;

public class Random_character {
    
    public static void main(String[] args) {
        
       final int NUMBER_OF_CHARS = 175;
       final int CHARS_PER_LINE = 25;
       
       for(int i = 1; i <= NUMBER_OF_CHARS; i++){
           char ch = Generate_random_character.getRandomLowercaseCharacter();
           if (i % CHARS_PER_LINE == 0)
               System.out.println(ch);
           else
               System.out.print(ch);
       }
    }
    
}

class Generate_random_character {
    public static char getRandomCharacter(char ch1, char ch2){
            return (char)(Math.random()*(ch2 - ch1 + 1) + ch1);
    }
    public static char getRandomCharacter (){
        return getRandomCharacter( '\u0000', '\uFFFF');
    }
    public static char getRandomLowercaseCharacter (){
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUppercaseCharacter (){
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter (){
        return getRandomCharacter('0', '9');
    }
    
}
