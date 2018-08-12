package instrument;

import interfaces.IPlay;

    public class Piano extends Instrument implements IPlay {
        private int numberOfKeys;

        public Piano(String type, String material, String colour, double sellPrice, double boughtPrice, int numberOfKeys) {
            super(type, material, colour, sellPrice, boughtPrice);
            this.numberOfKeys = numberOfKeys;
        }

        public int getNumberOfKeys() {
            return numberOfKeys;
        }

        @Override
        public String play() {
            return "Ding";
        }

        @Override
        public String play(Instrument instrument) {
            return "Ding";
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