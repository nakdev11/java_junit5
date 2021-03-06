package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IchigoTest {

    @Test
    @DisplayName("品種を文字列で与えて、あまおう とちおとめ もういっこ　であればいちごクラスに保存")
    public void save() {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertEquals("Hello TDD BootCamp!", actual);
    }

}
