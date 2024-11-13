public class PaintJob {
    // write code here

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {

        if (extraBuckets < 0) {
            return -1;
        }

        double areaToBeCovered = width * height - areaPerBucket * extraBuckets;

        return getBucketCount(areaToBeCovered, areaPerBucket);
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {

        double area = width * height;

        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount (double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil((double) (area / areaPerBucket));
    }
}