/*
 * XML Type:  CT_AlphaModulateFixedEffect
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_AlphaModulateFixedEffect(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTAlphaModulateFixedEffectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect
{
    
    public CTAlphaModulateFixedEffectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AMT$0 = 
        new javax.xml.namespace.QName("", "amt");
    
    
    /**
     * Gets the "amt" attribute
     */
    public int getAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AMT$0);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "amt" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage xgetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(AMT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_default_attribute_value(AMT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "amt" attribute
     */
    public boolean isSetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AMT$0) != null;
        }
    }
    
    /**
     * Sets the "amt" attribute
     */
    public void setAmt(int amt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AMT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AMT$0);
            }
            target.setIntValue(amt);
        }
    }
    
    /**
     * Sets (as xml) the "amt" attribute
     */
    public void xsetAmt(org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage amt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().find_attribute_user(AMT$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STPositivePercentage)get_store().add_attribute_user(AMT$0);
            }
            target.set(amt);
        }
    }
    
    /**
     * Unsets the "amt" attribute
     */
    public void unsetAmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AMT$0);
        }
    }
}
