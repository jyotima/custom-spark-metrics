package org.apache.spark.metrics.sink

import java.util.{Locale, Properties}
import com.codahale.metrics.{MetricRegistry, MetricFilter}
import org.apache.spark.{SecurityManager}
import java.util.concurrent.{TimeUnit}

private[spark] class VoidSink(val property: Properties, val registry: MetricRegistry,
    securityMgr: SecurityManager) extends Sink {
  val reporter: VoidReporter = new VoidReporter(registry, "void-reporter", MetricFilter.ALL, TimeUnit.SECONDS, TimeUnit.MILLISECONDS)
  
  override def start() {
    reporter.start(10, TimeUnit.SECONDS)
  }

  override def stop() {
    reporter.stop()
  }

  override def report() {
    reporter.report()
  }
}
