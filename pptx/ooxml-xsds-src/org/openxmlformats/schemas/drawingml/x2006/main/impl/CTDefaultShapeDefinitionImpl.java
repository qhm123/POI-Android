/*
 * XML Type:  CT_DefaultShapeDefinition
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_DefaultShapeDefinition(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTDefaultShapeDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTDefaultShapeDefinition
{
    
    public CTDefaultShapeDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPPR$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "spPr");
    private static final javax.xml.namespace.QName BODYPR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "bodyPr");
    private static final javax.xml.namespace.QName LSTSTYLE$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lstStyle");
    private static final javax.xml.namespace.QName STYLE$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "style");
    private static final javax.xml.namespace.QName EXTLST$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "extLst");
    
    
    /**
     * Gets the "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties getSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "spPr" element
     */
    public void setSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties spPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().find_element_user(SPPR$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$0);
            }
            target.set(spPr);
        }
    }
    
    /**
     * Appends and returns a new empty "spPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties addNewSpPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties)get_store().add_element_user(SPPR$0);
            return target;
        }
    }
    
    /**
     * Gets the "bodyPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties getBodyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().find_element_user(BODYPR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bodyPr" element
     */
    public void setBodyPr(org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties bodyPr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().find_element_user(BODYPR$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().add_element_user(BODYPR$2);
            }
            target.set(bodyPr);
        }
    }
    
    /**
     * Appends and returns a new empty "bodyPr" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties addNewBodyPr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextBodyProperties)get_store().add_element_user(BODYPR$2);
            return target;
        }
    }
    
    /**
     * Gets the "lstStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle getLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(LSTSTYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lstStyle" element
     */
    public void setLstStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle lstStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().find_element_user(LSTSTYLE$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(LSTSTYLE$4);
            }
            target.set(lstStyle);
        }
    }
    
    /**
     * Appends and returns a new empty "lstStyle" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle addNewLstStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTTextListStyle)get_store().add_element_user(LSTSTYLE$4);
            return target;
        }
    }
    
    /**
     * Gets the "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$6) != 0;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().find_element_user(STYLE$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$6);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTShapeStyle)get_store().add_element_user(STYLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$6, 0);
        }
    }
    
    /**
     * Gets the "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
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
            return get_store().count_elements(EXTLST$8) != 0;
        }
    }
    
    /**
     * Sets the "extLst" element
     */
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(EXTLST$8, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
            }
            target.set(extLst);
        }
    }
    
    /**
     * Appends and returns a new empty "extLst" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(EXTLST$8);
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
            get_store().remove_element(EXTLST$8, 0);
        }
    }
}
