package instrument;

    public class Guitar extends Instrument{
        public int numberOfStrings;

        public Guitar(String type, String material, String colour, double sellPrice, double boughtPrice, int numberOfStrings) {
            super(type, material, colour, sellPrice, boughtPrice);
            this.numberOfStrings = numberOfStrings;
        }

        public int getNumberOfStrings() {
            return numberOfStrings;
        }

        @Override
        public String play(Instrument instrument) {
            return "Twang";
        }


        @Override
        public String play() {
            return "Twang";
        }

        @Override
        public double calculateMarkUp(){
            double markup = (sellPrice - boughtPrice);
            return markup;
        }

        @Override
        public double calculateMarkup() {
            return calculateMarkUp();
        }
    }