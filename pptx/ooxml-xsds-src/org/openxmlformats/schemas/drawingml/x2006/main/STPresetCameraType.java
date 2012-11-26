/*
 * XML Type:  ST_PresetCameraType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_PresetCameraType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.
 */
public interface STPresetCameraType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STPresetCameraType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stpresetcameratype9969type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LEGACY_OBLIQUE_TOP_LEFT = Enum.forString("legacyObliqueTopLeft");
    static final Enum LEGACY_OBLIQUE_TOP = Enum.forString("legacyObliqueTop");
    static final Enum LEGACY_OBLIQUE_TOP_RIGHT = Enum.forString("legacyObliqueTopRight");
    static final Enum LEGACY_OBLIQUE_LEFT = Enum.forString("legacyObliqueLeft");
    static final Enum LEGACY_OBLIQUE_FRONT = Enum.forString("legacyObliqueFront");
    static final Enum LEGACY_OBLIQUE_RIGHT = Enum.forString("legacyObliqueRight");
    static final Enum LEGACY_OBLIQUE_BOTTOM_LEFT = Enum.forString("legacyObliqueBottomLeft");
    static final Enum LEGACY_OBLIQUE_BOTTOM = Enum.forString("legacyObliqueBottom");
    static final Enum LEGACY_OBLIQUE_BOTTOM_RIGHT = Enum.forString("legacyObliqueBottomRight");
    static final Enum LEGACY_PERSPECTIVE_TOP_LEFT = Enum.forString("legacyPerspectiveTopLeft");
    static final Enum LEGACY_PERSPECTIVE_TOP = Enum.forString("legacyPerspectiveTop");
    static final Enum LEGACY_PERSPECTIVE_TOP_RIGHT = Enum.forString("legacyPerspectiveTopRight");
    static final Enum LEGACY_PERSPECTIVE_LEFT = Enum.forString("legacyPerspectiveLeft");
    static final Enum LEGACY_PERSPECTIVE_FRONT = Enum.forString("legacyPerspectiveFront");
    static final Enum LEGACY_PERSPECTIVE_RIGHT = Enum.forString("legacyPerspectiveRight");
    static final Enum LEGACY_PERSPECTIVE_BOTTOM_LEFT = Enum.forString("legacyPerspectiveBottomLeft");
    static final Enum LEGACY_PERSPECTIVE_BOTTOM = Enum.forString("legacyPerspectiveBottom");
    static final Enum LEGACY_PERSPECTIVE_BOTTOM_RIGHT = Enum.forString("legacyPerspectiveBottomRight");
    static final Enum ORTHOGRAPHIC_FRONT = Enum.forString("orthographicFront");
    static final Enum ISOMETRIC_TOP_UP = Enum.forString("isometricTopUp");
    static final Enum ISOMETRIC_TOP_DOWN = Enum.forString("isometricTopDown");
    static final Enum ISOMETRIC_BOTTOM_UP = Enum.forString("isometricBottomUp");
    static final Enum ISOMETRIC_BOTTOM_DOWN = Enum.forString("isometricBottomDown");
    static final Enum ISOMETRIC_LEFT_UP = Enum.forString("isometricLeftUp");
    static final Enum ISOMETRIC_LEFT_DOWN = Enum.forString("isometricLeftDown");
    static final Enum ISOMETRIC_RIGHT_UP = Enum.forString("isometricRightUp");
    static final Enum ISOMETRIC_RIGHT_DOWN = Enum.forString("isometricRightDown");
    static final Enum ISOMETRIC_OFF_AXIS_1_LEFT = Enum.forString("isometricOffAxis1Left");
    static final Enum ISOMETRIC_OFF_AXIS_1_RIGHT = Enum.forString("isometricOffAxis1Right");
    static final Enum ISOMETRIC_OFF_AXIS_1_TOP = Enum.forString("isometricOffAxis1Top");
    static final Enum ISOMETRIC_OFF_AXIS_2_LEFT = Enum.forString("isometricOffAxis2Left");
    static final Enum ISOMETRIC_OFF_AXIS_2_RIGHT = Enum.forString("isometricOffAxis2Right");
    static final Enum ISOMETRIC_OFF_AXIS_2_TOP = Enum.forString("isometricOffAxis2Top");
    static final Enum ISOMETRIC_OFF_AXIS_3_LEFT = Enum.forString("isometricOffAxis3Left");
    static final Enum ISOMETRIC_OFF_AXIS_3_RIGHT = Enum.forString("isometricOffAxis3Right");
    static final Enum ISOMETRIC_OFF_AXIS_3_BOTTOM = Enum.forString("isometricOffAxis3Bottom");
    static final Enum ISOMETRIC_OFF_AXIS_4_LEFT = Enum.forString("isometricOffAxis4Left");
    static final Enum ISOMETRIC_OFF_AXIS_4_RIGHT = Enum.forString("isometricOffAxis4Right");
    static final Enum ISOMETRIC_OFF_AXIS_4_BOTTOM = Enum.forString("isometricOffAxis4Bottom");
    static final Enum OBLIQUE_TOP_LEFT = Enum.forString("obliqueTopLeft");
    static final Enum OBLIQUE_TOP = Enum.forString("obliqueTop");
    static final Enum OBLIQUE_TOP_RIGHT = Enum.forString("obliqueTopRight");
    static final Enum OBLIQUE_LEFT = Enum.forString("obliqueLeft");
    static final Enum OBLIQUE_RIGHT = Enum.forString("obliqueRight");
    static final Enum OBLIQUE_BOTTOM_LEFT = Enum.forString("obliqueBottomLeft");
    static final Enum OBLIQUE_BOTTOM = Enum.forString("obliqueBottom");
    static final Enum OBLIQUE_BOTTOM_RIGHT = Enum.forString("obliqueBottomRight");
    static final Enum PERSPECTIVE_FRONT = Enum.forString("perspectiveFront");
    static final Enum PERSPECTIVE_LEFT = Enum.forString("perspectiveLeft");
    static final Enum PERSPECTIVE_RIGHT = Enum.forString("perspectiveRight");
    static final Enum PERSPECTIVE_ABOVE = Enum.forString("perspectiveAbove");
    static final Enum PERSPECTIVE_BELOW = Enum.forString("perspectiveBelow");
    static final Enum PERSPECTIVE_ABOVE_LEFT_FACING = Enum.forString("perspectiveAboveLeftFacing");
    static final Enum PERSPECTIVE_ABOVE_RIGHT_FACING = Enum.forString("perspectiveAboveRightFacing");
    static final Enum PERSPECTIVE_CONTRASTING_LEFT_FACING = Enum.forString("perspectiveContrastingLeftFacing");
    static final Enum PERSPECTIVE_CONTRASTING_RIGHT_FACING = Enum.forString("perspectiveContrastingRightFacing");
    static final Enum PERSPECTIVE_HEROIC_LEFT_FACING = Enum.forString("perspectiveHeroicLeftFacing");
    static final Enum PERSPECTIVE_HEROIC_RIGHT_FACING = Enum.forString("perspectiveHeroicRightFacing");
    static final Enum PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING = Enum.forString("perspectiveHeroicExtremeLeftFacing");
    static final Enum PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING = Enum.forString("perspectiveHeroicExtremeRightFacing");
    static final Enum PERSPECTIVE_RELAXED = Enum.forString("perspectiveRelaxed");
    static final Enum PERSPECTIVE_RELAXED_MODERATELY = Enum.forString("perspectiveRelaxedModerately");
    
    static final int INT_LEGACY_OBLIQUE_TOP_LEFT = Enum.INT_LEGACY_OBLIQUE_TOP_LEFT;
    static final int INT_LEGACY_OBLIQUE_TOP = Enum.INT_LEGACY_OBLIQUE_TOP;
    static final int INT_LEGACY_OBLIQUE_TOP_RIGHT = Enum.INT_LEGACY_OBLIQUE_TOP_RIGHT;
    static final int INT_LEGACY_OBLIQUE_LEFT = Enum.INT_LEGACY_OBLIQUE_LEFT;
    static final int INT_LEGACY_OBLIQUE_FRONT = Enum.INT_LEGACY_OBLIQUE_FRONT;
    static final int INT_LEGACY_OBLIQUE_RIGHT = Enum.INT_LEGACY_OBLIQUE_RIGHT;
    static final int INT_LEGACY_OBLIQUE_BOTTOM_LEFT = Enum.INT_LEGACY_OBLIQUE_BOTTOM_LEFT;
    static final int INT_LEGACY_OBLIQUE_BOTTOM = Enum.INT_LEGACY_OBLIQUE_BOTTOM;
    static final int INT_LEGACY_OBLIQUE_BOTTOM_RIGHT = Enum.INT_LEGACY_OBLIQUE_BOTTOM_RIGHT;
    static final int INT_LEGACY_PERSPECTIVE_TOP_LEFT = Enum.INT_LEGACY_PERSPECTIVE_TOP_LEFT;
    static final int INT_LEGACY_PERSPECTIVE_TOP = Enum.INT_LEGACY_PERSPECTIVE_TOP;
    static final int INT_LEGACY_PERSPECTIVE_TOP_RIGHT = Enum.INT_LEGACY_PERSPECTIVE_TOP_RIGHT;
    static final int INT_LEGACY_PERSPECTIVE_LEFT = Enum.INT_LEGACY_PERSPECTIVE_LEFT;
    static final int INT_LEGACY_PERSPECTIVE_FRONT = Enum.INT_LEGACY_PERSPECTIVE_FRONT;
    static final int INT_LEGACY_PERSPECTIVE_RIGHT = Enum.INT_LEGACY_PERSPECTIVE_RIGHT;
    static final int INT_LEGACY_PERSPECTIVE_BOTTOM_LEFT = Enum.INT_LEGACY_PERSPECTIVE_BOTTOM_LEFT;
    static final int INT_LEGACY_PERSPECTIVE_BOTTOM = Enum.INT_LEGACY_PERSPECTIVE_BOTTOM;
    static final int INT_LEGACY_PERSPECTIVE_BOTTOM_RIGHT = Enum.INT_LEGACY_PERSPECTIVE_BOTTOM_RIGHT;
    static final int INT_ORTHOGRAPHIC_FRONT = Enum.INT_ORTHOGRAPHIC_FRONT;
    static final int INT_ISOMETRIC_TOP_UP = Enum.INT_ISOMETRIC_TOP_UP;
    static final int INT_ISOMETRIC_TOP_DOWN = Enum.INT_ISOMETRIC_TOP_DOWN;
    static final int INT_ISOMETRIC_BOTTOM_UP = Enum.INT_ISOMETRIC_BOTTOM_UP;
    static final int INT_ISOMETRIC_BOTTOM_DOWN = Enum.INT_ISOMETRIC_BOTTOM_DOWN;
    static final int INT_ISOMETRIC_LEFT_UP = Enum.INT_ISOMETRIC_LEFT_UP;
    static final int INT_ISOMETRIC_LEFT_DOWN = Enum.INT_ISOMETRIC_LEFT_DOWN;
    static final int INT_ISOMETRIC_RIGHT_UP = Enum.INT_ISOMETRIC_RIGHT_UP;
    static final int INT_ISOMETRIC_RIGHT_DOWN = Enum.INT_ISOMETRIC_RIGHT_DOWN;
    static final int INT_ISOMETRIC_OFF_AXIS_1_LEFT = Enum.INT_ISOMETRIC_OFF_AXIS_1_LEFT;
    static final int INT_ISOMETRIC_OFF_AXIS_1_RIGHT = Enum.INT_ISOMETRIC_OFF_AXIS_1_RIGHT;
    static final int INT_ISOMETRIC_OFF_AXIS_1_TOP = Enum.INT_ISOMETRIC_OFF_AXIS_1_TOP;
    static final int INT_ISOMETRIC_OFF_AXIS_2_LEFT = Enum.INT_ISOMETRIC_OFF_AXIS_2_LEFT;
    static final int INT_ISOMETRIC_OFF_AXIS_2_RIGHT = Enum.INT_ISOMETRIC_OFF_AXIS_2_RIGHT;
    static final int INT_ISOMETRIC_OFF_AXIS_2_TOP = Enum.INT_ISOMETRIC_OFF_AXIS_2_TOP;
    static final int INT_ISOMETRIC_OFF_AXIS_3_LEFT = Enum.INT_ISOMETRIC_OFF_AXIS_3_LEFT;
    static final int INT_ISOMETRIC_OFF_AXIS_3_RIGHT = Enum.INT_ISOMETRIC_OFF_AXIS_3_RIGHT;
    static final int INT_ISOMETRIC_OFF_AXIS_3_BOTTOM = Enum.INT_ISOMETRIC_OFF_AXIS_3_BOTTOM;
    static final int INT_ISOMETRIC_OFF_AXIS_4_LEFT = Enum.INT_ISOMETRIC_OFF_AXIS_4_LEFT;
    static final int INT_ISOMETRIC_OFF_AXIS_4_RIGHT = Enum.INT_ISOMETRIC_OFF_AXIS_4_RIGHT;
    static final int INT_ISOMETRIC_OFF_AXIS_4_BOTTOM = Enum.INT_ISOMETRIC_OFF_AXIS_4_BOTTOM;
    static final int INT_OBLIQUE_TOP_LEFT = Enum.INT_OBLIQUE_TOP_LEFT;
    static final int INT_OBLIQUE_TOP = Enum.INT_OBLIQUE_TOP;
    static final int INT_OBLIQUE_TOP_RIGHT = Enum.INT_OBLIQUE_TOP_RIGHT;
    static final int INT_OBLIQUE_LEFT = Enum.INT_OBLIQUE_LEFT;
    static final int INT_OBLIQUE_RIGHT = Enum.INT_OBLIQUE_RIGHT;
    static final int INT_OBLIQUE_BOTTOM_LEFT = Enum.INT_OBLIQUE_BOTTOM_LEFT;
    static final int INT_OBLIQUE_BOTTOM = Enum.INT_OBLIQUE_BOTTOM;
    static final int INT_OBLIQUE_BOTTOM_RIGHT = Enum.INT_OBLIQUE_BOTTOM_RIGHT;
    static final int INT_PERSPECTIVE_FRONT = Enum.INT_PERSPECTIVE_FRONT;
    static final int INT_PERSPECTIVE_LEFT = Enum.INT_PERSPECTIVE_LEFT;
    static final int INT_PERSPECTIVE_RIGHT = Enum.INT_PERSPECTIVE_RIGHT;
    static final int INT_PERSPECTIVE_ABOVE = Enum.INT_PERSPECTIVE_ABOVE;
    static final int INT_PERSPECTIVE_BELOW = Enum.INT_PERSPECTIVE_BELOW;
    static final int INT_PERSPECTIVE_ABOVE_LEFT_FACING = Enum.INT_PERSPECTIVE_ABOVE_LEFT_FACING;
    static final int INT_PERSPECTIVE_ABOVE_RIGHT_FACING = Enum.INT_PERSPECTIVE_ABOVE_RIGHT_FACING;
    static final int INT_PERSPECTIVE_CONTRASTING_LEFT_FACING = Enum.INT_PERSPECTIVE_CONTRASTING_LEFT_FACING;
    static final int INT_PERSPECTIVE_CONTRASTING_RIGHT_FACING = Enum.INT_PERSPECTIVE_CONTRASTING_RIGHT_FACING;
    static final int INT_PERSPECTIVE_HEROIC_LEFT_FACING = Enum.INT_PERSPECTIVE_HEROIC_LEFT_FACING;
    static final int INT_PERSPECTIVE_HEROIC_RIGHT_FACING = Enum.INT_PERSPECTIVE_HEROIC_RIGHT_FACING;
    static final int INT_PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING = Enum.INT_PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING;
    static final int INT_PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING = Enum.INT_PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING;
    static final int INT_PERSPECTIVE_RELAXED = Enum.INT_PERSPECTIVE_RELAXED;
    static final int INT_PERSPECTIVE_RELAXED_MODERATELY = Enum.INT_PERSPECTIVE_RELAXED_MODERATELY;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STPresetCameraType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LEGACY_OBLIQUE_TOP_LEFT
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_LEGACY_OBLIQUE_TOP_LEFT = 1;
        static final int INT_LEGACY_OBLIQUE_TOP = 2;
        static final int INT_LEGACY_OBLIQUE_TOP_RIGHT = 3;
        static final int INT_LEGACY_OBLIQUE_LEFT = 4;
        static final int INT_LEGACY_OBLIQUE_FRONT = 5;
        static final int INT_LEGACY_OBLIQUE_RIGHT = 6;
        static final int INT_LEGACY_OBLIQUE_BOTTOM_LEFT = 7;
        static final int INT_LEGACY_OBLIQUE_BOTTOM = 8;
        static final int INT_LEGACY_OBLIQUE_BOTTOM_RIGHT = 9;
        static final int INT_LEGACY_PERSPECTIVE_TOP_LEFT = 10;
        static final int INT_LEGACY_PERSPECTIVE_TOP = 11;
        static final int INT_LEGACY_PERSPECTIVE_TOP_RIGHT = 12;
        static final int INT_LEGACY_PERSPECTIVE_LEFT = 13;
        static final int INT_LEGACY_PERSPECTIVE_FRONT = 14;
        static final int INT_LEGACY_PERSPECTIVE_RIGHT = 15;
        static final int INT_LEGACY_PERSPECTIVE_BOTTOM_LEFT = 16;
        static final int INT_LEGACY_PERSPECTIVE_BOTTOM = 17;
        static final int INT_LEGACY_PERSPECTIVE_BOTTOM_RIGHT = 18;
        static final int INT_ORTHOGRAPHIC_FRONT = 19;
        static final int INT_ISOMETRIC_TOP_UP = 20;
        static final int INT_ISOMETRIC_TOP_DOWN = 21;
        static final int INT_ISOMETRIC_BOTTOM_UP = 22;
        static final int INT_ISOMETRIC_BOTTOM_DOWN = 23;
        static final int INT_ISOMETRIC_LEFT_UP = 24;
        static final int INT_ISOMETRIC_LEFT_DOWN = 25;
        static final int INT_ISOMETRIC_RIGHT_UP = 26;
        static final int INT_ISOMETRIC_RIGHT_DOWN = 27;
        static final int INT_ISOMETRIC_OFF_AXIS_1_LEFT = 28;
        static final int INT_ISOMETRIC_OFF_AXIS_1_RIGHT = 29;
        static final int INT_ISOMETRIC_OFF_AXIS_1_TOP = 30;
        static final int INT_ISOMETRIC_OFF_AXIS_2_LEFT = 31;
        static final int INT_ISOMETRIC_OFF_AXIS_2_RIGHT = 32;
        static final int INT_ISOMETRIC_OFF_AXIS_2_TOP = 33;
        static final int INT_ISOMETRIC_OFF_AXIS_3_LEFT = 34;
        static final int INT_ISOMETRIC_OFF_AXIS_3_RIGHT = 35;
        static final int INT_ISOMETRIC_OFF_AXIS_3_BOTTOM = 36;
        static final int INT_ISOMETRIC_OFF_AXIS_4_LEFT = 37;
        static final int INT_ISOMETRIC_OFF_AXIS_4_RIGHT = 38;
        static final int INT_ISOMETRIC_OFF_AXIS_4_BOTTOM = 39;
        static final int INT_OBLIQUE_TOP_LEFT = 40;
        static final int INT_OBLIQUE_TOP = 41;
        static final int INT_OBLIQUE_TOP_RIGHT = 42;
        static final int INT_OBLIQUE_LEFT = 43;
        static final int INT_OBLIQUE_RIGHT = 44;
        static final int INT_OBLIQUE_BOTTOM_LEFT = 45;
        static final int INT_OBLIQUE_BOTTOM = 46;
        static final int INT_OBLIQUE_BOTTOM_RIGHT = 47;
        static final int INT_PERSPECTIVE_FRONT = 48;
        static final int INT_PERSPECTIVE_LEFT = 49;
        static final int INT_PERSPECTIVE_RIGHT = 50;
        static final int INT_PERSPECTIVE_ABOVE = 51;
        static final int INT_PERSPECTIVE_BELOW = 52;
        static final int INT_PERSPECTIVE_ABOVE_LEFT_FACING = 53;
        static final int INT_PERSPECTIVE_ABOVE_RIGHT_FACING = 54;
        static final int INT_PERSPECTIVE_CONTRASTING_LEFT_FACING = 55;
        static final int INT_PERSPECTIVE_CONTRASTING_RIGHT_FACING = 56;
        static final int INT_PERSPECTIVE_HEROIC_LEFT_FACING = 57;
        static final int INT_PERSPECTIVE_HEROIC_RIGHT_FACING = 58;
        static final int INT_PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING = 59;
        static final int INT_PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING = 60;
        static final int INT_PERSPECTIVE_RELAXED = 61;
        static final int INT_PERSPECTIVE_RELAXED_MODERATELY = 62;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("legacyObliqueTopLeft", INT_LEGACY_OBLIQUE_TOP_LEFT),
                new Enum("legacyObliqueTop", INT_LEGACY_OBLIQUE_TOP),
                new Enum("legacyObliqueTopRight", INT_LEGACY_OBLIQUE_TOP_RIGHT),
                new Enum("legacyObliqueLeft", INT_LEGACY_OBLIQUE_LEFT),
                new Enum("legacyObliqueFront", INT_LEGACY_OBLIQUE_FRONT),
                new Enum("legacyObliqueRight", INT_LEGACY_OBLIQUE_RIGHT),
                new Enum("legacyObliqueBottomLeft", INT_LEGACY_OBLIQUE_BOTTOM_LEFT),
                new Enum("legacyObliqueBottom", INT_LEGACY_OBLIQUE_BOTTOM),
                new Enum("legacyObliqueBottomRight", INT_LEGACY_OBLIQUE_BOTTOM_RIGHT),
                new Enum("legacyPerspectiveTopLeft", INT_LEGACY_PERSPECTIVE_TOP_LEFT),
                new Enum("legacyPerspectiveTop", INT_LEGACY_PERSPECTIVE_TOP),
                new Enum("legacyPerspectiveTopRight", INT_LEGACY_PERSPECTIVE_TOP_RIGHT),
                new Enum("legacyPerspectiveLeft", INT_LEGACY_PERSPECTIVE_LEFT),
                new Enum("legacyPerspectiveFront", INT_LEGACY_PERSPECTIVE_FRONT),
                new Enum("legacyPerspectiveRight", INT_LEGACY_PERSPECTIVE_RIGHT),
                new Enum("legacyPerspectiveBottomLeft", INT_LEGACY_PERSPECTIVE_BOTTOM_LEFT),
                new Enum("legacyPerspectiveBottom", INT_LEGACY_PERSPECTIVE_BOTTOM),
                new Enum("legacyPerspectiveBottomRight", INT_LEGACY_PERSPECTIVE_BOTTOM_RIGHT),
                new Enum("orthographicFront", INT_ORTHOGRAPHIC_FRONT),
                new Enum("isometricTopUp", INT_ISOMETRIC_TOP_UP),
                new Enum("isometricTopDown", INT_ISOMETRIC_TOP_DOWN),
                new Enum("isometricBottomUp", INT_ISOMETRIC_BOTTOM_UP),
                new Enum("isometricBottomDown", INT_ISOMETRIC_BOTTOM_DOWN),
                new Enum("isometricLeftUp", INT_ISOMETRIC_LEFT_UP),
                new Enum("isometricLeftDown", INT_ISOMETRIC_LEFT_DOWN),
                new Enum("isometricRightUp", INT_ISOMETRIC_RIGHT_UP),
                new Enum("isometricRightDown", INT_ISOMETRIC_RIGHT_DOWN),
                new Enum("isometricOffAxis1Left", INT_ISOMETRIC_OFF_AXIS_1_LEFT),
                new Enum("isometricOffAxis1Right", INT_ISOMETRIC_OFF_AXIS_1_RIGHT),
                new Enum("isometricOffAxis1Top", INT_ISOMETRIC_OFF_AXIS_1_TOP),
                new Enum("isometricOffAxis2Left", INT_ISOMETRIC_OFF_AXIS_2_LEFT),
                new Enum("isometricOffAxis2Right", INT_ISOMETRIC_OFF_AXIS_2_RIGHT),
                new Enum("isometricOffAxis2Top", INT_ISOMETRIC_OFF_AXIS_2_TOP),
                new Enum("isometricOffAxis3Left", INT_ISOMETRIC_OFF_AXIS_3_LEFT),
                new Enum("isometricOffAxis3Right", INT_ISOMETRIC_OFF_AXIS_3_RIGHT),
                new Enum("isometricOffAxis3Bottom", INT_ISOMETRIC_OFF_AXIS_3_BOTTOM),
                new Enum("isometricOffAxis4Left", INT_ISOMETRIC_OFF_AXIS_4_LEFT),
                new Enum("isometricOffAxis4Right", INT_ISOMETRIC_OFF_AXIS_4_RIGHT),
                new Enum("isometricOffAxis4Bottom", INT_ISOMETRIC_OFF_AXIS_4_BOTTOM),
                new Enum("obliqueTopLeft", INT_OBLIQUE_TOP_LEFT),
                new Enum("obliqueTop", INT_OBLIQUE_TOP),
                new Enum("obliqueTopRight", INT_OBLIQUE_TOP_RIGHT),
                new Enum("obliqueLeft", INT_OBLIQUE_LEFT),
                new Enum("obliqueRight", INT_OBLIQUE_RIGHT),
                new Enum("obliqueBottomLeft", INT_OBLIQUE_BOTTOM_LEFT),
                new Enum("obliqueBottom", INT_OBLIQUE_BOTTOM),
                new Enum("obliqueBottomRight", INT_OBLIQUE_BOTTOM_RIGHT),
                new Enum("perspectiveFront", INT_PERSPECTIVE_FRONT),
                new Enum("perspectiveLeft", INT_PERSPECTIVE_LEFT),
                new Enum("perspectiveRight", INT_PERSPECTIVE_RIGHT),
                new Enum("perspectiveAbove", INT_PERSPECTIVE_ABOVE),
                new Enum("perspectiveBelow", INT_PERSPECTIVE_BELOW),
                new Enum("perspectiveAboveLeftFacing", INT_PERSPECTIVE_ABOVE_LEFT_FACING),
                new Enum("perspectiveAboveRightFacing", INT_PERSPECTIVE_ABOVE_RIGHT_FACING),
                new Enum("perspectiveContrastingLeftFacing", INT_PERSPECTIVE_CONTRASTING_LEFT_FACING),
                new Enum("perspectiveContrastingRightFacing", INT_PERSPECTIVE_CONTRASTING_RIGHT_FACING),
                new Enum("perspectiveHeroicLeftFacing", INT_PERSPECTIVE_HEROIC_LEFT_FACING),
                new Enum("perspectiveHeroicRightFacing", INT_PERSPECTIVE_HEROIC_RIGHT_FACING),
                new Enum("perspectiveHeroicExtremeLeftFacing", INT_PERSPECTIVE_HEROIC_EXTREME_LEFT_FACING),
                new Enum("perspectiveHeroicExtremeRightFacing", INT_PERSPECTIVE_HEROIC_EXTREME_RIGHT_FACING),
                new Enum("perspectiveRelaxed", INT_PERSPECTIVE_RELAXED),
                new Enum("perspectiveRelaxedModerately", INT_PERSPECTIVE_RELAXED_MODERATELY),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
