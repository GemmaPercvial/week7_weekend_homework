import instrument.Guitar;
import instrument.Instrument;
import instrument.Piano;
import instrument.Trumpet;
import interfaces.IPlay;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class InstrumentTest {
        private Guitar guitar;
        private Trumpet trumpet;
        private Piano piano;

        @Before
        public void before(){
            guitar = new Guitar("String", "Wood", "Red", 70.00, 50.00, 6);
            trumpet = new Trumpet("Brass", "Metal", "Gold", 30.00, 18.00, 3);
            piano = new Piano("Keyboard", "Wood", "Black", 500.00, 300.00, 88);
        }

        @Test
        public void hasNumberOfStrings() {
            assertEquals(6, guitar.numberOfStrings);
        }

        @Test
        public void canPlayGuitar(){
            assertEquals("Twang", guitar.play());
        }

        @Test
        public void hasNumberOfValves(){
            assertEquals(3, trumpet.getNumberOfValves());
        }

        @Test
        public void canPlayTrumpet() {
            assertEquals("Twang", trumpet.play());
        }

        @Test
        public void hasNumberOfKeys(){
            assertEquals(88, piano.getNumberOfKeys());
        }

        @Test
        public void canPlayPiano() {
            assertEquals("Ding", piano.play());
        }

        @Test
        public void hasCalculateMarkup(){
            assertEquals(12.00, trumpet.calculateMarkup(), 2);
        }
    }
