package staticTest;

public class EntryOfJava {
    public static void main(String[] args) {
        Utils1.INSTANCE.pLog("haha");

        Utils2Kt.pLog2("hehe");

        Utils3.Companion.pLog3("heihei");

        Utils3.pLog4("xixi");
    }
}
