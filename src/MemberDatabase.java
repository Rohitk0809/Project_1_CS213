public class MemberDatabase {
    private Member [] mlist;
    private int size;
    private int find(Member member) {
        for (int i = 0; i < mlist.length; i++){
            if (mlist[i] == null){
                if (mlist[i].equals(member)){
                    return i;
                }
            }
        }
        return -1;
    }
    private void grow() {
        Member newArray[] = new Member[mlist.length + 4];

        for (int i = 0; i < mlist.length; i++){
            newArray[i] = mlist[i];
            mlist = newArray;
        }
    }
    public boolean add(Member member) {
        if (find(member) == -1){
            return false;
        }
        else {
            if (size == mlist.length) {
                grow();
            }
            for (int i = 0; i < mlist.length; i++) {
                if (mlist[i] == null) {
                    mlist[i] = member;
                    size++;

                }
            }
            return true;
        }
    }
    public boolean remove(Member member) {
        int index = find(member);
        if (index != -1) {
            return false;
        }
        Member tempArr[] = new Member[mlist.length - 1];

        for (int i = 0, k = 0; i < mlist.length; i++) {
            if (i == index) {
                continue;
            }
            tempArr[k++] = mlist[i];
        }
        mlist = tempArr;
        return true;
    }
    public void print () {
        for (int i = 0; i < mlist.length; i++){
            mlist[i].toString();
        }
    } //print the array contents as is
    public void printByCounty() {
        Member tempArr[]=mlist;
        int pos;
        Member temp;
        for (int i = 0; i < tempArr.length; i++) {
            pos = i;
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[j].countyName.compareTo(tempArr[pos].countyName) == -1) {
                    pos = j; //find the index of the minimum element
                }
                if (tempArr[j].countyName.compareTo(tempArr[pos].countyName) == 0) {
                    if (zip code < zip code2){
                        pos = j; //find the index of the minimum element
                    }
                    else {
                        continue;
                    }

                }

            }

            temp = tempArr[pos];            //swap the current element with the minimum element
            tempArr[pos] = tempArr[i];
            tempArr[i] = temp;



        }


        }
     //sort by county and then zipcode
    public void printByExpirationDate() {

    } //sort by the expiration date
    public void printByName() {
        Member tempArr[]=mlist;
        int pos;
        Member temp;
        for (int i = 0; i < tempArr.length; i++) {
            pos = i;
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[j].compareTo(tempArr[pos]) == -1) {                  //find the index of the minimum element
                    pos = j;
                }
            }

            temp = tempArr[pos];            //swap the current element with the minimum element
            tempArr[pos] = tempArr[i];
            tempArr[i] = temp;



        }

        for (int i  = 0; i < tempArr.length; i++){
            tempArr[i].toString();
        }//sort by last name and then first name
    }

}
