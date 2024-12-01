package today.opai.api.interfaces.render;

import java.io.File;
import java.io.InputStream;

public interface FontUtil {
    Font createFont(InputStream inputStream,int size);
    Font createFont(byte[] data,int size);
    Font createFont(File fontFile, int size);
    Font getVanillaFont();
    Font getGoogleSansB18();
    Font getGoogleSansB16();
    Font getGoogleSans18();
    Font getGoogleSans16();
    Font getProduct18();
    Font getTahoma18();
}
