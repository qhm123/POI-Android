/*
 * XML Type:  ST_LightRigType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_LightRigType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType.
 */
public interface STLightRigType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STLightRigType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stlightrigtypec99ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LEGACY_FLAT_1 = Enum.forString("legacyFlat1");
    static final Enum LEGACY_FLAT_2 = Enum.forString("legacyFlat2");
    static final Enum LEGACY_FLAT_3 = Enum.forString("legacyFlat3");
    static final Enum LEGACY_FLAT_4 = Enum.forString("legacyFlat4");
    static final Enum LEGACY_NORMAL_1 = Enum.forString("legacyNormal1");
    static final Enum LEGACY_NORMAL_2 = Enum.forString("legacyNormal2");
    static final Enum LEGACY_NORMAL_3 = Enum.forString("legacyNormal3");
    static final Enum LEGACY_NORMAL_4 = Enum.forString("legacyNormal4");
    static final Enum LEGACY_HARSH_1 = Enum.forString("legacyHarsh1");
    static final Enum LEGACY_HARSH_2 = Enum.forString("legacyHarsh2");
    static final Enum LEGACY_HARSH_3 = Enum.forString("legacyHarsh3");
    static final Enum LEGACY_HARSH_4 = Enum.forString("legacyHarsh4");
    static final Enum THREE_PT = Enum.forString("threePt");
    static final Enum BALANCED = Enum.forString("balanced");
    static final Enum SOFT = Enum.forString("soft");
    static final Enum HARSH = Enum.forString("harsh");
    static final Enum FLOOD = Enum.forString("flood");
    static final Enum CONTRASTING = Enum.forString("contrasting");
    static final Enum MORNING = Enum.forString("morning");
    static final Enum SUNRISE = Enum.forString("sunrise");
    static final Enum SUNSET = Enum.forString("sunset");
    static final Enum CHILLY = Enum.forString("chilly");
    static final Enum FREEZING = Enum.forString("freezing");
    static final Enum FLAT = Enum.forString("flat");
    static final Enum TWO_PT = Enum.forString("twoPt");
    static final Enum GLOW = Enum.forString("glow");
    static final Enum BRIGHT_ROOM = Enum.forString("brightRoom");
    
    static final int INT_LEGACY_FLAT_1 = Enum.INT_LEGACY_FLAT_1;
    static final int INT_LEGACY_FLAT_2 = Enum.INT_LEGACY_FLAT_2;
    static final int INT_LEGACY_FLAT_3 = Enum.INT_LEGACY_FLAT_3;
    static final int INT_LEGACY_FLAT_4 = Enum.INT_LEGACY_FLAT_4;
    static final int INT_LEGACY_NORMAL_1 = Enum.INT_LEGACY_NORMAL_1;
    static final int INT_LEGACY_NORMAL_2 = Enum.INT_LEGACY_NORMAL_2;
    static final int INT_LEGACY_NORMAL_3 = Enum.INT_LEGACY_NORMAL_3;
    static final int INT_LEGACY_NORMAL_4 = Enum.INT_LEGACY_NORMAL_4;
    static final int INT_LEGACY_HARSH_1 = Enum.INT_LEGACY_HARSH_1;
    static final int INT_LEGACY_HARSH_2 = Enum.INT_LEGACY_HARSH_2;
    static final int INT_LEGACY_HARSH_3 = Enum.INT_LEGACY_HARSH_3;
    static final int INT_LEGACY_HARSH_4 = Enum.INT_LEGACY_HARSH_4;
    static final int INT_THREE_PT = Enum.INT_THREE_PT;
    static final int INT_BALANCED = Enum.INT_BALANCED;
    static final int INT_SOFT = Enum.INT_SOFT;
    static final int INT_HARSH = Enum.INT_HARSH;
    static final int INT_FLOOD = Enum.INT_FLOOD;
    static final int INT_CONTRASTING = Enum.INT_CONTRASTING;
    static final int INT_MORNING = Enum.INT_MORNING;
    static final int INT_SUNRISE = Enum.INT_SUNRISE;
    static final int INT_SUNSET = Enum.INT_SUNSET;
    static final int INT_CHILLY = Enum.INT_CHILLY;
    static final int INT_FREEZING = Enum.INT_FREEZING;
    static final int INT_FLAT = Enum.INT_FLAT;
    static final int INT_TWO_PT = Enum.INT_TWO_PT;
    static final int INT_GLOW = Enum.INT_GLOW;
    static final int INT_BRIGHT_ROOM = Enum.INT_BRIGHT_ROOM;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STLightRigType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LEGACY_FLAT_1
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
        
        static final int INT_LEGACY_FLAT_1 = 1;
        static final int INT_LEGACY_FLAT_2 = 2;
        static final int INT_LEGACY_FLAT_3 = 3;
        static final int INT_LEGACY_FLAT_4 = 4;
        static final int INT_LEGACY_NORMAL_1 = 5;
        static final int INT_LEGACY_NORMAL_2 = 6;
        static final int INT_LEGACY_NORMAL_3 = 7;
        static final int INT_LEGACY_NORMAL_4 = 8;
        static final int INT_LEGACY_HARSH_1 = 9;
        static final int INT_LEGACY_HARSH_2 = 10;
        static final int INT_LEGACY_HARSH_3 = 11;
        static final int INT_LEGACY_HARSH_4 = 12;
        static final int INT_THREE_PT = 13;
        static final int INT_BALANCED = 14;
        static final int INT_SOFT = 15;
        static final int INT_HARSH = 16;
        static final int INT_FLOOD = 17;
        static final int INT_CONTRASTING = 18;
        static final int INT_MORNING = 19;
        static final int INT_SUNRISE = 20;
        static final int INT_SUNSET = 21;
        static final int INT_CHILLY = 22;
        static final int INT_FREEZING = 23;
        static final int INT_FLAT = 24;
        static final int INT_TWO_PT = 25;
        static final int INT_GLOW = 26;
        static final int INT_BRIGHT_ROOM = 27;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("legacyFlat1", INT_LEGACY_FLAT_1),
                new Enum("legacyFlat2", INT_LEGACY_FLAT_2),
                new Enum("legacyFlat3", INT_LEGACY_FLAT_3),
                new Enum("legacyFlat4", INT_LEGACY_FLAT_4),
                new Enum("legacyNormal1", INT_LEGACY_NORMAL_1),
                new Enum("legacyNormal2", INT_LEGACY_NORMAL_2),
                new Enum("legacyNormal3", INT_LEGACY_NORMAL_3),
                new Enum("legacyNormal4", INT_LEGACY_NORMAL_4),
                new Enum("legacyHarsh1", INT_LEGACY_HARSH_1),
                new Enum("legacyHarsh2", INT_LEGACY_HARSH_2),
                new Enum("legacyHarsh3", INT_LEGACY_HARSH_3),
                new Enum("legacyHarsh4", INT_LEGACY_HARSH_4),
                new Enum("threePt", INT_THREE_PT),
                new Enum("balanced", INT_BALANCED),
                new Enum("soft", INT_SOFT),
                new Enum("harsh", INT_HARSH),
                new Enum("flood", INT_FLOOD),
                new Enum("contrasting", INT_CONTRASTING),
                new Enum("morning", INT_MORNING),
                new Enum("sunrise", INT_SUNRISE),
                new Enum("sunset", INT_SUNSET),
                new Enum("chilly", INT_CHILLY),
                new Enum("freezing", INT_FREEZING),
                new Enum("flat", INT_FLAT),
                new Enum("twoPt", INT_TWO_PT),
                new Enum("glow", INT_GLOW),
                new Enum("brightRoom", INT_BRIGHT_ROOM),
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
