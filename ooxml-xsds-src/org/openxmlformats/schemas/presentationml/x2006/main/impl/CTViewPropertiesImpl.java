/*
 * XML Type:  CT_ViewProperties
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_ViewProperties(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTViewPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTViewProperties
{
    
    public CTViewPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORMALVIEWPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "normalViewPr");
    private static final javax.xml.namespace.QName SLIDEVIEWPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "slideViewPr");
    private static final javax.xml.namespace.QName OUTLINEVIEWPR$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "outlineViewPr");
    private static final javax.xml.namespace.QName NOTESTEXTVIEWPR$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesTextViewPr");
    private static final javax.xml.namespace.QName SORTERVIEWPR$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "sorterViewPr");
    private static final javax.xml.namespace.QName NOTESVIEWPR$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "notesViewPr");
    private static final javax.xml.namespace.QName GRIDSPACING$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "gridSpacing");
    private static final javax.xml.namespace.QName EXTLST$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "extLst");
    private static final javax.xml.namespace.QName LASTVIEW$16 = 
        new javax.xml.namespace.QName("", "lastView");
    private static final javax.xml.namespace.QName SHOWCOMMENTS$18 = 
        new javax.xml.namespace.QName("", "showComments");
    
    
    /**
     * Gets the "normalViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties getNormalViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties)get_store().find_element_user(NORMALVIEWPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "normalViewPr" element
     */
    public boolean isSetNormalViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORMALVIEWPR$0) != 0;
        }
    }
    
    /**
     * Sets the "normalViewPr" element
     */
    public void setNormalViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties normalViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties)get_store().find_element_user(NORMALVIEWPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties)get_store().add_element_user(NORMALVIEWPR$0);
            }
            target.set(normalViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "normalViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties addNewNormalViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNormalViewProperties)get_store().add_element_user(NORMALVIEWPR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "normalViewPr" element
     */
    public void unsetNormalViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORMALVIEWPR$0, 0);
        }
    }
    
    /**
     * Gets the "slideViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties getSlideViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties)get_store().find_element_user(SLIDEVIEWPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "slideViewPr" element
     */
    public boolean isSetSlideViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLIDEVIEWPR$2) != 0;
        }
    }
    
    /**
     * Sets the "slideViewPr" element
     */
    public void setSlideViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties slideViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties)get_store().find_element_user(SLIDEVIEWPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties)get_store().add_element_user(SLIDEVIEWPR$2);
            }
            target.set(slideViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "slideViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties addNewSlideViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideViewProperties)get_store().add_element_user(SLIDEVIEWPR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "slideViewPr" element
     */
    public void unsetSlideViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLIDEVIEWPR$2, 0);
        }
    }
    
    /**
     * Gets the "outlineViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties getOutlineViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties)get_store().find_element_user(OUTLINEVIEWPR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outlineViewPr" element
     */
    public boolean isSetOutlineViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLINEVIEWPR$4) != 0;
        }
    }
    
    /**
     * Sets the "outlineViewPr" element
     */
    public void setOutlineViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties outlineViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties)get_store().find_element_user(OUTLINEVIEWPR$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties)get_store().add_element_user(OUTLINEVIEWPR$4);
            }
            target.set(outlineViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "outlineViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties addNewOutlineViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTOutlineViewProperties)get_store().add_element_user(OUTLINEVIEWPR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "outlineViewPr" element
     */
    public void unsetOutlineViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLINEVIEWPR$4, 0);
        }
    }
    
    /**
     * Gets the "notesTextViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties getNotesTextViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties)get_store().find_element_user(NOTESTEXTVIEWPR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notesTextViewPr" element
     */
    public boolean isSetNotesTextViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTESTEXTVIEWPR$6) != 0;
        }
    }
    
    /**
     * Sets the "notesTextViewPr" element
     */
    public void setNotesTextViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties notesTextViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties)get_store().find_element_user(NOTESTEXTVIEWPR$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties)get_store().add_element_user(NOTESTEXTVIEWPR$6);
            }
            target.set(notesTextViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "notesTextViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties addNewNotesTextViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesTextViewProperties)get_store().add_element_user(NOTESTEXTVIEWPR$6);
            return target;
        }
    }
    
    /**
     * Unsets the "notesTextViewPr" element
     */
    public void unsetNotesTextViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTESTEXTVIEWPR$6, 0);
        }
    }
    
    /**
     * Gets the "sorterViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties getSorterViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties)get_store().find_element_user(SORTERVIEWPR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sorterViewPr" element
     */
    public boolean isSetSorterViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SORTERVIEWPR$8) != 0;
        }
    }
    
    /**
     * Sets the "sorterViewPr" element
     */
    public void setSorterViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties sorterViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties)get_store().find_element_user(SORTERVIEWPR$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties)get_store().add_element_user(SORTERVIEWPR$8);
            }
            target.set(sorterViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "sorterViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties addNewSorterViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSorterViewProperties)get_store().add_element_user(SORTERVIEWPR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "sorterViewPr" element
     */
    public void unsetSorterViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SORTERVIEWPR$8, 0);
        }
    }
    
    /**
     * Gets the "notesViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties getNotesViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties)get_store().find_element_user(NOTESVIEWPR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notesViewPr" element
     */
    public boolean isSetNotesViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTESVIEWPR$10) != 0;
        }
    }
    
    /**
     * Sets the "notesViewPr" element
     */
    public void setNotesViewPr(org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties notesViewPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties)get_store().find_element_user(NOTESVIEWPR$10, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties)get_store().add_element_user(NOTESVIEWPR$10);
            }
            target.set(notesViewPr);
        }
    }
    
    /**
     * Appends and returns a new empty "notesViewPr" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties addNewNotesViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTNotesViewProperties)get_store().add_element_user(NOTESVIEWPR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "notesViewPr" element
     */
    public void unsetNotesViewPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTESVIEWPR$10, 0);
        }
    }
    
    /**
     * Gets the "gridSpacing" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D getGridSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(GRIDSPACING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gridSpacing" element
     */
    public boolean isSetGridSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDSPACING$12) != 0;
        }
    }
    
    /**
     * Sets the "gridSpacing" element
     */
    public void setGridSpacing(org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D gridSpacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().find_element_user(GRIDSPACING$12, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(GRIDSPACING$12);
            }
            target.set(gridSpacing);
        }
    }
    
    /**
     * Appends and returns a new empty "gridSpacing" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D addNewGridSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D)get_store().add_element_user(GRIDSPACING$12);
            return target;
        }
    }
    
    /**
     * Unsets the "gridSpacing" element
     */
    public void unsetGridSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDSPACING$12, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
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
            return get_store().count_elements(EXTLST$14) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().find_element_user(EXTLST$14, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionList)get_store().add_element_user(EXTLST$14);
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
            get_store().remove_element(EXTLST$14, 0);
        }
    }
    
    /**
     * Gets the "lastView" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STViewType.Enum getLastView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVIEW$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LASTVIEW$16);
            }
            if (target == null)
            {
                return null;
            }
            return (org.openxmlformats.schemas.presentationml.x2006.main.STViewType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastView" attribute
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.STViewType xgetLastView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STViewType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STViewType)get_store().find_attribute_user(LASTVIEW$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STViewType)get_default_attribute_value(LASTVIEW$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "lastView" attribute
     */
    public boolean isSetLastView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTVIEW$16) != null;
        }
    }
    
    /**
     * Sets the "lastView" attribute
     */
    public void setLastView(org.openxmlformats.schemas.presentationml.x2006.main.STViewType.Enum lastView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTVIEW$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTVIEW$16);
            }
            target.setEnumValue(lastView);
        }
    }
    
    /**
     * Sets (as xml) the "lastView" attribute
     */
    public void xsetLastView(org.openxmlformats.schemas.presentationml.x2006.main.STViewType lastView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.STViewType target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.STViewType)get_store().find_attribute_user(LASTVIEW$16);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.STViewType)get_store().add_attribute_user(LASTVIEW$16);
            }
            target.set(lastView);
        }
    }
    
    /**
     * Unsets the "lastView" attribute
     */
    public void unsetLastView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTVIEW$16);
        }
    }
    
    /**
     * Gets the "showComments" attribute
     */
    public boolean getShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOMMENTS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHOWCOMMENTS$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showComments" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOMMENTS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(SHOWCOMMENTS$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "showComments" attribute
     */
    public boolean isSetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOWCOMMENTS$18) != null;
        }
    }
    
    /**
     * Sets the "showComments" attribute
     */
    public void setShowComments(boolean showComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOWCOMMENTS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOWCOMMENTS$18);
            }
            target.setBooleanValue(showComments);
        }
    }
    
    /**
     * Sets (as xml) the "showComments" attribute
     */
    public void xsetShowComments(org.apache.xmlbeans.XmlBoolean showComments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHOWCOMMENTS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHOWCOMMENTS$18);
            }
            target.set(showComments);
        }
    }
    
    /**
     * Unsets the "showComments" attribute
     */
    public void unsetShowComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOWCOMMENTS$18);
        }
    }
}
