package tds.support.job;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tds.trt.model.TDSReport;

import javax.xml.bind.annotation.*;

@Document(collection = "testResults")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TestResults")
public class TestResultsWrapper {
    @Id
    private String mongoId;

    @XmlAttribute
    private String jobId;

    @XmlElement(name = "TDSReport")
    private TDSReport testResults;

    private TDSReport rescoredTestResults;

    private String errorMessage;

    private String invalidRescoredTestResults;

    private ScoringValidationReport scoringValidationReport;

    private TestResultsWrapper() {

    }

    public TestResultsWrapper(final String jobId, final TDSReport testResults) {
        this.jobId = jobId;
        this.testResults = testResults;
    }

    public String getMongoId() {
        return mongoId;
    }

    public TDSReport getTestResults() {
        return testResults;
    }

    public String getJobId() {
        return jobId;
    }

    public TDSReport getRescoredTestResults() {
        return rescoredTestResults;
    }

    public void setRescoredTestResults(final TDSReport rescoredTestResults) {
        this.rescoredTestResults = rescoredTestResults;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInvalidRescoredTestResults() {
        return invalidRescoredTestResults;
    }

    public void setInvalidRescoredTestResults(String invalidRescoredTestResults) {
        this.invalidRescoredTestResults = invalidRescoredTestResults;
    }

    public void clearErrors() {
        setErrorMessage(null);
        setInvalidRescoredTestResults(null);
    }

    public ScoringValidationReport getScoringValidationReport() {
        return scoringValidationReport;
    }

    public void setScoringValidationReport(final ScoringValidationReport scoringValidationReport) {
        this.scoringValidationReport = scoringValidationReport;
    }
}
