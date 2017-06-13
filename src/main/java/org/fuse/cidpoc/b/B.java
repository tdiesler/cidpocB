package org.fuse.cidpoc.b;

import java.util.Collections;
import java.util.List;

import org.fuse.cidpoc.Item;

public class B extends Item {

    @Override
    public Capability getCapability() {
        return new Capability("B", 5);
    }

    @Override
    public List<Item> getDependencies() {
        return Collections.emptyList();
    }
}
