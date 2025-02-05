package pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Rdscartons implements Serializable {
	private Integer cartonseq;
	private String lpn;
	private String geekstatus;
	private String ucc;
	private String upc;
	private Integer cartoncount;
	private String trackingnumber;
	private String orderid;
	private String trucknumber;
	private String cartontype;
	private String picktype;
	private String cartslot;
	private String parenttype;
	private Integer cartseq;
	private Integer palletseq;
	private String palletgroup;
	private String palletoperatorid;
	private String reservedby;
	private BigDecimal estweight;
	private BigDecimal estweightlow;
	private BigDecimal estweighthigh;
	private BigDecimal estlength;
	private BigDecimal estwidth;
	private BigDecimal estheight;
	private BigDecimal actweight;
	private BigDecimal actlength;
	private BigDecimal actwidth;
	private BigDecimal actheight;
	private BigDecimal netshippingcharge;
	private BigDecimal listshippingcharge;
	private Integer assigned;
	private Boolean isrepack;
	private Boolean auditrequired;
	private Boolean repackrequired;
	private Boolean packexception;
	private Timestamp createstamp;
	private Timestamp releasestamp;
	private Timestamp estcontentsuploadstamp;
	private Timestamp pickstartstamp;
	private Timestamp pickstamp;
	private Timestamp pickattemptedstamp;
	private Timestamp pickshortstamp;
	private Timestamp geekpickconfirmedstamp;
	private Timestamp auditstamp;
	private Timestamp packstamp;
	private Timestamp vasstamp;
	private Timestamp labelstamp;
	private Timestamp actcontentsuploadstamp;
	private Timestamp shipstamp;
	private Timestamp palletstamp;
	private Timestamp cancelstamp;
	private Timestamp sendtogeekstamp;
	private Timestamp receivedbygeekstamp;
	private Timestamp pickconfirmedbygeekstamp;
	private String lastpositionlogical;
	private String lastpositionphysical;
	private Timestamp lastpositionstamp;
	private Timestamp stamp;

	public Integer getCartonseq() {
		return cartonseq;
	}

	public void setCartonseq(Integer cartonseq) {
		this.cartonseq = cartonseq;
	}

	public String getLpn() {
		return lpn;
	}

	public void setLpn(String lpn) {
		this.lpn = lpn;
	}

	public String getGeekstatus() {
		return geekstatus;
	}

	public void setGeekstatus(String geekstatus) {
		this.geekstatus = geekstatus;
	}

	public String getUcc() {
		return ucc;
	}

	public void setUcc(String ucc) {
		this.ucc = ucc;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Integer getCartoncount() {
		return cartoncount;
	}

	public void setCartoncount(Integer cartoncount) {
		this.cartoncount = cartoncount;
	}

	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getTrucknumber() {
		return trucknumber;
	}

	public void setTrucknumber(String trucknumber) {
		this.trucknumber = trucknumber;
	}

	public String getCartontype() {
		return cartontype;
	}

	public void setCartontype(String cartontype) {
		this.cartontype = cartontype;
	}

	public String getPicktype() {
		return picktype;
	}

	public void setPicktype(String picktype) {
		this.picktype = picktype;
	}

	public String getCartslot() {
		return cartslot;
	}

	public void setCartslot(String cartslot) {
		this.cartslot = cartslot;
	}

	public String getParenttype() {
		return parenttype;
	}

	public void setParenttype(String parenttype) {
		this.parenttype = parenttype;
	}

	public Integer getCartseq() {
		return cartseq;
	}

	public void setCartseq(Integer cartseq) {
		this.cartseq = cartseq;
	}

	public Integer getPalletseq() {
		return palletseq;
	}

	public void setPalletseq(Integer palletseq) {
		this.palletseq = palletseq;
	}

	public String getPalletgroup() {
		return palletgroup;
	}

	public void setPalletgroup(String palletgroup) {
		this.palletgroup = palletgroup;
	}

	public String getPalletoperatorid() {
		return palletoperatorid;
	}

	public void setPalletoperatorid(String palletoperatorid) {
		this.palletoperatorid = palletoperatorid;
	}

	public String getReservedby() {
		return reservedby;
	}

	public void setReservedby(String reservedby) {
		this.reservedby = reservedby;
	}

	public BigDecimal getEstweight() {
		return estweight;
	}

	public void setEstweight(BigDecimal estweight) {
		this.estweight = estweight;
	}

	public BigDecimal getEstweightlow() {
		return estweightlow;
	}

	public void setEstweightlow(BigDecimal estweightlow) {
		this.estweightlow = estweightlow;
	}

	public BigDecimal getEstweighthigh() {
		return estweighthigh;
	}

	public void setEstweighthigh(BigDecimal estweighthigh) {
		this.estweighthigh = estweighthigh;
	}

	public BigDecimal getEstlength() {
		return estlength;
	}

	public void setEstlength(BigDecimal estlength) {
		this.estlength = estlength;
	}

	public BigDecimal getEstwidth() {
		return estwidth;
	}

	public void setEstwidth(BigDecimal estwidth) {
		this.estwidth = estwidth;
	}

	public BigDecimal getEstheight() {
		return estheight;
	}

	public void setEstheight(BigDecimal estheight) {
		this.estheight = estheight;
	}

	public BigDecimal getActweight() {
		return actweight;
	}

	public void setActweight(BigDecimal actweight) {
		this.actweight = actweight;
	}

	public BigDecimal getActlength() {
		return actlength;
	}

	public void setActlength(BigDecimal actlength) {
		this.actlength = actlength;
	}

	public BigDecimal getActwidth() {
		return actwidth;
	}

	public void setActwidth(BigDecimal actwidth) {
		this.actwidth = actwidth;
	}

	public BigDecimal getActheight() {
		return actheight;
	}

	public void setActheight(BigDecimal actheight) {
		this.actheight = actheight;
	}

	public BigDecimal getNetshippingcharge() {
		return netshippingcharge;
	}

	public void setNetshippingcharge(BigDecimal netshippingcharge) {
		this.netshippingcharge = netshippingcharge;
	}

	public BigDecimal getListshippingcharge() {
		return listshippingcharge;
	}

	public void setListshippingcharge(BigDecimal listshippingcharge) {
		this.listshippingcharge = listshippingcharge;
	}

	public Integer getAssigned() {
		return assigned;
	}

	public void setAssigned(Integer assigned) {
		this.assigned = assigned;
	}

	public Boolean getIsrepack() {
		return isrepack;
	}

	public void setIsrepack(Boolean isrepack) {
		this.isrepack = isrepack;
	}

	public Boolean getAuditrequired() {
		return auditrequired;
	}

	public void setAuditrequired(Boolean auditrequired) {
		this.auditrequired = auditrequired;
	}

	public Boolean getRepackrequired() {
		return repackrequired;
	}

	public void setRepackrequired(Boolean repackrequired) {
		this.repackrequired = repackrequired;
	}

	public Boolean getPackexception() {
		return packexception;
	}

	public void setPackexception(Boolean packexception) {
		this.packexception = packexception;
	}

	public Timestamp getCreatestamp() {
		return createstamp;
	}

	public void setCreatestamp(Timestamp createstamp) {
		this.createstamp = createstamp;
	}

	public Timestamp getReleasestamp() {
		return releasestamp;
	}

	public void setReleasestamp(Timestamp releasestamp) {
		this.releasestamp = releasestamp;
	}

	public Timestamp getEstcontentsuploadstamp() {
		return estcontentsuploadstamp;
	}

	public void setEstcontentsuploadstamp(Timestamp estcontentsuploadstamp) {
		this.estcontentsuploadstamp = estcontentsuploadstamp;
	}

	public Timestamp getPickstartstamp() {
		return pickstartstamp;
	}

	public void setPickstartstamp(Timestamp pickstartstamp) {
		this.pickstartstamp = pickstartstamp;
	}

	public Timestamp getPickstamp() {
		return pickstamp;
	}

	public void setPickstamp(Timestamp pickstamp) {
		this.pickstamp = pickstamp;
	}

	public Timestamp getPickattemptedstamp() {
		return pickattemptedstamp;
	}

	public void setPickattemptedstamp(Timestamp pickattemptedstamp) {
		this.pickattemptedstamp = pickattemptedstamp;
	}

	public Timestamp getPickshortstamp() {
		return pickshortstamp;
	}

	public void setPickshortstamp(Timestamp pickshortstamp) {
		this.pickshortstamp = pickshortstamp;
	}

	public Timestamp getGeekpickconfirmedstamp() {
		return geekpickconfirmedstamp;
	}

	public void setGeekpickconfirmedstamp(Timestamp geekpickconfirmedstamp) {
		this.geekpickconfirmedstamp = geekpickconfirmedstamp;
	}

	public Timestamp getAuditstamp() {
		return auditstamp;
	}

	public void setAuditstamp(Timestamp auditstamp) {
		this.auditstamp = auditstamp;
	}

	public Timestamp getPackstamp() {
		return packstamp;
	}

	public void setPackstamp(Timestamp packstamp) {
		this.packstamp = packstamp;
	}

	public Timestamp getVasstamp() {
		return vasstamp;
	}

	public void setVasstamp(Timestamp vasstamp) {
		this.vasstamp = vasstamp;
	}

	public Timestamp getLabelstamp() {
		return labelstamp;
	}

	public void setLabelstamp(Timestamp labelstamp) {
		this.labelstamp = labelstamp;
	}

	public Timestamp getActcontentsuploadstamp() {
		return actcontentsuploadstamp;
	}

	public void setActcontentsuploadstamp(Timestamp actcontentsuploadstamp) {
		this.actcontentsuploadstamp = actcontentsuploadstamp;
	}

	public Timestamp getShipstamp() {
		return shipstamp;
	}

	public void setShipstamp(Timestamp shipstamp) {
		this.shipstamp = shipstamp;
	}

	public Timestamp getPalletstamp() {
		return palletstamp;
	}

	public void setPalletstamp(Timestamp palletstamp) {
		this.palletstamp = palletstamp;
	}

	public Timestamp getCancelstamp() {
		return cancelstamp;
	}

	public void setCancelstamp(Timestamp cancelstamp) {
		this.cancelstamp = cancelstamp;
	}

	public Timestamp getSendtogeekstamp() {
		return sendtogeekstamp;
	}

	public void setSendtogeekstamp(Timestamp sendtogeekstamp) {
		this.sendtogeekstamp = sendtogeekstamp;
	}

	public Timestamp getReceivedbygeekstamp() {
		return receivedbygeekstamp;
	}

	public void setReceivedbygeekstamp(Timestamp receivedbygeekstamp) {
		this.receivedbygeekstamp = receivedbygeekstamp;
	}

	public Timestamp getPickconfirmedbygeekstamp() {
		return pickconfirmedbygeekstamp;
	}

	public void setPickconfirmedbygeekstamp(Timestamp pickconfirmedbygeekstamp) {
		this.pickconfirmedbygeekstamp = pickconfirmedbygeekstamp;
	}

	public String getLastpositionlogical() {
		return lastpositionlogical;
	}

	public void setLastpositionlogical(String lastpositionlogical) {
		this.lastpositionlogical = lastpositionlogical;
	}

	public String getLastpositionphysical() {
		return lastpositionphysical;
	}

	public void setLastpositionphysical(String lastpositionphysical) {
		this.lastpositionphysical = lastpositionphysical;
	}

	public Timestamp getLastpositionstamp() {
		return lastpositionstamp;
	}

	public void setLastpositionstamp(Timestamp lastpositionstamp) {
		this.lastpositionstamp = lastpositionstamp;
	}

	public Timestamp getStamp() {
		return stamp;
	}

	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}

}