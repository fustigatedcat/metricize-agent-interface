package com.fustigatedcat.metricize.agent.intf

trait AgentWorkerInterface {

  def process() : AgentResponse

}