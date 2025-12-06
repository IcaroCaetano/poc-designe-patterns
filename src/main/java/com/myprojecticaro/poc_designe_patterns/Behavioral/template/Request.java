package com.myprojecticaro.poc_designe_patterns.behavioral.template_method;

/**
 * Represents a data object used during fraud evaluation in the
 * Template Method pattern workflow.
 *
 * <p>
 * This class holds information that is processed and mutated by
 * different steps of the fraud-checking algorithm. In particular,
 * the fraud score is calculated and updated by subclasses of
 * {@link AbstractFraudCheck}, which define their own scoring logic.
 * </p>
 *
 * <p>
 * The final decision about approval or rejection is based on the
 * value stored in this object.
 * </p>
 *
 * <p><b>Usage example:</b></p>
 * <pre>
 *     Request request = new Request();
 *
 *     AbstractFraudCheck check = new BasicFraudCheck();
 *     check.process(request);
 *
 *     int score = request.getFraudScore();
 * </pre>
 *
 * @author Icaro
 * @version 1.0
 */
public class Request {

    /**
     * The calculated fraud score for the request.
     * Higher values indicate higher fraud risk.
     */
    private int fraudScore;

    /**
     * Retrieves the fraud score assigned during validation.
     *
     * @return the fraud score value
     */
    public int getFraudScore() {
        return fraudScore;
    }

    /**
     * Updates the fraud score with a value calculated by a specific
     * fraud-checking strategy.
     *
     * @param fraudScore the new fraud score value
     */
    public void setFraudScore(int fraudScore) {
        this.fraudScore = fraudScore;
    }
}
