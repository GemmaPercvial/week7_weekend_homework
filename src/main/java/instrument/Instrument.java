package instrument;
import interfaces.IPlay;
import interfaces.ISell;

    public abstract class Instrument implements IPlay, ISell {
        public String type;
        public String material;
        public String colour;
        public double sellPrice;
        public double boughtPrice;

        public Instrument(String type, String material, String colour, double sellPrice, double boughtPrice) {
            this.type = type;
            this.material = material;
            this.colour = colour;
            this.sellPrice = sellPrice;
            this.boughtPrice = boughtPrice;
        }

        public String getType() {
            return type;
        }

        public String getMaterial() {
            return material;
        }

        public String getColour() {
            return colour;
        }

        public double getSellPrice() {
            return sellPrice;
        }

        public double getBoughtPrice(){
            return boughtPrice;
        }

        public String play(Instrument instrument) {
            return new String();
        }

        public abstract double calculateMarkUp();
    }
