package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class SendRequestMessageRouting {
    private String method;
    private List<Object> channels;
}
