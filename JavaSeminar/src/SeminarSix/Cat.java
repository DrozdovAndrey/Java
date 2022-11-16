package SeminarSix;

public class Cat {
    int id;
    String catName;
    String address;
    String breed;

    public Cat(int id, String catName, String address, String breed){
        this.catName = catName;
        this.id = id;
        this.breed = breed;
        this.address = address;
    }

    public void sayHello(){
        System.out.println(this.catName + " say: 'may'");
    }

    @Override
    public String toString() {
        return String.format(" id:%d\n cat name:%s\n breed:%s\n address:%s\n", id, catName, breed, address);
    }
}
