import java.util.Scanner;

public class RomanNumeralToInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Roman numeral: ");
        String romanNumeral = scanner.next();
        int current = 0;
        Integer answer = 0;
        int previous = 0;

        // read the string from right to left
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            switch (romanNumeral.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }
            /*
            2. since the value of previous is 5 and in next iteration the value of current becomes 1 so, 5 > 1, thus
            the answer = answer - 1 = 4, which is the value of IV so next in the next iteration previous remains 5
            and now current becomes C which is 100 so it will go to else case as 5 < 100
            4. here previous > current so answer = answer - 10 = 94, now in next iteration current becomes M i.e.
            1000 so, 100 < 1000 so it will go to else case
            6. here 1000 > 100, so answer = answer - 100 = 994 and current will become 1000 so now 100 < 1000 so it will
            go to else case
             */
            if (previous > current) {
                answer -= current;
            }
            /*
             1. here we read the string from right to left in order to see that values like IV or IX are present or not,
            if they are present then we take two variables, current and previous, from right to left if the value is
            read and if suppose we encounter a case like IV then first we will add value of V i.e. 5 to answer, now
            in the next iteration the value of current will change to value of I which is 1 and previous value will
            be 5
            3. since in next iteration previous < current, so we increment answer = answer + 100 = 104 and now previous = 100
            and iteration makes current value X which 10, now 100 > 10 so it will go to above case
            5. here 100 < 1000 so, answer = answer + 1000 = 1094, now previous = 1000 and current will be 100 so it will go to
            above if case
            7. here 100 < 1000 so, answer = answer +  1000 = 1994, now previous = 1000 and there is no current as we will hit the
            back of char array so final answer is 1994
             */
            else {
                answer += current;
                previous = current;
            }
        }

        System.out.println(answer);
    }
}
