/*
 * XML Type:  CT_TextBlipBullet
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/main
 * Java type: org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.main.impl;
/**
 * An XML CT_TextBlipBullet(@http://schemas.openxmlformats.org/drawingml/2006/main).
 *
 * This is a complex type.
 */
public class CTTextBlipBulletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.drawingml.x2006.main.CTTextBlipBullet
{
    
    public CTTextBlipBulletImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLIP$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blip");
    
    
    /**
     * Gets the "blip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlip getBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().find_element_user(BLIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "blip" element
     */
    public void setBlip(org.openxmlformats.schemas.drawingml.x2006.main.CTBlip blip)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().find_element_user(BLIP$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().add_element_user(BLIP$0);
            }
            target.set(blip);
        }
    }
    
    /**
     * Appends and returns a new empty "blip" element
     */
    public org.openxmlformats.schemas.drawingml.x2006.main.CTBlip addNewBlip()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTBlip target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTBlip)get_store().add_element_user(BLIP$0);
            return target;
        }
    }
}
