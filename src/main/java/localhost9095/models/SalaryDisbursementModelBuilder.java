/*
 * ApiDocumentationLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package localhost9095.models;

import java.util.*;

public class SalaryDisbursementModelBuilder {
    //the instance to build
    private SalaryDisbursementModel salaryDisbursementModel;

    /**
     * Default constructor to initialize the instance
     */
    public SalaryDisbursementModelBuilder() {
        salaryDisbursementModel = new SalaryDisbursementModel();
    }

    public SalaryDisbursementModelBuilder amount(Integer amount) {
        salaryDisbursementModel.setAmount(amount);
        return this;
    }

    public SalaryDisbursementModelBuilder bankCode(String bankCode) {
        salaryDisbursementModel.setBankCode(bankCode);
        return this;
    }

    public SalaryDisbursementModelBuilder bankName(String bankName) {
        salaryDisbursementModel.setBankName(bankName);
        return this;
    }

    public SalaryDisbursementModelBuilder bonusStatus(String bonusStatus) {
        salaryDisbursementModel.setBonusStatus(bonusStatus);
        return this;
    }

    public SalaryDisbursementModelBuilder disbursementId(Integer disbursementId) {
        salaryDisbursementModel.setDisbursementId(disbursementId);
        return this;
    }

    public SalaryDisbursementModelBuilder disbursementMethod(String disbursementMethod) {
        salaryDisbursementModel.setDisbursementMethod(disbursementMethod);
        return this;
    }

    public SalaryDisbursementModelBuilder firstName(String firstName) {
        salaryDisbursementModel.setFirstName(firstName);
        return this;
    }

    public SalaryDisbursementModelBuilder payeeId(String payeeId) {
        salaryDisbursementModel.setPayeeId(payeeId);
        return this;
    }

    public SalaryDisbursementModelBuilder paymentId(Integer paymentId) {
        salaryDisbursementModel.setPaymentId(paymentId);
        return this;
    }

    public SalaryDisbursementModelBuilder remarks(String remarks) {
        salaryDisbursementModel.setRemarks(remarks);
        return this;
    }

    public SalaryDisbursementModelBuilder salaryApproved(String salaryApproved) {
        salaryDisbursementModel.setSalaryApproved(salaryApproved);
        return this;
    }

    public SalaryDisbursementModelBuilder salaryId(String salaryId) {
        salaryDisbursementModel.setSalaryId(salaryId);
        return this;
    }

    public SalaryDisbursementModelBuilder salaryType(String salaryType) {
        salaryDisbursementModel.setSalaryType(salaryType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SalaryDisbursementModel build() {
        return salaryDisbursementModel;
    }
}