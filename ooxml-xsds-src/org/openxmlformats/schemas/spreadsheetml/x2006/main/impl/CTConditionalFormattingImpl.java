/*
 * XML Type:  CT_ConditionalFormatting
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_ConditionalFormatting(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConditionalFormattingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConditionalFormatting
{
    
    public CTConditionalFormattingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CFRULE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "cfRule");
    private static final javax.xml.namespace.QName EXTLST$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName PIVOT$4 = 
        new javax.xml.namespace.QName("", "pivot");
    private static final javax.xml.namespace.QName SQREF$6 = 
        new javax.xml.namespace.QName("", "sqref");
    
    
    /**
     * Gets a List of "cfRule" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule> getCfRuleList()
    {
        final class CfRuleList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule get(int i)
                { return CTConditionalFormattingImpl.this.getCfRuleArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule old = CTConditionalFormattingImpl.this.getCfRuleArray(i);
                CTConditionalFormattingImpl.this.setCfRuleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule o)
                { CTConditionalFormattingImpl.this.insertNewCfRule(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule old = CTConditionalFormattingImpl.this.getCfRuleArray(i);
                CTConditionalFormattingImpl.this.removeCfRule(i);
                return old;
            }
            
            public int size()
                { return CTConditionalFormattingImpl.this.sizeOfCfRuleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CfRuleList();
        }
    }
    
    /**
     * Gets array of all "cfRule" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[] getCfRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CFRULE$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cfRule" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule getCfRuleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().find_element_user(CFRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cfRule" element
     */
    public int sizeOfCfRuleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CFRULE$0);
        }
    }
    
    /**
     * Sets array of all "cfRule" element
     */
    public void setCfRuleArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule[] cfRuleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cfRuleArray, CFRULE$0);
        }
    }
    
    /**
     * Sets ith "cfRule" element
     */
    public void setCfRuleArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule cfRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().find_element_user(CFRULE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cfRule);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cfRule" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule insertNewCfRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().insert_element_user(CFRULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cfRule" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule addNewCfRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCfRule)get_store().add_element_user(CFRULE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "cfRule" element
     */
    public void removeCfRule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CFRULE$0, i);
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
     * Gets the "pivot" attribute
     */
    public boolean getPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PIVOT$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "pivot" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PIVOT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "pivot" attribute
     */
    public boolean isSetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PIVOT$4) != null;
        }
    }
    
    /**
     * Sets the "pivot" attribute
     */
    public void setPivot(boolean pivot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PIVOT$4);
            }
            target.setBooleanValue(pivot);
        }
    }
    
    /**
     * Sets (as xml) the "pivot" attribute
     */
    public void xsetPivot(org.apache.xmlbeans.XmlBoolean pivot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PIVOT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PIVOT$4);
            }
            target.set(pivot);
        }
    }
    
    /**
     * Unsets the "pivot" attribute
     */
    public void unsetPivot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PIVOT$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            return target;
        }
    }
    
    /**
     * True if has "sqref" attribute
     */
    public boolean isSetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SQREF$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQREF$6);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().find_attribute_user(SQREF$6);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STSqref)get_store().add_attribute_user(SQREF$6);
            }
            target.set(sqref);
        }
    }
    
    /**
     * Unsets the "sqref" attribute
     */
    public void unsetSqref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SQREF$6);
        }
    }
}
