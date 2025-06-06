class WithoutMain {
    static {
        System.out.println("Hello World!");
        System.exit(0);
    }

    public static void main(String[] args) {
        // This will never be called due to System.exit(0) in static block
    }
}
