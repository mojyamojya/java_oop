public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("もじゃもじゃ");
        p.setAge(38);
        // System.out.println("みなさんこんにちは！講師の" + p.getName() +
        //     "です。年齢は" + p.getAge() + "です。" +
        //     "よろしくお願いします。");
        p.introduce();
    }
}
