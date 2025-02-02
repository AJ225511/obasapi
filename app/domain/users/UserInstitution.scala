package domain.users

import play.api.libs.json.Json

case class UserInstitution(
                      userId: String,
                      institutionId: String,
                      isCurrent: Boolean
                     )
object UserInstitution {
  implicit val userInstitutionFmt = Json.format[UserInstitution]
}

