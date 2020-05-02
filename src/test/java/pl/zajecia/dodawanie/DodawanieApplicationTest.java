package pl.zajecia.dodawanie;

import static org.junit.Assert.*;

public class DodawanieApplicationTest {

    @org.junit.Test
    public void dodawanie() {
            DodawanieApplication dodawanieApplication=new DodawanieApplication();
            assertEquals(10,dodawanieApplication.dodawanie(5,5));
        }
    }
