/*
 * XML Type:  CT_DocGrid
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_DocGrid(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDocGridImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocGrid
{
    
    public CTDocGridImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "type");
    private static final javax.xml.namespace.QName LINEPITCH$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "linePitch");
    private static final javax.xml.namespace.QName CHARSPACE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "charSpace");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocGrid)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "linePitch" attribute
     */
    public java.math.BigInteger getLinePitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINEPITCH$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "linePitch" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetLinePitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LINEPITCH$2);
            return target;
        }
    }
    
    /**
     * True if has "linePitch" attribute
     */
    public boolean isSetLinePitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINEPITCH$2) != null;
        }
    }
    
    /**
     * Sets the "linePitch" attribute
     */
    public void setLinePitch(java.math.BigInteger linePitch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINEPITCH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINEPITCH$2);
            }
            target.setBigIntegerValue(linePitch);
        }
    }
    
    /**
     * Sets (as xml) the "linePitch" attribute
     */
    public void xsetLinePitch(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber linePitch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(LINEPITCH$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(LINEPITCH$2);
            }
            target.set(linePitch);
        }
    }
    
    /**
     * Unsets the "linePitch" attribute
     */
    public void unsetLinePitch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINEPITCH$2);
        }
    }
    
    /**
     * Gets the "charSpace" attribute
     */
    public java.math.BigInteger getCharSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSPACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "charSpace" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetCharSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CHARSPACE$4);
            return target;
        }
    }
    
    /**
     * True if has "charSpace" attribute
     */
    public boolean isSetCharSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHARSPACE$4) != null;
        }
    }
    
    /**
     * Sets the "charSpace" attribute
     */
    public void setCharSpace(java.math.BigInteger charSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARSPACE$4);
            }
            target.setBigIntegerValue(charSpace);
        }
    }
    
    /**
     * Sets (as xml) the "charSpace" attribute
     */
    public void xsetCharSpace(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber charSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(CHARSPACE$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(CHARSPACE$4);
            }
            target.set(charSpace);
        }
    }
    
    /**
     * Unsets the "charSpace" attribute
     */
    public void unsetCharSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHARSPACE$4);
        }
    }
}
