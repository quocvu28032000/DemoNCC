package lesson2;

//override là kĩ thuật trong java cho phép lớp con định nghĩa lại phương thức
//của lớp cha theo cách của lớp con.

    class Animal {
        public void move() {
            System.out.println("động vật đang di chuyển");
        }
    }

    class Cat extends Animal {
        @java.lang.Override
        public void move() {
//            super.move();
            System.out.println("mèo di chuyển trên bờ");
        }
    }

    class Fish extends Animal {
        @java.lang.Override
        public void move() {
//            super.move();
            System.out.println("cá di chuyển dưới nước");
        }
    }

