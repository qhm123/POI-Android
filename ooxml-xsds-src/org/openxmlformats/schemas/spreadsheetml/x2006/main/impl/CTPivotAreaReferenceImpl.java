/*
 * XML Type:  CT_PivotAreaReference
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotAreaReference(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotAreaReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotAreaReference
{
    
    public CTPivotAreaReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "x");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName FIELD$4 = 
        new javax.xml.namespace.QName("", "field");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("", "count");
    private static final javax.xml.namespace.QName SELECTED$8 = 
        new javax.xml.namespace.QName("", "selected");
    private static final javax.xml.namespace.QName BYPOSITION$10 = 
        new javax.xml.namespace.QName("", "byPosition");
    private static final javax.xml.namespace.QName RELATIVE$12 = 
        new javax.xml.namespace.QName("", "relative");
    private static final javax.xml.namespace.QName DEFAULTSUBTOTAL$14 = 
        new javax.xml.namespace.QName("", "defaultSubtotal");
    private static final javax.xml.namespace.QName SUMSUBTOTAL$16 = 
        new javax.xml.namespace.QName("", "sumSubtotal");
    private static final javax.xml.namespace.QName COUNTASUBTOTAL$18 = 
        new javax.xml.namespace.QName("", "countASubtotal");
    private static final javax.xml.namespace.QName AVGSUBTOTAL$20 = 
        new javax.xml.namespace.QName("", "avgSubtotal");
    private static final javax.xml.namespace.QName MAXSUBTOTAL$22 = 
        new javax.xml.namespace.QName("", "maxSubtotal");
    private static final javax.xml.namespace.QName MINSUBTOTAL$24 = 
        new javax.xml.namespace.QName("", "minSubtotal");
    private static final javax.xml.namespace.QName PRODUCTSUBTOTAL$26 = 
        new javax.xml.namespace.QName("", "productSubtotal");
    private static final javax.xml.namespace.QName COUNTSUBTOTAL$28 = 
        new javax.xml.namespace.QName("", "countSubtotal");
    private static final javax.xml.namespace.QName STDDEVSUBTOTAL$30 = 
        new javax.xml.namespace.QName("", "stdDevSubtotal");
    private static final javax.xml.namespace.QName STDDEVPSUBTOTAL$32 = 
        new javax.xml.namespace.QName("", "stdDevPSubtotal");
    private static final javax.xml.namespace.QName VARSUBTOTAL$34 = 
        new javax.xml.namespace.QName("", "varSubtotal");
    private static final javax.xml.namespace.QName VARPSUBTOTAL$36 = 
        new javax.xml.namespace.QName("", "varPSubtotal");
    
    
    /**
     * Gets a List of "x" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex> getXList()
    {
        final class XList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex get(int i)
                { return CTPivotAreaReferenceImpl.this.getXArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTPivotAreaReferenceImpl.this.getXArray(i);
                CTPivotAreaReferenceImpl.this.setXArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex o)
                { CTPivotAreaReferenceImpl.this.insertNewX(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex old = CTPivotAreaReferenceImpl.this.getXArray(i);
                CTPivotAreaReferenceImpl.this.removeX(i);
                return old;
            }
            
            public int size()
                { return CTPivotAreaReferenceImpl.this.sizeOfXArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new XList();
        }
    }
    
    /**
     * Gets array of all "x" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] getXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex getXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "x" element
     */
    public int sizeOfXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X$0);
        }
    }
    
    /**
     * Sets array of all "x" element
     */
    public void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex[] xArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xArray, X$0);
        }
    }
    
    /**
     * Sets ith "x" element
     */
    public void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().find_element_user(X$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(x);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex insertNewX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().insert_element_user(X$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex addNewX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTIndex)get_store().add_element_user(X$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "x" element
     */
    public void removeX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X$0, i);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extLst" element
     */
    public boolean isSetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLST$2) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extLst" element
     */
    public void unsetExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLST$2, 0);
        }
    }
    
    /**
     * Gets the "field" attribute
     */
    public long getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "field" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELD$4);
            return target;
        }
    }
    
    /**
     * True if has "field" attribute
     */
    public boolean isSetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FIELD$4) != null;
        }
    }
    
    /**
     * Sets the "field" attribute
     */
    public void setField(long field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$4);
            }
            target.setLongValue(field);
        }
    }
    
    /**
     * Sets (as xml) the "field" attribute
     */
    public void xsetField(org.apache.xmlbeans.XmlUnsignedInt field)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(FIELD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(FIELD$4);
            }
            target.set(field);
        }
    }
    
    /**
     * Unsets the "field" attribute
     */
    public void unsetField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FIELD$4);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public long getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$6);
            return target;
        }
    }
    
    /**
     * True if has "count" attribute
     */
    public boolean isSetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNT$6) != null;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(long count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$6);
            }
            target.setLongValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COUNT$6);
            }
            target.set(count);
        }
    }
    
    /**
     * Unsets the "count" attribute
     */
    public void unsetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNT$6);
        }
    }
    
    /**
     * Gets the "selected" attribute
     */
    public boolean getSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SELECTED$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "selected" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SELECTED$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "selected" attribute
     */
    public boolean isSetSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SELECTED$8) != null;
        }
    }
    
    /**
     * Sets the "selected" attribute
     */
    public void setSelected(boolean selected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTED$8);
            }
            target.setBooleanValue(selected);
        }
    }
    
    /**
     * Sets (as xml) the "selected" attribute
     */
    public void xsetSelected(org.apache.xmlbeans.XmlBoolean selected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SELECTED$8);
            }
            target.set(selected);
        }
    }
    
    /**
     * Unsets the "selected" attribute
     */
    public void unsetSelected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SELECTED$8);
        }
    }
    
    /**
     * Gets the "byPosition" attribute
     */
    public boolean getByPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYPOSITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BYPOSITION$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "byPosition" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetByPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BYPOSITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BYPOSITION$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "byPosition" attribute
     */
    public boolean isSetByPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BYPOSITION$10) != null;
        }
    }
    
    /**
     * Sets the "byPosition" attribute
     */
    public void setByPosition(boolean byPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BYPOSITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BYPOSITION$10);
            }
            target.setBooleanValue(byPosition);
        }
    }
    
    /**
     * Sets (as xml) the "byPosition" attribute
     */
    public void xsetByPosition(org.apache.xmlbeans.XmlBoolean byPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BYPOSITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BYPOSITION$10);
            }
            target.set(byPosition);
        }
    }
    
    /**
     * Unsets the "byPosition" attribute
     */
    public void unsetByPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BYPOSITION$10);
        }
    }
    
    /**
     * Gets the "relative" attribute
     */
    public boolean getRelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RELATIVE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "relative" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELATIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RELATIVE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "relative" attribute
     */
    public boolean isSetRelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATIVE$12) != null;
        }
    }
    
    /**
     * Sets the "relative" attribute
     */
    public void setRelative(boolean relative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIVE$12);
            }
            target.setBooleanValue(relative);
        }
    }
    
    /**
     * Sets (as xml) the "relative" attribute
     */
    public void xsetRelative(org.apache.xmlbeans.XmlBoolean relative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RELATIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RELATIVE$12);
            }
            target.set(relative);
        }
    }
    
    /**
     * Unsets the "relative" attribute
     */
    public void unsetRelative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATIVE$12);
        }
    }
    
    /**
     * Gets the "defaultSubtotal" attribute
     */
    public boolean getDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSUBTOTAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTSUBTOTAL$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTSUBTOTAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DEFAULTSUBTOTAL$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "defaultSubtotal" attribute
     */
    public boolean isSetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTSUBTOTAL$14) != null;
        }
    }
    
    /**
     * Sets the "defaultSubtotal" attribute
     */
    public void setDefaultSubtotal(boolean defaultSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSUBTOTAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSUBTOTAL$14);
            }
            target.setBooleanValue(defaultSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "defaultSubtotal" attribute
     */
    public void xsetDefaultSubtotal(org.apache.xmlbeans.XmlBoolean defaultSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DEFAULTSUBTOTAL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DEFAULTSUBTOTAL$14);
            }
            target.set(defaultSubtotal);
        }
    }
    
    /**
     * Unsets the "defaultSubtotal" attribute
     */
    public void unsetDefaultSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTSUBTOTAL$14);
        }
    }
    
    /**
     * Gets the "sumSubtotal" attribute
     */
    public boolean getSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMSUBTOTAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUMSUBTOTAL$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sumSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMSUBTOTAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUMSUBTOTAL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "sumSubtotal" attribute
     */
    public boolean isSetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUMSUBTOTAL$16) != null;
        }
    }
    
    /**
     * Sets the "sumSubtotal" attribute
     */
    public void setSumSubtotal(boolean sumSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMSUBTOTAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMSUBTOTAL$16);
            }
            target.setBooleanValue(sumSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "sumSubtotal" attribute
     */
    public void xsetSumSubtotal(org.apache.xmlbeans.XmlBoolean sumSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUMSUBTOTAL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUMSUBTOTAL$16);
            }
            target.set(sumSubtotal);
        }
    }
    
    /**
     * Unsets the "sumSubtotal" attribute
     */
    public void unsetSumSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUMSUBTOTAL$16);
        }
    }
    
    /**
     * Gets the "countASubtotal" attribute
     */
    public boolean getCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTASUBTOTAL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNTASUBTOTAL$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "countASubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTASUBTOTAL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COUNTASUBTOTAL$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "countASubtotal" attribute
     */
    public boolean isSetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTASUBTOTAL$18) != null;
        }
    }
    
    /**
     * Sets the "countASubtotal" attribute
     */
    public void setCountASubtotal(boolean countASubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTASUBTOTAL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTASUBTOTAL$18);
            }
            target.setBooleanValue(countASubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "countASubtotal" attribute
     */
    public void xsetCountASubtotal(org.apache.xmlbeans.XmlBoolean countASubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTASUBTOTAL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COUNTASUBTOTAL$18);
            }
            target.set(countASubtotal);
        }
    }
    
    /**
     * Unsets the "countASubtotal" attribute
     */
    public void unsetCountASubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTASUBTOTAL$18);
        }
    }
    
    /**
     * Gets the "avgSubtotal" attribute
     */
    public boolean getAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGSUBTOTAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AVGSUBTOTAL$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "avgSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AVGSUBTOTAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(AVGSUBTOTAL$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "avgSubtotal" attribute
     */
    public boolean isSetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AVGSUBTOTAL$20) != null;
        }
    }
    
    /**
     * Sets the "avgSubtotal" attribute
     */
    public void setAvgSubtotal(boolean avgSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVGSUBTOTAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVGSUBTOTAL$20);
            }
            target.setBooleanValue(avgSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "avgSubtotal" attribute
     */
    public void xsetAvgSubtotal(org.apache.xmlbeans.XmlBoolean avgSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AVGSUBTOTAL$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AVGSUBTOTAL$20);
            }
            target.set(avgSubtotal);
        }
    }
    
    /**
     * Unsets the "avgSubtotal" attribute
     */
    public void unsetAvgSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AVGSUBTOTAL$20);
        }
    }
    
    /**
     * Gets the "maxSubtotal" attribute
     */
    public boolean getMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSUBTOTAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXSUBTOTAL$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXSUBTOTAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MAXSUBTOTAL$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "maxSubtotal" attribute
     */
    public boolean isSetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXSUBTOTAL$22) != null;
        }
    }
    
    /**
     * Sets the "maxSubtotal" attribute
     */
    public void setMaxSubtotal(boolean maxSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXSUBTOTAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXSUBTOTAL$22);
            }
            target.setBooleanValue(maxSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "maxSubtotal" attribute
     */
    public void xsetMaxSubtotal(org.apache.xmlbeans.XmlBoolean maxSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MAXSUBTOTAL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MAXSUBTOTAL$22);
            }
            target.set(maxSubtotal);
        }
    }
    
    /**
     * Unsets the "maxSubtotal" attribute
     */
    public void unsetMaxSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXSUBTOTAL$22);
        }
    }
    
    /**
     * Gets the "minSubtotal" attribute
     */
    public boolean getMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUBTOTAL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINSUBTOTAL$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "minSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINSUBTOTAL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MINSUBTOTAL$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "minSubtotal" attribute
     */
    public boolean isSetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINSUBTOTAL$24) != null;
        }
    }
    
    /**
     * Sets the "minSubtotal" attribute
     */
    public void setMinSubtotal(boolean minSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINSUBTOTAL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINSUBTOTAL$24);
            }
            target.setBooleanValue(minSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "minSubtotal" attribute
     */
    public void xsetMinSubtotal(org.apache.xmlbeans.XmlBoolean minSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MINSUBTOTAL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MINSUBTOTAL$24);
            }
            target.set(minSubtotal);
        }
    }
    
    /**
     * Unsets the "minSubtotal" attribute
     */
    public void unsetMinSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINSUBTOTAL$24);
        }
    }
    
    /**
     * Gets the "productSubtotal" attribute
     */
    public boolean getProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRODUCTSUBTOTAL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRODUCTSUBTOTAL$26);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "productSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRODUCTSUBTOTAL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRODUCTSUBTOTAL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "productSubtotal" attribute
     */
    public boolean isSetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRODUCTSUBTOTAL$26) != null;
        }
    }
    
    /**
     * Sets the "productSubtotal" attribute
     */
    public void setProductSubtotal(boolean productSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRODUCTSUBTOTAL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRODUCTSUBTOTAL$26);
            }
            target.setBooleanValue(productSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "productSubtotal" attribute
     */
    public void xsetProductSubtotal(org.apache.xmlbeans.XmlBoolean productSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRODUCTSUBTOTAL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRODUCTSUBTOTAL$26);
            }
            target.set(productSubtotal);
        }
    }
    
    /**
     * Unsets the "productSubtotal" attribute
     */
    public void unsetProductSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRODUCTSUBTOTAL$26);
        }
    }
    
    /**
     * Gets the "countSubtotal" attribute
     */
    public boolean getCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTSUBTOTAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COUNTSUBTOTAL$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "countSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTSUBTOTAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COUNTSUBTOTAL$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "countSubtotal" attribute
     */
    public boolean isSetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTSUBTOTAL$28) != null;
        }
    }
    
    /**
     * Sets the "countSubtotal" attribute
     */
    public void setCountSubtotal(boolean countSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTSUBTOTAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTSUBTOTAL$28);
            }
            target.setBooleanValue(countSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "countSubtotal" attribute
     */
    public void xsetCountSubtotal(org.apache.xmlbeans.XmlBoolean countSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COUNTSUBTOTAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COUNTSUBTOTAL$28);
            }
            target.set(countSubtotal);
        }
    }
    
    /**
     * Unsets the "countSubtotal" attribute
     */
    public void unsetCountSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTSUBTOTAL$28);
        }
    }
    
    /**
     * Gets the "stdDevSubtotal" attribute
     */
    public boolean getStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVSUBTOTAL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STDDEVSUBTOTAL$30);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdDevSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVSUBTOTAL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STDDEVSUBTOTAL$30);
            }
            return target;
        }
    }
    
    /**
     * True if has "stdDevSubtotal" attribute
     */
    public boolean isSetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STDDEVSUBTOTAL$30) != null;
        }
    }
    
    /**
     * Sets the "stdDevSubtotal" attribute
     */
    public void setStdDevSubtotal(boolean stdDevSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVSUBTOTAL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STDDEVSUBTOTAL$30);
            }
            target.setBooleanValue(stdDevSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "stdDevSubtotal" attribute
     */
    public void xsetStdDevSubtotal(org.apache.xmlbeans.XmlBoolean stdDevSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVSUBTOTAL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STDDEVSUBTOTAL$30);
            }
            target.set(stdDevSubtotal);
        }
    }
    
    /**
     * Unsets the "stdDevSubtotal" attribute
     */
    public void unsetStdDevSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STDDEVSUBTOTAL$30);
        }
    }
    
    /**
     * Gets the "stdDevPSubtotal" attribute
     */
    public boolean getStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVPSUBTOTAL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STDDEVPSUBTOTAL$32);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "stdDevPSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVPSUBTOTAL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(STDDEVPSUBTOTAL$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "stdDevPSubtotal" attribute
     */
    public boolean isSetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STDDEVPSUBTOTAL$32) != null;
        }
    }
    
    /**
     * Sets the "stdDevPSubtotal" attribute
     */
    public void setStdDevPSubtotal(boolean stdDevPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STDDEVPSUBTOTAL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STDDEVPSUBTOTAL$32);
            }
            target.setBooleanValue(stdDevPSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "stdDevPSubtotal" attribute
     */
    public void xsetStdDevPSubtotal(org.apache.xmlbeans.XmlBoolean stdDevPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(STDDEVPSUBTOTAL$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(STDDEVPSUBTOTAL$32);
            }
            target.set(stdDevPSubtotal);
        }
    }
    
    /**
     * Unsets the "stdDevPSubtotal" attribute
     */
    public void unsetStdDevPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STDDEVPSUBTOTAL$32);
        }
    }
    
    /**
     * Gets the "varSubtotal" attribute
     */
    public boolean getVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSUBTOTAL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VARSUBTOTAL$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "varSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSUBTOTAL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VARSUBTOTAL$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "varSubtotal" attribute
     */
    public boolean isSetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARSUBTOTAL$34) != null;
        }
    }
    
    /**
     * Sets the "varSubtotal" attribute
     */
    public void setVarSubtotal(boolean varSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARSUBTOTAL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARSUBTOTAL$34);
            }
            target.setBooleanValue(varSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "varSubtotal" attribute
     */
    public void xsetVarSubtotal(org.apache.xmlbeans.XmlBoolean varSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARSUBTOTAL$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VARSUBTOTAL$34);
            }
            target.set(varSubtotal);
        }
    }
    
    /**
     * Unsets the "varSubtotal" attribute
     */
    public void unsetVarSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARSUBTOTAL$34);
        }
    }
    
    /**
     * Gets the "varPSubtotal" attribute
     */
    public boolean getVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARPSUBTOTAL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VARPSUBTOTAL$36);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "varPSubtotal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARPSUBTOTAL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(VARPSUBTOTAL$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "varPSubtotal" attribute
     */
    public boolean isSetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARPSUBTOTAL$36) != null;
        }
    }
    
    /**
     * Sets the "varPSubtotal" attribute
     */
    public void setVarPSubtotal(boolean varPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARPSUBTOTAL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARPSUBTOTAL$36);
            }
            target.setBooleanValue(varPSubtotal);
        }
    }
    
    /**
     * Sets (as xml) the "varPSubtotal" attribute
     */
    public void xsetVarPSubtotal(org.apache.xmlbeans.XmlBoolean varPSubtotal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(VARPSUBTOTAL$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(VARPSUBTOTAL$36);
            }
            target.set(varPSubtotal);
        }
    }
    
    /**
     * Unsets the "varPSubtotal" attribute
     */
    public void unsetVarPSubtotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARPSUBTOTAL$36);
        }
    }
}
