public class ServerNameGenerator {
    public static String[] adjectives = {"successfully", "impossible", "political", "wonderful", "various", "traditional", "ugly", "pleasant", "relevant", "asleep"};
    public static String[] nouns = {"town", "buyer", "honey", "recommendation", "passion", "son", "baseball", "role", "committee", "literature"};

    public static String randomString(String[] array){
        int randomNum = (int) (Math.random() * array.length );
         return array[randomNum];

    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(randomString(nouns) + "-" + randomString(adjectives) );
    }


}
