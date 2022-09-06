package com.mauricio.apigateway.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Calendar;

@Slf4j
@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {


    public LogFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config){
        return (exchange, chain) -> {
            log.info("Path requested: " + exchange.getRequest().getPath());
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("Response time: {}",Calendar.getInstance().getTime());
            }));
        };
    }

    public static class Config {}

}
