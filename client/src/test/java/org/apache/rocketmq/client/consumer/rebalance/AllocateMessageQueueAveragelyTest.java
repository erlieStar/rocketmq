package org.apache.rocketmq.client.consumer.rebalance;

import org.apache.rocketmq.common.message.MessageQueue;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-11-24
 */
public class AllocateMessageQueueAveragelyTest {


    /**
     * 2-4
     */
    @Test
    public void allocate0() {
        AllocateMessageQueueAveragely averagely = new AllocateMessageQueueAveragely();
        List<MessageQueue> messageQueues = Lists.newArrayList();
        List<String> cidAll = Lists.newArrayList();
        cidAll.add("a");
        cidAll.add("b");
        cidAll.add("c");
        cidAll.add("d");
        for (int i = 1; i <= 2; i++) {
            MessageQueue messageQueue = new MessageQueue();
            messageQueue.setQueueId(i);
            messageQueues.add(messageQueue);
        }
        List<MessageQueue> result = averagely.allocate(null, "a", messageQueues, cidAll);
        for (MessageQueue messageQueue : result) {
            System.out.println(messageQueue.getQueueId());
        }
    }

    /**
     * 4-4
     */
    @Test
    public void allocate1() {
    }

    /**
     * 4-2
     */
    @Test
    public void allocate2() {
    }
}