package com.fustigatedcat.metricize.agent.intf

trait AgentResponse {

}

case class AgentResponseSuccess(time : Long, response : String) extends AgentResponse {

}

case class AgentResponseFailure(time : Long, failure : String) extends AgentResponse {

}