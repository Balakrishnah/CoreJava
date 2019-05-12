package com.java.serialization;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = -8775748888409817987L;
	private String data;
	public Data(String d) {
		this.data = d;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
	private static class DataProxy implements Serializable{
		private static final long serialVersionUID = -5682975350508169699L;
		
		private String dataProxy;
		private static final String PREFIX ="ABC";
		private static final String SUFFIX ="DEFG";
		
		public DataProxy(Data d) {
			this.dataProxy = PREFIX+d.data+SUFFIX;
		}
		private Object readReslove() throws InvalidObjectException{
			if(dataProxy.startsWith(PREFIX)&& dataProxy.endsWith(SUFFIX)){
				return new Data(dataProxy.substring(3,dataProxy.length()-4));
			}else{
				throw new InvalidObjectException("data corrupted");
			}
		}
		/*private Object writeReplace(){
			return new DataProxy(this);
		}*/
		
		private void readObject(ObjectInputStream ois)throws InvalidObjectException{
			throw new InvalidObjectException("proxy is not used, something fishy");
		}
	}
}
