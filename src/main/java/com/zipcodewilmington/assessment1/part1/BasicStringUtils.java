package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String [] strArray = str.split("");
        String result ="";

        for ( int i=0; i<=strArray.length-1;i++){
            if ((strArray[0].equals(strArray[i]))){
                result = strArray[0].toUpperCase();
            } else
                result+=strArray[i];



        }

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String [] resultArray = str.split("");
        String result="";

        for (int i=resultArray.length-1; i>=0; i--){
            result+=resultArray[i];
        }

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String res =reverse(str);
        String result= camelCase(res);


        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
       String [] resultRemove = str.split("");
       String result ="";
       for ( int i=0; i<resultRemove.length; i++){
           if (resultRemove[0]!= resultRemove[i] ){
               if ( resultRemove[resultRemove.length-1]!= resultRemove[i])
               result+=resultRemove[i];
           }
       }

        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
  String [] strArray = str.split("");
  String res ="";

  for ( int i=0; i<=strArray.length-1;i++) {

     if(Character.isUpperCase(str.charAt(i))){
        res+= strArray[i].toLowerCase();
     }  else   if(Character.isLowerCase(str.charAt(i))){
          res+= strArray[i].toUpperCase();
     }
     else  res+= strArray[i];

  }

    return res;
    }
}
