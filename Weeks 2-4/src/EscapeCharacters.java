//=================================================================================================
public class EscapeCharacters {
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        char normalCharacter;
        char specialCharacter;

        normalCharacter = 'X';
        specialCharacter = '\t';

        // \b is backspace, \n is new line and \t is tab
        System.out.println("Here we go:" + normalCharacter + specialCharacter + specialCharacter +
                normalCharacter + normalCharacter + '\b' + ' ' + normalCharacter + '\n' +
                "a string that is broken\nin the middle" + (char)7);

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
