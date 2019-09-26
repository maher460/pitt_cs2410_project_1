


public class Instruction
{
	private int address;
	private String opcode;
	private int source_reg1;
	private int source_reg2;
	private int dest_reg;
	private int immediate;

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
}