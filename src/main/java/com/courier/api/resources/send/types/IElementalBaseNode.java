/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import java.util.List;
import java.util.Optional;

public interface IElementalBaseNode {
    Optional<List<String>> getChannels();

    Optional<String> getRef();

    Optional<String> getIf();

    Optional<String> getLoop();
}
