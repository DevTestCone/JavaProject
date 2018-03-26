package dev.game.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * @author Nemanja Djorovic
 */
public class Assets {

    private static final int width = 64, height = 64;

    public static BufferedImage player, dirt, grass, stone, wall;

    public static void init(){ 
//            Klasa SpiriteSheet koja koristi u ( * ) klasu ImageLoader
        SpriteSheet sheetCharacter = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet_characters.png"));
        SpriteSheet sheetTiles = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet_tiles.png"));

        player = sheetCharacter.crop(0, 0, width, height);
        dirt = sheetTiles.crop(width * 4, 0, width, height);
        grass = sheetTiles.crop(0, 0, width, height);
        stone = sheetTiles.crop(width * 6, 0, width, height);
        wall = sheetTiles.crop(width * 6, height * 7, width, height);

    }
}
