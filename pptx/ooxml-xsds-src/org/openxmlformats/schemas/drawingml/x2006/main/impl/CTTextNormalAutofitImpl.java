/*
 * XML Type:  CT_TextNormalAutofit
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextNormalAutofit(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextNormalAutofitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextNormalAutofit
{
    
    public CTTextNormalAutofitImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FONTSCALE$0 = 
        new javax.xml.namespace.QName("", "fontScale");
    private static final javax.xml.namespace.QName LNSPCREDUCTION$2 = 
        new javax.xml.namespace.QName("", "lnSpcReduction");
    
    
    /**
     * Gets the "fontScale" attribute
     */
    public int getFontScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTSCALE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FONTSCALE$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "fontScale" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent xgetFontScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent)get_store().find_attribute_user(FONTSCALE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent)get_default_attribute_value(FONTSCALE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "fontScale" attribute
     */
    public boolean isSetFontScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FONTSCALE$0) != null;
        }
    }
    
    /**
     * Sets the "fontScale" attribute
     */
    public void setFontScale(int fontScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FONTSCALE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FONTSCALE$0);
            }
            target.setIntValue(fontScale);
        }
    }
    
    /**
     * Sets (as xml) the "fontScale" attribute
     */
    public void xsetFontScale(org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent fontScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent)get_store().find_attribute_user(FONTSCALE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercent)get_store().add_attribute_user(FONTSCALE$0);
            }
            target.set(fontScale);
        }
    }
    
    /**
     * Unsets the "fontScale" attribute
     */
    public void unsetFontScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FONTSCALE$0);
        }
    }
    
    /**
     * Gets the "lnSpcReduction" attribute
     */
    public int getLnSpcReduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNSPCREDUCTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LNSPCREDUCTION$2);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "lnSpcReduction" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent xgetLnSpcReduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent)get_store().find_attribute_user(LNSPCREDUCTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent)get_default_attribute_value(LNSPCREDUCTION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "lnSpcReduction" attribute
     */
    public boolean isSetLnSpcReduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LNSPCREDUCTION$2) != null;
        }
    }
    
    /**
     * Sets the "lnSpcReduction" attribute
     */
    public void setLnSpcReduction(int lnSpcReduction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LNSPCREDUCTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LNSPCREDUCTION$2);
            }
            target.setIntValue(lnSpcReduction);
        }
    }
    
    /**
     * Sets (as xml) the "lnSpcReduction" attribute
     */
    public void xsetLnSpcReduction(org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent lnSpcReduction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent)get_store().find_attribute_user(LNSPCREDUCTION$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextSpacingPercent)get_store().add_attribute_user(LNSPCREDUCTION$2);
            }
            target.set(lnSpcReduction);
        }
    }
    
    /**
     * Unsets the "lnSpcReduction" attribute
     */
    public void unsetLnSpcReduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LNSPCREDUCTION$2);
        }
    }
}
