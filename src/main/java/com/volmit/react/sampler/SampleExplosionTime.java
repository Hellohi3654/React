package com.volmit.react.sampler;

import com.volmit.react.React;
import com.volmit.react.api.IFormatter;
import com.volmit.react.api.MSampler;
import com.volmit.react.api.SampledType;
import com.volmit.react.util.F;
import primal.util.text.C;

public class SampleExplosionTime extends MSampler {
    private final IFormatter formatter;

    public SampleExplosionTime() {
        formatter = new IFormatter() {
            @Override
            public String from(double d) {
                return F.time(d / 1000000.0, 1);
            }
        };
    }

    @Override
    public void construct() {
        setName("Explosion MS"); //$NON-NLS-1$
        setDescription("Calculates milliseconds spent on explosions"); //$NON-NLS-1$
        setID(SampledType.EXPLOSION_TIME.toString());
        setValue(0);
        setColor(C.LIGHT_PURPLE, C.LIGHT_PURPLE);
        setInterval(1);
    }

    @Override
    public void sample() {
        setValue(React.instance.explosiveController.getaCSMS().getAverage());
    }

    @Override
    public String get() {
        return getFormatter().from(getValue());
    }

    @Override
    public IFormatter getFormatter() {
        return formatter;
    }
}
