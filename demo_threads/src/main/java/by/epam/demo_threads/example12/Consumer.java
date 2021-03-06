package by.epam.demo_threads.example12;

public class Consumer extends Thread {

    Store store;
    int countProducts;
    private String name;

    public Consumer(Store store, int countProducts, String name) {
        this.store = store;
        this.countProducts = countProducts;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < countProducts; i++) {
            store.get(this);
        }
    }

    public String calcName() {
        return name;
    }
}

