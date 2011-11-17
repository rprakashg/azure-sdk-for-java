package com.microsoft.windowsazure.services.serviceBus;

import com.microsoft.windowsazure.ServiceException;
import com.microsoft.windowsazure.services.serviceBus.models.Queue;
import com.microsoft.windowsazure.services.serviceBus.models.Topic;

public class Util {
    public static Iterable<Queue> iterateQueues(ServiceBusContract service)
            throws ServiceException {
        // TODO: iterate over link rel=next pagination
        return service.listQueues().getItems();
    }

    public static Iterable<Topic> iterateTopics(ServiceBusContract service)
            throws ServiceException {
        // TODO: iterate over link rel=next pagination
        return service.listTopics().getItems();
    }
}
