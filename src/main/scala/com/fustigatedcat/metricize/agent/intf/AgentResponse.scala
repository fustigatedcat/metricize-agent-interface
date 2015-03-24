package com.fustigatedcat.metricize.agent.intf

trait AgentResponse {

}

case class AgentResponseSuccess(queryTime : Long, time : Long, response : String) extends AgentResponse {

}

case class AgentResponseFailure(queryTime : Long, time : Long, failure : String) extends AgentResponse {

}