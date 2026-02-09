import org.example.ProductRepository;
import org.example.PurchaseItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ProductRepositoryTest {

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 40, 3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 30, 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 20, 7);
    PurchaseItem item4 = new PurchaseItem(453, 897, "творог", 55, 6);
    PurchaseItem item5 = new PurchaseItem(4998, 345, "сырок", 87, 3);

    //Удален один продукт, проверяем, что остальные вывел
    @Test
    public void removeOneItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.removeById(item2.getId());

        PurchaseItem[] expected = {item1, item3, item4, item5};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Удалем все продукты, проверяем, что у нас пустой массив
    @Test
    public void removeALLItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.removeById(item1.getId());
        repo.removeById(item2.getId());
        repo.removeById(item3.getId());
        repo.removeById(item4.getId());
        repo.removeById(item5.getId());


        PurchaseItem[] expected = {};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Добавили все продукты
    @Test
    public void addAllItem() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);

        PurchaseItem[] expected = {item1, item2, item3, item4, item5};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}