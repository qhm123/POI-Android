/*
 * XML Type:  CT_Connections
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_Connections(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTConnectionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnections
{
    
    public CTConnectionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTION$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/spreadsheetml/2006/main", "connection");
    
    
    /**
     * Gets a List of "connection" elements
     */
    public java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection> getConnectionList()
    {
        final class ConnectionList extends java.util.AbstractList<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection>
        {
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection get(int i)
                { return CTConnectionsImpl.this.getConnectionArray(i); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection set(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection o)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection old = CTConnectionsImpl.this.getConnectionArray(i);
                CTConnectionsImpl.this.setConnectionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection o)
                { CTConnectionsImpl.this.insertNewConnection(i).set(o); }
            
            public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection remove(int i)
            {
                org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection old = CTConnectionsImpl.this.getConnectionArray(i);
                CTConnectionsImpl.this.removeConnection(i);
                return old;
            }
            
            public int size()
                { return CTConnectionsImpl.this.sizeOfConnectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConnectionList();
        }
    }
    
    /**
     * Gets array of all "connection" elements
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection[] getConnectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONNECTION$0, targetList);
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection[] result = new org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "connection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection getConnectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection)get_store().find_element_user(CONNECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "connection" element
     */
    public int sizeOfConnectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONNECTION$0);
        }
    }
    
    /**
     * Sets array of all "connection" element
     */
    public void setConnectionArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection[] connectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(connectionArray, CONNECTION$0);
        }
    }
    
    /**
     * Sets ith "connection" element
     */
    public void setConnectionArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection connection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection)get_store().find_element_user(CONNECTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(connection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "connection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection insertNewConnection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection)get_store().insert_element_user(CONNECTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "connection" element
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection addNewConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTConnection)get_store().add_element_user(CONNECTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "connection" element
     */
    public void removeConnection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONNECTION$0, i);
        }
    }
}
