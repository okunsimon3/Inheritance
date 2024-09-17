import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person ("Simon", "Okun","000001", "Mr.", 2002);

    @org.junit.jupiter.api.Test
    void getIDSeed() {
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {

        assertEquals("Simon",person.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Okun",person.getLastName());
    }


    @org.junit.jupiter.api.Test
    void getID() {
        assertEquals("000001",person.getID());
    }


    @org.junit.jupiter.api.Test
    void getTitle() {
        assertEquals("Mr.",person.getTitle());
    }


    @org.junit.jupiter.api.Test
    void getYOB() {
        assertEquals(2002,person.getYOB());
    }


    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void toJSONRecord() {
    }

    @org.junit.jupiter.api.Test
    void toXMLRecord() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        assertEquals("Simon Okun", person.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
        assertEquals("Mr. Simon Okun", person.formalName());
    }
    @org.junit.jupiter.api.Test
    void getAge() {
        int currentYear = java.util.Calendar.getInstance().get(Calendar.YEAR);
        assertEquals(currentYear - 2002, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
    }
}