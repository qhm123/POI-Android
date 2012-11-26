package and.awt.font;

public class GlyphJustificationInfo {

    /**
     * Constructs information about the justification properties of a
     * glyph.
     * @param weight the weight of this glyph when allocating space.  Must be non-negative.
     * @param growAbsorb if <code>true</code> this glyph absorbs
     * all extra space at this priority and lower priority levels when it
     * grows
     * @param growPriority the priority level of this glyph when it
     * grows
     * @param growLeftLimit the maximum amount by which the left side of this
     * glyph can grow.  Must be non-negative.
     * @param growRightLimit the maximum amount by which the right side of this
     * glyph can grow.  Must be non-negative.
     * @param shrinkAbsorb if <code>true</code>, this glyph absorbs all
     * remaining shrinkage at this and lower priority levels when it
     * shrinks
     * @param shrinkPriority the priority level of this glyph when
     * it shrinks
     * @param shrinkLeftLimit the maximum amount by which the left side of this
     * glyph can shrink.  Must be non-negative.
     * @param shrinkRightLimit the maximum amount by which the right side
     * of this glyph can shrink.  Must be non-negative.
     */
     public GlyphJustificationInfo(float weight,
                                  boolean growAbsorb,
                                  int growPriority,
                                  float growLeftLimit,
                                  float growRightLimit,
                                  boolean shrinkAbsorb,
                                  int shrinkPriority,
                                  float shrinkLeftLimit,
                                  float shrinkRightLimit)
    {
        if (weight < 0) {
            throw new IllegalArgumentException("weight is negative");
        }

        if (!priorityIsValid(growPriority)) {
            throw new IllegalArgumentException("Invalid grow priority");
        }
        if (growLeftLimit < 0) {
            throw new IllegalArgumentException("growLeftLimit is negative");
        }
        if (growRightLimit < 0) {
            throw new IllegalArgumentException("growRightLimit is negative");
        }

        if (!priorityIsValid(shrinkPriority)) {
            throw new IllegalArgumentException("Invalid shrink priority");
        }
        if (shrinkLeftLimit < 0) {
            throw new IllegalArgumentException("shrinkLeftLimit is negative");
        }
        if (shrinkRightLimit < 0) {
            throw new IllegalArgumentException("shrinkRightLimit is negative");
        }

        this.weight = weight;
        this.growAbsorb = growAbsorb;
        this.growPriority = growPriority;
        this.growLeftLimit = growLeftLimit;
        this.growRightLimit = growRightLimit;
        this.shrinkAbsorb = shrinkAbsorb;
        this.shrinkPriority = shrinkPriority;
        this.shrinkLeftLimit = shrinkLeftLimit;
        this.shrinkRightLimit = shrinkRightLimit;
    }

    private static boolean priorityIsValid(int priority) {

        return priority >= PRIORITY_KASHIDA && priority <= PRIORITY_NONE;
    }

    /** The highest justification priority. */
    public static final int PRIORITY_KASHIDA = 0;

    /** The second highest justification priority. */
    public static final int PRIORITY_WHITESPACE = 1;

    /** The second lowest justification priority. */
    public static final int PRIORITY_INTERCHAR = 2;

    /** The lowest justification priority. */
    public static final int PRIORITY_NONE = 3;

    /**
     * The weight of this glyph.
     */
    public final float weight;

    /**
     * The priority level of this glyph as it is growing.
     */
    public final int growPriority;

    /**
     * If <code>true</code>, this glyph absorbs all extra
     * space at this and lower priority levels when it grows.
     */
    public final boolean growAbsorb;

    /**
     * The maximum amount by which the left side of this glyph can grow.
     */
    public final float growLeftLimit;

    /**
     * The maximum amount by which the right side of this glyph can grow.
     */
    public final float growRightLimit;

    /**
     * The priority level of this glyph as it is shrinking.
     */
    public final int shrinkPriority;

    /**
     * If <code>true</code>,this glyph absorbs all remaining shrinkage at
     * this and lower priority levels as it shrinks.
     */
    public final boolean shrinkAbsorb;

    /**
     * The maximum amount by which the left side of this glyph can shrink
     * (a positive number).
     */
    public final float shrinkLeftLimit;

    /**
     * The maximum amount by which the right side of this glyph can shrink
     * (a positive number).
     */
    public final float shrinkRightLimit;

}
