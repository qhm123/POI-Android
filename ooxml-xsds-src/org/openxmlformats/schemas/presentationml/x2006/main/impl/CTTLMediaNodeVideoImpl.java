/*
 * XML Type:  CT_TLMediaNodeVideo
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLMediaNodeVideo(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLMediaNodeVideoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeVideo
{
    
    public CTTLMediaNodeVideoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMEDIANODE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cMediaNode");
    private static final javax.xml.namespace.QName FULLSCRN$2 = 
        new javax.xml.namespace.QName("", "fullScrn");
    
    
    /**
     * Gets the "cMediaNode" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData getCMediaNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData)get_store().find_element_user(CMEDIANODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cMediaNode" element
     */
    public void setCMediaNode(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData cMediaNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData)get_store().find_element_user(CMEDIANODE$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData)get_store().add_element_user(CMEDIANODE$0);
            }
            target.set(cMediaNode);
        }
    }
    
    /**
     * Appends and returns a new empty "cMediaNode" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData addNewCMediaNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonMediaNodeData)get_store().add_element_user(CMEDIANODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "fullScrn" attribute
     */
    public boolean getFullScrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLSCRN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLSCRN$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullScrn" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFullScrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLSCRN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FULLSCRN$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "fullScrn" attribute
     */
    public boolean isSetFullScrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLSCRN$2) != null;
        }
    }
    
    /**
     * Sets the "fullScrn" attribute
     */
    public void setFullScrn(boolean fullScrn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLSCRN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLSCRN$2);
            }
            target.setBooleanValue(fullScrn);
        }
    }
    
    /**
     * Sets (as xml) the "fullScrn" attribute
     */
    public void xsetFullScrn(org.apache.xmlbeans.XmlBoolean fullScrn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FULLSCRN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FULLSCRN$2);
            }
            target.set(fullScrn);
        }
    }
    
    /**
     * Unsets the "fullScrn" attribute
     */
    public void unsetFullScrn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLSCRN$2);
        }
    }
}
