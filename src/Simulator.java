/*
	Simulator (skeleton)

	Author: Maher Khan

 */

import java.util.HashMap;
import java.lang.IllegalArgumentException;

public class Simulator
{
	private int cycle;


	/*
		constructor
	 */
	public Simulator()
	{
		this.cycle = 0;
	}


	/*
		This function should simulate a single cycle of the architecture
	 */
	private void run_cycle()
	{
		this.cycle = this.cycle + 1;
	}

	/*
		Simulates Part 1
	 */
	public void run(InstructionCache instruction_cache, Memory memory)
	{
		run_cycle();
	}

	/*
	Simulates Part 2
	 */
	public void run_smt(InstructionCache instruction_cache_1, InstructionCache instruction_cache_2, Memory memory)
	{
		run_cycle();
	}

	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			throw new IllegalArgumentException("No test file passed to the simulator!");
		}
		else if(args.length==1)
		{
			// Load input file path
			String filepath = args[0];

			// Create new instruction cache object
			InstructionCache instruction_cache = new InstructionCache();

			// Create new memory object
			Memory memory = new Memory();

			// Parse the input file and fill the instruction cache and memory
			Parser.parseFile(filepath, instruction_cache, memory);

			// Create new instance of the Simulator
			Simulator simulator = new Simulator();

			// Run the simulator
			simulator.run(instruction_cache, memory);

			// Print Instruction Cache
			System.out.println(instruction_cache.toString());

			// Print Registers
			
			// Print Data Memory
			System.out.println(memory.toString());
			

			// Print cycle count and other information

		}

		else if(args.length==2)
		{
			//Part2: SMT
			
			// Load input file paths
			String filepath_1 = args[0];
			String filepath_2 = args[1];

			// Create new memory object (shared between both input programs)
			Memory memory = new Memory();

			// Create new instruction cache object for filepath_1
			InstructionCache instruction_cache_1 = new InstructionCache();

			// Parse file_1 and fill the instruction cache and memory
			Parser.parseFile(filepath_1, instruction_cache_1, memory);

			// Create new instruction cache object for filepath_2
			InstructionCache instruction_cache_2 = new InstructionCache();

			// Parse file_2 and fill the instruction cache and memory
			Parser.parseFile(filepath_2, instruction_cache_2, memory);

			// Print Instruction Cache 1
			System.out.println(instruction_cache_1.toString());

			// Print Instruction Cache 2
			System.out.println(instruction_cache_2.toString());

			// Print Registers
			
			// Print Data Memory
			System.out.println(memory.toString());
			

			// Print cycle count and other information
			
		}

		System.out.println("Done running simulator!");
	}
}