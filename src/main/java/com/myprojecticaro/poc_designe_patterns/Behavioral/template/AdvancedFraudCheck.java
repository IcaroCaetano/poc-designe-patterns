package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

/**
 * Advanced implementation of {@link AbstractFraudCheck} that performs
 * a sophisticated and high-accuracy fraud evaluation process.
 *
 * <p>
 * This class represents a more robust fraud verification workflow 
 * that applies multiple security mechanisms such as biometrics,
 * device fingerprinting, and machine-learning-based scoring.
 * </p>
 *
 * <p>
 * It overrides the customizable steps of the template:
 * <ul>
 *     <li>{@link #specificValidation(Request)} — Executes advanced validation steps.</li>
 *     <li>{@link #calculateRiskScore(Request)} — Computes a high-accuracy fraud score.</li>
 * </ul>
 * The overall algorithm structure is enforced by the
 * {@link AbstractFraudCheck#process(Request)} method.
 * </p>
 *
 * <p><b>Use case:</b><br>
 * This implementation is suitable for high-risk operations,
 * onboarding workflows, financial transactions, or any scenario
 * requiring deeper fraud detection.</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     Request request = new Request();
 *     AbstractFraudCheck check = new AdvancedFraudCheck();
 *     check.process(request);
 *
 *     System.out.println(request.getFraudScore()); // -> 85
 * </pre>
 *
 * @author Icaro
 * @version 1.0
 */
public class AdvancedFraudCheck extends AbstractFraudCheck {

    /**
     * Performs advanced validation, including biometrics,
     * device fingerprinting, and other high-level security checks.
     *
     * @param request the request being validated
     */
    @Override
    protected void specificValidation(Request request) {
        System.out.println("Advanced validation: running biometrics & device fingerprinting…");
    }

    /**
     * Calculates and assigns an advanced fraud score using
     * machine learning predictions or risk analytics.
     *
     * @param request the request whose fraud score is updated
     */
    @Override
    protected void calculateRiskScore(Request request) {
        System.out.println("Calculating advanced risk score using ML…");
        request.setFraudScore(85);
    }
}
