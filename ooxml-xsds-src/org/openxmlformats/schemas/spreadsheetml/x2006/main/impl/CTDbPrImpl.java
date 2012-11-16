/*
 * XML Type:  CT_DbPr
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main.impl;
/**
 * An XML CT_DbPr(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public class CTDbPrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDbPr
{
    
    public CTDbPrImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONNECTION$0 = 
        new javax.xml.namespace.QName("", "connection");
    private static final javax.xml.namespace.QName COMMAND$2 = 
        new javax.xml.namespace.QName("", "command");
    private static final javax.xml.namespace.QName SERVERCOMMAND$4 = 
        new javax.xml.namespace.QName("", "serverCommand");
    private static final javax.xml.namespace.QName COMMANDTYPE$6 = 
        new javax.xml.namespace.QName("", "commandType");
    
    
    /**
     * Gets the "connection" attribute
     */
    public java.lang.String getConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "connection" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetConnection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CONNECTION$0);
            return target;
        }
    }
    
    /**
     * Sets the "connection" attribute
     */
    public void setConnection(java.lang.String connection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTION$0);
            }
            target.setStringValue(connection);
        }
    }
    
    /**
     * Sets (as xml) the "connection" attribute
     */
    public void xsetConnection(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring connection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(CONNECTION$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(CONNECTION$0);
            }
            target.set(connection);
        }
    }
    
    /**
     * Gets the "command" attribute
     */
    public java.lang.String getCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMAND$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "command" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMAND$2);
            return target;
        }
    }
    
    /**
     * True if has "command" attribute
     */
    public boolean isSetCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMAND$2) != null;
        }
    }
    
    /**
     * Sets the "command" attribute
     */
    public void setCommand(java.lang.String command)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMAND$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMAND$2);
            }
            target.setStringValue(command);
        }
    }
    
    /**
     * Sets (as xml) the "command" attribute
     */
    public void xsetCommand(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring command)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(COMMAND$2);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(COMMAND$2);
            }
            target.set(command);
        }
    }
    
    /**
     * Unsets the "command" attribute
     */
    public void unsetCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMAND$2);
        }
    }
    
    /**
     * Gets the "serverCommand" attribute
     */
    public java.lang.String getServerCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERCOMMAND$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverCommand" attribute
     */
    public org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetServerCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SERVERCOMMAND$4);
            return target;
        }
    }
    
    /**
     * True if has "serverCommand" attribute
     */
    public boolean isSetServerCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVERCOMMAND$4) != null;
        }
    }
    
    /**
     * Sets the "serverCommand" attribute
     */
    public void setServerCommand(java.lang.String serverCommand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVERCOMMAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVERCOMMAND$4);
            }
            target.setStringValue(serverCommand);
        }
    }
    
    /**
     * Sets (as xml) the "serverCommand" attribute
     */
    public void xsetServerCommand(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring serverCommand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring target = null;
            target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().find_attribute_user(SERVERCOMMAND$4);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring)get_store().add_attribute_user(SERVERCOMMAND$4);
            }
            target.set(serverCommand);
        }
    }
    
    /**
     * Unsets the "serverCommand" attribute
     */
    public void unsetServerCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVERCOMMAND$4);
        }
    }
    
    /**
     * Gets the "commandType" attribute
     */
    public long getCommandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMANDTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMMANDTYPE$6);
            }
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "commandType" attribute
     */
    public org.apache.xmlbeans.XmlUnsignedInt xgetCommandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COMMANDTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_default_attribute_value(COMMANDTYPE$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "commandType" attribute
     */
    public boolean isSetCommandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMMANDTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "commandType" attribute
     */
    public void setCommandType(long commandType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMANDTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMANDTYPE$6);
            }
            target.setLongValue(commandType);
        }
    }
    
    /**
     * Sets (as xml) the "commandType" attribute
     */
    public void xsetCommandType(org.apache.xmlbeans.XmlUnsignedInt commandType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(COMMANDTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(COMMANDTYPE$6);
            }
            target.set(commandType);
        }
    }
    
    /**
     * Unsets the "commandType" attribute
     */
    public void unsetCommandType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMMANDTYPE$6);
        }
    }
}
