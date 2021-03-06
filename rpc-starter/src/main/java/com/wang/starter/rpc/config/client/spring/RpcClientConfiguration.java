package com.wang.starter.rpc.config.client.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Package:com.wang.starter.rpc.config.client</p>
 * <p>Description: </p>
 * <p>Company: com.dfire</p>
 *
 * @author baiyundou
 * @date 2020/6/16 22:37
 */
@Configuration
@EnableConfigurationProperties(RpcClientProperties.class)
public class RpcClientConfiguration {

    @Autowired
    private RpcClientProperties rpcClientProperties;

/*    @Bean
    @ConditionalOnProperty(prefix = "rpc.starter",name = "consumer",havingValue = "true")
    public RpcClient rpcClient() {
        return new RPCClient(rpcClientProperties.getIp(), rpcClientProperties.getPort());
    }*/

}
