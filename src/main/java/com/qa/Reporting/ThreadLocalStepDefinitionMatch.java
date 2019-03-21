package com.qa.Reporting;

import cucumber.runtime.StepDefinitionMatch;

public class ThreadLocalStepDefinitionMatch {
	private static final ThreadLocal<StepDefinitionMatch> threadStepDefMatch = new InheritableThreadLocal<StepDefinitionMatch>();

    private ThreadLocalStepDefinitionMatch() {
    }

    public static StepDefinitionMatch get() {
        return threadStepDefMatch.get();
    }

    public static void set(StepDefinitionMatch match) {
        threadStepDefMatch.set(match);
    }

    public static void remove() {
        threadStepDefMatch.remove();
    }
}
