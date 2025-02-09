package gg.moonflower.tolerablecreepers.client.render;

import com.mojang.blaze3d.vertex.VertexConsumer;
import gg.moonflower.pollen.pinwheel.api.client.geometry.GeometryModel;
import gg.moonflower.pollen.pinwheel.api.client.geometry.GeometryModelWrapper;
import gg.moonflower.pollen.pinwheel.api.client.texture.GeometryAtlasTexture;
import gg.moonflower.pollen.pinwheel.api.common.texture.GeometryModelTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class CreepieModelWrapper extends GeometryModelWrapper {
    @Override
    public VertexConsumer getBuffer(MultiBufferSource buffer, GeometryAtlasTexture atlas, GeometryModelTexture texture, @Nullable Consumer<RenderType.CompositeState.CompositeStateBuilder> renderTypeConsumer) {
        return buffer.getBuffer(texture.getLayer().getRenderType(texture, atlas, renderTypeConsumer));
    }
}
