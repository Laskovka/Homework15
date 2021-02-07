package ua.com.alevel.Task8;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        packer.repackage(foodBox, cakeBox);
    }

    public <T extends Goods> void repackage(Box<? super T> to, Box<? extends T> from) {
        to.put(from.get());
    }
}

