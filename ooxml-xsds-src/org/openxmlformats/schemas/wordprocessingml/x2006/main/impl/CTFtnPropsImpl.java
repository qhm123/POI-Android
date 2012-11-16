/*
 * XML Type:  CT_FtnProps
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_FtnProps(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTFtnPropsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnProps
{
    
    public CTFtnPropsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "pos");
    private static final javax.xml.namespace.QName NUMFMT$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numFmt");
    private static final javax.xml.namespace.QName NUMSTART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numStart");
    private static final javax.xml.namespace.QName NUMRESTART$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "numRestart");
    
    
    /**
     * Gets the "pos" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pos" element
     */
    public boolean isSetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POS$0) != 0;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnPos)get_store().add_element_user(POS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "pos" element
     */
    public void unsetPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POS$0, 0);
        }
    }
    
    /**
     * Gets the "numFmt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt getNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numFmt" element
     */
    public boolean isSetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMFMT$2) != 0;
        }
    }
    
    /**
     * Sets the "numFmt" element
     */
    public void setNumFmt(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt numFmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().find_element_user(NUMFMT$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
            }
            target.set(numFmt);
        }
    }
    
    /**
     * Appends and returns a new empty "numFmt" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt addNewNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumFmt)get_store().add_element_user(NUMFMT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "numFmt" element
     */
    public void unsetNumFmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMFMT$2, 0);
        }
    }
    
    /**
     * Gets the "numStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber getNumStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMSTART$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numStart" element
     */
    public boolean isSetNumStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMSTART$4) != 0;
        }
    }
    
    /**
     * Sets the "numStart" element
     */
    public void setNumStart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber numStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().find_element_user(NUMSTART$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMSTART$4);
            }
            target.set(numStart);
        }
    }
    
    /**
     * Appends and returns a new empty "numStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber addNewNumStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber)get_store().add_element_user(NUMSTART$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numStart" element
     */
    public void unsetNumStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMSTART$4, 0);
        }
    }
    
    /**
     * Gets the "numRestart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart getNumRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart)get_store().find_element_user(NUMRESTART$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numRestart" element
     */
    public boolean isSetNumRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMRESTART$6) != 0;
        }
    }
    
    /**
     * Sets the "numRestart" element
     */
    public void setNumRestart(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart numRestart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart)get_store().find_element_user(NUMRESTART$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart)get_store().add_element_user(NUMRESTART$6);
            }
            target.set(numRestart);
        }
    }
    
    /**
     * Appends and returns a new empty "numRestart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart addNewNumRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumRestart)get_store().add_element_user(NUMRESTART$6);
            return target;
        }
    }
    
    /**
     * Unsets the "numRestart" element
     */
    public void unsetNumRestart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMRESTART$6, 0);
        }
    }
}
