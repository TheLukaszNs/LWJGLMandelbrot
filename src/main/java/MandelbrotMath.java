public class MandelbrotMath {
    /**
     * Converts 0-255 format color into 0-1 format color.
     * @param   color   a 4-items length array contains the RGBA values in 0-255 format.
     * @return          4-items length array contains color in 0-1 range format.
     */
    public static float[] convertColor(float[] color) {
        return new float[]{
                color[0] / 255, color[1] / 255, color[2] / 255, 0.0f
        };
    }
}