/*
 * XML Type:  CT_PivotHierarchy
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotHierarchy
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_PivotHierarchy(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTPivotHierarchy extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTPivotHierarchy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctpivothierarchy215ctype");
    
    /**
     * Gets the "mps" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties getMps();
    
    /**
     * True if has "mps" element
     */
    boolean isSetMps();
    
    /**
     * Sets the "mps" element
     */
    void setMps(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties mps);
    
    /**
     * Appends and returns a new empty "mps" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMemberProperties addNewMps();
    
    /**
     * Unsets the "mps" element
     */
    void unsetMps();
    
    /**
     * Gets a List of "members" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers> getMembersList();
    
    /**
     * Gets array of all "members" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[] getMembersArray();
    
    /**
     * Gets ith "members" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers getMembersArray(int i);
    
    /**
     * Returns number of "members" element
     */
    int sizeOfMembersArray();
    
    /**
     * Sets array of all "members" element
     */
    void setMembersArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers[] membersArray);
    
    /**
     * Sets ith "members" element
     */
    void setMembersArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers members);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "members" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers insertNewMembers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "members" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMembers addNewMembers();
    
    /**
     * Removes the ith "members" element
     */
    void removeMembers(int i);
    
    /**
     * Gets the "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList getExtLst();
    
    /**
     * True if has "extLst" element
     */
    boolean isSetExtLst();
    
    /**
     * Sets the "extLst" element
     */
    void setExtLst(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList extLst);
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList addNewExtLst();
    
    /**
     * Unsets the "extLst" element
     */
    void unsetExtLst();
    
    /**
     * Gets the "outline" attribute
     */
    boolean getOutline();
    
    /**
     * Gets (as xml) the "outline" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOutline();
    
    /**
     * True if has "outline" attribute
     */
    boolean isSetOutline();
    
    /**
     * Sets the "outline" attribute
     */
    void setOutline(boolean outline);
    
    /**
     * Sets (as xml) the "outline" attribute
     */
    void xsetOutline(org.apache.xmlbeans.XmlBoolean outline);
    
    /**
     * Unsets the "outline" attribute
     */
    void unsetOutline();
    
    /**
     * Gets the "multipleItemSelectionAllowed" attribute
     */
    boolean getMultipleItemSelectionAllowed();
    
    /**
     * Gets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMultipleItemSelectionAllowed();
    
    /**
     * True if has "multipleItemSelectionAllowed" attribute
     */
    boolean isSetMultipleItemSelectionAllowed();
    
    /**
     * Sets the "multipleItemSelectionAllowed" attribute
     */
    void setMultipleItemSelectionAllowed(boolean multipleItemSelectionAllowed);
    
    /**
     * Sets (as xml) the "multipleItemSelectionAllowed" attribute
     */
    void xsetMultipleItemSelectionAllowed(org.apache.xmlbeans.XmlBoolean multipleItemSelectionAllowed);
    
    /**
     * Unsets the "multipleItemSelectionAllowed" attribute
     */
    void unsetMultipleItemSelectionAllowed();
    
    /**
     * Gets the "subtotalTop" attribute
     */
    boolean getSubtotalTop();
    
    /**
     * Gets (as xml) the "subtotalTop" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSubtotalTop();
    
    /**
     * True if has "subtotalTop" attribute
     */
    boolean isSetSubtotalTop();
    
    /**
     * Sets the "subtotalTop" attribute
     */
    void setSubtotalTop(boolean subtotalTop);
    
    /**
     * Sets (as xml) the "subtotalTop" attribute
     */
    void xsetSubtotalTop(org.apache.xmlbeans.XmlBoolean subtotalTop);
    
    /**
     * Unsets the "subtotalTop" attribute
     */
    void unsetSubtotalTop();
    
    /**
     * Gets the "showInFieldList" attribute
     */
    boolean getShowInFieldList();
    
    /**
     * Gets (as xml) the "showInFieldList" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetShowInFieldList();
    
    /**
     * True if has "showInFieldList" attribute
     */
    boolean isSetShowInFieldList();
    
    /**
     * Sets the "showInFieldList" attribute
     */
    void setShowInFieldList(boolean showInFieldList);
    
    /**
     * Sets (as xml) the "showInFieldList" attribute
     */
    void xsetShowInFieldList(org.apache.xmlbeans.XmlBoolean showInFieldList);
    
    /**
     * Unsets the "showInFieldList" attribute
     */
    void unsetShowInFieldList();
    
    /**
     * Gets the "dragToRow" attribute
     */
    boolean getDragToRow();
    
    /**
     * Gets (as xml) the "dragToRow" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToRow();
    
    /**
     * True if has "dragToRow" attribute
     */
    boolean isSetDragToRow();
    
    /**
     * Sets the "dragToRow" attribute
     */
    void setDragToRow(boolean dragToRow);
    
    /**
     * Sets (as xml) the "dragToRow" attribute
     */
    void xsetDragToRow(org.apache.xmlbeans.XmlBoolean dragToRow);
    
    /**
     * Unsets the "dragToRow" attribute
     */
    void unsetDragToRow();
    
    /**
     * Gets the "dragToCol" attribute
     */
    boolean getDragToCol();
    
    /**
     * Gets (as xml) the "dragToCol" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToCol();
    
    /**
     * True if has "dragToCol" attribute
     */
    boolean isSetDragToCol();
    
    /**
     * Sets the "dragToCol" attribute
     */
    void setDragToCol(boolean dragToCol);
    
    /**
     * Sets (as xml) the "dragToCol" attribute
     */
    void xsetDragToCol(org.apache.xmlbeans.XmlBoolean dragToCol);
    
    /**
     * Unsets the "dragToCol" attribute
     */
    void unsetDragToCol();
    
    /**
     * Gets the "dragToPage" attribute
     */
    boolean getDragToPage();
    
    /**
     * Gets (as xml) the "dragToPage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToPage();
    
    /**
     * True if has "dragToPage" attribute
     */
    boolean isSetDragToPage();
    
    /**
     * Sets the "dragToPage" attribute
     */
    void setDragToPage(boolean dragToPage);
    
    /**
     * Sets (as xml) the "dragToPage" attribute
     */
    void xsetDragToPage(org.apache.xmlbeans.XmlBoolean dragToPage);
    
    /**
     * Unsets the "dragToPage" attribute
     */
    void unsetDragToPage();
    
    /**
     * Gets the "dragToData" attribute
     */
    boolean getDragToData();
    
    /**
     * Gets (as xml) the "dragToData" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragToData();
    
    /**
     * True if has "dragToData" attribute
     */
    boolean isSetDragToData();
    
    /**
     * Sets the "dragToData" attribute
     */
    void setDragToData(boolean dragToData);
    
    /**
     * Sets (as xml) the "dragToData" attribute
     */
    void xsetDragToData(org.apache.xmlbeans.XmlBoolean dragToData);
    
    /**
     * Unsets the "dragToData" attribute
     */
    void unsetDragToData();
    
    /**
     * Gets the "dragOff" attribute
     */
    boolean getDragOff();
    
    /**
     * Gets (as xml) the "dragOff" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDragOff();
    
    /**
     * True if has "dragOff" attribute
     */
    boolean isSetDragOff();
    
    /**
     * Sets the "dragOff" attribute
     */
    void setDragOff(boolean dragOff);
    
    /**
     * Sets (as xml) the "dragOff" attribute
     */
    void xsetDragOff(org.apache.xmlbeans.XmlBoolean dragOff);
    
    /**
     * Unsets the "dragOff" attribute
     */
    void unsetDragOff();
    
    /**
     * Gets the "includeNewItemsInFilter" attribute
     */
    boolean getIncludeNewItemsInFilter();
    
    /**
     * Gets (as xml) the "includeNewItemsInFilter" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIncludeNewItemsInFilter();
    
    /**
     * True if has "includeNewItemsInFilter" attribute
     */
    boolean isSetIncludeNewItemsInFilter();
    
    /**
     * Sets the "includeNewItemsInFilter" attribute
     */
    void setIncludeNewItemsInFilter(boolean includeNewItemsInFilter);
    
    /**
     * Sets (as xml) the "includeNewItemsInFilter" attribute
     */
    void xsetIncludeNewItemsInFilter(org.apache.xmlbeans.XmlBoolean includeNewItemsInFilter);
    
    /**
     * Unsets the "includeNewItemsInFilter" attribute
     */
    void unsetIncludeNewItemsInFilter();
    
    /**
     * Gets the "caption" attribute
     */
    java.lang.String getCaption();
    
    /**
     * Gets (as xml) the "caption" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCaption();
    
    /**
     * True if has "caption" attribute
     */
    boolean isSetCaption();
    
    /**
     * Sets the "caption" attribute
     */
    void setCaption(java.lang.String caption);
    
    /**
     * Sets (as xml) the "caption" attribute
     */
    void xsetCaption(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring caption);
    
    /**
     * Unsets the "caption" attribute
     */
    void unsetCaption();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
