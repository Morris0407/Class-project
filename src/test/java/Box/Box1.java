package Box;

    public abstract class Box1 extends Box{
        public Box1() {
            length = 30;
            width=30;
            height=30;
        }
        @Override
        public String getName3(){
            return "BOX1";
        }
        @Override
        public int getPrice3(){
            return 240;
        }
    }

