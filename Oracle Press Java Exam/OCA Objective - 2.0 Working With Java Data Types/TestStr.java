public class TestStr{
    public static void main (String[] args) {
        String s1 = "bing ";
        String s2 = "bang ";
        s1 = s1.concat("boom ");
        String s3 = "bamm ";
        s3.concat("bamm ");
        System.out.println(s1 + s2 + s3);
    }
}