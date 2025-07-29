package Programz;

public class KarpRobinAlgorithm {
    private final int PRIME = 101;

    public long calculateHash(String str){
        long hash = 0;
        for (int i = 0; i < str.length() ; i++) {
            hash = (long) ( hash + str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }


    public static void main(String[] args) {
       int res =  search("suryaprakashk","surya");
    }

    static int search(String str,String pattern){
        return 1;
    }



}
