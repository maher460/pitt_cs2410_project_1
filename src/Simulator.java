public class Simulator
{
	private int cycle;
	private InstructionsReader instructions_reader;

	public Simulator()
	{
		this.cycle = 0;
	}

	// Setter
	public void setInstructionReader(InstructionsReader ir) {
		this.instructions_reader = ir;
	}

	private void run_cycle()
	{
		this.cycle = this.cycle + 1;
	}

	public void run()
	{
		run_cycle();
	}

	public static void main(String[] args) 
	{
		String filepath = "../test/Test1.dat";

		InstructionsReader instructions_reader = new InstructionsReader(filepath);

		Simulator simulator = new Simulator();
		simulator.setInstructionReader(instructions_reader);
		simulator.run();

		// Print Registers
		

		// Print Data Memory
		

		// Print cycle count and other information

		System.out.println("Done running simulator!");
	}
}