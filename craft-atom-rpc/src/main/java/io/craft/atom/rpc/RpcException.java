package io.craft.atom.rpc;

import lombok.Getter;
import lombok.ToString;

/**
 * @author mindwind
 * @version 1.0, Aug 8, 2014
 */
@ToString(callSuper = true)
public final class RpcException extends RuntimeException {

	
	private static final long serialVersionUID  = -4168884981656035910L;
	
	
	public static final byte UNKNOWN         = 0 ;
	public static final byte NETWORK         = 10;
	public static final byte CLIENT_BAD_REQ  = 40;
	public static final byte CLIENT_TIMEOUT  = 41;
    public static final byte SERVER_ERROR    = 50;
    public static final byte SERVER_TIMEOUT  = 51;
    public static final byte SERVER_OVERLOAD = 52;
	
	
	@Getter private byte code;
	
	
	public RpcException() {}
	
	public RpcException(byte code, String message) {
        super(message);
        this.code = code;
    }

	public RpcException(byte code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}
	
}
