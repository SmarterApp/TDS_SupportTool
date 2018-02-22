import { TestPackageStatus } from "../model/test-package-status";
import { TestPackageStatusRow, TestPackageStatusRowBuilder } from "../model/test-package-status-row";
import { TargetSystem } from "../model/target-system.enum";
import { StepStatus } from "../../jobs/model/test-package-job.model";

/**
 * Map a collection of TestPackageStatus objects from the server to {TestPackageStatus}es
 */
export class TestPackageStatusRowMapper {
  /**
   * Map a single JSON representation of a test package status from the server to a {TestPackageStatus}.
   *
   * @param status {TestPackageStatus} A single JSON representation of a test package status record from the server
   * @return {TestPackageStatusRow} A {TestPackageStatusRow} describing the state of the test package in the system
   */
  static map(status: TestPackageStatus): TestPackageStatusRow {
    // Map the target system to its status.  If a system does not exist in the map, then the test package has not been
    // loaded into it.
    const systemStatusMap = new Map(
      status.targets.map(t => [t.target, t.status] as [TargetSystem, StepStatus])
    );

    return new TestPackageStatusRowBuilder(status.name)
      .withUploadedAt(status.uploadedAt)
      .withJobId(status.jobId)
      .withJobType(status.jobType)
      .withTdsStatus(systemStatusMap.get(TargetSystem.TDS) || StepStatus.NotApplicable)
      .withArtStatus(systemStatusMap.get(TargetSystem.ART) || StepStatus.NotApplicable)
      .withTisStatus(systemStatusMap.get(TargetSystem.TIS) || StepStatus.NotApplicable)
      .withThssStatus(systemStatusMap.get(TargetSystem.THSS) || StepStatus.NotApplicable)
      .build();
  }
}