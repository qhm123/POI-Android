/*
 * XML Type:  CT_Relation
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTRelation
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Relation(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTRelation
{
    
    public CTRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXT$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName IDSRC$2 = 
        new javax.xml.namespace.QName("", "idsrc");
    private static final javax.xml.namespace.QName IDDEST$4 = 
        new javax.xml.namespace.QName("", "iddest");
    private static final javax.xml.namespace.QName IDCNTR$6 = 
        new javax.xml.namespace.QName("", "idcntr");
    
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComVml.STExt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt xgetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            return target;
        }
    }
    
    /**
     * True if has "ext" attribute
     */
    public boolean isSetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXT$0) != null;
        }
    }
    
    /**
     * Sets the "ext" attribute
     */
    public void setExt(schemasMicrosoftComVml.STExt.Enum ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$0);
            }
            target.setEnumValue(ext);
        }
    }
    
    /**
     * Sets (as xml) the "ext" attribute
     */
    public void xsetExt(schemasMicrosoftComVml.STExt ext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComVml.STExt target = null;
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$0);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$0);
            }
            target.set(ext);
        }
    }
    
    /**
     * Unsets the "ext" attribute
     */
    public void unsetExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXT$0);
        }
    }
    
    /**
     * Gets the "idsrc" attribute
     */
    public java.lang.String getIdsrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSRC$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idsrc" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIdsrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSRC$2);
            return target;
        }
    }
    
    /**
     * True if has "idsrc" attribute
     */
    public boolean isSetIdsrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDSRC$2) != null;
        }
    }
    
    /**
     * Sets the "idsrc" attribute
     */
    public void setIdsrc(java.lang.String idsrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDSRC$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDSRC$2);
            }
            target.setStringValue(idsrc);
        }
    }
    
    /**
     * Sets (as xml) the "idsrc" attribute
     */
    public void xsetIdsrc(org.apache.xmlbeans.XmlString idsrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDSRC$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDSRC$2);
            }
            target.set(idsrc);
        }
    }
    
    /**
     * Unsets the "idsrc" attribute
     */
    public void unsetIdsrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDSRC$2);
        }
    }
    
    /**
     * Gets the "iddest" attribute
     */
    public java.lang.String getIddest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDDEST$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iddest" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIddest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDDEST$4);
            return target;
        }
    }
    
    /**
     * True if has "iddest" attribute
     */
    public boolean isSetIddest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDDEST$4) != null;
        }
    }
    
    /**
     * Sets the "iddest" attribute
     */
    public void setIddest(java.lang.String iddest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDDEST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDDEST$4);
            }
            target.setStringValue(iddest);
        }
    }
    
    /**
     * Sets (as xml) the "iddest" attribute
     */
    public void xsetIddest(org.apache.xmlbeans.XmlString iddest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDDEST$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDDEST$4);
            }
            target.set(iddest);
        }
    }
    
    /**
     * Unsets the "iddest" attribute
     */
    public void unsetIddest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDDEST$4);
        }
    }
    
    /**
     * Gets the "idcntr" attribute
     */
    public java.lang.String getIdcntr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCNTR$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idcntr" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIdcntr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDCNTR$6);
            return target;
        }
    }
    
    /**
     * True if has "idcntr" attribute
     */
    public boolean isSetIdcntr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IDCNTR$6) != null;
        }
    }
    
    /**
     * Sets the "idcntr" attribute
     */
    public void setIdcntr(java.lang.String idcntr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDCNTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDCNTR$6);
            }
            target.setStringValue(idcntr);
        }
    }
    
    /**
     * Sets (as xml) the "idcntr" attribute
     */
    public void xsetIdcntr(org.apache.xmlbeans.XmlString idcntr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDCNTR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDCNTR$6);
            }
            target.set(idcntr);
        }
    }
    
    /**
     * Unsets the "idcntr" attribute
     */
    public void unsetIdcntr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IDCNTR$6);
        }
    }
}
