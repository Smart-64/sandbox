package pattern.creational.model;

// Паттерн проектирования порождаюший: Builder.
public class Plane {
    private final boolean isMilitary;
    private final String type;
    private final int length;

    public Plane(Builder builder) {
        this.isMilitary = builder.isMilitary;
        this.type = builder.type;
        this.length = builder.length;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public static class Builder {
        private boolean isMilitary;
        private String type;
        private int length;

        public Builder setMilitary(boolean isMilitary) {
            this.isMilitary = isMilitary;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setLength(int length) {
            this.length = length;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}
