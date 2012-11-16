/*
 * XML Type:  CT_RevisionFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_RevisionFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTRevisionFormattingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRevisionFormatting
{
    
    public CTRevisionFormattingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DXF$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "dxf");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName SHEETID$4 = 
        new javax.xml.namespace.QName("", "sheetId");
    private static final javax.xml.namespace.QName XFDXF$6 = 
        new javax.xml.namespace.QName("", "xfDxf");
    private static final javax.xml.namespace.QName S$8 = 
        new javax.xml.namespace.QName("", "s");
    private static final javax.xml.namespace.QName SQREF$10 = 
        new javax.xml.namespace.QName("", "sqref");
    private static final javax.xml.namespace.QName START$12 = 
        new javax.xml.namespace.QName("", "start");
    private static final javax.xml.namespace.QName LENGTH$14 = 
        new javax.xml.namespace.QName("", "length");
    
    
    /**
     * Gets the "dxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf getDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(DXF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dxf" element
     */
    public boolean isSetDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DXF$0) != 0;
        }
    }
    
    /**
     * Sets the "dxf" element
     */
    public void setDxf(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf dxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().find_element_user(DXF$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(DXF$0);
            }
            target.set(dxf);
        }
    }
    
    /**
     * Appends and returns a new empty "dxf" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf addNewDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf)get_store().add_element_user(DXF$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dxf" element
     */
    public void unsetDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DXF$0, 0);
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
     * Gets the "sheetId" attribute
     */
    public long getSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "sheetId" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetSheetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$4);
            return target;
        }
    }
    
    /**
     * Sets the "sheetId" attribute
     */
    public void setSheetId(long sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHEETID$4);
            }
            target.setLongValue(sheetId);
        }
    }
    
    /**
     * Sets (as xml) the "sheetId" attribute
     */
    public void xsetSheetId(org.apache.xmlbeans.XmlUnsignedInt sheetId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(SHEETID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(SHEETID$4);
            }
            target.set(sheetId);
        }
    }
    
    /**
     * Gets the "xfDxf" attribute
     */
    public boolean getXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFDXF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XFDXF$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xfDxf" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XFDXF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(XFDXF$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "xfDxf" attribute
     */
    public boolean isSetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XFDXF$6) != null;
        }
    }
    
    /**
     * Sets the "xfDxf" attribute
     */
    public void setXfDxf(boolean xfDxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XFDXF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XFDXF$6);
            }
            target.setBooleanValue(xfDxf);
        }
    }
    
    /**
     * Sets (as xml) the "xfDxf" attribute
     */
    public void xsetXfDxf(org.apache.xmlbeans.XmlBoolean xfDxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(XFDXF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(XFDXF$6);
            }
            target.set(xfDxf);
        }
    }
    
    /**
     * Unsets the "xfDxf" attribute
     */
    public void unsetXfDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XFDXF$6);
        }
    }
    
    /**
     * Gets the "s" attribute
     */
    public boolean getS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(S$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "s" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(S$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "s" attribute
     */
    public boolean isSetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(S$8) != null;
        }
    }
    
    /**
     * Sets the "s" attribute
     */
    public void setS(boolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(S$8);
            }
            target.setBooleanValue(s);
        }
    }
    
    /**
     * Sets (as xml) the "s" attribute
     */
    public void xsetS(org.apache.xmlbeans.XmlBoolean s)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(S$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(S$8);
            }
            target.set(s);
        }
    }
    
    /**
     * Unsets the "s" attribute
     */
    public void unsetS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(S$8);
        }
    }
    
    /**
     * Gets the "sqref" attribute
     */
    public java.util.List getSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$10);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sqref" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref xgetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$10);
            return target;
        }
    }
    
    /**
     * Sets the "sqref" attribute
     */
    public void setSqref(java.util.List sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$10);
            }
            target.setListValue(sqref);
        }
    }
    
    /**
     * Sets (as xml) the "sqref" attribute
     */
    public void xsetSqref(org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref sqref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$10);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$10);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Gets the "start" attribute
     */
    public long getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$12);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(START$12);
            return target;
        }
    }
    
    /**
     * True if has "start" attribute
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(START$12) != null;
        }
    }
    
    /**
     * Sets the "start" attribute
     */
    public void setStart(long start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$12);
            }
            target.setLongValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" attribute
     */
    public void xsetStart(org.apache.xmlbeans.XmlUnsignedInt start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(START$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(START$12);
            }
            target.set(start);
        }
    }
    
    /**
     * Unsets the "start" attribute
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(START$12);
        }
    }
    
    /**
     * Gets the "length" attribute
     */
    public long getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$14);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "length" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LENGTH$14);
            return target;
        }
    }
    
    /**
     * True if has "length" attribute
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LENGTH$14) != null;
        }
    }
    
    /**
     * Sets the "length" attribute
     */
    public void setLength(long length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LENGTH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LENGTH$14);
            }
            target.setLongValue(length);
        }
    }
    
    /**
     * Sets (as xml) the "length" attribute
     */
    public void xsetLength(org.apache.xmlbeans.XmlUnsignedInt length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(LENGTH$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(LENGTH$14);
            }
            target.set(length);
        }
    }
    
    /**
     * Unsets the "length" attribute
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LENGTH$14);
        }
    }
}
