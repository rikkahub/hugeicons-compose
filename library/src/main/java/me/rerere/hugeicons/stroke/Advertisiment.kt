package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Advertisiment: ImageVector
    get() {
        if (_advertisiment != null) {
            return _advertisiment!!
        }
        _advertisiment = ImageVector.Builder(
            name = "Advertisiment",
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
        moveTo(5.50586f, 16.9916f)
        lineTo(8.03146f, 10.0288f)
        curveTo(8.49073f, 9.06222f, 9.19305f, 8.26286f, 9.99777f, 10.18f)
        curveTo(10.7406f, 11.9497f, 11.8489f, 15.1903f, 12.5031f, 16.9954f)
        moveTo(6.65339f, 14.002f)
        horizontalLineTo(11.3215f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.46447f, 5.31802f)
        curveTo(2f, 6.63604f, 2f, 8.75736f, 2f, 13f)
        curveTo(2f, 17.2426f, 2f, 19.364f, 3.46447f, 20.682f)
        curveTo(4.92893f, 22f, 7.28596f, 22f, 12f, 22f)
        curveTo(16.714f, 22f, 19.0711f, 22f, 20.5355f, 20.682f)
        curveTo(22f, 19.364f, 22f, 17.2426f, 22f, 13f)
        curveTo(22f, 8.75736f, 22f, 6.63604f, 20.5355f, 5.31802f)
        curveTo(19.0711f, 4f, 16.714f, 4f, 12f, 4f)
        curveTo(7.28596f, 4f, 4.92893f, 4f, 3.46447f, 5.31802f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4843f, 9.98682f)
        verticalLineTo(12.9815f)
        moveTo(18.4843f, 12.9815f)
        verticalLineTo(16.9252f)
        moveTo(18.4843f, 12.9815f)
        horizontalLineTo(16.466f)
        curveTo(16.2263f, 12.9815f, 15.9885f, 13.0261f, 15.7645f, 13.113f)
        curveTo(14.0707f, 13.7702f, 14.0707f, 16.2124f, 15.7645f, 16.8696f)
        curveTo(15.9885f, 16.9565f, 16.2263f, 17.0011f, 16.466f, 17.0011f)
        horizontalLineTo(18.4843f)
        }
        }.build()

        return _advertisiment!!
    }

private var _advertisiment: ImageVector? = null
