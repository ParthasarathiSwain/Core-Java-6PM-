class AQ {
    static int count = 0; 
}
class Test extends AQ {
    public static void main(String[] args) {
        Test.count = 10;
        System.out.println(AQ.count);
    }
}
