class BuilderHuman {
    private int age;
    private String name;
    private int weight;

    BuilderHuman(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.weight = builder.weight;
    }

    static Builder builder(int weight) {
        return new Builder(weight);
    }

    @Override
    public String toString() {
        return "BuilderHuman{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private int age;
        private String name;
        private int weight;

        private Builder(int weight) {
            this.weight=weight;

        }

        Builder withAge(int age) {
            this.age = age;
            return this;
        }

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        BuilderHuman build(){
            return new BuilderHuman(this);
        }
    }
}