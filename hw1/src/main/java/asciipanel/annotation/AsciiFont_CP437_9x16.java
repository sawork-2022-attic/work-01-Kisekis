package asciipanel.annotation;

import asciipanel.AsciiFont;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AsciiFont_CP437_9x16 extends AsciiFont {
    public AsciiFont_CP437_9x16() {
        super("cp437_9x16.png", 9, 16);
    }
}
