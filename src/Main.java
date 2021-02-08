public class Main {

    public static void main(String[] args) {
        TestApp testApp = new TestApp();
        System.out.println(testApp.stringParser("{()(({}))[]}"));
        System.out.println(testApp.stringParser("{(awe)aery(aery(4e{345}))[]}(("));
        System.out.println(testApp.stringParser("{([[[)}"));
    }
}
