/*
 * XML Type:  CT_TLTimeNodeExclusive
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main.impl;
/**
 * An XML CT_TLTimeNodeExclusive(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is a complex type.
 */
public class CTTLTimeNodeExclusiveImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.presentationml.x2006.main.CTTLTimeNodeExclusive
{
    
    public CTTLTimeNodeExclusiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CTN$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/presentationml/2006/main", "cTn");
    
    
    /**
     * Gets the "cTn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData getCTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().find_element_user(CTN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cTn" element
     */
    public void setCTn(org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData cTn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().find_element_user(CTN$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().add_element_user(CTN$0);
            }
            target.set(cTn);
        }
    }
    
    /**
     * Appends and returns a new empty "cTn" element
     */
    public org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData addNewCTn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData target = null;
            target = (org.openxmlformats.schemas.presentationml.x2006.main.CTTLCommonTimeNodeData)get_store().add_element_user(CTN$0);
            return target;
        }
    }
}
