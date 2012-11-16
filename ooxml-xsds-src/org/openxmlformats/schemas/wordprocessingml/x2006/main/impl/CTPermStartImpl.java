/*
 * XML Type:  CT_PermStart
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_PermStart(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTPermStartImpl extends org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTPermImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart
{
    
    public CTPermStartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGRP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "edGrp");
    private static final javax.xml.namespace.QName ED$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ed");
    private static final javax.xml.namespace.QName COLFIRST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colFirst");
    private static final javax.xml.namespace.QName COLLAST$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "colLast");
    
    
    /**
     * Gets the "edGrp" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp.Enum getEdGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGRP$0);
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "edGrp" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp xgetEdGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp)get_store().find_attribute_user(EDGRP$0);
            return target;
        }
    }
    
    /**
     * True if has "edGrp" attribute
     */
    public boolean isSetEdGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EDGRP$0) != null;
        }
    }
    
    /**
     * Sets the "edGrp" attribute
     */
    public void setEdGrp(org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp.Enum edGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDGRP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDGRP$0);
            }
            target.setEnumValue(edGrp);
        }
    }
    
    /**
     * Sets (as xml) the "edGrp" attribute
     */
    public void xsetEdGrp(org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp edGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp)get_store().find_attribute_user(EDGRP$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STEdGrp)get_store().add_attribute_user(EDGRP$0);
            }
            target.set(edGrp);
        }
    }
    
    /**
     * Unsets the "edGrp" attribute
     */
    public void unsetEdGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EDGRP$0);
        }
    }
    
    /**
     * Gets the "ed" attribute
     */
    public java.lang.String getEd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ED$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ed" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STString xgetEd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ED$2);
            return target;
        }
    }
    
    /**
     * True if has "ed" attribute
     */
    public boolean isSetEd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ED$2) != null;
        }
    }
    
    /**
     * Sets the "ed" attribute
     */
    public void setEd(java.lang.String ed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ED$2);
            }
            target.setStringValue(ed);
        }
    }
    
    /**
     * Sets (as xml) the "ed" attribute
     */
    public void xsetEd(org.openxmlformats.schemas.wordprocessingml.x2006.main.STString ed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().find_attribute_user(ED$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STString)get_store().add_attribute_user(ED$2);
            }
            target.set(ed);
        }
    }
    
    /**
     * Unsets the "ed" attribute
     */
    public void unsetEd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ED$2);
        }
    }
    
    /**
     * Gets the "colFirst" attribute
     */
    public java.math.BigInteger getColFirst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLFIRST$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLFIRST$4);
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
            return get_store().find_attribute_user(COLFIRST$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLFIRST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLFIRST$4);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLFIRST$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COLFIRST$4);
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
            get_store().remove_attribute(COLFIRST$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAST$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLLAST$6);
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
            return get_store().find_attribute_user(COLLAST$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAST$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAST$6);
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
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().find_attribute_user(COLLAST$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber)get_store().add_attribute_user(COLLAST$6);
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
            get_store().remove_attribute(COLLAST$6);
        }
    }
}
