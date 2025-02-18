package today.opai.api.interfaces.render;

import java.io.File;
import java.io.InputStream;

public interface FontUtil {
    /**
     * Creates a true type font (.ttf) from an input stream.
     *
     * @param inputStream The input stream containing the font data.
     * @param size The size of the font.
     * @return A {@link Font} object created from the input stream.
     */
    Font createFont(InputStream inputStream, float size);

    /**
     * Creates a true type font (.ttf) from a byte array.
     *
     * @param data The byte array containing the font data.
     * @param size The size of the font.
     * @return A {@link Font} object created from the byte array.
     */
    Font createFont(byte[] data, float size);

    /**
     * Creates a true type font (.ttf) from a file.
     *
     * @param fontFile The file containing the font data.
     * @param size The size of the font.
     * @return A {@link Font} object created from the file.
     */
    Font createFont(File fontFile, float size);

    Font getVanillaFont();

    Font getGoogleSansB18();

    Font getGoogleSansB16();

    Font getGoogleSans18();

    Font getGoogleSans16();

    Font getProduct18();

    Font getTahoma18();
}
