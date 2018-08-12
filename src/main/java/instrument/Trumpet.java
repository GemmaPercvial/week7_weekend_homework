package instrument;

    public class Trumpet extends Instrument{
        private int numberOfValves;
        private String play;

        public Trumpet(String type, String material, String colour, double sellPrice, double boughtPrice, int numberOfValves) {
            super(type, material, colour, sellPrice, boughtPrice);
            this.numberOfValves = numberOfValves;
        }

        public int getNumberOfValves() {
            return numberOfValves;
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