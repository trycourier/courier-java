package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class SendEventRoutingResponseBody {
    List<List<SendEventRoutingResponseResult>> results;
}