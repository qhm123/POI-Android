/*
 * XML Type:  CT_TLAnimVariant
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLAnimVariant(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLAnimVariantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariant
{
    
    public CTTLAnimVariantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLVAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "boolVal");
    private static final javax.xml.namespace.QName INTVAL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "intVal");
    private static final javax.xml.namespace.QName FLTVAL$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "fltVal");
    private static final javax.xml.namespace.QName STRVAL$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "strVal");
    private static final javax.xml.namespace.QName CLRVAL$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "clrVal");
    
    
    /**
     * Gets the "boolVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal getBoolVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal)get_store().find_element_user(BOOLVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "boolVal" element
     */
    public boolean isSetBoolVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLVAL$0) != 0;
        }
    }
    
    /**
     * Sets the "boolVal" element
     */
    public void setBoolVal(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal boolVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal)get_store().find_element_user(BOOLVAL$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal)get_store().add_element_user(BOOLVAL$0);
            }
            target.set(boolVal);
        }
    }
    
    /**
     * Appends and returns a new empty "boolVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal addNewBoolVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantBooleanVal)get_store().add_element_user(BOOLVAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "boolVal" element
     */
    public void unsetBoolVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLVAL$0, 0);
        }
    }
    
    /**
     * Gets the "intVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal getIntVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal)get_store().find_element_user(INTVAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "intVal" element
     */
    public boolean isSetIntVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTVAL$2) != 0;
        }
    }
    
    /**
     * Sets the "intVal" element
     */
    public void setIntVal(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal intVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal)get_store().find_element_user(INTVAL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal)get_store().add_element_user(INTVAL$2);
            }
            target.set(intVal);
        }
    }
    
    /**
     * Appends and returns a new empty "intVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal addNewIntVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantIntegerVal)get_store().add_element_user(INTVAL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "intVal" element
     */
    public void unsetIntVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTVAL$2, 0);
        }
    }
    
    /**
     * Gets the "fltVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal getFltVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal)get_store().find_element_user(FLTVAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fltVal" element
     */
    public boolean isSetFltVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLTVAL$4) != 0;
        }
    }
    
    /**
     * Sets the "fltVal" element
     */
    public void setFltVal(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal fltVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal)get_store().find_element_user(FLTVAL$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal)get_store().add_element_user(FLTVAL$4);
            }
            target.set(fltVal);
        }
    }
    
    /**
     * Appends and returns a new empty "fltVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal addNewFltVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantFloatVal)get_store().add_element_user(FLTVAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fltVal" element
     */
    public void unsetFltVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLTVAL$4, 0);
        }
    }
    
    /**
     * Gets the "strVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal getStrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal)get_store().find_element_user(STRVAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "strVal" element
     */
    public boolean isSetStrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRVAL$6) != 0;
        }
    }
    
    /**
     * Sets the "strVal" element
     */
    public void setStrVal(org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal strVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal)get_store().find_element_user(STRVAL$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal)get_store().add_element_user(STRVAL$6);
            }
            target.set(strVal);
        }
    }
    
    /**
     * Appends and returns a new empty "strVal" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal addNewStrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLAnimVariantStringVal)get_store().add_element_user(STRVAL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "strVal" element
     */
    public void unsetStrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRVAL$6, 0);
        }
    }
    
    /**
     * Gets the "clrVal" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor getClrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRVAL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "clrVal" element
     */
    public boolean isSetClrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLRVAL$8) != 0;
        }
    }
    
    /**
     * Sets the "clrVal" element
     */
    public void setClrVal(org.openxmlformats.schemas.drawingml.x2006.main.CTColor clrVal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().find_element_user(CLRVAL$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRVAL$8);
            }
            target.set(clrVal);
        }
    }
    
    /**
     * Appends and returns a new empty "clrVal" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTColor addNewClrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTColor)get_store().add_element_user(CLRVAL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "clrVal" element
     */
    public void unsetClrVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLRVAL$8, 0);
        }
    }
}
