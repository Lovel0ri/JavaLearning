package chapter2;

 class Dog {
    //实例变量
    int size;
    String breed;
    String name;
    //方法
    void bark(){
        System.out.println("Ruff! Ruff!");
    }
}

class  DogTestDrive{
    public static void main(String[] ages){
        //建立Dog对象
        Dog d = new Dog();
        //存取该对象的变量
        d.size = 40;
        //调用方法
        d.bark();
    }

}
