/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.messages.types;

import java.util.Optional;

public interface IMessageDetails {
    String getId();

    MessageStatus getStatus();

    long getEnqueued();

    long getSent();

    long getDelivered();

    long getOpened();

    long getClicked();

    String getRecipient();

    String getEvent();

    String getNotification();

    Optional<String> getError();

    Optional<Reason> getReason();
}
