package org.ovirt.engine.ui.webadmin.widget.renderer;

import com.google.gwt.text.shared.AbstractRenderer;

public class DiskSizeRenderer<T extends Number> extends AbstractRenderer<T> {

    public enum DiskSizeUnit {
        BYTE,
        GIGABYTE;
    }

    private final DiskSizeUnit unit;

    public DiskSizeRenderer(DiskSizeUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("The unit can not be null!");
        }

        this.unit = unit;
    }

    @Override
    public String render(T size) {
        if (size == null) {
            return "< 1 GB";
        }

        long sizeInGB = -1;

        switch (unit) {
        case BYTE:
            sizeInGB = (long) (size.longValue() / Math.pow(1024, 3));
            break;
        case GIGABYTE:
            sizeInGB = size.longValue();
            break;
        }

        return sizeInGB >= 1 ? sizeInGB + " GB" : "< 1 GB";
    }

}
