/*
 * XML Type:  ST_ShapeType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.STShapeType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main;


/**
 * An XML ST_ShapeType(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.
 */
public interface STShapeType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STShapeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stshapetype069ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LINE = Enum.forString("line");
    static final Enum LINE_INV = Enum.forString("lineInv");
    static final Enum TRIANGLE = Enum.forString("triangle");
    static final Enum RT_TRIANGLE = Enum.forString("rtTriangle");
    static final Enum RECT = Enum.forString("rect");
    static final Enum DIAMOND = Enum.forString("diamond");
    static final Enum PARALLELOGRAM = Enum.forString("parallelogram");
    static final Enum TRAPEZOID = Enum.forString("trapezoid");
    static final Enum NON_ISOSCELES_TRAPEZOID = Enum.forString("nonIsoscelesTrapezoid");
    static final Enum PENTAGON = Enum.forString("pentagon");
    static final Enum HEXAGON = Enum.forString("hexagon");
    static final Enum HEPTAGON = Enum.forString("heptagon");
    static final Enum OCTAGON = Enum.forString("octagon");
    static final Enum DECAGON = Enum.forString("decagon");
    static final Enum DODECAGON = Enum.forString("dodecagon");
    static final Enum STAR_4 = Enum.forString("star4");
    static final Enum STAR_5 = Enum.forString("star5");
    static final Enum STAR_6 = Enum.forString("star6");
    static final Enum STAR_7 = Enum.forString("star7");
    static final Enum STAR_8 = Enum.forString("star8");
    static final Enum STAR_10 = Enum.forString("star10");
    static final Enum STAR_12 = Enum.forString("star12");
    static final Enum STAR_16 = Enum.forString("star16");
    static final Enum STAR_24 = Enum.forString("star24");
    static final Enum STAR_32 = Enum.forString("star32");
    static final Enum ROUND_RECT = Enum.forString("roundRect");
    static final Enum ROUND_1_RECT = Enum.forString("round1Rect");
    static final Enum ROUND_2_SAME_RECT = Enum.forString("round2SameRect");
    static final Enum ROUND_2_DIAG_RECT = Enum.forString("round2DiagRect");
    static final Enum SNIP_ROUND_RECT = Enum.forString("snipRoundRect");
    static final Enum SNIP_1_RECT = Enum.forString("snip1Rect");
    static final Enum SNIP_2_SAME_RECT = Enum.forString("snip2SameRect");
    static final Enum SNIP_2_DIAG_RECT = Enum.forString("snip2DiagRect");
    static final Enum PLAQUE = Enum.forString("plaque");
    static final Enum ELLIPSE = Enum.forString("ellipse");
    static final Enum TEARDROP = Enum.forString("teardrop");
    static final Enum HOME_PLATE = Enum.forString("homePlate");
    static final Enum CHEVRON = Enum.forString("chevron");
    static final Enum PIE_WEDGE = Enum.forString("pieWedge");
    static final Enum PIE = Enum.forString("pie");
    static final Enum BLOCK_ARC = Enum.forString("blockArc");
    static final Enum DONUT = Enum.forString("donut");
    static final Enum NO_SMOKING = Enum.forString("noSmoking");
    static final Enum RIGHT_ARROW = Enum.forString("rightArrow");
    static final Enum LEFT_ARROW = Enum.forString("leftArrow");
    static final Enum UP_ARROW = Enum.forString("upArrow");
    static final Enum DOWN_ARROW = Enum.forString("downArrow");
    static final Enum STRIPED_RIGHT_ARROW = Enum.forString("stripedRightArrow");
    static final Enum NOTCHED_RIGHT_ARROW = Enum.forString("notchedRightArrow");
    static final Enum BENT_UP_ARROW = Enum.forString("bentUpArrow");
    static final Enum LEFT_RIGHT_ARROW = Enum.forString("leftRightArrow");
    static final Enum UP_DOWN_ARROW = Enum.forString("upDownArrow");
    static final Enum LEFT_UP_ARROW = Enum.forString("leftUpArrow");
    static final Enum LEFT_RIGHT_UP_ARROW = Enum.forString("leftRightUpArrow");
    static final Enum QUAD_ARROW = Enum.forString("quadArrow");
    static final Enum LEFT_ARROW_CALLOUT = Enum.forString("leftArrowCallout");
    static final Enum RIGHT_ARROW_CALLOUT = Enum.forString("rightArrowCallout");
    static final Enum UP_ARROW_CALLOUT = Enum.forString("upArrowCallout");
    static final Enum DOWN_ARROW_CALLOUT = Enum.forString("downArrowCallout");
    static final Enum LEFT_RIGHT_ARROW_CALLOUT = Enum.forString("leftRightArrowCallout");
    static final Enum UP_DOWN_ARROW_CALLOUT = Enum.forString("upDownArrowCallout");
    static final Enum QUAD_ARROW_CALLOUT = Enum.forString("quadArrowCallout");
    static final Enum BENT_ARROW = Enum.forString("bentArrow");
    static final Enum UTURN_ARROW = Enum.forString("uturnArrow");
    static final Enum CIRCULAR_ARROW = Enum.forString("circularArrow");
    static final Enum LEFT_CIRCULAR_ARROW = Enum.forString("leftCircularArrow");
    static final Enum LEFT_RIGHT_CIRCULAR_ARROW = Enum.forString("leftRightCircularArrow");
    static final Enum CURVED_RIGHT_ARROW = Enum.forString("curvedRightArrow");
    static final Enum CURVED_LEFT_ARROW = Enum.forString("curvedLeftArrow");
    static final Enum CURVED_UP_ARROW = Enum.forString("curvedUpArrow");
    static final Enum CURVED_DOWN_ARROW = Enum.forString("curvedDownArrow");
    static final Enum SWOOSH_ARROW = Enum.forString("swooshArrow");
    static final Enum CUBE = Enum.forString("cube");
    static final Enum CAN = Enum.forString("can");
    static final Enum LIGHTNING_BOLT = Enum.forString("lightningBolt");
    static final Enum HEART = Enum.forString("heart");
    static final Enum SUN = Enum.forString("sun");
    static final Enum MOON = Enum.forString("moon");
    static final Enum SMILEY_FACE = Enum.forString("smileyFace");
    static final Enum IRREGULAR_SEAL_1 = Enum.forString("irregularSeal1");
    static final Enum IRREGULAR_SEAL_2 = Enum.forString("irregularSeal2");
    static final Enum FOLDED_CORNER = Enum.forString("foldedCorner");
    static final Enum BEVEL = Enum.forString("bevel");
    static final Enum FRAME = Enum.forString("frame");
    static final Enum HALF_FRAME = Enum.forString("halfFrame");
    static final Enum CORNER = Enum.forString("corner");
    static final Enum DIAG_STRIPE = Enum.forString("diagStripe");
    static final Enum CHORD = Enum.forString("chord");
    static final Enum ARC = Enum.forString("arc");
    static final Enum LEFT_BRACKET = Enum.forString("leftBracket");
    static final Enum RIGHT_BRACKET = Enum.forString("rightBracket");
    static final Enum LEFT_BRACE = Enum.forString("leftBrace");
    static final Enum RIGHT_BRACE = Enum.forString("rightBrace");
    static final Enum BRACKET_PAIR = Enum.forString("bracketPair");
    static final Enum BRACE_PAIR = Enum.forString("bracePair");
    static final Enum STRAIGHT_CONNECTOR_1 = Enum.forString("straightConnector1");
    static final Enum BENT_CONNECTOR_2 = Enum.forString("bentConnector2");
    static final Enum BENT_CONNECTOR_3 = Enum.forString("bentConnector3");
    static final Enum BENT_CONNECTOR_4 = Enum.forString("bentConnector4");
    static final Enum BENT_CONNECTOR_5 = Enum.forString("bentConnector5");
    static final Enum CURVED_CONNECTOR_2 = Enum.forString("curvedConnector2");
    static final Enum CURVED_CONNECTOR_3 = Enum.forString("curvedConnector3");
    static final Enum CURVED_CONNECTOR_4 = Enum.forString("curvedConnector4");
    static final Enum CURVED_CONNECTOR_5 = Enum.forString("curvedConnector5");
    static final Enum CALLOUT_1 = Enum.forString("callout1");
    static final Enum CALLOUT_2 = Enum.forString("callout2");
    static final Enum CALLOUT_3 = Enum.forString("callout3");
    static final Enum ACCENT_CALLOUT_1 = Enum.forString("accentCallout1");
    static final Enum ACCENT_CALLOUT_2 = Enum.forString("accentCallout2");
    static final Enum ACCENT_CALLOUT_3 = Enum.forString("accentCallout3");
    static final Enum BORDER_CALLOUT_1 = Enum.forString("borderCallout1");
    static final Enum BORDER_CALLOUT_2 = Enum.forString("borderCallout2");
    static final Enum BORDER_CALLOUT_3 = Enum.forString("borderCallout3");
    static final Enum ACCENT_BORDER_CALLOUT_1 = Enum.forString("accentBorderCallout1");
    static final Enum ACCENT_BORDER_CALLOUT_2 = Enum.forString("accentBorderCallout2");
    static final Enum ACCENT_BORDER_CALLOUT_3 = Enum.forString("accentBorderCallout3");
    static final Enum WEDGE_RECT_CALLOUT = Enum.forString("wedgeRectCallout");
    static final Enum WEDGE_ROUND_RECT_CALLOUT = Enum.forString("wedgeRoundRectCallout");
    static final Enum WEDGE_ELLIPSE_CALLOUT = Enum.forString("wedgeEllipseCallout");
    static final Enum CLOUD_CALLOUT = Enum.forString("cloudCallout");
    static final Enum CLOUD = Enum.forString("cloud");
    static final Enum RIBBON = Enum.forString("ribbon");
    static final Enum RIBBON_2 = Enum.forString("ribbon2");
    static final Enum ELLIPSE_RIBBON = Enum.forString("ellipseRibbon");
    static final Enum ELLIPSE_RIBBON_2 = Enum.forString("ellipseRibbon2");
    static final Enum LEFT_RIGHT_RIBBON = Enum.forString("leftRightRibbon");
    static final Enum VERTICAL_SCROLL = Enum.forString("verticalScroll");
    static final Enum HORIZONTAL_SCROLL = Enum.forString("horizontalScroll");
    static final Enum WAVE = Enum.forString("wave");
    static final Enum DOUBLE_WAVE = Enum.forString("doubleWave");
    static final Enum PLUS = Enum.forString("plus");
    static final Enum FLOW_CHART_PROCESS = Enum.forString("flowChartProcess");
    static final Enum FLOW_CHART_DECISION = Enum.forString("flowChartDecision");
    static final Enum FLOW_CHART_INPUT_OUTPUT = Enum.forString("flowChartInputOutput");
    static final Enum FLOW_CHART_PREDEFINED_PROCESS = Enum.forString("flowChartPredefinedProcess");
    static final Enum FLOW_CHART_INTERNAL_STORAGE = Enum.forString("flowChartInternalStorage");
    static final Enum FLOW_CHART_DOCUMENT = Enum.forString("flowChartDocument");
    static final Enum FLOW_CHART_MULTIDOCUMENT = Enum.forString("flowChartMultidocument");
    static final Enum FLOW_CHART_TERMINATOR = Enum.forString("flowChartTerminator");
    static final Enum FLOW_CHART_PREPARATION = Enum.forString("flowChartPreparation");
    static final Enum FLOW_CHART_MANUAL_INPUT = Enum.forString("flowChartManualInput");
    static final Enum FLOW_CHART_MANUAL_OPERATION = Enum.forString("flowChartManualOperation");
    static final Enum FLOW_CHART_CONNECTOR = Enum.forString("flowChartConnector");
    static final Enum FLOW_CHART_PUNCHED_CARD = Enum.forString("flowChartPunchedCard");
    static final Enum FLOW_CHART_PUNCHED_TAPE = Enum.forString("flowChartPunchedTape");
    static final Enum FLOW_CHART_SUMMING_JUNCTION = Enum.forString("flowChartSummingJunction");
    static final Enum FLOW_CHART_OR = Enum.forString("flowChartOr");
    static final Enum FLOW_CHART_COLLATE = Enum.forString("flowChartCollate");
    static final Enum FLOW_CHART_SORT = Enum.forString("flowChartSort");
    static final Enum FLOW_CHART_EXTRACT = Enum.forString("flowChartExtract");
    static final Enum FLOW_CHART_MERGE = Enum.forString("flowChartMerge");
    static final Enum FLOW_CHART_OFFLINE_STORAGE = Enum.forString("flowChartOfflineStorage");
    static final Enum FLOW_CHART_ONLINE_STORAGE = Enum.forString("flowChartOnlineStorage");
    static final Enum FLOW_CHART_MAGNETIC_TAPE = Enum.forString("flowChartMagneticTape");
    static final Enum FLOW_CHART_MAGNETIC_DISK = Enum.forString("flowChartMagneticDisk");
    static final Enum FLOW_CHART_MAGNETIC_DRUM = Enum.forString("flowChartMagneticDrum");
    static final Enum FLOW_CHART_DISPLAY = Enum.forString("flowChartDisplay");
    static final Enum FLOW_CHART_DELAY = Enum.forString("flowChartDelay");
    static final Enum FLOW_CHART_ALTERNATE_PROCESS = Enum.forString("flowChartAlternateProcess");
    static final Enum FLOW_CHART_OFFPAGE_CONNECTOR = Enum.forString("flowChartOffpageConnector");
    static final Enum ACTION_BUTTON_BLANK = Enum.forString("actionButtonBlank");
    static final Enum ACTION_BUTTON_HOME = Enum.forString("actionButtonHome");
    static final Enum ACTION_BUTTON_HELP = Enum.forString("actionButtonHelp");
    static final Enum ACTION_BUTTON_INFORMATION = Enum.forString("actionButtonInformation");
    static final Enum ACTION_BUTTON_FORWARD_NEXT = Enum.forString("actionButtonForwardNext");
    static final Enum ACTION_BUTTON_BACK_PREVIOUS = Enum.forString("actionButtonBackPrevious");
    static final Enum ACTION_BUTTON_END = Enum.forString("actionButtonEnd");
    static final Enum ACTION_BUTTON_BEGINNING = Enum.forString("actionButtonBeginning");
    static final Enum ACTION_BUTTON_RETURN = Enum.forString("actionButtonReturn");
    static final Enum ACTION_BUTTON_DOCUMENT = Enum.forString("actionButtonDocument");
    static final Enum ACTION_BUTTON_SOUND = Enum.forString("actionButtonSound");
    static final Enum ACTION_BUTTON_MOVIE = Enum.forString("actionButtonMovie");
    static final Enum GEAR_6 = Enum.forString("gear6");
    static final Enum GEAR_9 = Enum.forString("gear9");
    static final Enum FUNNEL = Enum.forString("funnel");
    static final Enum MATH_PLUS = Enum.forString("mathPlus");
    static final Enum MATH_MINUS = Enum.forString("mathMinus");
    static final Enum MATH_MULTIPLY = Enum.forString("mathMultiply");
    static final Enum MATH_DIVIDE = Enum.forString("mathDivide");
    static final Enum MATH_EQUAL = Enum.forString("mathEqual");
    static final Enum MATH_NOT_EQUAL = Enum.forString("mathNotEqual");
    static final Enum CORNER_TABS = Enum.forString("cornerTabs");
    static final Enum SQUARE_TABS = Enum.forString("squareTabs");
    static final Enum PLAQUE_TABS = Enum.forString("plaqueTabs");
    static final Enum CHART_X = Enum.forString("chartX");
    static final Enum CHART_STAR = Enum.forString("chartStar");
    static final Enum CHART_PLUS = Enum.forString("chartPlus");
    
    static final int INT_LINE = Enum.INT_LINE;
    static final int INT_LINE_INV = Enum.INT_LINE_INV;
    static final int INT_TRIANGLE = Enum.INT_TRIANGLE;
    static final int INT_RT_TRIANGLE = Enum.INT_RT_TRIANGLE;
    static final int INT_RECT = Enum.INT_RECT;
    static final int INT_DIAMOND = Enum.INT_DIAMOND;
    static final int INT_PARALLELOGRAM = Enum.INT_PARALLELOGRAM;
    static final int INT_TRAPEZOID = Enum.INT_TRAPEZOID;
    static final int INT_NON_ISOSCELES_TRAPEZOID = Enum.INT_NON_ISOSCELES_TRAPEZOID;
    static final int INT_PENTAGON = Enum.INT_PENTAGON;
    static final int INT_HEXAGON = Enum.INT_HEXAGON;
    static final int INT_HEPTAGON = Enum.INT_HEPTAGON;
    static final int INT_OCTAGON = Enum.INT_OCTAGON;
    static final int INT_DECAGON = Enum.INT_DECAGON;
    static final int INT_DODECAGON = Enum.INT_DODECAGON;
    static final int INT_STAR_4 = Enum.INT_STAR_4;
    static final int INT_STAR_5 = Enum.INT_STAR_5;
    static final int INT_STAR_6 = Enum.INT_STAR_6;
    static final int INT_STAR_7 = Enum.INT_STAR_7;
    static final int INT_STAR_8 = Enum.INT_STAR_8;
    static final int INT_STAR_10 = Enum.INT_STAR_10;
    static final int INT_STAR_12 = Enum.INT_STAR_12;
    static final int INT_STAR_16 = Enum.INT_STAR_16;
    static final int INT_STAR_24 = Enum.INT_STAR_24;
    static final int INT_STAR_32 = Enum.INT_STAR_32;
    static final int INT_ROUND_RECT = Enum.INT_ROUND_RECT;
    static final int INT_ROUND_1_RECT = Enum.INT_ROUND_1_RECT;
    static final int INT_ROUND_2_SAME_RECT = Enum.INT_ROUND_2_SAME_RECT;
    static final int INT_ROUND_2_DIAG_RECT = Enum.INT_ROUND_2_DIAG_RECT;
    static final int INT_SNIP_ROUND_RECT = Enum.INT_SNIP_ROUND_RECT;
    static final int INT_SNIP_1_RECT = Enum.INT_SNIP_1_RECT;
    static final int INT_SNIP_2_SAME_RECT = Enum.INT_SNIP_2_SAME_RECT;
    static final int INT_SNIP_2_DIAG_RECT = Enum.INT_SNIP_2_DIAG_RECT;
    static final int INT_PLAQUE = Enum.INT_PLAQUE;
    static final int INT_ELLIPSE = Enum.INT_ELLIPSE;
    static final int INT_TEARDROP = Enum.INT_TEARDROP;
    static final int INT_HOME_PLATE = Enum.INT_HOME_PLATE;
    static final int INT_CHEVRON = Enum.INT_CHEVRON;
    static final int INT_PIE_WEDGE = Enum.INT_PIE_WEDGE;
    static final int INT_PIE = Enum.INT_PIE;
    static final int INT_BLOCK_ARC = Enum.INT_BLOCK_ARC;
    static final int INT_DONUT = Enum.INT_DONUT;
    static final int INT_NO_SMOKING = Enum.INT_NO_SMOKING;
    static final int INT_RIGHT_ARROW = Enum.INT_RIGHT_ARROW;
    static final int INT_LEFT_ARROW = Enum.INT_LEFT_ARROW;
    static final int INT_UP_ARROW = Enum.INT_UP_ARROW;
    static final int INT_DOWN_ARROW = Enum.INT_DOWN_ARROW;
    static final int INT_STRIPED_RIGHT_ARROW = Enum.INT_STRIPED_RIGHT_ARROW;
    static final int INT_NOTCHED_RIGHT_ARROW = Enum.INT_NOTCHED_RIGHT_ARROW;
    static final int INT_BENT_UP_ARROW = Enum.INT_BENT_UP_ARROW;
    static final int INT_LEFT_RIGHT_ARROW = Enum.INT_LEFT_RIGHT_ARROW;
    static final int INT_UP_DOWN_ARROW = Enum.INT_UP_DOWN_ARROW;
    static final int INT_LEFT_UP_ARROW = Enum.INT_LEFT_UP_ARROW;
    static final int INT_LEFT_RIGHT_UP_ARROW = Enum.INT_LEFT_RIGHT_UP_ARROW;
    static final int INT_QUAD_ARROW = Enum.INT_QUAD_ARROW;
    static final int INT_LEFT_ARROW_CALLOUT = Enum.INT_LEFT_ARROW_CALLOUT;
    static final int INT_RIGHT_ARROW_CALLOUT = Enum.INT_RIGHT_ARROW_CALLOUT;
    static final int INT_UP_ARROW_CALLOUT = Enum.INT_UP_ARROW_CALLOUT;
    static final int INT_DOWN_ARROW_CALLOUT = Enum.INT_DOWN_ARROW_CALLOUT;
    static final int INT_LEFT_RIGHT_ARROW_CALLOUT = Enum.INT_LEFT_RIGHT_ARROW_CALLOUT;
    static final int INT_UP_DOWN_ARROW_CALLOUT = Enum.INT_UP_DOWN_ARROW_CALLOUT;
    static final int INT_QUAD_ARROW_CALLOUT = Enum.INT_QUAD_ARROW_CALLOUT;
    static final int INT_BENT_ARROW = Enum.INT_BENT_ARROW;
    static final int INT_UTURN_ARROW = Enum.INT_UTURN_ARROW;
    static final int INT_CIRCULAR_ARROW = Enum.INT_CIRCULAR_ARROW;
    static final int INT_LEFT_CIRCULAR_ARROW = Enum.INT_LEFT_CIRCULAR_ARROW;
    static final int INT_LEFT_RIGHT_CIRCULAR_ARROW = Enum.INT_LEFT_RIGHT_CIRCULAR_ARROW;
    static final int INT_CURVED_RIGHT_ARROW = Enum.INT_CURVED_RIGHT_ARROW;
    static final int INT_CURVED_LEFT_ARROW = Enum.INT_CURVED_LEFT_ARROW;
    static final int INT_CURVED_UP_ARROW = Enum.INT_CURVED_UP_ARROW;
    static final int INT_CURVED_DOWN_ARROW = Enum.INT_CURVED_DOWN_ARROW;
    static final int INT_SWOOSH_ARROW = Enum.INT_SWOOSH_ARROW;
    static final int INT_CUBE = Enum.INT_CUBE;
    static final int INT_CAN = Enum.INT_CAN;
    static final int INT_LIGHTNING_BOLT = Enum.INT_LIGHTNING_BOLT;
    static final int INT_HEART = Enum.INT_HEART;
    static final int INT_SUN = Enum.INT_SUN;
    static final int INT_MOON = Enum.INT_MOON;
    static final int INT_SMILEY_FACE = Enum.INT_SMILEY_FACE;
    static final int INT_IRREGULAR_SEAL_1 = Enum.INT_IRREGULAR_SEAL_1;
    static final int INT_IRREGULAR_SEAL_2 = Enum.INT_IRREGULAR_SEAL_2;
    static final int INT_FOLDED_CORNER = Enum.INT_FOLDED_CORNER;
    static final int INT_BEVEL = Enum.INT_BEVEL;
    static final int INT_FRAME = Enum.INT_FRAME;
    static final int INT_HALF_FRAME = Enum.INT_HALF_FRAME;
    static final int INT_CORNER = Enum.INT_CORNER;
    static final int INT_DIAG_STRIPE = Enum.INT_DIAG_STRIPE;
    static final int INT_CHORD = Enum.INT_CHORD;
    static final int INT_ARC = Enum.INT_ARC;
    static final int INT_LEFT_BRACKET = Enum.INT_LEFT_BRACKET;
    static final int INT_RIGHT_BRACKET = Enum.INT_RIGHT_BRACKET;
    static final int INT_LEFT_BRACE = Enum.INT_LEFT_BRACE;
    static final int INT_RIGHT_BRACE = Enum.INT_RIGHT_BRACE;
    static final int INT_BRACKET_PAIR = Enum.INT_BRACKET_PAIR;
    static final int INT_BRACE_PAIR = Enum.INT_BRACE_PAIR;
    static final int INT_STRAIGHT_CONNECTOR_1 = Enum.INT_STRAIGHT_CONNECTOR_1;
    static final int INT_BENT_CONNECTOR_2 = Enum.INT_BENT_CONNECTOR_2;
    static final int INT_BENT_CONNECTOR_3 = Enum.INT_BENT_CONNECTOR_3;
    static final int INT_BENT_CONNECTOR_4 = Enum.INT_BENT_CONNECTOR_4;
    static final int INT_BENT_CONNECTOR_5 = Enum.INT_BENT_CONNECTOR_5;
    static final int INT_CURVED_CONNECTOR_2 = Enum.INT_CURVED_CONNECTOR_2;
    static final int INT_CURVED_CONNECTOR_3 = Enum.INT_CURVED_CONNECTOR_3;
    static final int INT_CURVED_CONNECTOR_4 = Enum.INT_CURVED_CONNECTOR_4;
    static final int INT_CURVED_CONNECTOR_5 = Enum.INT_CURVED_CONNECTOR_5;
    static final int INT_CALLOUT_1 = Enum.INT_CALLOUT_1;
    static final int INT_CALLOUT_2 = Enum.INT_CALLOUT_2;
    static final int INT_CALLOUT_3 = Enum.INT_CALLOUT_3;
    static final int INT_ACCENT_CALLOUT_1 = Enum.INT_ACCENT_CALLOUT_1;
    static final int INT_ACCENT_CALLOUT_2 = Enum.INT_ACCENT_CALLOUT_2;
    static final int INT_ACCENT_CALLOUT_3 = Enum.INT_ACCENT_CALLOUT_3;
    static final int INT_BORDER_CALLOUT_1 = Enum.INT_BORDER_CALLOUT_1;
    static final int INT_BORDER_CALLOUT_2 = Enum.INT_BORDER_CALLOUT_2;
    static final int INT_BORDER_CALLOUT_3 = Enum.INT_BORDER_CALLOUT_3;
    static final int INT_ACCENT_BORDER_CALLOUT_1 = Enum.INT_ACCENT_BORDER_CALLOUT_1;
    static final int INT_ACCENT_BORDER_CALLOUT_2 = Enum.INT_ACCENT_BORDER_CALLOUT_2;
    static final int INT_ACCENT_BORDER_CALLOUT_3 = Enum.INT_ACCENT_BORDER_CALLOUT_3;
    static final int INT_WEDGE_RECT_CALLOUT = Enum.INT_WEDGE_RECT_CALLOUT;
    static final int INT_WEDGE_ROUND_RECT_CALLOUT = Enum.INT_WEDGE_ROUND_RECT_CALLOUT;
    static final int INT_WEDGE_ELLIPSE_CALLOUT = Enum.INT_WEDGE_ELLIPSE_CALLOUT;
    static final int INT_CLOUD_CALLOUT = Enum.INT_CLOUD_CALLOUT;
    static final int INT_CLOUD = Enum.INT_CLOUD;
    static final int INT_RIBBON = Enum.INT_RIBBON;
    static final int INT_RIBBON_2 = Enum.INT_RIBBON_2;
    static final int INT_ELLIPSE_RIBBON = Enum.INT_ELLIPSE_RIBBON;
    static final int INT_ELLIPSE_RIBBON_2 = Enum.INT_ELLIPSE_RIBBON_2;
    static final int INT_LEFT_RIGHT_RIBBON = Enum.INT_LEFT_RIGHT_RIBBON;
    static final int INT_VERTICAL_SCROLL = Enum.INT_VERTICAL_SCROLL;
    static final int INT_HORIZONTAL_SCROLL = Enum.INT_HORIZONTAL_SCROLL;
    static final int INT_WAVE = Enum.INT_WAVE;
    static final int INT_DOUBLE_WAVE = Enum.INT_DOUBLE_WAVE;
    static final int INT_PLUS = Enum.INT_PLUS;
    static final int INT_FLOW_CHART_PROCESS = Enum.INT_FLOW_CHART_PROCESS;
    static final int INT_FLOW_CHART_DECISION = Enum.INT_FLOW_CHART_DECISION;
    static final int INT_FLOW_CHART_INPUT_OUTPUT = Enum.INT_FLOW_CHART_INPUT_OUTPUT;
    static final int INT_FLOW_CHART_PREDEFINED_PROCESS = Enum.INT_FLOW_CHART_PREDEFINED_PROCESS;
    static final int INT_FLOW_CHART_INTERNAL_STORAGE = Enum.INT_FLOW_CHART_INTERNAL_STORAGE;
    static final int INT_FLOW_CHART_DOCUMENT = Enum.INT_FLOW_CHART_DOCUMENT;
    static final int INT_FLOW_CHART_MULTIDOCUMENT = Enum.INT_FLOW_CHART_MULTIDOCUMENT;
    static final int INT_FLOW_CHART_TERMINATOR = Enum.INT_FLOW_CHART_TERMINATOR;
    static final int INT_FLOW_CHART_PREPARATION = Enum.INT_FLOW_CHART_PREPARATION;
    static final int INT_FLOW_CHART_MANUAL_INPUT = Enum.INT_FLOW_CHART_MANUAL_INPUT;
    static final int INT_FLOW_CHART_MANUAL_OPERATION = Enum.INT_FLOW_CHART_MANUAL_OPERATION;
    static final int INT_FLOW_CHART_CONNECTOR = Enum.INT_FLOW_CHART_CONNECTOR;
    static final int INT_FLOW_CHART_PUNCHED_CARD = Enum.INT_FLOW_CHART_PUNCHED_CARD;
    static final int INT_FLOW_CHART_PUNCHED_TAPE = Enum.INT_FLOW_CHART_PUNCHED_TAPE;
    static final int INT_FLOW_CHART_SUMMING_JUNCTION = Enum.INT_FLOW_CHART_SUMMING_JUNCTION;
    static final int INT_FLOW_CHART_OR = Enum.INT_FLOW_CHART_OR;
    static final int INT_FLOW_CHART_COLLATE = Enum.INT_FLOW_CHART_COLLATE;
    static final int INT_FLOW_CHART_SORT = Enum.INT_FLOW_CHART_SORT;
    static final int INT_FLOW_CHART_EXTRACT = Enum.INT_FLOW_CHART_EXTRACT;
    static final int INT_FLOW_CHART_MERGE = Enum.INT_FLOW_CHART_MERGE;
    static final int INT_FLOW_CHART_OFFLINE_STORAGE = Enum.INT_FLOW_CHART_OFFLINE_STORAGE;
    static final int INT_FLOW_CHART_ONLINE_STORAGE = Enum.INT_FLOW_CHART_ONLINE_STORAGE;
    static final int INT_FLOW_CHART_MAGNETIC_TAPE = Enum.INT_FLOW_CHART_MAGNETIC_TAPE;
    static final int INT_FLOW_CHART_MAGNETIC_DISK = Enum.INT_FLOW_CHART_MAGNETIC_DISK;
    static final int INT_FLOW_CHART_MAGNETIC_DRUM = Enum.INT_FLOW_CHART_MAGNETIC_DRUM;
    static final int INT_FLOW_CHART_DISPLAY = Enum.INT_FLOW_CHART_DISPLAY;
    static final int INT_FLOW_CHART_DELAY = Enum.INT_FLOW_CHART_DELAY;
    static final int INT_FLOW_CHART_ALTERNATE_PROCESS = Enum.INT_FLOW_CHART_ALTERNATE_PROCESS;
    static final int INT_FLOW_CHART_OFFPAGE_CONNECTOR = Enum.INT_FLOW_CHART_OFFPAGE_CONNECTOR;
    static final int INT_ACTION_BUTTON_BLANK = Enum.INT_ACTION_BUTTON_BLANK;
    static final int INT_ACTION_BUTTON_HOME = Enum.INT_ACTION_BUTTON_HOME;
    static final int INT_ACTION_BUTTON_HELP = Enum.INT_ACTION_BUTTON_HELP;
    static final int INT_ACTION_BUTTON_INFORMATION = Enum.INT_ACTION_BUTTON_INFORMATION;
    static final int INT_ACTION_BUTTON_FORWARD_NEXT = Enum.INT_ACTION_BUTTON_FORWARD_NEXT;
    static final int INT_ACTION_BUTTON_BACK_PREVIOUS = Enum.INT_ACTION_BUTTON_BACK_PREVIOUS;
    static final int INT_ACTION_BUTTON_END = Enum.INT_ACTION_BUTTON_END;
    static final int INT_ACTION_BUTTON_BEGINNING = Enum.INT_ACTION_BUTTON_BEGINNING;
    static final int INT_ACTION_BUTTON_RETURN = Enum.INT_ACTION_BUTTON_RETURN;
    static final int INT_ACTION_BUTTON_DOCUMENT = Enum.INT_ACTION_BUTTON_DOCUMENT;
    static final int INT_ACTION_BUTTON_SOUND = Enum.INT_ACTION_BUTTON_SOUND;
    static final int INT_ACTION_BUTTON_MOVIE = Enum.INT_ACTION_BUTTON_MOVIE;
    static final int INT_GEAR_6 = Enum.INT_GEAR_6;
    static final int INT_GEAR_9 = Enum.INT_GEAR_9;
    static final int INT_FUNNEL = Enum.INT_FUNNEL;
    static final int INT_MATH_PLUS = Enum.INT_MATH_PLUS;
    static final int INT_MATH_MINUS = Enum.INT_MATH_MINUS;
    static final int INT_MATH_MULTIPLY = Enum.INT_MATH_MULTIPLY;
    static final int INT_MATH_DIVIDE = Enum.INT_MATH_DIVIDE;
    static final int INT_MATH_EQUAL = Enum.INT_MATH_EQUAL;
    static final int INT_MATH_NOT_EQUAL = Enum.INT_MATH_NOT_EQUAL;
    static final int INT_CORNER_TABS = Enum.INT_CORNER_TABS;
    static final int INT_SQUARE_TABS = Enum.INT_SQUARE_TABS;
    static final int INT_PLAQUE_TABS = Enum.INT_PLAQUE_TABS;
    static final int INT_CHART_X = Enum.INT_CHART_X;
    static final int INT_CHART_STAR = Enum.INT_CHART_STAR;
    static final int INT_CHART_PLUS = Enum.INT_CHART_PLUS;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.main.STShapeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LINE
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
        
        static final int INT_LINE = 1;
        static final int INT_LINE_INV = 2;
        static final int INT_TRIANGLE = 3;
        static final int INT_RT_TRIANGLE = 4;
        static final int INT_RECT = 5;
        static final int INT_DIAMOND = 6;
        static final int INT_PARALLELOGRAM = 7;
        static final int INT_TRAPEZOID = 8;
        static final int INT_NON_ISOSCELES_TRAPEZOID = 9;
        static final int INT_PENTAGON = 10;
        static final int INT_HEXAGON = 11;
        static final int INT_HEPTAGON = 12;
        static final int INT_OCTAGON = 13;
        static final int INT_DECAGON = 14;
        static final int INT_DODECAGON = 15;
        static final int INT_STAR_4 = 16;
        static final int INT_STAR_5 = 17;
        static final int INT_STAR_6 = 18;
        static final int INT_STAR_7 = 19;
        static final int INT_STAR_8 = 20;
        static final int INT_STAR_10 = 21;
        static final int INT_STAR_12 = 22;
        static final int INT_STAR_16 = 23;
        static final int INT_STAR_24 = 24;
        static final int INT_STAR_32 = 25;
        static final int INT_ROUND_RECT = 26;
        static final int INT_ROUND_1_RECT = 27;
        static final int INT_ROUND_2_SAME_RECT = 28;
        static final int INT_ROUND_2_DIAG_RECT = 29;
        static final int INT_SNIP_ROUND_RECT = 30;
        static final int INT_SNIP_1_RECT = 31;
        static final int INT_SNIP_2_SAME_RECT = 32;
        static final int INT_SNIP_2_DIAG_RECT = 33;
        static final int INT_PLAQUE = 34;
        static final int INT_ELLIPSE = 35;
        static final int INT_TEARDROP = 36;
        static final int INT_HOME_PLATE = 37;
        static final int INT_CHEVRON = 38;
        static final int INT_PIE_WEDGE = 39;
        static final int INT_PIE = 40;
        static final int INT_BLOCK_ARC = 41;
        static final int INT_DONUT = 42;
        static final int INT_NO_SMOKING = 43;
        static final int INT_RIGHT_ARROW = 44;
        static final int INT_LEFT_ARROW = 45;
        static final int INT_UP_ARROW = 46;
        static final int INT_DOWN_ARROW = 47;
        static final int INT_STRIPED_RIGHT_ARROW = 48;
        static final int INT_NOTCHED_RIGHT_ARROW = 49;
        static final int INT_BENT_UP_ARROW = 50;
        static final int INT_LEFT_RIGHT_ARROW = 51;
        static final int INT_UP_DOWN_ARROW = 52;
        static final int INT_LEFT_UP_ARROW = 53;
        static final int INT_LEFT_RIGHT_UP_ARROW = 54;
        static final int INT_QUAD_ARROW = 55;
        static final int INT_LEFT_ARROW_CALLOUT = 56;
        static final int INT_RIGHT_ARROW_CALLOUT = 57;
        static final int INT_UP_ARROW_CALLOUT = 58;
        static final int INT_DOWN_ARROW_CALLOUT = 59;
        static final int INT_LEFT_RIGHT_ARROW_CALLOUT = 60;
        static final int INT_UP_DOWN_ARROW_CALLOUT = 61;
        static final int INT_QUAD_ARROW_CALLOUT = 62;
        static final int INT_BENT_ARROW = 63;
        static final int INT_UTURN_ARROW = 64;
        static final int INT_CIRCULAR_ARROW = 65;
        static final int INT_LEFT_CIRCULAR_ARROW = 66;
        static final int INT_LEFT_RIGHT_CIRCULAR_ARROW = 67;
        static final int INT_CURVED_RIGHT_ARROW = 68;
        static final int INT_CURVED_LEFT_ARROW = 69;
        static final int INT_CURVED_UP_ARROW = 70;
        static final int INT_CURVED_DOWN_ARROW = 71;
        static final int INT_SWOOSH_ARROW = 72;
        static final int INT_CUBE = 73;
        static final int INT_CAN = 74;
        static final int INT_LIGHTNING_BOLT = 75;
        static final int INT_HEART = 76;
        static final int INT_SUN = 77;
        static final int INT_MOON = 78;
        static final int INT_SMILEY_FACE = 79;
        static final int INT_IRREGULAR_SEAL_1 = 80;
        static final int INT_IRREGULAR_SEAL_2 = 81;
        static final int INT_FOLDED_CORNER = 82;
        static final int INT_BEVEL = 83;
        static final int INT_FRAME = 84;
        static final int INT_HALF_FRAME = 85;
        static final int INT_CORNER = 86;
        static final int INT_DIAG_STRIPE = 87;
        static final int INT_CHORD = 88;
        static final int INT_ARC = 89;
        static final int INT_LEFT_BRACKET = 90;
        static final int INT_RIGHT_BRACKET = 91;
        static final int INT_LEFT_BRACE = 92;
        static final int INT_RIGHT_BRACE = 93;
        static final int INT_BRACKET_PAIR = 94;
        static final int INT_BRACE_PAIR = 95;
        static final int INT_STRAIGHT_CONNECTOR_1 = 96;
        static final int INT_BENT_CONNECTOR_2 = 97;
        static final int INT_BENT_CONNECTOR_3 = 98;
        static final int INT_BENT_CONNECTOR_4 = 99;
        static final int INT_BENT_CONNECTOR_5 = 100;
        static final int INT_CURVED_CONNECTOR_2 = 101;
        static final int INT_CURVED_CONNECTOR_3 = 102;
        static final int INT_CURVED_CONNECTOR_4 = 103;
        static final int INT_CURVED_CONNECTOR_5 = 104;
        static final int INT_CALLOUT_1 = 105;
        static final int INT_CALLOUT_2 = 106;
        static final int INT_CALLOUT_3 = 107;
        static final int INT_ACCENT_CALLOUT_1 = 108;
        static final int INT_ACCENT_CALLOUT_2 = 109;
        static final int INT_ACCENT_CALLOUT_3 = 110;
        static final int INT_BORDER_CALLOUT_1 = 111;
        static final int INT_BORDER_CALLOUT_2 = 112;
        static final int INT_BORDER_CALLOUT_3 = 113;
        static final int INT_ACCENT_BORDER_CALLOUT_1 = 114;
        static final int INT_ACCENT_BORDER_CALLOUT_2 = 115;
        static final int INT_ACCENT_BORDER_CALLOUT_3 = 116;
        static final int INT_WEDGE_RECT_CALLOUT = 117;
        static final int INT_WEDGE_ROUND_RECT_CALLOUT = 118;
        static final int INT_WEDGE_ELLIPSE_CALLOUT = 119;
        static final int INT_CLOUD_CALLOUT = 120;
        static final int INT_CLOUD = 121;
        static final int INT_RIBBON = 122;
        static final int INT_RIBBON_2 = 123;
        static final int INT_ELLIPSE_RIBBON = 124;
        static final int INT_ELLIPSE_RIBBON_2 = 125;
        static final int INT_LEFT_RIGHT_RIBBON = 126;
        static final int INT_VERTICAL_SCROLL = 127;
        static final int INT_HORIZONTAL_SCROLL = 128;
        static final int INT_WAVE = 129;
        static final int INT_DOUBLE_WAVE = 130;
        static final int INT_PLUS = 131;
        static final int INT_FLOW_CHART_PROCESS = 132;
        static final int INT_FLOW_CHART_DECISION = 133;
        static final int INT_FLOW_CHART_INPUT_OUTPUT = 134;
        static final int INT_FLOW_CHART_PREDEFINED_PROCESS = 135;
        static final int INT_FLOW_CHART_INTERNAL_STORAGE = 136;
        static final int INT_FLOW_CHART_DOCUMENT = 137;
        static final int INT_FLOW_CHART_MULTIDOCUMENT = 138;
        static final int INT_FLOW_CHART_TERMINATOR = 139;
        static final int INT_FLOW_CHART_PREPARATION = 140;
        static final int INT_FLOW_CHART_MANUAL_INPUT = 141;
        static final int INT_FLOW_CHART_MANUAL_OPERATION = 142;
        static final int INT_FLOW_CHART_CONNECTOR = 143;
        static final int INT_FLOW_CHART_PUNCHED_CARD = 144;
        static final int INT_FLOW_CHART_PUNCHED_TAPE = 145;
        static final int INT_FLOW_CHART_SUMMING_JUNCTION = 146;
        static final int INT_FLOW_CHART_OR = 147;
        static final int INT_FLOW_CHART_COLLATE = 148;
        static final int INT_FLOW_CHART_SORT = 149;
        static final int INT_FLOW_CHART_EXTRACT = 150;
        static final int INT_FLOW_CHART_MERGE = 151;
        static final int INT_FLOW_CHART_OFFLINE_STORAGE = 152;
        static final int INT_FLOW_CHART_ONLINE_STORAGE = 153;
        static final int INT_FLOW_CHART_MAGNETIC_TAPE = 154;
        static final int INT_FLOW_CHART_MAGNETIC_DISK = 155;
        static final int INT_FLOW_CHART_MAGNETIC_DRUM = 156;
        static final int INT_FLOW_CHART_DISPLAY = 157;
        static final int INT_FLOW_CHART_DELAY = 158;
        static final int INT_FLOW_CHART_ALTERNATE_PROCESS = 159;
        static final int INT_FLOW_CHART_OFFPAGE_CONNECTOR = 160;
        static final int INT_ACTION_BUTTON_BLANK = 161;
        static final int INT_ACTION_BUTTON_HOME = 162;
        static final int INT_ACTION_BUTTON_HELP = 163;
        static final int INT_ACTION_BUTTON_INFORMATION = 164;
        static final int INT_ACTION_BUTTON_FORWARD_NEXT = 165;
        static final int INT_ACTION_BUTTON_BACK_PREVIOUS = 166;
        static final int INT_ACTION_BUTTON_END = 167;
        static final int INT_ACTION_BUTTON_BEGINNING = 168;
        static final int INT_ACTION_BUTTON_RETURN = 169;
        static final int INT_ACTION_BUTTON_DOCUMENT = 170;
        static final int INT_ACTION_BUTTON_SOUND = 171;
        static final int INT_ACTION_BUTTON_MOVIE = 172;
        static final int INT_GEAR_6 = 173;
        static final int INT_GEAR_9 = 174;
        static final int INT_FUNNEL = 175;
        static final int INT_MATH_PLUS = 176;
        static final int INT_MATH_MINUS = 177;
        static final int INT_MATH_MULTIPLY = 178;
        static final int INT_MATH_DIVIDE = 179;
        static final int INT_MATH_EQUAL = 180;
        static final int INT_MATH_NOT_EQUAL = 181;
        static final int INT_CORNER_TABS = 182;
        static final int INT_SQUARE_TABS = 183;
        static final int INT_PLAQUE_TABS = 184;
        static final int INT_CHART_X = 185;
        static final int INT_CHART_STAR = 186;
        static final int INT_CHART_PLUS = 187;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("line", INT_LINE),
                new Enum("lineInv", INT_LINE_INV),
                new Enum("triangle", INT_TRIANGLE),
                new Enum("rtTriangle", INT_RT_TRIANGLE),
                new Enum("rect", INT_RECT),
                new Enum("diamond", INT_DIAMOND),
                new Enum("parallelogram", INT_PARALLELOGRAM),
                new Enum("trapezoid", INT_TRAPEZOID),
                new Enum("nonIsoscelesTrapezoid", INT_NON_ISOSCELES_TRAPEZOID),
                new Enum("pentagon", INT_PENTAGON),
                new Enum("hexagon", INT_HEXAGON),
                new Enum("heptagon", INT_HEPTAGON),
                new Enum("octagon", INT_OCTAGON),
                new Enum("decagon", INT_DECAGON),
                new Enum("dodecagon", INT_DODECAGON),
                new Enum("star4", INT_STAR_4),
                new Enum("star5", INT_STAR_5),
                new Enum("star6", INT_STAR_6),
                new Enum("star7", INT_STAR_7),
                new Enum("star8", INT_STAR_8),
                new Enum("star10", INT_STAR_10),
                new Enum("star12", INT_STAR_12),
                new Enum("star16", INT_STAR_16),
                new Enum("star24", INT_STAR_24),
                new Enum("star32", INT_STAR_32),
                new Enum("roundRect", INT_ROUND_RECT),
                new Enum("round1Rect", INT_ROUND_1_RECT),
                new Enum("round2SameRect", INT_ROUND_2_SAME_RECT),
                new Enum("round2DiagRect", INT_ROUND_2_DIAG_RECT),
                new Enum("snipRoundRect", INT_SNIP_ROUND_RECT),
                new Enum("snip1Rect", INT_SNIP_1_RECT),
                new Enum("snip2SameRect", INT_SNIP_2_SAME_RECT),
                new Enum("snip2DiagRect", INT_SNIP_2_DIAG_RECT),
                new Enum("plaque", INT_PLAQUE),
                new Enum("ellipse", INT_ELLIPSE),
                new Enum("teardrop", INT_TEARDROP),
                new Enum("homePlate", INT_HOME_PLATE),
                new Enum("chevron", INT_CHEVRON),
                new Enum("pieWedge", INT_PIE_WEDGE),
                new Enum("pie", INT_PIE),
                new Enum("blockArc", INT_BLOCK_ARC),
                new Enum("donut", INT_DONUT),
                new Enum("noSmoking", INT_NO_SMOKING),
                new Enum("rightArrow", INT_RIGHT_ARROW),
                new Enum("leftArrow", INT_LEFT_ARROW),
                new Enum("upArrow", INT_UP_ARROW),
                new Enum("downArrow", INT_DOWN_ARROW),
                new Enum("stripedRightArrow", INT_STRIPED_RIGHT_ARROW),
                new Enum("notchedRightArrow", INT_NOTCHED_RIGHT_ARROW),
                new Enum("bentUpArrow", INT_BENT_UP_ARROW),
                new Enum("leftRightArrow", INT_LEFT_RIGHT_ARROW),
                new Enum("upDownArrow", INT_UP_DOWN_ARROW),
                new Enum("leftUpArrow", INT_LEFT_UP_ARROW),
                new Enum("leftRightUpArrow", INT_LEFT_RIGHT_UP_ARROW),
                new Enum("quadArrow", INT_QUAD_ARROW),
                new Enum("leftArrowCallout", INT_LEFT_ARROW_CALLOUT),
                new Enum("rightArrowCallout", INT_RIGHT_ARROW_CALLOUT),
                new Enum("upArrowCallout", INT_UP_ARROW_CALLOUT),
                new Enum("downArrowCallout", INT_DOWN_ARROW_CALLOUT),
                new Enum("leftRightArrowCallout", INT_LEFT_RIGHT_ARROW_CALLOUT),
                new Enum("upDownArrowCallout", INT_UP_DOWN_ARROW_CALLOUT),
                new Enum("quadArrowCallout", INT_QUAD_ARROW_CALLOUT),
                new Enum("bentArrow", INT_BENT_ARROW),
                new Enum("uturnArrow", INT_UTURN_ARROW),
                new Enum("circularArrow", INT_CIRCULAR_ARROW),
                new Enum("leftCircularArrow", INT_LEFT_CIRCULAR_ARROW),
                new Enum("leftRightCircularArrow", INT_LEFT_RIGHT_CIRCULAR_ARROW),
                new Enum("curvedRightArrow", INT_CURVED_RIGHT_ARROW),
                new Enum("curvedLeftArrow", INT_CURVED_LEFT_ARROW),
                new Enum("curvedUpArrow", INT_CURVED_UP_ARROW),
                new Enum("curvedDownArrow", INT_CURVED_DOWN_ARROW),
                new Enum("swooshArrow", INT_SWOOSH_ARROW),
                new Enum("cube", INT_CUBE),
                new Enum("can", INT_CAN),
                new Enum("lightningBolt", INT_LIGHTNING_BOLT),
                new Enum("heart", INT_HEART),
                new Enum("sun", INT_SUN),
                new Enum("moon", INT_MOON),
                new Enum("smileyFace", INT_SMILEY_FACE),
                new Enum("irregularSeal1", INT_IRREGULAR_SEAL_1),
                new Enum("irregularSeal2", INT_IRREGULAR_SEAL_2),
                new Enum("foldedCorner", INT_FOLDED_CORNER),
                new Enum("bevel", INT_BEVEL),
                new Enum("frame", INT_FRAME),
                new Enum("halfFrame", INT_HALF_FRAME),
                new Enum("corner", INT_CORNER),
                new Enum("diagStripe", INT_DIAG_STRIPE),
                new Enum("chord", INT_CHORD),
                new Enum("arc", INT_ARC),
                new Enum("leftBracket", INT_LEFT_BRACKET),
                new Enum("rightBracket", INT_RIGHT_BRACKET),
                new Enum("leftBrace", INT_LEFT_BRACE),
                new Enum("rightBrace", INT_RIGHT_BRACE),
                new Enum("bracketPair", INT_BRACKET_PAIR),
                new Enum("bracePair", INT_BRACE_PAIR),
                new Enum("straightConnector1", INT_STRAIGHT_CONNECTOR_1),
                new Enum("bentConnector2", INT_BENT_CONNECTOR_2),
                new Enum("bentConnector3", INT_BENT_CONNECTOR_3),
                new Enum("bentConnector4", INT_BENT_CONNECTOR_4),
                new Enum("bentConnector5", INT_BENT_CONNECTOR_5),
                new Enum("curvedConnector2", INT_CURVED_CONNECTOR_2),
                new Enum("curvedConnector3", INT_CURVED_CONNECTOR_3),
                new Enum("curvedConnector4", INT_CURVED_CONNECTOR_4),
                new Enum("curvedConnector5", INT_CURVED_CONNECTOR_5),
                new Enum("callout1", INT_CALLOUT_1),
                new Enum("callout2", INT_CALLOUT_2),
                new Enum("callout3", INT_CALLOUT_3),
                new Enum("accentCallout1", INT_ACCENT_CALLOUT_1),
                new Enum("accentCallout2", INT_ACCENT_CALLOUT_2),
                new Enum("accentCallout3", INT_ACCENT_CALLOUT_3),
                new Enum("borderCallout1", INT_BORDER_CALLOUT_1),
                new Enum("borderCallout2", INT_BORDER_CALLOUT_2),
                new Enum("borderCallout3", INT_BORDER_CALLOUT_3),
                new Enum("accentBorderCallout1", INT_ACCENT_BORDER_CALLOUT_1),
                new Enum("accentBorderCallout2", INT_ACCENT_BORDER_CALLOUT_2),
                new Enum("accentBorderCallout3", INT_ACCENT_BORDER_CALLOUT_3),
                new Enum("wedgeRectCallout", INT_WEDGE_RECT_CALLOUT),
                new Enum("wedgeRoundRectCallout", INT_WEDGE_ROUND_RECT_CALLOUT),
                new Enum("wedgeEllipseCallout", INT_WEDGE_ELLIPSE_CALLOUT),
                new Enum("cloudCallout", INT_CLOUD_CALLOUT),
                new Enum("cloud", INT_CLOUD),
                new Enum("ribbon", INT_RIBBON),
                new Enum("ribbon2", INT_RIBBON_2),
                new Enum("ellipseRibbon", INT_ELLIPSE_RIBBON),
                new Enum("ellipseRibbon2", INT_ELLIPSE_RIBBON_2),
                new Enum("leftRightRibbon", INT_LEFT_RIGHT_RIBBON),
                new Enum("verticalScroll", INT_VERTICAL_SCROLL),
                new Enum("horizontalScroll", INT_HORIZONTAL_SCROLL),
                new Enum("wave", INT_WAVE),
                new Enum("doubleWave", INT_DOUBLE_WAVE),
                new Enum("plus", INT_PLUS),
                new Enum("flowChartProcess", INT_FLOW_CHART_PROCESS),
                new Enum("flowChartDecision", INT_FLOW_CHART_DECISION),
                new Enum("flowChartInputOutput", INT_FLOW_CHART_INPUT_OUTPUT),
                new Enum("flowChartPredefinedProcess", INT_FLOW_CHART_PREDEFINED_PROCESS),
                new Enum("flowChartInternalStorage", INT_FLOW_CHART_INTERNAL_STORAGE),
                new Enum("flowChartDocument", INT_FLOW_CHART_DOCUMENT),
                new Enum("flowChartMultidocument", INT_FLOW_CHART_MULTIDOCUMENT),
                new Enum("flowChartTerminator", INT_FLOW_CHART_TERMINATOR),
                new Enum("flowChartPreparation", INT_FLOW_CHART_PREPARATION),
                new Enum("flowChartManualInput", INT_FLOW_CHART_MANUAL_INPUT),
                new Enum("flowChartManualOperation", INT_FLOW_CHART_MANUAL_OPERATION),
                new Enum("flowChartConnector", INT_FLOW_CHART_CONNECTOR),
                new Enum("flowChartPunchedCard", INT_FLOW_CHART_PUNCHED_CARD),
                new Enum("flowChartPunchedTape", INT_FLOW_CHART_PUNCHED_TAPE),
                new Enum("flowChartSummingJunction", INT_FLOW_CHART_SUMMING_JUNCTION),
                new Enum("flowChartOr", INT_FLOW_CHART_OR),
                new Enum("flowChartCollate", INT_FLOW_CHART_COLLATE),
                new Enum("flowChartSort", INT_FLOW_CHART_SORT),
                new Enum("flowChartExtract", INT_FLOW_CHART_EXTRACT),
                new Enum("flowChartMerge", INT_FLOW_CHART_MERGE),
                new Enum("flowChartOfflineStorage", INT_FLOW_CHART_OFFLINE_STORAGE),
                new Enum("flowChartOnlineStorage", INT_FLOW_CHART_ONLINE_STORAGE),
                new Enum("flowChartMagneticTape", INT_FLOW_CHART_MAGNETIC_TAPE),
                new Enum("flowChartMagneticDisk", INT_FLOW_CHART_MAGNETIC_DISK),
                new Enum("flowChartMagneticDrum", INT_FLOW_CHART_MAGNETIC_DRUM),
                new Enum("flowChartDisplay", INT_FLOW_CHART_DISPLAY),
                new Enum("flowChartDelay", INT_FLOW_CHART_DELAY),
                new Enum("flowChartAlternateProcess", INT_FLOW_CHART_ALTERNATE_PROCESS),
                new Enum("flowChartOffpageConnector", INT_FLOW_CHART_OFFPAGE_CONNECTOR),
                new Enum("actionButtonBlank", INT_ACTION_BUTTON_BLANK),
                new Enum("actionButtonHome", INT_ACTION_BUTTON_HOME),
                new Enum("actionButtonHelp", INT_ACTION_BUTTON_HELP),
                new Enum("actionButtonInformation", INT_ACTION_BUTTON_INFORMATION),
                new Enum("actionButtonForwardNext", INT_ACTION_BUTTON_FORWARD_NEXT),
                new Enum("actionButtonBackPrevious", INT_ACTION_BUTTON_BACK_PREVIOUS),
                new Enum("actionButtonEnd", INT_ACTION_BUTTON_END),
                new Enum("actionButtonBeginning", INT_ACTION_BUTTON_BEGINNING),
                new Enum("actionButtonReturn", INT_ACTION_BUTTON_RETURN),
                new Enum("actionButtonDocument", INT_ACTION_BUTTON_DOCUMENT),
                new Enum("actionButtonSound", INT_ACTION_BUTTON_SOUND),
                new Enum("actionButtonMovie", INT_ACTION_BUTTON_MOVIE),
                new Enum("gear6", INT_GEAR_6),
                new Enum("gear9", INT_GEAR_9),
                new Enum("funnel", INT_FUNNEL),
                new Enum("mathPlus", INT_MATH_PLUS),
                new Enum("mathMinus", INT_MATH_MINUS),
                new Enum("mathMultiply", INT_MATH_MULTIPLY),
                new Enum("mathDivide", INT_MATH_DIVIDE),
                new Enum("mathEqual", INT_MATH_EQUAL),
                new Enum("mathNotEqual", INT_MATH_NOT_EQUAL),
                new Enum("cornerTabs", INT_CORNER_TABS),
                new Enum("squareTabs", INT_SQUARE_TABS),
                new Enum("plaqueTabs", INT_PLAQUE_TABS),
                new Enum("chartX", INT_CHART_X),
                new Enum("chartStar", INT_CHART_STAR),
                new Enum("chartPlus", INT_CHART_PLUS),
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
