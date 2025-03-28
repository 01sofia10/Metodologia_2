public class Excepciones {
    public static void main(String[] args) {
        try{
            ex1();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }try{
            ex2();
        } catch (NullPointerException e){
            System.out.println(e);
        }try{
            ex3();
        } catch (NumberFormatException e){
            System.out.println(e);
        }try{
            ex4();
        } catch (ClassCastException e){
            System.out.println(e);
        }try{
            ex5();
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }try{
            ex6();
        } catch (IllegalStateException e){
            System.out.println(e);
        }try{
            ex7();
        } catch (NoClassDefFoundError e){
            System.out.println(e);
        }
    }
    public static void ex1() throws ArrayIndexOutOfBoundsException{
        System.out.println("ex1");
        int[] a = new int[10];
        System.out.println(a[11]);
    }
    public static void ex2() throws NullPointerException{
        System.out.println("ex2");
        String[] b = new String[10];
        System.out.println(b[0].length());
    }
    public static void ex3() throws NumberFormatException{
        System.out.println("ex3");
        Integer.parseInt("c");
    }
    public static void ex4() throws ClassCastException{
        System.out.println("ex4");
        Object d = new String("No");
        Integer No = (Integer)d;
    }
    public static void ex5() throws IllegalArgumentException{
        System.out.println("ex5");
        m("No");
    }
    private static void m (Object e){
        if(e.toString().equals("No")){
            throw new IllegalArgumentException("No");
        }
        if(e.toString().equals("1")){
            throw new IllegalStateException("Solo una vez");
        }
        if(e.toString().equals("clase")){
            throw new NoClassDefFoundError("Clase");
        }
    }
    public static void ex6(){
        System.out.println("ex6");
        int f = 0;
        m(f);
        f+=1;
        m(f);
    }
    public static void ex7(){
        System.out.println("ex7");
        m("clase");
    }
}
