package com.github.arteam.simplejsonrpc.core.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ValueNode;
import org.jetbrains.annotations.NotNull;

/**
 * Date: 07.06.14
 * Time: 12:35
 * <p/>
 * Representation of a JSON-RPC error response
 *
 * @author Artem Prigoda
 */
public class ErrorResponse extends Response {

    @NotNull
    @JsonProperty("error")
    private final ErrorMessage error;

    @JsonCreator
    public ErrorResponse(@JsonProperty("id") @NotNull ValueNode id,
                         @JsonProperty("error") @NotNull ErrorMessage error) {
        super(id);
        this.error = error;
    }

    public ErrorResponse(@NotNull ErrorMessage error) {
        super(NullNode.getInstance());
        this.error = error;
    }

    @NotNull
    public ErrorMessage getError() {
        return error;
    }
}
