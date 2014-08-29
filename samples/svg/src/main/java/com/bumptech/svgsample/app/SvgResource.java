package com.bumptech.svgsample.app;

import com.bumptech.glide.load.engine.Resource;
import com.caverock.androidsvg.SVG;

/**
 * Resource wrapping a {@link SVG}.
 */
public class SvgResource implements Resource<SVG> {
    private final SVG svg;

    public SvgResource(SVG svg) {
        this.svg = svg;
    }

    @Override
    public SVG get() {
        return svg;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public void recycle() {
        // can't recycle SVGs
    }
}
