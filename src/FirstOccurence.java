public class FirstOccurence {
    public static void main(String[] args) {
        String haystack = "gotothego";
        String needle = "go";
        int index;
        index = firstOccurence(haystack, needle);
        System.out.println(index);
    }
    public static int firstOccurence(String haystack, String needle) {
        int index = 0;
        if(!haystack.contains(needle))
            return -1;
        else
            return haystack.indexOf(needle);
    }
}
