package org.apache.rocketmq.common.sysflag;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-11-09
 */
public class MessageSysFlagTest {

    @Test
    public void test1() {
        System.out.println(MessageSysFlag.COMPRESSED_FLAG);
        System.out.println(MessageSysFlag.TRANSACTION_NOT_TYPE);
    }

    @Test
    public void getTransactionValue() {
    }

    @Test
    public void resetTransactionValue() {
    }

    @Test
    public void clearCompressedFlag() {
    }
}