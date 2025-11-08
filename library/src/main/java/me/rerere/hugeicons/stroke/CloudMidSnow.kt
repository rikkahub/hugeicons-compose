package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudMidSnow: ImageVector
    get() {
        if (_cloudMidSnow != null) {
            return _cloudMidSnow!!
        }
        _cloudMidSnow = ImageVector.Builder(
            name = "CloudMidSnow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4776f, 8.81069f)
        curveTo(17.485f, 8.81066f, 17.4925f, 8.81064f, 17.5f, 8.81064f)
        curveTo(19.9853f, 8.81064f, 22f, 10.7618f, 22f, 13.1686f)
        curveTo(22f, 15.4118f, 20.25f, 17.2591f, 18f, 17.5f)
        moveTo(17.4776f, 8.81069f)
        curveTo(17.4924f, 8.65119f, 17.5f, 8.48966f, 17.5f, 8.32642f)
        curveTo(17.5f, 5.38472f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.13891f, 6.52042f, 7.86418f)
        moveTo(17.4776f, 8.81069f)
        curveTo(17.3753f, 9.90933f, 16.9286f, 10.9118f, 16.2428f, 11.716f)
        moveTo(6.52042f, 7.86418f)
        curveTo(3.98398f, 8.09794f, 2f, 10.1668f, 2f, 12.6844f)
        curveTo(2f, 15.027f, 3.71776f, 17.0514f, 6f, 17.5f)
        moveTo(6.52042f, 7.86418f)
        curveTo(6.67826f, 7.84964f, 6.83823f, 7.8422f, 7f, 7.8422f)
        curveTo(8.12582f, 7.8422f, 9.16474f, 8.20254f, 10.0005f, 8.81064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        verticalLineTo(21f)
        moveTo(14.5f, 16.5f)
        lineTo(9.50013f, 19.5f)
        moveTo(9.5f, 16.5f)
        lineTo(14.4999f, 19.5f)
        }
        }.build()

        return _cloudMidSnow!!
    }

private var _cloudMidSnow: ImageVector? = null
