public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte b = 127;
        System.out.println(b);
        // byte c = 257;
        // System.out.println(c);
        int a = b;
        System.out.println(a);
        System.out.println("---------------");
        int c = 12;
        byte d = (byte)c;
        System.out.println(d);
        float f = 5.6f;
        int g = (int)f;
        System.out.println(g);
    }
}
