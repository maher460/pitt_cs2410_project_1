/*
	Memory

	Author: Maher Khan

 */

import java.util.HashMap;
import java.util.Map;

public class Memory
{
	private HashMap<Integer, Mem> memory;

	public Memory()
	{
		this.memory = new HashMap<Integer, Mem>();
	}
	

	/*
		To add an integer to the memmory
	 */
	public void add_int(int address, int val)
	{
		Mem mem = new Mem();
		mem.isFloat = false;
		mem.int_val = val;
		this.memory.put(address, mem);
	}


	/*
		To add a float to the memmory
	 */
	public void add_float(int address, double val)
	{
		Mem mem = new Mem();
		mem.isFloat = true;
		mem.float_val = val;
		this.memory.put(address, mem);
	}


	/*
		To retrieve an int value from the memmory
	 */
	public int get_int(int address)
	{
		Mem mem = this.memory.get(address);
		if(mem.isFloat==true)
		{
			return (new Double(mem.float_val)).intValue();
		}
		else
		{
			return mem.int_val;
		}
	}


	/*
		To retrieve a float value from the memmory
	 */
	public double get_float(int address)
	{
		Mem mem = this.memory.get(address);
		if(mem.isFloat==true)
		{
			return mem.float_val;
		}
		else
		{
			return new Double(mem.int_val);
		}
	}

	public String toString()
	{
		String result = "\nMEMORY:\n\n";

		for (Map.Entry<Integer, Mem> entry : this.memory.entrySet()) {
		    Integer key = entry.getKey();
		    Mem value = entry.getValue();
		    result += "Location: " + Integer.toString(key) + "\n";
		    result += "Value: " + value.toString() + "\n";
		    result += "\n";
		}

		return result;
	}

	private class Mem
	{
		public boolean isFloat;
		public int int_val;
		public double float_val;

		public String toString()
		{
			if(isFloat)
			{
				return Double.toString(float_val);
			}
			else
			{
				return Integer.toString(int_val);
			}
		}
	}

}