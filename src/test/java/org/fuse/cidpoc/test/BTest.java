package org.fuse.cidpoc.test;

import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Item.Capability;
import org.fuse.cidpoc.Item.Requirement;
import org.fuse.cidpoc.b.B;
import org.junit.Assert;
import org.junit.Test;

public class BTest {

    @Test
    public void testB() throws Exception {
        
        Item item = new B();
        item.transitiveStatus();
        
        List<Item> deps = item.getDependencies();
        Assert.assertEquals(0, deps.size());

        Capability cap = item.getCapability();
        Assert.assertEquals("B", cap.getName());
        Assert.assertTrue(cap.getValue() > 0);
        
        List<Requirement> reqs = item.getRequirements();
        Assert.assertEquals(0, reqs.size());

        String version = Item.getVersion(item.getClass());
        Assert.assertEquals("B-" + version, item.getVName());
        Assert.assertEquals("is satisfied", item.getStatus());
    }
}
