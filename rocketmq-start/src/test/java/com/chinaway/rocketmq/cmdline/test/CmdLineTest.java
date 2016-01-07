/**@FILE:CmdLineTest.java
 * @AUTHOR:chenqiu
 * @DATE:2016年1月7日 下午3:07:29*/
package com.chinaway.rocketmq.cmdline.test;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

import com.alibaba.rocketmq.namesrv.NamesrvStartup;
import com.alibaba.rocketmq.srvutil.ServerUtil;

/**@COMPANY:北京汇通天下科技有限公司
 * @CLASS:CmdLineTest
 * @DESCRIPTION:	
 * @AUTHOR:chenqiu
 * @VERSION:v2.0
 * @DATE:2016年1月7日 下午3:07:29*/

public class CmdLineTest {

    /**@description:	
     * @author:chenqiu
     * @return:void
     * @param args*/
    public static CommandLine commandLine = null;
    public static void main(String[] a) {
        String[] args = new String[]{"-c config.poperties -p"};
        Options options = ServerUtil.buildCommandlineOptions(new Options());
        commandLine =
                ServerUtil.parseCmdLine("mqnamesrv", args, NamesrvStartup.buildCommandlineOptions(options),
                    new PosixParser());
        System.out.println(ServerUtil.commandLine2Properties(commandLine));

    }

}

