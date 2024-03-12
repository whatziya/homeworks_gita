package lesson_14.enum_vazifa2;

public enum Animal {
    CAT(){
        @Override
        public void voise() {
            System.out.println("M-I-Y-A-U");
        }
    },DOG(){
        @Override
        public void voise() {
            System.out.println("V-O-V");
        }
    },COW(){
        @Override
        public void voise() {
            System.out.println("M-O'-O'-O'");
        }
    },HORSE(){
        @Override
        public void voise() {
            System.out.println("X-X-I-I");
        }
    },DONKEY(){
        @Override
        public void voise() {
            System.out.println("I-I-A-A");
        }
    };
    public void voise(){

    }
}
