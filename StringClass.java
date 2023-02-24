import java.lang.ProcessBuilder.Redirect.Type;

public class StringClass {
    public static void main(String args[])
    {
        //this is string literal concept as the string formed as this syntax stored in the string constant pool
        //because jvm checks in this string pool first if this objects is already exist then it will return the refrenece of that object only
        //and will not crate the new object which will help in memory optimization 
        String str1= "anurodh";
        String duplicate= "anurodh";
        String str2= "aviral";
       System.out.println("the length of str1 string;"+ str1.length());
       System.out.println(str1.charAt(3));
       System.out.println(str1.substring(3));  //return substring from i th index to end of the string
       System.out.println(str1.substring(3,6)); //return substring from i the index to j-1th index
        String output= str1.concat(str2);
        System.out.println(output);

        //return the index of the first occurence of the given string
        System.out.println(output.indexOf("vi"));
        //return the last occurenct of the specified string passsed as parameter in function
        System.out.println(output.lastIndexOf("a"));
        Boolean out= str1.equals(str2);
        Boolean out2= str1.equals(duplicate);
        System.out.println(out+" "+out2);
    //  equlasIgnoreCase used to get the compare the string ignoring teh case of sentence
        Boolean outc= str1.equalsIgnoreCase("Aurodh");
        System.out.println(outc);


        //compare function is used to compare two string that which will come first in dictionary
        int compare= str1.compareTo("anurodh");
        System.out.println(compare);   //if s1-s2 comes <0 means s1 comes first else if >0 s2 comes first else if 0 then both are the same level

        //toUpperCase()
        System.out.println("anurodh".toUpperCase());
        //toLowerCase()
        System.out.println("AnuRodh".toLowerCase());

        //trim() function is used to remove the whitespace in left and right side of the string but it doesn't effect the middle spaces
        String trimm=  "          i am going         to delhi        ";
        System.out.print(trimm.trim()+"Hello");

        //replace() function is used to repalce some character or string
        String ans= "I am anurodh Singh";
        String replacedans= ans.replace("am","will be");
        System.out.println(replacedans);


        //replaceAll() is used to replace any character or string in a string
        String replacedAll= ans.replaceAll("a","x");
        System.out.println(ans+" "+replacedAll);
        // System.out.println

        // char index[]={'a','n','u','r'};
        //contains() function return true or false if find the charsequence to check in string 
        Boolean mi= ans.contains("am");
        System.out.println(mi);


        //startsWith() function return true if the string starts with the parameter given to the function
        System.out.println(ans.startsWith("I"));

        //endsWith() 
        System.out.println(ans.endsWith("gh"));

        //toCharArray() function converts the whole string to character array
        char chararray[]= ans.toCharArray();
        
        // System.out.println(chararray.getclass().getSimpleName());

        //split() function to split the whole sentence on basis of some regular expression
        String stringsplit= "Welcome-to-nagarro-as-you-have-technology-test-before-joining";
        String[] stringarray= stringsplit.split("-");
        for(String str: stringarray)
        {
            System.out.println(str);
        }
        String joinedstring= String.join(" > ", stringarray);
        System.out.println(joinedstring);


        //getchars()
        String data="Anurodh Singh is a goood boy";
        char[] array= new char[15];
        data.getChars(0, 13, array, 0);
        System.out.println(array);


    }
    
}
