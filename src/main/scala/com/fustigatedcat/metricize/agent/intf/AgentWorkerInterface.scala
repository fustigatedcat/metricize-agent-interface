package com.fustigatedcat.metricize.agent.intf

trait AgentWorkerInterface {

  def needsRescheduling_? : Boolean

  def process() : AgentResponse

}