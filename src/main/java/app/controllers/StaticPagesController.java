package app.controllers;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class StaticPagesController {

	@Get({ "/", "/home" })
	public void home() {

	}

	@Get("/help")
	public void help() {

	}

	@Get("/about")
	public void about() {

	}

	@Get("/contact")
	public void contact() {

	}
}