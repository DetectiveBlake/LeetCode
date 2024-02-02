public class StoneGameVII {
    public static int minPartitions(String n) {

        char max = '0';
        for (int i = 0; i < n.length() ; i++) {
            if (max < n.charAt(i)){
                max = n.charAt(i);
            }
        }
        return max - '0';
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("5313415"));
    }
}
