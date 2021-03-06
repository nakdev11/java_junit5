package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IchigoTest {

    @Test
    @DisplayName("品種を文字列で与えて、あまおう　であればいちごクラスに保存")
    public void save() {
        // Setup
        Ichigo sut = new Ichigo();
        // Exercise
        sut.setHinsyu("あまおう");
        String actual = sut.getHinsyu();
        // Verify
        assertEquals("あまおう", actual);
    }

}
