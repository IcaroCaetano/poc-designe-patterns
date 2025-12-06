package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

/**
 * Abstract base class implementing the Template Method pattern
 * for fraud-checking workflows.
 *
 * <p>
 * This class defines the fixed algorithm for processing a fraud
 * validation request. The {@link #process(Request)} method is
 * declared as {@code final} to ensure that the order of execution
 * remains unchanged across all implementations.
 * </p>
 *
 * <p>
 * Subclasses are required to implement specific portions of the
 * workflow by overriding:
 * </p>
 *
 * <ul>
 *     <li>{@link #specificValidation(Request)}</li>
 *     <li>{@link #calculateRiskScore(Request)}</li>
 * </ul>
 *
 * <p>
 * Common steps (base validation and final decision) are implemented
 * in this abstract class to ensure consistency between all fraud
 * check strategies.
 * </p>
 *
 * <p><b>Workflow steps defined by the template:</b></p>
 * <ol>
 *     <li>Validate base request data</li>
 *     <li>Run subclass-specific validation</li>
 *     <li>Calculate fraud score</li>
 *     <li>Issue final approval or rejection</li>
 * </ol>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     Request request = new Request();
 *
 *     AbstractFraudCheck checker = new BasicFraudCheck();
 *     checker.process(request);
 * </pre>
 *
 * @see BasicFraudCheck
 * @see AdvancedFraudCheck
 * @author Icaro
 * @version 1.0
 */
public abstract class AbstractFraudCheck {

    /**
     * Executes the complete fraud-check algorithm in a predefined order.
     * <p>
     * This method is final to prevent subclasses from altering the
     * structure of the algorithm.
     * </p>
     *
     * @param request the request object containing fraud evaluation data
     */
    public final void process(Request request) {

        validateBaseData(request);
        specificValidation(request);
        calculateRiskScore(request);
        finalDecision(request);
    }

    /**
     * Step 1 — Performs common, mandatory validations required by all
     * implementations (e.g., basic field checks).
     *
     * @param request the request to validate
     */
    protected void validateBaseData(Request request) {
        System.out.println("Validating basic request fields...");
    }

    /**
     * Step 2 — Performs subclass-specific validation logic.
     * <p>
     * Implementations define their own custom validation rules,
     * such as format checks, biometric verification, or external
     * data lookups.
     * </p>
     *
     * @param request the request being validated
     */
    protected abstract void specificValidation(Request request);

    /**
     * Step 3 — Computes the fraud score using rules or heuristics
     * defined by the subclass.
     *
     * @param request the request whose fraud score should be updated
     */
    protected abstract void calculateRiskScore(Request request);

    /**
     * Step 4 — Issues the final approval or rejection of the request
     * based on the calculated fraud score.
     *
     * @param request the request containing the evaluated fraud score
     */
    protected void finalDecision(Request request) {
        if (request.getFraudScore() > 70) {
            System.out.println("High risk — Request rejected!");
        } else {
            System.out.println("Request approved.");
        }
    }
}
