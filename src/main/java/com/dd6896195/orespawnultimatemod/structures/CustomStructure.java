package com.dd6896195.orespawnultimatemod.structures;

import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

public class CustomStructure extends Structure {
    
    public CustomStructure(StructureSettings settings) {
        super(settings);
    }
    
    @Override
    public StructureType<?> type() {
        return StructureType.JIGSAW;
    }
    
    @Override
    public void generatePieces(StructurePiecesBuilder builder, Structure.GenerationContext context) {
        // Implement structure generation logic here
    }
}