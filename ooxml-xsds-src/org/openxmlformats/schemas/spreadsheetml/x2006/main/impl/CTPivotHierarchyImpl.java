/*
 * XML Type:  CT_PivotHierarchy
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_PivotHierarchy(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTPivotHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy
{
    
    public CTPivotHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MPS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "mps");
    private static final javax.xml.namespace.QName MEMBERS$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "members");
    private static final javax.xml.namespace.QName EXTLST$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "extLst");
    private static final javax.xml.namespace.QName OUTLINE$6 = 
        new javax.xml.namespace.QName("", "outline");
    private static final javax.xml.namespace.QName MULTIPLEITEMSELECTIONALLOWED$8 = 
        new javax.xml.namespace.QName("", "multipleItemSelectionAllowed");
    private static final javax.xml.namespace.QName SUBTOTALTOP$10 = 
        new javax.xml.namespace.QName("", "subtotalTop");
    private static final javax.xml.namespace.QName SHOWINFIELDLIST$12 = 
        new javax.xml.namespace.QName("", "showInFieldList");
    private static final javax.xml.namespace.QName DRAGTOROW$14 = 
        new javax.xml.namespace.QName("", "dragToRow");
    private static final javax.xml.namespace.QName DRAGTOCOL$16 = 
        new javax.xml.namespace.QName("", "dragToCol");
    private static final javax.xml.namespace.QName DRAGTOPAGE$18 = 
        new javax.xml.namespace.QName("", "dragToPage");
    private static final javax.xml.namespace.QName DRAGTODATA$20 = 
        new javax.xml.namespace.QName("", "dragToData");
    private static final javax.xml.namespace.QName DRAGOFF$22 = 
        new javax.xml.namespace.QName("", "dragOff");
    private static final javax.xml.namespace.QName INCLUDENEWITEMSINFILTER$24 = 
        new javax.xml.namespace.QName("", "includeNewItemsInFilter");
    private static final javax.xml.namespace.QName CAPTION$26 = 
        new javax.xml.namespace.QName("", "caption");
    
    
    /**
     * Gets the "mps" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties getMps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties)get_store().find_element_user(MPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mps" element
     */
    public boolean isSetMps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MPS$0) != 0;
        }
    }
    
    /**
     * Sets the "mps" element
     */
    public void setMps(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties mps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties)get_store().find_element_user(MPS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties)get_store().add_element_user(MPS$0);
            }
            target.set(mps);
        }
    }
    
    /**
     * Appends and returns a new empty "mps" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties addNewMps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties)get_store().add_element_user(MPS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mps" element
     */
    public void unsetMps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MPS$0, 0);
        }
    }
    
    /**
     * Gets a List of "members" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers> getMembersList()
    {
        final class MembersList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers get(int i)
                { return CTPivotHierarchyImpl.this.getMembersArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers old = CTPivotHierarchyImpl.this.getMembersArray(i);
                CTPivotHierarchyImpl.this.setMembersArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers o)
                { CTPivotHierarchyImpl.this.insertNewMembers(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers old = CTPivotHierarchyImpl.this.getMembersArray(i);
                CTPivotHierarchyImpl.this.removeMembers(i);
                return old;
            }
            
            public int size()
                { return CTPivotHierarchyImpl.this.sizeOfMembersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MembersList();
        }
    }
    
    /**
     * Gets array of all "members" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[] getMembersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBERS$2, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "members" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers getMembersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers)get_store().find_element_user(MEMBERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "members" element
     */
    public int sizeOfMembersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERS$2);
        }
    }
    
    /**
     * Sets array of all "members" element
     */
    public void setMembersArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[] membersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(membersArray, MEMBERS$2);
        }
    }
    
    /**
     * Sets ith "members" element
     */
    public void setMembersArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers members)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers)get_store().find_element_user(MEMBERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(members);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "members" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers insertNewMembers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers)get_store().insert_element_user(MEMBERS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "members" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers)get_store().add_element_user(MEMBERS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "members" element
     */
    public void removeMembers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERS$2, i);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
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
            return get_store().count_elements(EXTLST$4) != 0;
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$4);
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
            get_store().remove_element(EXTLST$4, 0);
        }
    }
    
    /**
     * Gets the "outline" attribute
     */
    public boolean getOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OUTLINE$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "outline" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(OUTLINE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "outline" attribute
     */
    public boolean isSetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTLINE$6) != null;
        }
    }
    
    /**
     * Sets the "outline" attribute
     */
    public void setOutline(boolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTLINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTLINE$6);
            }
            target.setBooleanValue(outline);
        }
    }
    
    /**
     * Sets (as xml) the "outline" attribute
     */
    public void xsetOutline(org.apache.xmlbeans.XmlBoolean outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(OUTLINE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(OUTLINE$6);
            }
            target.set(outline);
        }
    }
    
    /**
     * Unsets the "outline" attribute
     */
    public void unsetOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTLINE$6);
        }
    }
    
    /**
     * Gets the "multipleItemSelectionAllowed" attribute
     */
    public boolean getMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MULTIPLEITEMSELECTIONALLOWED$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "multipleItemSelectionAllowed" attribute
     */
    public boolean isSetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8) != null;
        }
    }
    
    /**
     * Sets the "multipleItemSelectionAllowed" attribute
     */
    public void setMultipleItemSelectionAllowed(boolean multipleItemSelectionAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            }
            target.setBooleanValue(multipleItemSelectionAllowed);
        }
    }
    
    /**
     * Sets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    public void xsetMultipleItemSelectionAllowed(org.apache.xmlbeans.XmlBoolean multipleItemSelectionAllowed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MULTIPLEITEMSELECTIONALLOWED$8);
            }
            target.set(multipleItemSelectionAllowed);
        }
    }
    
    /**
     * Unsets the "multipleItemSelectionAllowed" attribute
     */
    public void unsetMultipleItemSelectionAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MULTIPLEITEMSELECTIONALLOWED$8);
        }
    }
    
    /**
     * Gets the "subtotalTop" attribute
     */
    public boolean getSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SUBTOTALTOP$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "subtotalTop" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SUBTOTALTOP$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "subtotalTop" attribute
     */
    public boolean isSetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUBTOTALTOP$10) != null;
        }
    }
    
    /**
     * Sets the "subtotalTop" attribute
     */
    public void setSubtotalTop(boolean subtotalTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBTOTALTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBTOTALTOP$10);
            }
            target.setBooleanValue(subtotalTop);
        }
    }
    
    /**
     * Sets (as xml) the "subtotalTop" attribute
     */
    public void xsetSubtotalTop(org.apache.xmlbeans.XmlBoolean subtotalTop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SUBTOTALTOP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SUBTOTALTOP$10);
            }
            target.set(subtotalTop);
        }
    }
    
    /**
     * Unsets the "subtotalTop" attribute
     */
    public void unsetSubtotalTop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUBTOTALTOP$10);
        }
    }
    
    /**
     * Gets the "showInFieldList" attribute
     */
    public boolean getShowInFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINFIELDLIST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWINFIELDLIST$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showInFieldList" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowInFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINFIELDLIST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWINFIELDLIST$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "showInFieldList" attribute
     */
    public boolean isSetShowInFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWINFIELDLIST$12) != null;
        }
    }
    
    /**
     * Sets the "showInFieldList" attribute
     */
    public void setShowInFieldList(boolean showInFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWINFIELDLIST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWINFIELDLIST$12);
            }
            target.setBooleanValue(showInFieldList);
        }
    }
    
    /**
     * Sets (as xml) the "showInFieldList" attribute
     */
    public void xsetShowInFieldList(org.apache.xmlbeans.XmlBoolean showInFieldList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWINFIELDLIST$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWINFIELDLIST$12);
            }
            target.set(showInFieldList);
        }
    }
    
    /**
     * Unsets the "showInFieldList" attribute
     */
    public void unsetShowInFieldList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWINFIELDLIST$12);
        }
    }
    
    /**
     * Gets the "dragToRow" attribute
     */
    public boolean getDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOROW$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToRow" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOROW$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToRow" attribute
     */
    public boolean isSetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOROW$14) != null;
        }
    }
    
    /**
     * Sets the "dragToRow" attribute
     */
    public void setDragToRow(boolean dragToRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOROW$14);
            }
            target.setBooleanValue(dragToRow);
        }
    }
    
    /**
     * Sets (as xml) the "dragToRow" attribute
     */
    public void xsetDragToRow(org.apache.xmlbeans.XmlBoolean dragToRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOROW$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOROW$14);
            }
            target.set(dragToRow);
        }
    }
    
    /**
     * Unsets the "dragToRow" attribute
     */
    public void unsetDragToRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOROW$14);
        }
    }
    
    /**
     * Gets the "dragToCol" attribute
     */
    public boolean getDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOCOL$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToCol" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOCOL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToCol" attribute
     */
    public boolean isSetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOCOL$16) != null;
        }
    }
    
    /**
     * Sets the "dragToCol" attribute
     */
    public void setDragToCol(boolean dragToCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOCOL$16);
            }
            target.setBooleanValue(dragToCol);
        }
    }
    
    /**
     * Sets (as xml) the "dragToCol" attribute
     */
    public void xsetDragToCol(org.apache.xmlbeans.XmlBoolean dragToCol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOCOL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOCOL$16);
            }
            target.set(dragToCol);
        }
    }
    
    /**
     * Unsets the "dragToCol" attribute
     */
    public void unsetDragToCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOCOL$16);
        }
    }
    
    /**
     * Gets the "dragToPage" attribute
     */
    public boolean getDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOPAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTOPAGE$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToPage" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOPAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTOPAGE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToPage" attribute
     */
    public boolean isSetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTOPAGE$18) != null;
        }
    }
    
    /**
     * Sets the "dragToPage" attribute
     */
    public void setDragToPage(boolean dragToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTOPAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTOPAGE$18);
            }
            target.setBooleanValue(dragToPage);
        }
    }
    
    /**
     * Sets (as xml) the "dragToPage" attribute
     */
    public void xsetDragToPage(org.apache.xmlbeans.XmlBoolean dragToPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTOPAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTOPAGE$18);
            }
            target.set(dragToPage);
        }
    }
    
    /**
     * Unsets the "dragToPage" attribute
     */
    public void unsetDragToPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTOPAGE$18);
        }
    }
    
    /**
     * Gets the "dragToData" attribute
     */
    public boolean getDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTODATA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGTODATA$20);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragToData" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTODATA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGTODATA$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragToData" attribute
     */
    public boolean isSetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGTODATA$20) != null;
        }
    }
    
    /**
     * Sets the "dragToData" attribute
     */
    public void setDragToData(boolean dragToData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGTODATA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGTODATA$20);
            }
            target.setBooleanValue(dragToData);
        }
    }
    
    /**
     * Sets (as xml) the "dragToData" attribute
     */
    public void xsetDragToData(org.apache.xmlbeans.XmlBoolean dragToData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGTODATA$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGTODATA$20);
            }
            target.set(dragToData);
        }
    }
    
    /**
     * Unsets the "dragToData" attribute
     */
    public void unsetDragToData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGTODATA$20);
        }
    }
    
    /**
     * Gets the "dragOff" attribute
     */
    public boolean getDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGOFF$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DRAGOFF$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dragOff" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGOFF$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(DRAGOFF$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "dragOff" attribute
     */
    public boolean isSetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DRAGOFF$22) != null;
        }
    }
    
    /**
     * Sets the "dragOff" attribute
     */
    public void setDragOff(boolean dragOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DRAGOFF$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DRAGOFF$22);
            }
            target.setBooleanValue(dragOff);
        }
    }
    
    /**
     * Sets (as xml) the "dragOff" attribute
     */
    public void xsetDragOff(org.apache.xmlbeans.XmlBoolean dragOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DRAGOFF$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DRAGOFF$22);
            }
            target.set(dragOff);
        }
    }
    
    /**
     * Unsets the "dragOff" attribute
     */
    public void unsetDragOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DRAGOFF$22);
        }
    }
    
    /**
     * Gets the "includeNewItemsInFilter" attribute
     */
    public boolean getIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDENEWITEMSINFILTER$24);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "includeNewItemsInFilter" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDENEWITEMSINFILTER$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "includeNewItemsInFilter" attribute
     */
    public boolean isSetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$24) != null;
        }
    }
    
    /**
     * Sets the "includeNewItemsInFilter" attribute
     */
    public void setIncludeNewItemsInFilter(boolean includeNewItemsInFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$24);
            }
            target.setBooleanValue(includeNewItemsInFilter);
        }
    }
    
    /**
     * Sets (as xml) the "includeNewItemsInFilter" attribute
     */
    public void xsetIncludeNewItemsInFilter(org.apache.xmlbeans.XmlBoolean includeNewItemsInFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDENEWITEMSINFILTER$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDENEWITEMSINFILTER$24);
            }
            target.set(includeNewItemsInFilter);
        }
    }
    
    /**
     * Unsets the "includeNewItemsInFilter" attribute
     */
    public void unsetIncludeNewItemsInFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDENEWITEMSINFILTER$24);
        }
    }
    
    /**
     * Gets the "caption" attribute
     */
    public java.lang.String getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$26);
            return target;
        }
    }
    
    /**
     * True if has "caption" attribute
     */
    public boolean isSetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAPTION$26) != null;
        }
    }
    
    /**
     * Sets the "caption" attribute
     */
    public void setCaption(java.lang.String caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPTION$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPTION$26);
            }
            target.setStringValue(caption);
        }
    }
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    public void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CAPTION$26);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CAPTION$26);
            }
            target.set(caption);
        }
    }
    
    /**
     * Unsets the "caption" attribute
     */
    public void unsetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAPTION$26);
        }
    }
}
