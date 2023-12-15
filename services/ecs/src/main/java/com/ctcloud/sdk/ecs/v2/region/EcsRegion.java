package com.ctcloud.sdk.ecs.v2.region;

import com.ctcloud.sdk.core.region.IRegionProvider;
import com.ctcloud.sdk.core.region.Region;
import com.ctcloud.sdk.core.region.RegionProviderChain;
import com.ctcloud.sdk.core.utils.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EcsRegion {

    public static final Region RU_MOSCOW_1 = new Region("ru-moscow-1", "https://ecs.ru-moscow-1.hc.sbercloud.ru");

    private static final IRegionProvider PROVIDER = RegionProviderChain.getDefaultRegionProviderChain("ECS");

    private static final Map<String, Region> STATIC_FIELDS = createStaticFields();

    private static Map<String, Region> createStaticFields() {
        Map<String, Region> map = new HashMap<>();
        map.put("ru-moscow-1", RU_MOSCOW_1);
        return Collections.unmodifiableMap(map);
    }

    public static Region valueOf(String regionId) {
        if (StringUtils.isEmpty(regionId)) {
            throw new IllegalArgumentException("Unexpected empty parameter: regionId.");
        }

        Region result = PROVIDER.getRegion(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }

        result = STATIC_FIELDS.get(regionId);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected regionId: " + regionId);
    }
}
