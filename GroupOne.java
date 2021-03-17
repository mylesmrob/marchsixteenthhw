package homework;

import java.util.Arrays;

public class GroupOne {

    //QUESTION 1
    public static int getLastIndex(String[] names){
        return names.length-1;
    }

    //QUESTION 2
    public static int getSecondToLastIndex(String[] names){
        return names.length-2;
    }

    //QUESTION 3
    public static String getFirstElement(String[] names){
        return names[0];
    }

    //QUESTION 4
    public static String getLastElement(String[] names){
        return names[names.length-1];
    }

    //QUESTION 5:
    public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }

    //QUESTION 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        return sum;
    }

    //QUESTION 7:
    public static int getAverage(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        return sum/ints.length;
    }

    //QUESTION 8
    public static String extractAllOddNumbers(int[] numbers) {
        String odd = null;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0 && odd == null){
                odd = String.valueOf(numbers[i]);
            }else if(numbers[i] % 2 != 0){
                odd += ","+numbers[i];
            }
        }
        return odd;
    }

    //QUESTION 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String even = null;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0 && even == null){
                even = String.valueOf(numbers[i]);
            }else if(numbers[i] % 2 == 0){
                even += ","+numbers[i];
            }
        }
        return even;
    }

    //QUESTION 10:
    public static boolean contains(String[] names, String element) {
        boolean inArray = false;
        for(int i = 0; i < names.length; i++){
            if(names[i] == element){
                inArray = true;
            }
        }
        return inArray;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int index = 0;
        for(int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                index = i;
            }
        }
        return index;
    }

    //QUESTION 12
    public static void printOddNumbersInRange(int start, int end){
        String oddNumbers = null;
        for(int i = start; i <= end; i++){
            if(i % 2 != 0 && oddNumbers == null){
                oddNumbers = String.valueOf(i);
            }else if(i % 2 != 0){
                oddNumbers += ","+String.valueOf(i);
            }
        }
        System.out.println(oddNumbers);
    }

    //QUESTION 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String newString = null;
        for(int i = 0; i < n; i++){
            if(newString == null){
                newString = str;
            }else{
                newString += " "+str;
            }
        }
        return newString;
    }

    //QUESTION 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String subString = str.substring(0,3);
        String newString = "";
        for(int i = 0; i < n; i++){
            newString += subString;
        }
        return newString;
    }

    //QUESTION 15:
    public static int WordsInAStringCounter(String str){
        int wordCount = 1;
        for(int i = 0; i <  str.length(); i++){
            if(str.charAt(i) == ' '){
                wordCount++;
            }
        }
        return wordCount;
    }

    //QUESTION 16
    public static int VowelsCounter(String str){
        int vowelCount = 0;
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                case 'Y':
                case 'y':
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }

    //QUESTION 17
    public static String[] swap(String[] stringArray) {
        String firstElement = stringArray[0];
        stringArray[0] = stringArray[stringArray.length-1];
        stringArray[stringArray.length-1] = firstElement;
        return stringArray;
    }

    //QUESTION 18
    public static String replaceCharacters(String str) {
        String newString = str
                .replace("F","7")
                .replace("f","7")
                .replace("S","$")
                .replace("s","$")
                .replace("1","!")
                .replace("A","@")
                .replace("a","@");
        return newString;
    }

    //QUESTION 19
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] array = stringInput.split(" ");
        for(int i = 1; i < array.length; i++){
            if(i % 2 == 0){
                array[i-1] = "Wu";
            }else if(i % 3 == 0){
                array[i-1] = "Tang";
            }
        }
        String newString = String.join(" ",array);
        return newString;
    }

    //QUESTION 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int prevNum = 0;
        int currentNum = 1;
        int newNum = prevNum + currentNum;
        String seq = "0";
        while(newNum < maxnumber){
            seq += " "+newNum;
            newNum = prevNum + currentNum;
            prevNum = currentNum;
            currentNum = newNum;
        }
        return seq;
    }

    public static void main(String[] args) {
        String names[] = {"Bob","John","Amy","Mike","Amanda"};
        System.out.println(getLastIndex(names)); //Q1
        System.out.println(getSecondToLastIndex(names)); //Q2
        System.out.println(getFirstElement(names)); //Q3
        System.out.println(getLastElement(names)); //Q4
        System.out.println(getSecondToLastElement(names)); //Q5
        int numbers[] = {5,82,64,121,98};
        System.out.println(getSum(numbers)); //Q6
        System.out.println(getAverage(numbers)); //Q7
        System.out.println(extractAllOddNumbers(numbers)); //Q8
        System.out.println(extractAllEvenNumbers(numbers)); //Q9
        System.out.println(contains(names,"Bob")); //Q10
        System.out.println(getIndexByElement(names,"Amy")); //Q11
        printOddNumbersInRange(50,80); //Q12
        System.out.println(printGivenStringTimesNumberGiven("Apple",3)); //Q13
        System.out.println(repeatFirstThreeLetters("House",3)); //Q14
        System.out.println(WordsInAStringCounter("Making bacon in the morning"));
        System.out.println(VowelsCounter("Potato")); //Q16
        System.out.println(Arrays.toString(swap(names))); //Q17
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer")); //Q18
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence")); //Q19
        System.out.println(createStringOfFibonnaciUpToMax(50)); //Q20
    }
}
