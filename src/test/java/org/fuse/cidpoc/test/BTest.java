package org.fuse.cidpoc.test;

import org.fuse.cidpoc.a.Item;
import org.fuse.cidpoc.a.Utils;
import org.fuse.cidpoc.b.B;
import org.junit.Assert;
import org.junit.Test;

public class BTest {

    @Test
    public void testB() throws Exception {
        
        Item item = new B();
        item.transitiveStatus();
        
        String version = Utils.getVersion(item.getClass());
        String status = Utils.getStatus(item.getClass());
        Assert.assertEquals("B-" + version + " is " + status, item.getMessage());
    }
}
