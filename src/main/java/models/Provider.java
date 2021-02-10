package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Provider {
    private Channel channel;
    private long clicked;
    private long delivered;
    private String error;
    private long opened;
    private String provider;
    private Reference reference;
    private long sent;
    private String status;
}
