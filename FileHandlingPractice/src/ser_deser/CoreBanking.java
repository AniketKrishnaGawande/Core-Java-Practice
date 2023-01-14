package ser_deser;

import java.io.Serializable;

public class CoreBanking implements Serializable // for serialisation it must be serialisable
{

	private int acno;
	private String name;
	private double balance;

	public CoreBanking(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CoreBanking [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}

	public int getAcno() {
		return acno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
