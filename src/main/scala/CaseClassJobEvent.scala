

case class CaseClassJobEvent(
                              jobId: String,
                              jobType: Option[String],
                              inPlanning: Option[Boolean],

                              var teamId: String,
                              var actorId: String,
                              adminActorId: Option[String],
                              sessionId: String,
                              clientSessionId: Option[String],
                              clientCreatedAt: Long,
                              seqId: Long,
                              isSideEffect: Option[Boolean],

                              opAction: String,
                              stepId: Option[String],
                              jobBaseStepId: Option[String],
                              fieldId: Option[String],

                              serverReceivedAt: Option[Long]) extends Event

trait Event {
  def teamId: String
  def actorId: String
}