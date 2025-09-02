public class StaticContext extends FinalContext {
    final static int value; //You can't modify or remove this line ofcode
    private static double mark;
    private static int count;


    static{
        value = 8;
        mark = 90.0;
    }

        private static int getCount() {
            return ++count;
        }

        private static double getMark() {
            return mark;
        }
        // You can’t modify the following main method.
        public static void main(String... args) {
            count++;
            System.out.println("count= "+getCount());
            System.out.println("value = "+value);
            FinalContext sv = new StaticContext();
            System.out.println("mark= "+((StaticContext)sv).getMark());
            sv.calculate();
        }
    }