package lab3;

public class Computer {
    private String name;
    private Specification specification;

    public Computer(String name, Specification specification) {
        this.name = name;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public static class Specification {
        private String operatingSystem;
        private String processor;
        private int memory;

        public Specification(String operatingSystem, String processor, int memory) {
            this.operatingSystem = operatingSystem;
            this.processor = processor;
            this.memory = memory;
        }

        public String getOperatingSystem() {
            return operatingSystem;
        }

        public String getProcessor() {
            return processor;
        }

        public int getMemory() {
            return memory;
        }

        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }
    }
}
