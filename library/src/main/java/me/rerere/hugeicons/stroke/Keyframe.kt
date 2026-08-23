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

val HugeIcons.Keyframe: ImageVector
    get() {
        if (_keyframe != null) {
            return _keyframe!!
        }
        _keyframe = ImageVector.Builder(
            name = "Keyframe",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.38188f, 5.00507f)
            curveTo(10.5901f, 3.66836f, 11.1943f, 3f, 12f, 3f)
            curveTo(12.8057f, 3f, 13.4099f, 3.66836f, 14.6181f, 5.00507f)
            lineTo(17.5897f, 8.29254f)
            curveTo(19.1966f, 10.0702f, 20f, 10.9591f, 20f, 12f)
            curveTo(20f, 13.0409f, 19.1966f, 13.9298f, 17.5897f, 15.7075f)
            lineTo(14.6181f, 18.9949f)
            curveTo(13.4099f, 20.3316f, 12.8057f, 21f, 12f, 21f)
            curveTo(11.1943f, 21f, 10.5901f, 20.3316f, 9.38188f, 18.9949f)
            lineTo(6.41031f, 15.7075f)
            curveTo(4.80344f, 13.9298f, 4f, 13.0409f, 4f, 12f)
            curveTo(4f, 10.9591f, 4.80344f, 10.0702f, 6.41031f, 8.29254f)
            lineTo(9.38188f, 5.00507f)
            close()
        }
        }.build()

        return _keyframe!!
    }

private var _keyframe: ImageVector? = null
