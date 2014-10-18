package ru.vsu.csf.enlightened.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import ru.vsu.csf.enlightened.gameobjects.Map;
import ru.vsu.csf.enlightened.renderers.MapRenderer;

public class GameScreen extends SlasherScreen{

    private MapRenderer mapRenderer;

    public GameScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        mapRenderer = new MapRenderer(new Map());

        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keycode) {
                return true;
            }
        });
    }

    @Override
    public void render(float delta) {
        delta = Math.min(0.06f, Gdx.graphics.getDeltaTime());

        super.render(delta);

        mapRenderer.render(delta);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}