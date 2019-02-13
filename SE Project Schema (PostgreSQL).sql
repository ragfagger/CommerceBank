CREATE TABLE "Appointments" (
  "ApptID" int,
  "UserID" int,
  "BranchID" int,
  "ApptTime" int,
  "ApptDate" int,
  "TopicOneWanted" boolean,
  "TopicTwoWanted" boolean,
  "TopicThreeWanted" boolean,
  "TopicFourWanted" boolean,
  "TopicFiveWanted" boolean,
  "TopicSixWanted" boolean,
  "TopicSevenWanted" boolean,
  "TopicEightWanted" boolean,
  "TopicNineWanted" boolean,
  "TopicTenWanted" boolean,
  "TopicElevenWanted" boolean,
  "TopicTwelveWanted" boolean,
  "Note" string
);

CREATE TABLE "UserInformation" (
  "UserID" int,
  "FirstName" string,
  "LastName" string,
  "Email" string,
  "PhoneNumber" int,
  "OnMailingList" boolean
);

CREATE TABLE "Branches" (
  "BranchID" int,
  "Street" string,
  "City" string,
  "State" string,
  "Zip" int,
  "TopicOneCovered" boolean,
  "TopicTwoCovered" boolean,
  "TopicThreeCovered" boolean,
  "TopicFourCovered" boolean,
  "TopicFiveCovered" boolean,
  "TopicSixCovered" boolean,
  "TopicSevenCovered" boolean,
  "TopicEightCovered" boolean,
  "TopicNineCovered" boolean,
  "TopicTenCovered" boolean,
  "TopicElevenCovered" boolean,
  "TopicTwelveCovered" boolean
);

CREATE TABLE "HoursOfOperation" (
  "BranchID" int,
  "OpenSunday" boolean,
  "OpenMonday" boolean,
  "OpenTuesday" boolean,
  "OpenWednesday" boolean,
  "OpenThursday" boolean,
  "OpenFriday" boolean,
  "OpenSaturday" boolean,
  "OpenOneAM" boolean,
  "OpenTwoAM" boolean,
  "OpenThreeAM" boolean,
  "OpenFourAM" boolean,
  "OpenFiveAM" boolean,
  "OpenSixAM" boolean,
  "OpenSevenAM" boolean,
  "OpenEightAM" boolean,
  "OpenNineAM" boolean,
  "OpenTenAM" boolean,
  "OpenElevenAM" boolean,
  "OpenTwelveAM" boolean,
  "OpenOnePM" boolean,
  "OpenTwoPM" boolean,
  "OpenThreePM" boolean,
  "OpenFourPM" boolean,
  "OpenFivePM" boolean,
  "OpenSixPM" boolean,
  "OpenSevenPM" boolean,
  "OpenEightPM" boolean,
  "OpenNinePM" boolean,
  "OpenTenPM" boolean,
  "OpenElevenPM" boolean,
  "OpenTwelvePM" boolean
);

CREATE TABLE "AppointmentTimes" (
  "BranchID" int,
  "ApptDate" int,
  "OneAMAvailable" boolean,
  "TwoAMAvailable" boolean,
  "ThreeAMAvailable" boolean,
  "FourAMAvailable" boolean,
  "FiveAMAvailable" boolean,
  "SixAMAvailable" boolean,
  "SevenAMAvailable" boolean,
  "EightAMAvailable" boolean,
  "NineAMAvailable" boolean,
  "TenAMAvailable" boolean,
  "ElevenAMAvailable" boolean,
  "TwelveAMAvailable" boolean,
  "OnePMAvailable" boolean,
  "TwoPMAvailable" boolean,
  "ThreePMAvailable" boolean,
  "FourPMAvailable" boolean,
  "FivePMAvailable" boolean,
  "SixPMAvailable" boolean,
  "SevenPMAvailable" boolean,
  "EightPMAvailable" boolean,
  "NinePMAvailable" boolean,
  "TenPMAvailable" boolean,
  "ElevenPMAvailable" boolean,
  "TwelvePMAvailable" boolean
);

ALTER TABLE "Appointments" ADD FOREIGN KEY ("UserID") REFERENCES "UserInformation" ("UserID");

ALTER TABLE "HoursOfOperation" ADD FOREIGN KEY ("BranchID") REFERENCES "Branches" ("BranchID");

ALTER TABLE "Appointments" ADD FOREIGN KEY ("BranchID") REFERENCES "Branches" ("BranchID");

ALTER TABLE "Appointments" ADD FOREIGN KEY ("ApptDate") REFERENCES "AppointmentTimes" ("ApptDate");

ALTER TABLE "AppointmentTimes" ADD FOREIGN KEY ("BranchID") REFERENCES "Branches" ("BranchID");