package applications;

import graphics.Renderer;
import graphics.primitives.Primitive.Primitives;
import utility.vec2;

public class Console extends GUIWindow {

	public Console(vec2 position, vec2 size) {
		this.position = position;
		this.size = size;

		this.renderer = new Renderer(Primitives.Quad, 10);
	}
	
	@Override
	public void draw() {
		drawFrame();
	}

	@Override
	public void cursor(float m_x, float m_y, int button, int m_action) {
		buttons(m_x, m_y, button, m_action);
	}
	
	
	
}
