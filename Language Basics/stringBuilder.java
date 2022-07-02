public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // To print char at index 0
        System.out.println(sb.charAt(0));

        // To set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // To insert char at index
        sb.insert(0, 'S');
        System.out.println(sb);

        // To Delete char from index to index
        sb.delete(0, 2); //---> The ending index is non inclusive.
        System.out.println(sb);

        // To append (append means - To add characters at the end )
        sb.append('u');         //--> This will add chracters at the end at the same string and this will be less time consuming.
        sb.append('o');         
        System.out.println(sb);
        // FOR STRING --> str = str + 'u' --> this will take more time because it makes a new string and deletes previous string.

        // To print the length of a string.
        System.out.println(sb.length());
    }
}
