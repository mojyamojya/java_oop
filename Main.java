public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("鈴木");
        p.setAge(50);
        // System.out.println("みなさんこんにちは！講師の" + p.getName() +
        //     "です。年齢は" + p.getAge() + "です。" +
        //     "よろしくお願いします。");
        p.introduce();
    }
}
