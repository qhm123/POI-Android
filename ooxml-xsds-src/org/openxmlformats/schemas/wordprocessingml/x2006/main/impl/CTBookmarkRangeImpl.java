/*
 * XML Type:  CT_BookmarkRange
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmarkRange
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_BookmarkRange(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTBookmarkRangeImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTMarkupRangeImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmarkRange
{
    
    public CTBookmarkRangeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLFIRST$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colFirst");
    private static final javax.xml.namespace.QName COLLAST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colLast");
    
    
    /**
     * Gets the "colFirst" attribute
     */
    public java.math.BigInteger getColFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLFIRST$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "colFirst" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetColFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLFIRST$0);
            return target;
        }
    }
    
    /**
     * True if has "colFirst" attribute
     */
    public boolean isSetColFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLFIRST$0) != null;
        }
    }
    
    /**
     * Sets the "colFirst" attribute
     */
    public void setColFirst(java.math.BigInteger colFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLFIRST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLFIRST$0);
            }
            target.setBigIntegerValue(colFirst);
        }
    }
    
    /**
     * Sets (as xml) the "colFirst" attribute
     */
    public void xsetColFirst(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber colFirst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLFIRST$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COLFIRST$0);
            }
            target.set(colFirst);
        }
    }
    
    /**
     * Unsets the "colFirst" attribute
     */
    public void unsetColFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLFIRST$0);
        }
    }
    
    /**
     * Gets the "colLast" attribute
     */
    public java.math.BigInteger getColLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAST$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "colLast" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber xgetColLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLLAST$2);
            return target;
        }
    }
    
    /**
     * True if has "colLast" attribute
     */
    public boolean isSetColLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLLAST$2) != null;
        }
    }
    
    /**
     * Sets the "colLast" attribute
     */
    public void setColLast(java.math.BigInteger colLast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAST$2);
            }
            target.setBigIntegerValue(colLast);
        }
    }
    
    /**
     * Sets (as xml) the "colLast" attribute
     */
    public void xsetColLast(org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber colLast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLLAST$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COLLAST$2);
            }
            target.set(colLast);
        }
    }
    
    /**
     * Unsets the "colLast" attribute
     */
    public void unsetColLast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLLAST$2);
        }
    }
}
