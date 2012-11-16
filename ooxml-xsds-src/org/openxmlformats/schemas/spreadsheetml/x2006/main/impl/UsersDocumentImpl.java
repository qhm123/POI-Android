/*
 * An XML document type.
 * Localname: users
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.UsersDocument
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * A document containing one users(@http://schemas.openxmlformats.org/spreadsheetml/2006/main) element.
 *
 * This is a complex type.
 */
public class UsersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.UsersDocument
{
    
    public UsersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "users");
    
    
    /**
     * Gets the "users" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers getUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers)get_store().find_element_user(USERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "users" element
     */
    public void setUsers(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers users)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers)get_store().find_element_user(USERS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers)get_store().add_element_user(USERS$0);
            }
            target.set(users);
        }
    }
    
    /**
     * Appends and returns a new empty "users" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers addNewUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUsers)get_store().add_element_user(USERS$0);
            return target;
        }
    }
}
