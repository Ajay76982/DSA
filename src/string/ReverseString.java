package src.string;

public class ReverseString {
    public String getStringReverse(String inputString) {
        this.checkValidString(inputString);
        String reverseS = "";
        char[] charArray = inputString.toCharArray();
        this.swapCharArray(charArray);
        for (char c : charArray) {
            reverseS += c;
        }
        return reverseS;
    }

    public void swapCharArray(char[] charArray) {
        int length = charArray.length;
        int i = 0;
        int j = length - 1;
        while (i <= j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseUsingCharAtMethod(String inputString) {
        this.checkValidString(inputString);
        int i = inputString.length() - 1;
        String result = "";
        for (; i >= 0; i--) {
            result += inputString.charAt(i);
        }
        return result;
    }

    public void checkValidString(String inputString) {
        if(inputString == null){
            throw new IllegalArgumentException("Please Enter Valid Input String");
        }
    }

    public String reverseUsingStringBuilder(String inputString) {
        this.checkValidString(inputString);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=inputString.length()-1; i >= 0 ; i--){
            stringBuilder.append(inputString.charAt(i));
        }
        return stringBuilder.toString();

    }

    public String reverseUsingStringBuilderReverse(String inputString) {
        this.checkValidString(inputString);
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

    public String reverseUsingRecursion(String inputString){
        if (inputString.isEmpty()) {
            return inputString;
        } else {
            return reverseUsingRecursion(inputString.substring(1)) + inputString.charAt(0);
        }
    }

    public static void main(String[] args) {
        String inputString = "Good Morning";
        ReverseString reverseString = new ReverseString();

        String result = reverseString.getStringReverse(inputString);
        System.out.println(result);

        String reverseUsingCharAtMethod = reverseString.reverseUsingCharAtMethod(inputString);
        System.out.println(reverseUsingCharAtMethod);

        String reverseUsingStringBuilder = reverseString.reverseUsingStringBuilderReverse(inputString);
        System.out.println(reverseUsingStringBuilder);

        String reverseUsingRecursion = reverseString.reverseUsingRecursion(inputString);
        System.out.println(reverseUsingRecursion);
    }
}
