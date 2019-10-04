/*
	Instruction

	Author: Maher Khan

 */

public class Instruction
{
	private int address;
	private String opcode;
	private int source_reg1;
	private int source_reg2;
	private int dest_reg;
	private int immediate;
	private int target;

	public Instruction()
	{
		this.address = -1;
		this.opcode = "";
		this.source_reg1 = -1;
		this.source_reg2 = -1;
		this.dest_reg = -1;
		this.immediate = -1;
		this.target = -1;
	}

	// Getter
	public int getAddess() 
	{
		return this.address;
	}

	// Setter
	public void setAddress(int address) {
		this.address = address;
	}

	// Getter
	public String getOpcode() 
	{
		return this.opcode;
	}

	// Setter
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

	// Getter
	public int getSourceReg1() 
	{
		return this.source_reg1;
	}

	// Setter
	public void setSourceReg1(int source_reg1) {
		this.source_reg1 = source_reg1;
	}

	// Getter
	public int getSourceReg2() 
	{
		return this.source_reg2;
	}

	// Setter
	public void setSourceReg2(int source_reg2) {
		this.source_reg2 = source_reg2;
	}

	// Getter
	public int getDestReg() 
	{
		return this.dest_reg;
	}

	// Setter
	public void setDestReg(int dest_reg) {
		this.dest_reg = dest_reg;
	}

	// Getter
	public int getImmediate() 
	{
		return this.immediate;
	}

	// Setter
	public void setImmediate(int immediate) {
		this.immediate = immediate;
	}

	// Getter
	public int getTarget() 
	{
		return this.target;
	}

	// Setter
	public void setTarget(int target) {
		this.target = target;
	}

	public String toString()
	{
		String result = "";
		result += "Instruction Address: " + Integer.toString(this.address) +"\n";
		result += "opcode: " + this.opcode +"\n";
		result += "source_reg1: " + Integer.toString(this.source_reg1) +"\n";
		result += "source_reg2: " + Integer.toString(this.source_reg2) +"\n";
		result += "dest_reg: " + Integer.toString(this.dest_reg) +"\n";
		result += "immediate: " + Integer.toString(this.immediate) +"\n";
		result += "target: " + Integer.toString(this.target) +"\n";
		return result;
	}
}