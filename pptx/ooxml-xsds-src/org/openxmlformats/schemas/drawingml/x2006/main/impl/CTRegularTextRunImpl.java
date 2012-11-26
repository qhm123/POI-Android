/*
 * XML Type:  CT_RegularTextRun
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_RegularTextRun(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRegularTextRunImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun
{
    
    public CTRegularTextRunImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "rPr");
    private static final javax.xml.namespace.QName T$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "t");
    
    
    /**
     * Gets the "rPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties getRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rPr" element
     */
    public boolean isSetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RPR$0) != 0;
        }
    }
    
    /**
     * Sets the "rPr" element
     */
    public void setRPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties rPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().find_element_user(RPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(RPR$0);
            }
            target.set(rPr);
        }
    }
    
    /**
     * Appends and returns a new empty "rPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties addNewRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextCharacterProperties)get_store().add_element_user(RPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "rPr" element
     */
    public void unsetRPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RPR$0, 0);
        }
    }
    
    /**
     * Gets the "t" element
     */
    public java.lang.String getT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "t" element
     */
    public org.apache.xmlbeans.XmlString xgetT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(T$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "t" element
     */
    public void setT(java.lang.String t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(T$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(T$2);
            }
            target.setStringValue(t);
        }
    }
    
    /**
     * Sets (as xml) the "t" element
     */
    public void xsetT(org.apache.xmlbeans.XmlString t)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(T$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(T$2);
            }
            target.set(t);
        }
    }
}
