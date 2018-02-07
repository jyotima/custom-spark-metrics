package org.apache.spark.metrics.sink

import java.util.{SortedMap}
import java.util.concurrent.{TimeUnit, ScheduledExecutorService}

import com.codahale.metrics.{ScheduledReporter, MetricRegistry, MetricFilter, Gauge, Counter, Histogram, Meter, Timer}

private[spark] class VoidReporter( registry: MetricRegistry,
  name: String,
  filter: MetricFilter,
  rateUnit: TimeUnit,  
  durationUnit: TimeUnit) extends ScheduledReporter(registry, name, filter, rateUnit, durationUnit){

  override def report(gauges: SortedMap[String,Gauge[_]],
    counters: SortedMap[String,Counter],
    histograms: SortedMap[String,Histogram],
    meters: SortedMap[String,Meter],
    timers: SortedMap[String,Timer]){
      println("logged")    
  }
}
