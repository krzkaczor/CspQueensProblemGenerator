package me.kaczor;

/**
 * Created by krzysztofkaczor on 4/21/15.
 */
public class QueensProblemGenerator {
    /*
    @param compact - use shorthand for comparing n values
     */
    String generate(int size, boolean compact) {
        StringBuffer output = new StringBuffer();

        generateVariableSection(output, size);

        generateDomainSection(output, size);

        if (compact) {
            generateCompactConstraints(output, size);
        } else {
            generateConstraints(output, size);
        }

        return output.toString();
    }

    private static void generateCompactConstraints(StringBuffer output, int n) {
        for(int i = 0;i < n;i++) {
            output.append("H").append(i).append(" ");
        }
        output.append(n).append(" ").append("!!").append("\n");

        for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++) {
                output.append("H").append(i).append(" ").append("H").append(j).append(" - ").append("|| ");
                output.append(i).append(" ").append(j).append(" - ").append("||");
                output.append(" != ").append('\n');
            }
        }
    }

    private void generateConstraints(StringBuffer output, int n) {
        for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++) {
                output.append("H").append(i).append(" ").append("H").append(j).append(" != ").append('\n');
            }
        }

        for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++) {
                output.append("H").append(i).append(" ").append("H").append(j).append(" - ").append("|| ");
                output.append(i).append(" ").append(j).append(" - ").append("||");
                output.append(" != ").append('\n');
            }
        }
    }

    private void generateDomainSection(StringBuffer output, int n) {
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                output.append(j).append(" ");
            }
            output.append("\n");
        }
    }

    private void generateVariableSection(StringBuffer output, int n) {
        for(int i = 0;i < n;i++) {
            output.append("H").append(i).append(" ");
        }
        output.append("\n");
    }
}
