package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IchigoTest {

    @Test
    public void 品種を文字列で与えてあまおうであればいちごクラスに保存() {
        // Setup
        Ichigo sut = new Ichigo();
        // Exercise
        sut.setHinsyu("あまおう");
        String actual = sut.getHinsyu();
        // Verify
        assertEquals("あまおう", actual);
    }


}
