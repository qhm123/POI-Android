/*
 * XML Type:  CT_SupplementalFont
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_SupplementalFont(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTSupplementalFontImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTSupplementalFont
{
    
    public CTSupplementalFontImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("", "script");
    private static final javax.xml.namespace.QName TYPEFACE$2 = 
        new javax.xml.namespace.QName("", "typeface");
    
    
    /**
     * Gets the "script" attribute
     */
    public java.lang.String getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "script" attribute
     */
    public org.apache.xmlbeans.XmlString xgetScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPT$0);
            return target;
        }
    }
    
    /**
     * Sets the "script" attribute
     */
    public void setScript(java.lang.String script)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCRIPT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCRIPT$0);
            }
            target.setStringValue(script);
        }
    }
    
    /**
     * Sets (as xml) the "script" attribute
     */
    public void xsetScript(org.apache.xmlbeans.XmlString script)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCRIPT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCRIPT$0);
            }
            target.set(script);
        }
    }
    
    /**
     * Gets the "typeface" attribute
     */
    public java.lang.String getTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEFACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeface" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface xgetTypeface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().find_attribute_user(TYPEFACE$2);
            return target;
        }
    }
    
    /**
     * Sets the "typeface" attribute
     */
    public void setTypeface(java.lang.String typeface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEFACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEFACE$2);
            }
            target.setStringValue(typeface);
        }
    }
    
    /**
     * Sets (as xml) the "typeface" attribute
     */
    public void xsetTypeface(org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface typeface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().find_attribute_user(TYPEFACE$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STTextTypeface)get_store().add_attribute_user(TYPEFACE$2);
            }
            target.set(typeface);
        }
    }
}
