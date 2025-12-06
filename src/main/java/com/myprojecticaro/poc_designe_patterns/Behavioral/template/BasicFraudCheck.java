package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

/**
 * Concrete implementation of {@link AbstractFraudCheck} that performs
 * a simple and lightweight fraud evaluation.
 *
 * <p>
 * This class represents a basic fraud-checking workflow where minimal
 * validations are executed, such as verifying CPF formatting and
 * applying a low-complexity fraud score calculation.
 * </p>
 *
 * <p>
 * It overrides the template-defined steps:
 * <ul>
 *     <li>{@link #specificValidation(Request)} — Performs basic data validation.</li>
 *     <li>{@link #calculateRiskScore(Request)} — Assigns a fixed low-risk score.</li>
 * </ul>
 * The general processing flow is controlled by the {@link AbstractFraudCheck#process(Request)}
 * method, which enforces the algorithm structure.
 * </p>
 *
 * <p><b>Use case:</b>  
 * Ideal for scenarios where performance is more important than accuracy,
 * or when dealing with low-risk operations.</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     Request request = new Request();
 *     AbstractFraudCheck check = new BasicFraudCheck();
 *     check.process(request);
 *
 *     System.out.println(request.getFraudScore()); // -> 30
 * </pre>
 *
 * @author Icaro
 * @version 1.0
 */
public class BasicFraudCheck extends AbstractFraudCheck {

    /**
     * Performs basic validation on the request, such as checking
     * whether the CPF format is correct.
     *
     * @param request the request being validated
     */
    @Override
    protected void specificValidation(Request request) {
        System.out.println("Basic validation: checking CPF format…");
    }

    /**
     * Calculates and assigns a simple fraud score, representing
     * a low-risk assessment for the request.
     *
     * @param request the request whose fraud score is updated
     */
    @Override
    protected void calculateRiskScore(Request request) {
        System.out.println("Calculating basic fraud score…");
        request.setFraudScore(30);
    }
}
