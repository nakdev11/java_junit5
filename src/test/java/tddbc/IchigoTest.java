package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class IchigoTest {


    @Nested
    class 品種とサイズを与えていちごを作成する{
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

        @Test
        public void 品種を文字列で与えてとちおとめであればいちごクラスに保存() {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setHinsyu("とちおとめ");
            String actual = sut.getHinsyu();
            // Verify
            assertEquals("とちおとめ", actual);
        }
    }

}
