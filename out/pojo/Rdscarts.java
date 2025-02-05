package pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Rdscarts implements Serializable {
	private Integer cartseq;
	private String cartid;
	private String carttype;
	private String reservedby;
	private Timestamp createstamp;
	private Timestamp buildstamp;
	private Timestamp pickstartstamp;
	private Timestamp pickendstamp;
	private Timestamp completestamp;
	private Timestamp errorstamp;
	private String errormsg;
	private Timestamp stamp;

	public Integer getCartseq() {
		return cartseq;
	}

	public void setCartseq(Integer cartseq) {
		this.cartseq = cartseq;
	}

	public String getCartid() {
		return cartid;
	}

	public void setCartid(String cartid) {
		this.cartid = cartid;
	}

	public String getCarttype() {
		return carttype;
	}

	public void setCarttype(String carttype) {
		this.carttype = carttype;
	}

	public String getReservedby() {
		return reservedby;
	}

	public void setReservedby(String reservedby) {
		this.reservedby = reservedby;
	}

	public Timestamp getCreatestamp() {
		return createstamp;
	}

	public void setCreatestamp(Timestamp createstamp) {
		this.createstamp = createstamp;
	}

	public Timestamp getBuildstamp() {
		return buildstamp;
	}

	public void setBuildstamp(Timestamp buildstamp) {
		this.buildstamp = buildstamp;
	}

	public Timestamp getPickstartstamp() {
		return pickstartstamp;
	}

	public void setPickstartstamp(Timestamp pickstartstamp) {
		this.pickstartstamp = pickstartstamp;
	}

	public Timestamp getPickendstamp() {
		return pickendstamp;
	}

	public void setPickendstamp(Timestamp pickendstamp) {
		this.pickendstamp = pickendstamp;
	}

	public Timestamp getCompletestamp() {
		return completestamp;
	}

	public void setCompletestamp(Timestamp completestamp) {
		this.completestamp = completestamp;
	}

	public Timestamp getErrorstamp() {
		return errorstamp;
	}

	public void setErrorstamp(Timestamp errorstamp) {
		this.errorstamp = errorstamp;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	public Timestamp getStamp() {
		return stamp;
	}

	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}

}