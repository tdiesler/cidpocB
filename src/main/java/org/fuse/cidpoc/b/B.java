package org.fuse.cidpoc.b;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.a.A;
import org.fuse.cidpoc.a.Item;

public class B implements Item {

    Item[] deps = new Item[] { new A() };

    @Override
    public List<Item> getDependecies() {
        return Arrays.asList(deps);
    }
}
