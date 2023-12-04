package Code;

import Code.Utility.File;

public class MainFile {
    public static void main(String[] args) {
//        File.createFile("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile", "Name1", "txt");
//        File.isFileExists("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Name1.txt");
//        File.deleteFile("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Name.txt");
//        File.writeFileOutputStream("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Name1.txt", "Chào mừng đến với File Name1.txt", true);
//        File.readFileInputStream("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Name1.txt");
        File.writeObjectFile("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Object.txt", new Vehicle("C300", "Red", "Mercedes"), false);
        File.readObjectFile("D:\\Users\\admin\\Documents\\DocumentStudy\\HocChuyenSau\\Java\\InteliJ\\File\\SourceFile\\Object.txt");
    }
}
