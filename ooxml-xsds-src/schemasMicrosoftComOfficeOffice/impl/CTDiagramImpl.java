/*
 * XML Type:  CT_Diagram
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: schemasMicrosoftComOfficeOffice.CTDiagram
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComOfficeOffice.impl;
/**
 * An XML CT_Diagram(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTDiagramImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements schemasMicrosoftComOfficeOffice.CTDiagram
{
    
    public CTDiagramImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONTABLE$0 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:office:office", "relationtable");
    private static final javax.xml.namespace.QName EXT$2 = 
        new javax.xml.namespace.QName("urn:schemas-microsoft-com:vml", "ext");
    private static final javax.xml.namespace.QName DGMSTYLE$4 = 
        new javax.xml.namespace.QName("", "dgmstyle");
    private static final javax.xml.namespace.QName AUTOFORMAT$6 = 
        new javax.xml.namespace.QName("", "autoformat");
    private static final javax.xml.namespace.QName REVERSE$8 = 
        new javax.xml.namespace.QName("", "reverse");
    private static final javax.xml.namespace.QName AUTOLAYOUT$10 = 
        new javax.xml.namespace.QName("", "autolayout");
    private static final javax.xml.namespace.QName DGMSCALEX$12 = 
        new javax.xml.namespace.QName("", "dgmscalex");
    private static final javax.xml.namespace.QName DGMSCALEY$14 = 
        new javax.xml.namespace.QName("", "dgmscaley");
    private static final javax.xml.namespace.QName DGMFONTSIZE$16 = 
        new javax.xml.namespace.QName("", "dgmfontsize");
    private static final javax.xml.namespace.QName CONSTRAINBOUNDS$18 = 
        new javax.xml.namespace.QName("", "constrainbounds");
    private static final javax.xml.namespace.QName DGMBASETEXTSCALE$20 = 
        new javax.xml.namespace.QName("", "dgmbasetextscale");
    
    
    /**
     * Gets the "relationtable" element
     */
    public schemasMicrosoftComOfficeOffice.CTRelationTable getRelationtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelationTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelationTable)get_store().find_element_user(RELATIONTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relationtable" element
     */
    public boolean isSetRelationtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONTABLE$0) != 0;
        }
    }
    
    /**
     * Sets the "relationtable" element
     */
    public void setRelationtable(schemasMicrosoftComOfficeOffice.CTRelationTable relationtable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelationTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelationTable)get_store().find_element_user(RELATIONTABLE$0, 0);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.CTRelationTable)get_store().add_element_user(RELATIONTABLE$0);
            }
            target.set(relationtable);
        }
    }
    
    /**
     * Appends and returns a new empty "relationtable" element
     */
    public schemasMicrosoftComOfficeOffice.CTRelationTable addNewRelationtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.CTRelationTable target = null;
            target = (schemasMicrosoftComOfficeOffice.CTRelationTable)get_store().add_element_user(RELATIONTABLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "relationtable" element
     */
    public void unsetRelationtable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONTABLE$0, 0);
        }
    }
    
    /**
     * Gets the "ext" attribute
     */
    public schemasMicrosoftComVml.STExt.Enum getExt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$2);
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
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$2);
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
            return get_store().find_attribute_user(EXT$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXT$2);
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
            target = (schemasMicrosoftComVml.STExt)get_store().find_attribute_user(EXT$2);
            if (target == null)
            {
                target = (schemasMicrosoftComVml.STExt)get_store().add_attribute_user(EXT$2);
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
            get_store().remove_attribute(EXT$2);
        }
    }
    
    /**
     * Gets the "dgmstyle" attribute
     */
    public java.math.BigInteger getDgmstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSTYLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmstyle" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSTYLE$4);
            return target;
        }
    }
    
    /**
     * True if has "dgmstyle" attribute
     */
    public boolean isSetDgmstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMSTYLE$4) != null;
        }
    }
    
    /**
     * Sets the "dgmstyle" attribute
     */
    public void setDgmstyle(java.math.BigInteger dgmstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSTYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMSTYLE$4);
            }
            target.setBigIntegerValue(dgmstyle);
        }
    }
    
    /**
     * Sets (as xml) the "dgmstyle" attribute
     */
    public void xsetDgmstyle(org.apache.xmlbeans.XmlInteger dgmstyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSTYLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMSTYLE$4);
            }
            target.set(dgmstyle);
        }
    }
    
    /**
     * Unsets the "dgmstyle" attribute
     */
    public void unsetDgmstyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMSTYLE$4);
        }
    }
    
    /**
     * Gets the "autoformat" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAutoformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMAT$6);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "autoformat" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAutoformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOFORMAT$6);
            return target;
        }
    }
    
    /**
     * True if has "autoformat" attribute
     */
    public boolean isSetAutoformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOFORMAT$6) != null;
        }
    }
    
    /**
     * Sets the "autoformat" attribute
     */
    public void setAutoformat(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum autoformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFORMAT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFORMAT$6);
            }
            target.setEnumValue(autoformat);
        }
    }
    
    /**
     * Sets (as xml) the "autoformat" attribute
     */
    public void xsetAutoformat(schemasMicrosoftComOfficeOffice.STTrueFalse autoformat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOFORMAT$6);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(AUTOFORMAT$6);
            }
            target.set(autoformat);
        }
    }
    
    /**
     * Unsets the "autoformat" attribute
     */
    public void unsetAutoformat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOFORMAT$6);
        }
    }
    
    /**
     * Gets the "reverse" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reverse" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(REVERSE$8);
            return target;
        }
    }
    
    /**
     * True if has "reverse" attribute
     */
    public boolean isSetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REVERSE$8) != null;
        }
    }
    
    /**
     * Sets the "reverse" attribute
     */
    public void setReverse(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum reverse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVERSE$8);
            }
            target.setEnumValue(reverse);
        }
    }
    
    /**
     * Sets (as xml) the "reverse" attribute
     */
    public void xsetReverse(schemasMicrosoftComOfficeOffice.STTrueFalse reverse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(REVERSE$8);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(REVERSE$8);
            }
            target.set(reverse);
        }
    }
    
    /**
     * Unsets the "reverse" attribute
     */
    public void unsetReverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REVERSE$8);
        }
    }
    
    /**
     * Gets the "autolayout" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse.Enum getAutolayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOLAYOUT$10);
            if (target == null)
            {
                return null;
            }
            return (schemasMicrosoftComOfficeOffice.STTrueFalse.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "autolayout" attribute
     */
    public schemasMicrosoftComOfficeOffice.STTrueFalse xgetAutolayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOLAYOUT$10);
            return target;
        }
    }
    
    /**
     * True if has "autolayout" attribute
     */
    public boolean isSetAutolayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AUTOLAYOUT$10) != null;
        }
    }
    
    /**
     * Sets the "autolayout" attribute
     */
    public void setAutolayout(schemasMicrosoftComOfficeOffice.STTrueFalse.Enum autolayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOLAYOUT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOLAYOUT$10);
            }
            target.setEnumValue(autolayout);
        }
    }
    
    /**
     * Sets (as xml) the "autolayout" attribute
     */
    public void xsetAutolayout(schemasMicrosoftComOfficeOffice.STTrueFalse autolayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            schemasMicrosoftComOfficeOffice.STTrueFalse target = null;
            target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().find_attribute_user(AUTOLAYOUT$10);
            if (target == null)
            {
                target = (schemasMicrosoftComOfficeOffice.STTrueFalse)get_store().add_attribute_user(AUTOLAYOUT$10);
            }
            target.set(autolayout);
        }
    }
    
    /**
     * Unsets the "autolayout" attribute
     */
    public void unsetAutolayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AUTOLAYOUT$10);
        }
    }
    
    /**
     * Gets the "dgmscalex" attribute
     */
    public java.math.BigInteger getDgmscalex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSCALEX$12);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmscalex" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmscalex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSCALEX$12);
            return target;
        }
    }
    
    /**
     * True if has "dgmscalex" attribute
     */
    public boolean isSetDgmscalex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMSCALEX$12) != null;
        }
    }
    
    /**
     * Sets the "dgmscalex" attribute
     */
    public void setDgmscalex(java.math.BigInteger dgmscalex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSCALEX$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMSCALEX$12);
            }
            target.setBigIntegerValue(dgmscalex);
        }
    }
    
    /**
     * Sets (as xml) the "dgmscalex" attribute
     */
    public void xsetDgmscalex(org.apache.xmlbeans.XmlInteger dgmscalex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSCALEX$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMSCALEX$12);
            }
            target.set(dgmscalex);
        }
    }
    
    /**
     * Unsets the "dgmscalex" attribute
     */
    public void unsetDgmscalex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMSCALEX$12);
        }
    }
    
    /**
     * Gets the "dgmscaley" attribute
     */
    public java.math.BigInteger getDgmscaley()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSCALEY$14);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmscaley" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmscaley()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSCALEY$14);
            return target;
        }
    }
    
    /**
     * True if has "dgmscaley" attribute
     */
    public boolean isSetDgmscaley()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMSCALEY$14) != null;
        }
    }
    
    /**
     * Sets the "dgmscaley" attribute
     */
    public void setDgmscaley(java.math.BigInteger dgmscaley)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMSCALEY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMSCALEY$14);
            }
            target.setBigIntegerValue(dgmscaley);
        }
    }
    
    /**
     * Sets (as xml) the "dgmscaley" attribute
     */
    public void xsetDgmscaley(org.apache.xmlbeans.XmlInteger dgmscaley)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMSCALEY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMSCALEY$14);
            }
            target.set(dgmscaley);
        }
    }
    
    /**
     * Unsets the "dgmscaley" attribute
     */
    public void unsetDgmscaley()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMSCALEY$14);
        }
    }
    
    /**
     * Gets the "dgmfontsize" attribute
     */
    public java.math.BigInteger getDgmfontsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMFONTSIZE$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmfontsize" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmfontsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMFONTSIZE$16);
            return target;
        }
    }
    
    /**
     * True if has "dgmfontsize" attribute
     */
    public boolean isSetDgmfontsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMFONTSIZE$16) != null;
        }
    }
    
    /**
     * Sets the "dgmfontsize" attribute
     */
    public void setDgmfontsize(java.math.BigInteger dgmfontsize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMFONTSIZE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMFONTSIZE$16);
            }
            target.setBigIntegerValue(dgmfontsize);
        }
    }
    
    /**
     * Sets (as xml) the "dgmfontsize" attribute
     */
    public void xsetDgmfontsize(org.apache.xmlbeans.XmlInteger dgmfontsize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMFONTSIZE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMFONTSIZE$16);
            }
            target.set(dgmfontsize);
        }
    }
    
    /**
     * Unsets the "dgmfontsize" attribute
     */
    public void unsetDgmfontsize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMFONTSIZE$16);
        }
    }
    
    /**
     * Gets the "constrainbounds" attribute
     */
    public java.lang.String getConstrainbounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTRAINBOUNDS$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "constrainbounds" attribute
     */
    public org.apache.xmlbeans.XmlString xgetConstrainbounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONSTRAINBOUNDS$18);
            return target;
        }
    }
    
    /**
     * True if has "constrainbounds" attribute
     */
    public boolean isSetConstrainbounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONSTRAINBOUNDS$18) != null;
        }
    }
    
    /**
     * Sets the "constrainbounds" attribute
     */
    public void setConstrainbounds(java.lang.String constrainbounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONSTRAINBOUNDS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONSTRAINBOUNDS$18);
            }
            target.setStringValue(constrainbounds);
        }
    }
    
    /**
     * Sets (as xml) the "constrainbounds" attribute
     */
    public void xsetConstrainbounds(org.apache.xmlbeans.XmlString constrainbounds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONSTRAINBOUNDS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONSTRAINBOUNDS$18);
            }
            target.set(constrainbounds);
        }
    }
    
    /**
     * Unsets the "constrainbounds" attribute
     */
    public void unsetConstrainbounds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONSTRAINBOUNDS$18);
        }
    }
    
    /**
     * Gets the "dgmbasetextscale" attribute
     */
    public java.math.BigInteger getDgmbasetextscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMBASETEXTSCALE$20);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dgmbasetextscale" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDgmbasetextscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMBASETEXTSCALE$20);
            return target;
        }
    }
    
    /**
     * True if has "dgmbasetextscale" attribute
     */
    public boolean isSetDgmbasetextscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DGMBASETEXTSCALE$20) != null;
        }
    }
    
    /**
     * Sets the "dgmbasetextscale" attribute
     */
    public void setDgmbasetextscale(java.math.BigInteger dgmbasetextscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DGMBASETEXTSCALE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DGMBASETEXTSCALE$20);
            }
            target.setBigIntegerValue(dgmbasetextscale);
        }
    }
    
    /**
     * Sets (as xml) the "dgmbasetextscale" attribute
     */
    public void xsetDgmbasetextscale(org.apache.xmlbeans.XmlInteger dgmbasetextscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DGMBASETEXTSCALE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DGMBASETEXTSCALE$20);
            }
            target.set(dgmbasetextscale);
        }
    }
    
    /**
     * Unsets the "dgmbasetextscale" attribute
     */
    public void unsetDgmbasetextscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DGMBASETEXTSCALE$20);
        }
    }
}
