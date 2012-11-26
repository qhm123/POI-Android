package nus.font;

import java.awt.font.TextAttribute;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class AttributeMap extends AbstractMap<TextAttribute, Object> {
    private AttributeValues values;
    private Map<TextAttribute, Object> delegateMap;

    public AttributeMap(AttributeValues values) {
        this.values = values;
    }

    public Set<Entry<TextAttribute, Object>> entrySet() {
        return delegate().entrySet();
    }

    public Object put(TextAttribute key, Object value) {
        return delegate().put(key, value);
    }

    // internal API
    public AttributeValues getValues() {
        return values;
    }

    private static boolean first = false; // debug
    private Map<TextAttribute, Object> delegate() {
        if (delegateMap == null) {
            if (first) {
                first = false;
                Thread.dumpStack();
            }
            delegateMap = values.toMap(new HashMap<TextAttribute, Object>(27));

            // nuke values, once map is accessible it might be mutated and values would
            // no longer reflect its contents
            values = null;
        }

        return delegateMap;
    }

    public String toString() {
        if (values != null) {
            return "map of " + values.toString();
        }
        return super.toString();
    }
}

