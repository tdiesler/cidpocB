package org.fuse.cidpoc.b;

import java.util.Collections;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Utils;

public class B extends Item {

    @Override
    public Capability getCapability() {
        return Utils.getCapability(B.class);
    }

    @Override
    public List<Item> getDependencies() {
        return Collections.emptyList();
    }
}
