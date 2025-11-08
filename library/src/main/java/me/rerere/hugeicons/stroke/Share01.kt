package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Share01: ImageVector
    get() {
        if (_share01 != null) {
            return _share01!!
        }
        _share01 = ImageVector.Builder(
            name = "Share01",
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
        moveTo(9.39583f, 4.5f)
        horizontalLineTo(8.35417f)
        curveTo(5.40789f, 4.5f, 3.93475f, 4.5f, 3.01946f, 5.37868f)
        curveTo(2.10417f, 6.25736f, 2.10417f, 7.67157f, 2.10417f, 10.5f)
        verticalLineTo(14.5f)
        curveTo(2.10417f, 17.3284f, 2.10417f, 18.7426f, 3.01946f, 19.6213f)
        curveTo(3.93475f, 20.5f, 5.40789f, 20.5f, 8.35417f, 20.5f)
        horizontalLineTo(12.5608f)
        curveTo(15.5071f, 20.5f, 16.9802f, 20.5f, 17.8955f, 19.6213f)
        curveTo(18.4885f, 19.052f, 18.6973f, 18.2579f, 18.7708f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.1667f, 7f)
        verticalLineTo(3.85355f)
        curveTo(16.1667f, 3.65829f, 16.3316f, 3.5f, 16.535f, 3.5f)
        curveTo(16.6326f, 3.5f, 16.7263f, 3.53725f, 16.7954f, 3.60355f)
        lineTo(21.5275f, 8.14645f)
        curveTo(21.7634f, 8.37282f, 21.8958f, 8.67986f, 21.8958f, 9f)
        curveTo(21.8958f, 9.32014f, 21.7634f, 9.62718f, 21.5275f, 9.85355f)
        lineTo(16.7954f, 14.3964f)
        curveTo(16.7263f, 14.4628f, 16.6326f, 14.5f, 16.535f, 14.5f)
        curveTo(16.3316f, 14.5f, 16.1667f, 14.3417f, 16.1667f, 14.1464f)
        verticalLineTo(11f)
        horizontalLineTo(13.1157f)
        curveTo(8.875f, 11f, 7.3125f, 14.5f, 7.3125f, 14.5f)
        verticalLineTo(12f)
        curveTo(7.3125f, 9.23858f, 9.64435f, 7f, 12.5208f, 7f)
        horizontalLineTo(16.1667f)
        }
        }.build()

        return _share01!!
    }

private var _share01: ImageVector? = null
