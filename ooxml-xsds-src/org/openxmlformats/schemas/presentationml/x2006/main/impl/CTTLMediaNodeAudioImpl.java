/*
 * XML Type:  CT_TLMediaNodeAudio
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLMediaNodeAudio(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLMediaNodeAudioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLMediaNodeAudio
{
    
    public CTTLMediaNodeAudioImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CMEDIANODE$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cMediaNode");
    private static final javax.xml.namespace.QName ISNARRATION$2 = 
        new javax.xml.namespace.QName("", "isNarration");
    
    
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
     * Gets the "isNarration" attribute
     */
    public boolean getIsNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNARRATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISNARRATION$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNarration" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNARRATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISNARRATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "isNarration" attribute
     */
    public boolean isSetIsNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNARRATION$2) != null;
        }
    }
    
    /**
     * Sets the "isNarration" attribute
     */
    public void setIsNarration(boolean isNarration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNARRATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNARRATION$2);
            }
            target.setBooleanValue(isNarration);
        }
    }
    
    /**
     * Sets (as xml) the "isNarration" attribute
     */
    public void xsetIsNarration(org.apache.xmlbeans.XmlBoolean isNarration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISNARRATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISNARRATION$2);
            }
            target.set(isNarration);
        }
    }
    
    /**
     * Unsets the "isNarration" attribute
     */
    public void unsetIsNarration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNARRATION$2);
        }
    }
}
