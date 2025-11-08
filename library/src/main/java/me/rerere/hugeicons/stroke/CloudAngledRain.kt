package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudAngledRain: ImageVector
    get() {
        if (_cloudAngledRain != null) {
            return _cloudAngledRain!!
        }
        _cloudAngledRain = ImageVector.Builder(
            name = "CloudAngledRain",
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
        moveTo(12.5f, 15f)
        lineTo(11.5f, 17f)
        moveTo(17f, 15f)
        lineTo(16f, 17f)
        moveTo(13.5f, 19f)
        lineTo(12.5f, 21f)
        moveTo(8f, 15f)
        lineTo(7f, 17f)
        moveTo(9f, 19f)
        lineTo(8f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4776f, 8.89801f)
        lineTo(17.5f, 8.89795f)
        curveTo(19.9853f, 8.89795f, 22f, 10.8784f, 22f, 13.3214f)
        curveTo(22f, 14.8551f, 21.206f, 16.2065f, 20f, 17f)
        moveTo(17.4776f, 8.89801f)
        curveTo(17.4924f, 8.73611f, 17.5f, 8.57216f, 17.5f, 8.40646f)
        curveTo(17.5f, 5.42055f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.17106f, 6.52042f, 7.93728f)
        moveTo(17.4776f, 8.89801f)
        curveTo(17.3753f, 10.0132f, 16.9286f, 11.0307f, 16.2428f, 11.8469f)
        moveTo(6.52042f, 7.93728f)
        curveTo(3.98398f, 8.17454f, 2f, 10.2745f, 2f, 12.8299f)
        curveTo(2f, 14.4378f, 2.78565f, 15.8652f, 4f, 16.7619f)
        moveTo(6.52042f, 7.93728f)
        curveTo(6.67826f, 7.92251f, 6.83823f, 7.91496f, 7f, 7.91496f)
        curveTo(8.12582f, 7.91496f, 9.16474f, 8.28072f, 10.0005f, 8.89795f)
        }
        }.build()

        return _cloudAngledRain!!
    }

private var _cloudAngledRain: ImageVector? = null
