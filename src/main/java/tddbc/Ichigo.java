package tddbc;

import java.util.Objects;

public class Ichigo {

    private String hinsyu;
    private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) throws Exception {
		if(size.equals("S") || size.equals("M") || size.equals("L") || size.equals("LL"))
			this.size = size;
		else
			throw new Exception();
	}

	public String getHinsyu() {
		return hinsyu;
	}

	public void setHinsyu(String hinsyu) throws Exception {
		if(hinsyu.equals("あまおう") || hinsyu.equals("とちおとめ") || hinsyu.equals("もういっこ"))
			this.hinsyu = hinsyu;
		else
			throw new Exception();
	}

	public String getIchigoInfoToString() {
		String hinsyuToString = Objects.isNull(this.getHinsyu())  ? "不明" : this.getHinsyu();
		String sizeToString = Objects.isNull(this.getSize())  ? "不明" : this.getSize();

		return hinsyuToString + ": " + sizeToString;
	}


}
