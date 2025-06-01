interface MountainArray {
    int get(int index);
    int length();
}

public class Mountain {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeakIndex(mountainArr, n);

        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeakIndex(MountainArray arr, int n) {
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    private int binarySearch(MountainArray arr, int target, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (ascending) {
                if (val < target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (val > target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}
