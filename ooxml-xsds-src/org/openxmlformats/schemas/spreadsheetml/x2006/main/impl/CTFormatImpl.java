/*
 * XML Type:  CT_Format
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Format(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTFormatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFormat
{
    
    public CTFormatImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIVOTAREA$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "pivotArea");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName ACTION$4 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName DXFID$6 = 
        new javax.xml.namespace.QName("", "dxfId");
    
    
    /**
     * Gets the "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea getPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pivotArea" element
     */
    public void setPivotArea(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea pivotArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().find_element_user(PIVOTAREA$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            }
            target.set(pivotArea);
        }
    }
    
    /**
     * Appends and returns a new empty "pivotArea" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea addNewPivotArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotArea)get_store().add_element_user(PIVOTAREA$0);
            return target;
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
     * Gets the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction)get_default_attribute_value(ACTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$4) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$4);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction)get_store().find_attribute_user(ACTION$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STFormatAction)get_store().add_attribute_user(ACTION$4);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$4);
        }
    }
    
    /**
     * Gets the "dxfId" attribute
     */
    public long getDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$6);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "dxfId" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId xgetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$6);
            return target;
        }
    }
    
    /**
     * True if has "dxfId" attribute
     */
    public boolean isSetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DXFID$6) != null;
        }
    }
    
    /**
     * Sets the "dxfId" attribute
     */
    public void setDxfId(long dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DXFID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DXFID$6);
            }
            target.setLongValue(dxfId);
        }
    }
    
    /**
     * Sets (as xml) the "dxfId" attribute
     */
    public void xsetDxfId(org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId dxfId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().find_attribute_user(DXFID$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STDxfId)get_store().add_attribute_user(DXFID$6);
            }
            target.set(dxfId);
        }
    }
    
    /**
     * Unsets the "dxfId" attribute
     */
    public void unsetDxfId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DXFID$6);
        }
    }
}
