public class CClass {
    public void mFnc(){
        System.out.println("Hello from C Class!");
        super.mFnc(11.22);
    }

    public void mFnc(int a2, double d2){
        mFnc(d2);
        System.out.println("Double valur: " + d1);
    }
}
