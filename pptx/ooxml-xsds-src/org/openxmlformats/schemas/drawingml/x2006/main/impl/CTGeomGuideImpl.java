/*
 * XML Type:  CT_GeomGuide
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_GeomGuide(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTGeomGuideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTGeomGuide
{
    
    public CTGeomGuideImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName FMLA$2 = 
        new javax.xml.namespace.QName("", "fmla");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "fmla" attribute
     */
    public java.lang.String getFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMLA$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fmla" attribute
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula xgetFmla()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula)get_store().find_attribute_user(FMLA$2);
            return target;
        }
    }
    
    /**
     * Sets the "fmla" attribute
     */
    public void setFmla(java.lang.String fmla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FMLA$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FMLA$2);
            }
            target.setStringValue(fmla);
        }
    }
    
    /**
     * Sets (as xml) the "fmla" attribute
     */
    public void xsetFmla(org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula fmla)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula)get_store().find_attribute_user(FMLA$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideFormula)get_store().add_attribute_user(FMLA$2);
            }
            target.set(fmla);
        }
    }
}
