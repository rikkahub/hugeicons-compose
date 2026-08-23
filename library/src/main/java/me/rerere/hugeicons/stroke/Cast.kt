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

val HugeIcons.Cast: ImageVector
    get() {
        if (_cast != null) {
            return _cast!!
        }
        _cast = ImageVector.Builder(
            name = "Cast",
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
            moveTo(8f, 21f)
            curveTo(8f, 18.2386f, 5.76142f, 16f, 3f, 16f)
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
            moveTo(12f, 21f)
            curveTo(12f, 16.0294f, 7.97056f, 12f, 3f, 12f)
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
            moveTo(3.25f, 20.625f)
            verticalLineTo(20.75f)
            moveTo(3.5f, 20.75f)
            curveTo(3.5f, 20.8881f, 3.38807f, 21f, 3.25f, 21f)
            curveTo(3.11193f, 21f, 3f, 20.8881f, 3f, 20.75f)
            curveTo(3f, 20.6119f, 3.11193f, 20.5f, 3.25f, 20.5f)
            curveTo(3.38807f, 20.5f, 3.5f, 20.6119f, 3.5f, 20.75f)
            close()
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
            moveTo(16f, 21f)
            curveTo(16.9293f, 21f, 17.394f, 21f, 17.7804f, 20.9231f)
            curveTo(19.3671f, 20.6075f, 20.6075f, 19.3671f, 20.9231f, 17.7804f)
            curveTo(21f, 17.394f, 21f, 16.9293f, 21f, 16f)
            verticalLineTo(11f)
            curveTo(21f, 7.22876f, 21f, 5.34315f, 19.8284f, 4.17157f)
            curveTo(18.6569f, 3f, 16.7712f, 3f, 13f, 3f)
            horizontalLineTo(8f)
            curveTo(7.07069f, 3f, 6.60603f, 3f, 6.21964f, 3.07686f)
            curveTo(4.63288f, 3.39249f, 3.39249f, 4.63288f, 3.07686f, 6.21964f)
            curveTo(3f, 6.60603f, 3f, 7.07069f, 3f, 8f)
        }
        }.build()

        return _cast!!
    }

private var _cast: ImageVector? = null
