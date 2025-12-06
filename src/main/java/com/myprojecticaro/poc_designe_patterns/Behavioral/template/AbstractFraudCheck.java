package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

/**
 * Template Method for defining a complete fraud check workflow.
 *
 * <p>The method {@link #process(Request)} defines the fixed steps of the
 * algorithm while subclasses customize specific parts of the validation.</p>
 */
public abstract class AbstractFraudCheck {

    /**
     * Final method defining the algorithm steps.
     * Subclasses cannot override the order of execution.
     */
    public final void process(Request request) {

        validateBaseData(request);      
        specificValidation(request);
        calculateRiskScore(request);
        finalDecision(request);
    }

    /**
     * Step 1 — common to all implementations.
     */
    protected void validateBaseData(Request request) {
        System.out.println("Validating basic request fields...");
    }

    /**
     * Step 2 — subclass-specific validation rules.
     */
    protected abstract void specificValidation(Request request);

    /**
     * Step 3 — subclass-specific fraud score calculation.
     */
    protected abstract void calculateRiskScore(Request request);

    /**
     * Step 4 — final decision common to all.
     */
    protected void finalDecision(Request request) {
        if (request.getFraudScore() > 70) {
            System.out.println("High risk — Request rejected!");
        } else {
            System.out.println("Request approved.");
        }
    }
}

