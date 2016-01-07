/**@FILE:StartBroker.java
 * @AUTHOR:chenqiu
 * @DATE:2016年1月7日 下午2:47:54*/
package com.chinaway.rocketmq.start;

import com.alibaba.rocketmq.broker.BrokerStartup;

/**@COMPANY:北京汇通天下科技有限公司
 * @CLASS:StartBroker
 * @DESCRIPTION:	
 * @AUTHOR:chenqiu
 * @VERSION:v2.0
 * @DATE:2016年1月7日 下午2:47:54*/

public class StartBrokerB {

    /**@description:	
     * @author:chenqiu
     * @return:void
     * @param args*/

    public static void main(String[] args) {
        /**
         * 参数设置：
         * -c config.path
         * -h -help,退出程序
         * -p print configitem
         * -n name_server_addr 多个用；分割
         *
         */
        String[] options = new String[]{
            "-c" 
            ,"D:/GitReps/Github/RocketMQ/rocketmq-start/src/main/resources/conf/broker-b-config.properties"
            ,"-p"
        }; 
        BrokerStartup.main(options);        
    }

}

