package com.spring.ioc.DependencyInjection;

import javax.annotation.PostConstruct;

public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();

	}

	@PostConstruct
	public void init() {
		System.out.println("We are called after the constructor in editor.");
	}

}
