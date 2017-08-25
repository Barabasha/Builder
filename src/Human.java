public class Human {
    public static void main(String[] args) {

        BuilderHuman human = BuilderHuman.builder(90)
        //BuilderHuman human = new BuilderHuman.new Builder.Builder()
                .withAge(30)
                .withName("Jhon")
                .build();
        System.out.println(human);

    }
}
