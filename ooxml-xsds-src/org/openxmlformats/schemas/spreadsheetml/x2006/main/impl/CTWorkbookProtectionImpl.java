/*
 * XML Type:  CT_WorkbookProtection
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_WorkbookProtection(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTWorkbookProtectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbookProtection
{
    
    public CTWorkbookProtectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKBOOKPASSWORD$0 = 
        new javax.xml.namespace.QName("", "workbookPassword");
    private static final javax.xml.namespace.QName REVISIONSPASSWORD$2 = 
        new javax.xml.namespace.QName("", "revisionsPassword");
    private static final javax.xml.namespace.QName LOCKSTRUCTURE$4 = 
        new javax.xml.namespace.QName("", "lockStructure");
    private static final javax.xml.namespace.QName LOCKWINDOWS$6 = 
        new javax.xml.namespace.QName("", "lockWindows");
    private static final javax.xml.namespace.QName LOCKREVISION$8 = 
        new javax.xml.namespace.QName("", "lockRevision");
    
    
    /**
     * Gets the "workbookPassword" attribute
     */
    public byte[] getWorkbookPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKPASSWORD$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "workbookPassword" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetWorkbookPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(WORKBOOKPASSWORD$0);
            return target;
        }
    }
    
    /**
     * True if has "workbookPassword" attribute
     */
    public boolean isSetWorkbookPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WORKBOOKPASSWORD$0) != null;
        }
    }
    
    /**
     * Sets the "workbookPassword" attribute
     */
    public void setWorkbookPassword(byte[] workbookPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WORKBOOKPASSWORD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WORKBOOKPASSWORD$0);
            }
            target.setByteArrayValue(workbookPassword);
        }
    }
    
    /**
     * Sets (as xml) the "workbookPassword" attribute
     */
    public void xsetWorkbookPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex workbookPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(WORKBOOKPASSWORD$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().add_attribute_user(WORKBOOKPASSWORD$0);
            }
            target.set(workbookPassword);
        }
    }
    
    /**
     * Unsets the "workbookPassword" attribute
     */
    public void unsetWorkbookPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WORKBOOKPASSWORD$0);
        }
    }
    
    /**
     * Gets the "revisionsPassword" attribute
     */
    public byte[] getRevisionsPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISIONSPASSWORD$2);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "revisionsPassword" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex xgetRevisionsPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(REVISIONSPASSWORD$2);
            return target;
        }
    }
    
    /**
     * True if has "revisionsPassword" attribute
     */
    public boolean isSetRevisionsPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REVISIONSPASSWORD$2) != null;
        }
    }
    
    /**
     * Sets the "revisionsPassword" attribute
     */
    public void setRevisionsPassword(byte[] revisionsPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISIONSPASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISIONSPASSWORD$2);
            }
            target.setByteArrayValue(revisionsPassword);
        }
    }
    
    /**
     * Sets (as xml) the "revisionsPassword" attribute
     */
    public void xsetRevisionsPassword(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex revisionsPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().find_attribute_user(REVISIONSPASSWORD$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedShortHex)get_store().add_attribute_user(REVISIONSPASSWORD$2);
            }
            target.set(revisionsPassword);
        }
    }
    
    /**
     * Unsets the "revisionsPassword" attribute
     */
    public void unsetRevisionsPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REVISIONSPASSWORD$2);
        }
    }
    
    /**
     * Gets the "lockStructure" attribute
     */
    public boolean getLockStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKSTRUCTURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCKSTRUCTURE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lockStructure" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLockStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKSTRUCTURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCKSTRUCTURE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "lockStructure" attribute
     */
    public boolean isSetLockStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKSTRUCTURE$4) != null;
        }
    }
    
    /**
     * Sets the "lockStructure" attribute
     */
    public void setLockStructure(boolean lockStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKSTRUCTURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKSTRUCTURE$4);
            }
            target.setBooleanValue(lockStructure);
        }
    }
    
    /**
     * Sets (as xml) the "lockStructure" attribute
     */
    public void xsetLockStructure(org.apache.xmlbeans.XmlBoolean lockStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKSTRUCTURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKSTRUCTURE$4);
            }
            target.set(lockStructure);
        }
    }
    
    /**
     * Unsets the "lockStructure" attribute
     */
    public void unsetLockStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKSTRUCTURE$4);
        }
    }
    
    /**
     * Gets the "lockWindows" attribute
     */
    public boolean getLockWindows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKWINDOWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCKWINDOWS$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lockWindows" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLockWindows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKWINDOWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCKWINDOWS$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "lockWindows" attribute
     */
    public boolean isSetLockWindows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKWINDOWS$6) != null;
        }
    }
    
    /**
     * Sets the "lockWindows" attribute
     */
    public void setLockWindows(boolean lockWindows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKWINDOWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKWINDOWS$6);
            }
            target.setBooleanValue(lockWindows);
        }
    }
    
    /**
     * Sets (as xml) the "lockWindows" attribute
     */
    public void xsetLockWindows(org.apache.xmlbeans.XmlBoolean lockWindows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKWINDOWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKWINDOWS$6);
            }
            target.set(lockWindows);
        }
    }
    
    /**
     * Unsets the "lockWindows" attribute
     */
    public void unsetLockWindows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKWINDOWS$6);
        }
    }
    
    /**
     * Gets the "lockRevision" attribute
     */
    public boolean getLockRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKREVISION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCKREVISION$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lockRevision" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLockRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKREVISION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCKREVISION$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "lockRevision" attribute
     */
    public boolean isSetLockRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCKREVISION$8) != null;
        }
    }
    
    /**
     * Sets the "lockRevision" attribute
     */
    public void setLockRevision(boolean lockRevision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCKREVISION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCKREVISION$8);
            }
            target.setBooleanValue(lockRevision);
        }
    }
    
    /**
     * Sets (as xml) the "lockRevision" attribute
     */
    public void xsetLockRevision(org.apache.xmlbeans.XmlBoolean lockRevision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCKREVISION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCKREVISION$8);
            }
            target.set(lockRevision);
        }
    }
    
    /**
     * Unsets the "lockRevision" attribute
     */
    public void unsetLockRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCKREVISION$8);
        }
    }
}
