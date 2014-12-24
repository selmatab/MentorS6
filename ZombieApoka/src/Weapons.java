
public class Weapons {
	
	private String ime;	
	private double dmg;
	private double crit;
	private double ammo;
	
	public Weapons(String ime, double dmg, double crit, double ammo)
	{
		this.ime = ime;
		setDmg(dmg);
		setCrit(crit);
		setAmmo(ammo);
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public double getDmg()
	{
		return dmg;
	}
	
	public double getCrit()
	{
		return crit;
	}
	
	public double getAmmo()
	{
		return ammo;
	}
	
	public void setDmg(double dmg)
	{
		this.dmg = dmg*crit;
		if (ammo == 0)
		{
			this.dmg = 0;
		}
	}
	
	public void setCrit(double crit)
	{
		this.crit = (int)(Math.random()*crit);
		if (crit == 5)
		{
			crit *= 10;
		}
		else
		{
			crit = 1;
		}
	}
	
	public void setAmmo(double ammo)
	{
		this.ammo = ammo--;
	}
	
	public void setIme(String ime)
	{
		this.ime = ime;
	}
	
	public boolean equals(Weapons weapon)
	{
		if (this.ime == weapon.ime && this.dmg == weapon.dmg && this.crit == weapon.crit && this.dmg == weapon.dmg)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return ime + ": dmg = " + dmg + ", crit = " + crit + ", ammo = " + ammo;
	}
	

}

