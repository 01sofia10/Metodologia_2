public class MyMagicExceptionPrueba {
    public static void main(String[] args) {
        try{
            magic("Hola");
            magic("0");
        }catch (Exception e){
            System.out.println(e);
        }try{
            magic("Haz magic");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void magic(String m) throws MyMagicException, ArithmeticException{
        if (m.equals("0")){
            int n = 1 / 0;
        }
        if (m.equals("Haz magic")){
            throw new MyMagicException("**********");
        }
    }
}
