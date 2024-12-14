public class StringLab 
{
    public static void main (String [] args)
    {
        String str = "Welcome to Java String Lab!";
        //length()
        System.out.println(str.length());

        //charAt()
        System.out.println(str.charAt(7));

        //substring()
        System.out.println(str.substring(11,15));

        //toUpperCase() and toLowerCase()
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //indexOf()
        System.out.println(str.indexOf("Java"));

        //contains()
        System.out.println(str.contains("Lab"));

        //replace()
        System.out.println(str.replace("Java","Java Programming"));

        //slipt()
        String[] words =str.split("\\s+");
        for (String word : words){
            System.out.println(word);
        }

        //equals()
        String str1 = "java string lab!";
        String str2 = "   Welcome to the Java String lab!   ";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //trim()
        System.out.println(str2.trim());
        




        //Task 2 :StringBuilder 
        
        StringBuilder sb = new StringBuilder ("StringBuilder Lab");
        
        //append()
        sb.append(" - Learning Java ");
        System.out.println(sb.toString());

        //insert()
        sb.insert(18, "is fun");
        System.out.println(sb);

        //delete()
        sb.delete(26,34);
        System.out.println(sb);


        //reverse()
        sb.reverse();
        System.out.println(sb);







        //Task 3 :StringBuffer
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        //append()
        sbf.append(" - Learning Java");
        System.out.println(sbf);

        //insert()
        sbf.insert(19,"is fun");
        System.out.println(sbf);

        //delete()
        sbf.delete(26,34);
        System.out.println(sbf);

        //reverse()
        sbf.reverse();
        System.out.println(sbf);


    }
}