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

val HugeIcons.Milestone: ImageVector
    get() {
        if (_milestone != null) {
            return _milestone!!
        }
        _milestone = ImageVector.Builder(
            name = "Milestone",
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
            moveTo(8.74414f, 21.5f)
            curveTo(8.74414f, 18.3773f, 8.74414f, 16.1227f, 8.74414f, 13f)
            verticalLineTo(2.5f)
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
            moveTo(5.74414f, 21.5f)
            horizontalLineTo(11.7441f)
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
            moveTo(8.74414f, 2.50004f)
            lineTo(15.6909f, 2.5f)
            curveTo(16.7455f, 2.49999f, 17.2729f, 2.49999f, 17.5523f, 2.6416f)
            curveTo(18.1053f, 2.92176f, 18.3718f, 3.54703f, 18.1846f, 4.12511f)
            curveTo(18.0901f, 4.41729f, 17.7172f, 4.77966f, 16.9714f, 5.5044f)
            curveTo(16.6952f, 5.77288f, 16.5571f, 5.90713f, 16.4825f, 6.05156f)
            curveTo(16.3368f, 6.33374f, 16.3368f, 6.66621f, 16.4825f, 6.94839f)
            curveTo(16.5571f, 7.09282f, 16.6952f, 7.22706f, 16.9714f, 7.49555f)
            curveTo(17.7172f, 8.22032f, 18.0901f, 8.5827f, 18.1847f, 8.8749f)
            curveTo(18.3718f, 9.45296f, 18.1053f, 10.0782f, 17.5524f, 10.3584f)
            curveTo(17.2729f, 10.5f, 16.7456f, 10.5f, 15.6909f, 10.5f)
            lineTo(8.74414f, 10.5f)
        }
        }.build()

        return _milestone!!
    }

private var _milestone: ImageVector? = null
