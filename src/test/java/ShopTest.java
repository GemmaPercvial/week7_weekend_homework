import instrument.Guitar;
import instrument.Instrument;
import instrument.Piano;
import instrument.Trumpet;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

    public class ShopTest {
        private ArrayList<ISell> instruments;
        private Shop shop;
        private Guitar guitar;
        private Trumpet trumpet;
        private Piano piano;

        public ShopTest(ArrayList<ISell> instruments, Shop shop) {
            this.instruments = instruments;
            this.shop = shop;
        }

        @Before
        public void before(){
            guitar = new Guitar("String", "Wood", "Red", 70.00, 50.00, 6);
            trumpet = new Trumpet("Brass", "Metal", "Gold", 30.00, 18.00, 3);
            piano = new Piano("Keyboard", "Wood", "Black", 500.00, 300.00, 88);
        }

        @Test
        public void canAddItem(){
            shop.addItem(guitar);
            shop.addItem(piano);
            shop.addItem(trumpet);
            assertEquals(3, shop.getAllStock().size());
        }

        @Test
        public void canRemoveItem(){
            shop.addItem(guitar);
            shop.addItem(piano);
            shop.removeItem(piano);
            assertEquals(1, shop.getAllStock().size());
        }
    }
