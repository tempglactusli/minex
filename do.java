StringBuilder sb = new StringBuilder();
sb.append("Hello, ");
sb.append("world!");

Writer writer = new FileWriter("output.txt"); // Example: FileWriter as writer
writer.write(sb.toString());
writer.close(); // It's good practice to close writers after use
