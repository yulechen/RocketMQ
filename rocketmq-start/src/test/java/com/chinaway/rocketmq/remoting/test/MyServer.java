/**@FILE:MyServer.java
 * @AUTHOR:chenqiu
 * @DATE:2015年12月30日 下午4:15:07*/
package com.chinaway.rocketmq.remoting.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.remoting.RemotingServer;

/**@COMPANY:北京汇通天下科技有限公司
 * @CLASS:MyServer
 * @DESCRIPTION:	
 * @AUTHOR:chenqiu
 * @VERSION:v2.0
 * @DATE:2015年12月30日 下午4:15:07*/

public class MyServer {

   static Logger log  =LoggerFactory.getLogger(MyServer.class);
    public static void main(String[] args) {
        log.info("ss");
    }
    
    public static RemotingServer ceateServer(){
        return null;
    }
    
    
}

