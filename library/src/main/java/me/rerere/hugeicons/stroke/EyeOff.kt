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

val HugeIcons.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = ImageVector.Builder(
            name = "EyeOff",
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
            moveTo(6.43385f, 6.51953f)
            curveTo(4.22009f, 7.89049f, 2.93281f, 9.86457f, 2.31858f, 11.0339f)
            curveTo(2.10621f, 11.4382f, 2.00003f, 11.6403f, 2f, 12.0082f)
            curveTo(1.99997f, 12.3761f, 2.10584f, 12.5777f, 2.3176f, 12.981f)
            curveTo(3.32862f, 14.9066f, 6.16702f, 19.0195f, 11.9669f, 19.0195f)
            curveTo(14.2454f, 19.0195f, 16.0669f, 18.3848f, 17.5f, 17.4972f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.87868f, 9.87868f)
            curveTo(9.33579f, 10.4216f, 9f, 11.1716f, 9f, 12f)
            curveTo(9f, 13.6569f, 10.3431f, 15f, 12f, 15f)
            curveTo(12.8284f, 15f, 13.5784f, 14.6642f, 14.1213f, 14.1213f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(10f, 5.14847f)
            curveTo(10.5934f, 5.05255f, 11.224f, 5f, 11.8936f, 5f)
            curveTo(17.7747f, 5f, 20.6528f, 9.05385f, 21.6779f, 10.9517f)
            curveTo(21.8927f, 11.3492f, 22f, 11.548f, 22f, 11.9106f)
            curveTo(22f, 12.2733f, 21.8921f, 12.4727f, 21.6765f, 12.8717f)
            curveTo(21.3678f, 13.4428f, 20.8916f, 14.2085f, 20.2167f, 15f)
        }
        }.build()

        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
