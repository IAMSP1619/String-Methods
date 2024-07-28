package stringMethods;


public class Hello{
    public static void main(String[] args){
        String str1 = "Hello World";
        String lowerStr = str1.toLowerCase();
        System.out.println(lowerStr);            // Output: hello world


        String str2 = "Hello World";
        String upperStr = str2.toUpperCase();
        System.out.println(upperStr);               // Output: HELLO WORLD



        String str3 = "hexlo";
        String replacedStr = str3.replace('x','l');
        System.out.println(replacedStr);                    // Output: hello



        String str4 = "   Hello World   ";
        String trimmedStr = str4.trim();
        System.out.println(trimmedStr);                 // Output: "Hello World"



        String str5 = "Hello";
        String str6 = "Hello";
        System.out.println(str5.equals(str6));          // Output: true

        

        String str7 = "apple";
        String str8 = "banana";
        int result = str7.compareTo(str8);
        System.out.println(result);                    // Output: negative value




        String str9 = "hello";
        String str10 = "HELLO";
        System.out.println(str9.equalsIgnoreCase(str10));  // Output: true



        String s1 = "Hello";
        int len = s1.length();
        System.out.println(len);                       // Output: 5




        String s2 = "Hello";
        char ch = s2.charAt(1);
        System.out.println(ch);                      // Output: e




        String s3 = "Hello";
        String s4 = " World";
        String res = s3.concat(s4);
        System.out.println(res);                 // Output: Hello World




        String s5 = "Hello World";
        String substr = s5.substring(6);
        System.out.println(substr);                  // Output: World




        Integer number = 100;
        String str = number.toString();
        System.out.println(str);                     // Output: 100




        String s6 = "Hello";
        int index = s6.indexOf('l');
        System.out.println(index);                   // Output: 2



        String s7 = "Hello";
        int ind= s7.indexOf('l', 3);
        System.out.println(ind);                        // Output: 3




        int num = 100;
        String s8 = String.valueOf(num);
        System.out.println(s8);                          // Output: 100

    }
}



