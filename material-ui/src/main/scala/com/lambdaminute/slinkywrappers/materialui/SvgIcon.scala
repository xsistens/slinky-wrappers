package com.lambdaminute.slinkywrappers.materialui

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.UndefOr

@react object SvgIcon extends ExternalComponent {
  case class Props(className: UndefOr[String] = js.undefined,
                   color: UndefOr[color],
                   nativeColor: UndefOr[String],
                   titleAccess: UndefOr[String],
                   viewBox: UndefOr[String])
  override val component = MaterialUi.SvgIcon
}
