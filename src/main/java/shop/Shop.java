package shop;
import interfaces.ISell;
import java.util.ArrayList;

    public class Shop {
        private ArrayList<ISell> instruments;

        public Shop(){
            instruments = new ArrayList<>();
        }

        public void addItem(ISell item){
            instruments.add(item);
        }

        public boolean removeItem(ISell item){
            return instruments.remove(item);
        }

        public ArrayList getAllStock(){
            return instruments;
        }

    }
