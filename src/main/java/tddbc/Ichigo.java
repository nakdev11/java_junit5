package tddbc;

public class Ichigo {

    private String hinsyu;

	public String getHinsyu() {
		return hinsyu;
	}

	public void setHinsyu(String hinsyu) throws Exception {
		if(hinsyu.equals("あまおう") || hinsyu.equals("とちおとめ") || hinsyu.equals("もういっこ"))
			this.hinsyu = hinsyu;
		else
			throw new Exception();
	}


}
