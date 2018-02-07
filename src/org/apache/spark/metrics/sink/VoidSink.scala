package org.apache.spark.metrics.sink

import java.util.{Locale, Properties}
import com.codahale.metrics.{MetricRegistry}

private[spark] class VoidSink(val property: Properties, val registry: MetricRegistry,
    securityMgr: SecurityManager) extends Sink {
  override def start() {
  }

  override def stop() {
  }

  override def report() {
  }
}
