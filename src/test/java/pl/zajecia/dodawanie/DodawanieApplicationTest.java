package pl.zajecia.dodawanie;

import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieApplicationTest {

    @Test
    public void dodawanie() {
            DodawanieApplication dodawanieApplication=new DodawanieApplication();
            assertEquals(10,dodawanieApplication.dodawanie(5,5));
        }
    }
