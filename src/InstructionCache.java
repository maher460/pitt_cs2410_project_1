/*
	Instruction Cache

	Author: Maher Khan

 */

import java.util.ArrayList;

public class InstructionCache
{
	public ArrayList<Instruction> instructions;

	public InstructionCache()
	{
		instructions = new ArrayList<Instruction>();
	}

	public String toString()
	{
		String result = "\nINSTRUCTION CACHE:\n\n";
		for(Instruction instruction: this.instructions)
		{
			result += instruction.toString() + "\n";
		}

		return result;
	}


	/*
		Given an instruction address, this function will
		find and return the associated Instruction object
	 */
	public Instruction findInstruction(int address)
	{
		for(Instruction instruction: this.instructions)
		{
			if(instruction.getAddess() == address)
			{
				return instruction;
			}
		}

		return null;
	}
}