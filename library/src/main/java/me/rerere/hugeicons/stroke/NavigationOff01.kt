package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NavigationOff01: ImageVector
    get() {
        if (_navigationOff01 != null) {
            return _navigationOff01!!
        }
        _navigationOff01 = ImageVector.Builder(
            name = "NavigationOff01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.4922f, 12.986f)
            lineTo(17.2541f, 10.4584f)
            curveTo(14.9818f, 5.81946f, 13.8457f, 3.5f, 11.9914f, 3.5f)
            curveTo(11.1304f, 3.5f, 10.4244f, 4.00001f, 9.6875f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.1288f, 20.3729f)
            curveTo(19.1565f, 20.8743f, 17.3716f, 19.8641f, 13.8018f, 17.8436f)
            curveTo(13.01f, 17.3954f, 12.6141f, 17.1713f, 12.1811f, 17.1312f)
            curveTo(12.0555f, 17.1196f, 11.9289f, 17.1196f, 11.8032f, 17.1312f)
            curveTo(11.3703f, 17.1713f, 10.9744f, 17.3954f, 10.1826f, 17.8436f)
            curveTo(6.61278f, 19.8641f, 4.82789f, 20.8743f, 3.85556f, 20.3729f)
            curveTo(3.59415f, 20.238f, 3.36938f, 20.0481f, 3.19883f, 19.8178f)
            curveTo(2.56445f, 18.9613f, 3.437f, 17.18f, 5.18208f, 13.6174f)
            lineTo(6.72945f, 10.4584f)
            curveTo(7.17443f, 9.54996f, 7.57596f, 8.73054f, 7.94772f, 8f)
        }
        }.build()

        return _navigationOff01!!
    }

private var _navigationOff01: ImageVector? = null
