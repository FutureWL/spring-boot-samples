package io.github.futurewl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 功能描述：
 * 单号		类型			规格				宽		高		块数			单块面积	总面积
 *
 * @author weilai
 */
public class OutputDemo {

    class Glass {
        private String type;
        private String standard;
        private Integer width;
        private Integer height;
        private Integer number;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStandard() {
            return standard;
        }

        public void setStandard(String standard) {
            this.standard = standard;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Glass{" +
                    "type='" + type + '\'' +
                    ", standard='" + standard + '\'' +
                    ", width=" + width +
                    ", height=" + height +
                    ", number=" + number +
                    '}';
        }
    }

    public void run() throws IOException {
        File file = new File("test.xls");
        FileInputStream fileInputStream = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet");
        for (Row row : sheet) {
            if (row.getRowNum() >= 6) {
                String type = row.getCell(2).getStringCellValue();
                if (type == null || "".equals(type)) {
                    return;
                }
                Glass glass = new Glass();
                glass.setType(row.getCell(2).getStringCellValue());
                glass.setStandard(row.getCell(5).getStringCellValue());
                glass.setWidth((int) (row.getCell(9).getNumericCellValue()));
                glass.setHeight((int) row.getCell(11).getNumericCellValue());
                glass.setNumber((int) row.getCell(13).getNumericCellValue());
                System.out.println(glass);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        OutputDemo outputDemo = new OutputDemo();
        outputDemo.run();
    }
}
