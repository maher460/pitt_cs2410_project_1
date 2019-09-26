import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class InstructionsReader 
{
	private ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	private HashMap<String, Integer> labels = new HashMap<String, Integer>();

	public InstructionsReader(String path)
	{
		try 
		{
			Scanner scanner = new Scanner(new File(path));

			Boolean data_start = false;
			int instructionCacheBaseAddress = 1000;
			int cacheline_size = 4;
			int cur_instruction_num = 0;

			while (scanner.hasNextLine()) 
			{
				String next_line = scanner.nextLine();
				String[] splitted = next_line.split(" ", 10);

				for (int i = 0; i < splitted.length; i++) 
				{
					System.out.print(splitted[i]);
					System.out.print("_");
				}
				System.out.print("LENGTH: "); 
				System.out.println(splitted.length);

				if(splitted[0].equals("DATA"))
				{
					data_start = true;
					// System.out.println("DATA STARTED!");
				}

				if(data_start == false)
				{
					Instruction instruction = new Instruction();

					instruction.setAddress(instructionCacheBaseAddress + (cur_instruction_num * cacheline_size));

					cur_instruction_num = cur_instruction_num + 1;

					if (splitted[0].indexOf(':') != -1)
					{
						labels.put(splitted[0].split(":", 2)[0], instruction.getAddess());
						splitted = Arrays.copyOfRange(splitted, 1, splitted.length);
					}

					instruction.setOpcode(splitted[0]);

					if (instruction.getOpcode().equals("add"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
					else if (instruction.getOpcode().equals("sub"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
					if (instruction.getOpcode().equals("fadd"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
					if (instruction.getOpcode().equals("fsub"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
					if (instruction.getOpcode().equals("fmul"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
					if (instruction.getOpcode().equals("fdiv"))
					{
						instruction.setDestReg(Integer.parseInt(splitted[1].split("")[1]));
						instruction.setSourceReg1(Integer.parseInt(splitted[2].split("")[1]));
						instruction.setSourceReg2(Integer.parseInt(splitted[3].split("")[1]));
					}
				}


				// System.out.println(scanner.nextLine());
			}
			System.out.println(labels.toString());
			scanner.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

}