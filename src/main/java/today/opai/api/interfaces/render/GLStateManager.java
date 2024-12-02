package today.opai.api.interfaces.render;

public interface GLStateManager {
    void pushAttrib();

    void popAttrib();

    void disableAlpha();

    void enableAlpha();

    void alphaFunc(int func, float ref);

    void enableLighting();

    void disableLighting();

    void enableLight(int light);

    void disableLight(int light);

    void enableColorMaterial();

    void disableColorMaterial();

    void colorMaterial(int face, int mode);

    void disableDepth();

    void enableDepth();

    void depthFunc(int depthFunc);

    void depthMask(boolean flagIn);

    void disableBlend();

    void enableBlend();

    void blendFunc(int srcFactor, int dstFactor);

    void tryBlendFuncSeparate(int srcFactor, int dstFactor, int srcFactorAlpha, int dstFactorAlpha);

    void enableFog();

    void disableFog();

    void setFog(int param);

    void setFogDensity(float param);

    void setFogStart(float param);

    void setFogEnd(float param);

    void enableCull();

    void disableCull();

    void cullFace(int mode);

    void enablePolygonOffset();

    void disablePolygonOffset();

    void doPolygonOffset(float factor, float units);

    void enableColorLogic();

    void disableColorLogic();

    void colorLogicOp(int opcode);

    void setActiveTexture(int texture);

    void enableTexture2D();

    void disableTexture2D();

    int generateTexture();

    void deleteTexture(int texture);

    void bindTexture(int texture);

    void enableNormalize();

    void disableNormalize();

    void shadeModel(int mode);

    void enableRescaleNormal();

    void disableRescaleNormal();

    void viewport(int x, int y, int width, int height);

    void colorMask(boolean red, boolean green, boolean blue, boolean alpha);

    void clearDepth(double depth);

    void clearColor(float red, float green, float blue, float alpha);

    void clear(int mask);

    void matrixMode(int mode);

    void loadIdentity();

    void pushMatrix();

    void popMatrix();

    void ortho(double left, double right, double bottom, double top, double zNear, double zFar);

    void rotate(float angle, float x, float y, float z);

    void scale(float x, float y, float z);

    void scale(double x, double y, double z);

    void translate(float x, float y, float z);

    void translate(double x, double y, double z);

    void color(float colorRed, float colorGreen, float colorBlue, float colorAlpha);

    void color(float colorRed, float colorGreen, float colorBlue);

    void resetColor();

    void glBegin(int p_glBegin_0_);

    void glEnd();

    void glDrawArrays(int p_glDrawArrays_0_, int p_glDrawArrays_1_, int p_glDrawArrays_2_);

    void callList(int list);

    void glDeleteLists(int p_glDeleteLists_0_, int p_glDeleteLists_1_);

    void glNewList(int p_glNewList_0_, int p_glNewList_1_);

    void glEndList();

    int glGetError();
}
