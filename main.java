package Module5_3;



public class main {


    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore(4,2,3);
        Flowers[] flowers = flowerStore.sell(3,5,1);
        showFlowers(flowers);
        System.out.println();
        System.out.println("Наличных в кассе: " + flowerStore.getKassa());


        Flowers[] flowers1 = flowerStore.sellSequence(3,2,3);
        showSequenceFlowers(flowers1);
        System.out.println();
        System.out.println("А теперь наличных в кассе: " + flowerStore.getKassa());
//        save("files/flowers.txt",flowers);
//
//        Flowers[] flowersRead = load("files/flowers.txt");
//        showFlowers(flowersRead);
//        showSequenceFlowers(flowers1);

    }

    public static void showFlowers(Flowers[] flowers){
        for (int i = 0; i < flowers.length; i++){
            System.out.print(flowers[i].show() + ",");
        }
    }

    public static void showSequenceFlowers(Flowers[] flowers1){
        for (int i = 0; i < flowers1.length; i++){
            System.out.print(flowers1[i].show() + ",");
        }
        System.out.println();
    }



}
