package aademo.superawesome.tv.awesomeadsdemo.activities.main.user;

class UserPlacementModel {

    private String placementString = null;
    private int placementId = 0;

    public UserPlacementModel(String placementString) {
        this.placementString = placementString;
        try {
            placementId = Integer.parseInt(this.placementString);
        } catch (NumberFormatException e) {
            placementId = 0;
        }
    }

    public boolean isValid () {
        return placementString != null && placementId > 0;
    }

    public int getPlacementId () {
        return placementId;
    }


}