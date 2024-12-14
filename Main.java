public class Main {
    public static void main(String[] args) {
        try {
            Iphone iphone = new Iphone(2007, 20);
            System.out.println("Modelo: " + iphone.getAno());
        } catch (ModeloException e) {
            System.out.println(e.getMessage());

        }

    }
}
