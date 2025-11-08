package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EntranceStairs: ImageVector
    get() {
        if (_entranceStairs != null) {
            return _entranceStairs!!
        }
        _entranceStairs = ImageVector.Builder(
            name = "EntranceStairs",
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
        moveTo(4f, 10f)
        curveTo(4f, 5.58172f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 5.58172f, 20f, 10f)
        verticalLineTo(18.6667f)
        curveTo(20f, 19.9128f, 20f, 20.5359f, 19.7321f, 21f)
        curveTo(19.5565f, 21.304f, 19.304f, 21.5565f, 19f, 21.732f)
        curveTo(18.5359f, 22f, 17.9128f, 22f, 16.6667f, 22f)
        horizontalLineTo(7.33333f)
        curveTo(6.08718f, 22f, 5.4641f, 22f, 5f, 21.732f)
        curveTo(4.69596f, 21.5565f, 4.44349f, 21.304f, 4.26795f, 21f)
        curveTo(4f, 20.5359f, 4f, 19.9128f, 4f, 18.6667f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18f)
        horizontalLineTo(9f)
        curveTo(8.05719f, 18f, 7.58579f, 18f, 7.29289f, 18.2929f)
        curveTo(7f, 18.5858f, 7f, 19.0572f, 7f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        horizontalLineTo(13f)
        curveTo(12.0572f, 14f, 11.5858f, 14f, 11.2929f, 14.2929f)
        curveTo(11f, 14.5858f, 11f, 15.0572f, 11f, 16f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 10f)
        horizontalLineTo(17f)
        curveTo(16.0572f, 10f, 15.5858f, 10f, 15.2929f, 10.2929f)
        curveTo(15f, 10.5858f, 15f, 11.0572f, 15f, 12f)
        verticalLineTo(14f)
        }
        }.build()

        return _entranceStairs!!
    }

private var _entranceStairs: ImageVector? = null
