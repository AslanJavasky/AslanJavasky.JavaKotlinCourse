package mod10_design_pattern.lesson4_builder;

public class MagicalCreature {
    private String name;
    private String type;
    private int age;
    private String habitat;

    public MagicalCreature(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.habitat = builder.habitat;
    }


    @Override
    public String toString() {
        return "MagicalCreature{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String type;
        private int age;
        private String habitat;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHabitat(String habitat) {
            this.habitat = habitat;
            return this;
        }

        public MagicalCreature build() {
            return new MagicalCreature(this);
        }
    }


}
