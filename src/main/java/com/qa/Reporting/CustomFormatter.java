package com.qa.Reporting;

import cucumber.runtime.StepDefinitionMatch;
import gherkin.formatter.Reporter;
import gherkin.formatter.model.Match;
import gherkin.formatter.model.Result;

public class CustomFormatter implements Reporter{

	public void before(Match match, Result result) {
		// TODO Auto-generated method stub
		
	}


	public void result(Result result) {
		// TODO Auto-generated method stub
		
	}


	public void after(Match match, Result result) {
		// TODO Auto-generated method stub
		
	}


	public void match(Match match) {
		// TODO Auto-generated method stub
		ThreadLocalStepDefinitionMatch.set((StepDefinitionMatch)match);
	}


	public void embedding(String mimeType, byte[] data) {
		// TODO Auto-generated method stub
		
	}


	public void write(String text) {
		// TODO Auto-generated method stub
		
	}

}
