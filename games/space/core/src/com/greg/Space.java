package com.greg;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.TimeUtils;

import java.util.Iterator;


public class Space extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, tNave, tMissil, tInimigo;
	private Sprite nave, missil;
	private float xNave, yNave, velocidade, xMissil, yMissil;
	private boolean atacar, gameover;
	private Array<Rectangle> inimigos;
	private long inimigoTempo;
	private int pontuacao, poder, numeroInimigos, nivel, velocidadeNave;

	private FreeTypeFontGenerator gerador;
	private FreeTypeFontGenerator.FreeTypeFontParameter parametro;
	private BitmapFont bitmap;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("bg.png");
		// Nave
		tNave = new Texture("spaceship.png");
		nave = new Sprite(tNave);
		xNave = 0;
		yNave = 0;
		velocidade = 10;
		nivel = 0;

		// Missil
		tMissil = new Texture("missile.png");
		missil = new Sprite(tMissil);
		xMissil = xNave;
		yMissil = yNave;

		// Inimigos
		tInimigo = new Texture("enemy.png");
		inimigos = new Array<Rectangle>();
		inimigoTempo = 0;

		// pontuações, poderes e quantidade de inimigos
		pontuacao = 0;
		poder = 0;
		numeroInimigos = 99999999;

		velocidadeNave = 200;

		// Fontes
		gerador = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		parametro = new FreeTypeFontGenerator.FreeTypeFontParameter();

		// Configurações do parametro na tela da fonte
		parametro.size = 30;
		parametro.borderWidth = 1;
		parametro.borderColor = Color.BLACK;
		parametro.color = Color.WHITE;
		bitmap = gerador.generateFont(parametro);

		// Outras informações
		gameover = false;
	}

	@Override
	public void render () {
		// Métodos criados para auxiliar na cena
		this.moverNave();
		this.lancarMissil();
		this.moverInimigos();

		// Desenhando objetos
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		// Condição de renderização dos sprites na tela
		if (!gameover) {
			if (atacar) {
				batch.draw(missil, xMissil, yMissil);
			}

			batch.draw(nave, xNave, yNave);
			// Desenhar os inimigos em tela
			for (Rectangle inimigo: inimigos) {
				batch.draw(tInimigo, inimigo.x, inimigo.y);
			}
			bitmap.draw(batch, "Pontuação: " + pontuacao, 20, Gdx.graphics.getHeight() - 20);
			bitmap.draw(batch, "Nível: " + nivel, Gdx.graphics.getWidth() / 2 , Gdx.graphics.getHeight() - 20);
			bitmap.draw(batch, "Poder: " + poder, Gdx.graphics.getWidth() - 150, Gdx.graphics.getHeight() - 20);
		} else {
			bitmap.draw(batch, "Pontuação: " + pontuacao, 20, Gdx.graphics.getHeight() - 20);
			bitmap.draw(batch, "GAME OVER", Gdx.graphics.getWidth() - 150, Gdx.graphics.getHeight() - 20);

			if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
				inimigos = new Array<Rectangle>();
				gameover = false;
				pontuacao = 0;
				poder = 3;
				xNave = 0;
				yNave = 0;
			}
		}

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		tNave.dispose();
	}

	// Refente aos objetos da cena.
	private void moverNave() {
		// Movimentação da nave com base na largura da tela
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			if(xNave < Gdx.graphics.getWidth() - nave.getWidth()) {
				xNave += velocidade;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			if(xNave > 0 ) {
				xNave -= velocidade;
			}
		}
		// Movimentação da nave com base na altura da tela
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			if (yNave > 0) {
				yNave -= velocidade;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			if (yNave < Gdx.graphics.getHeight() - nave.getHeight()) {
				yNave += velocidade;
			}
		}
	}

	private void lancarMissil() {
		// O Missil só é lançado quando o atacar = false e precionar a tecla de espaço
		if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && !atacar && !gameover) {
			atacar = true;
			yMissil = yNave + nave.getHeight() / 2 - 12;
		}
		// Condição para movimento do missil com base na largura e altura da nave e largura da tela.
		if (atacar) {
			if (xMissil < Gdx.graphics.getWidth()) {
				xMissil += 40;
			} else {
				xMissil = xNave + nave.getWidth() / 2;
				atacar = false;
			}
		} else {
			xMissil = xNave + nave.getWidth() / 2;
			yMissil = yNave + nave.getHeight() / 2 - 12;
		}
	}

	// Criando os inimigos em tela
	private void spawnInimigos() {
		// Cria um inimigo do tipo Rectangle com a largura da tela
		// Criando randomicamente no eixo Y da tela
		// Para depoisa dicionar no Array de inimigos
		Rectangle inimigo = new Rectangle(
				Gdx.graphics.getWidth(),
				MathUtils.random(0, Gdx.graphics.getHeight() - tInimigo.getHeight()),
				tInimigo.getWidth(),
				tInimigo.getHeight()
		);
		inimigos.add(inimigo);
		inimigoTempo = TimeUtils.nanoTime();
	}

	// Movimenta os inimigos
	private void moverInimigos() {
		// Verifica o tempo de criação de cada inimigo para poder criar
		if (TimeUtils.nanoTime() - inimigoTempo > numeroInimigos) {
			this.spawnInimigos();
		}

		for (Iterator<Rectangle> i = inimigos.iterator(); i.hasNext();) {
			Rectangle inimigo = i.next();
			inimigo.x -= velocidadeNave * Gdx.graphics.getDeltaTime();

			// Colisão referente ao Míssil
			if (colisor(inimigo.x, inimigo.y, inimigo.getWidth(), inimigo.getHeight(), xMissil, yMissil, missil.getWidth(), missil.getHeight()) && atacar) {
				++pontuacao;
				/*if (pontuacao % 15 == 0) {
					nivel++;
					velocidadeNave += 10;
				}*/
				if (pontuacao % 10 == 0) {
					++nivel;
					numeroInimigos -= 100;
					velocidadeNave += 10;
				}
				atacar = false;
				i.remove();
			// Colisão referente a Nave
			} else if (colisor(inimigo.x, inimigo.y, inimigo.getWidth(), inimigo.getHeight(), xNave, yNave, nave.getWidth(), nave.getHeight()) && !gameover){
				--poder;
				if (poder <= 0) {
					gameover = true;
				}
				i.remove();
			}

			if (inimigo.x + tInimigo.getWidth() < 0) {
				i.remove();
			}
		}
	}

	// Colisor entre dois objetos
	private boolean colisor(
			float x_inimigo,
			float y_inimigo,
			float w_inimigo,
			float h_inimigo,
			float x_nave,
			float y_nave,
			float w_nave,
			float h_nave
			)
	{
		if (x_inimigo + w_inimigo > x_nave && x_inimigo < x_nave + w_nave && y_inimigo + h_inimigo > y_nave && y_inimigo < y_nave + h_nave) {
			return true;
		}
		return false;
	}

}
