package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = ImageVector.Builder(
            name = "Church",
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
        moveTo(12f, 2f)
        verticalLineTo(6f)
        moveTo(14f, 4f)
        lineTo(10f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.50122f, 8.79902f)
        lineTo(12f, 6f)
        lineTo(15.4988f, 8.79902f)
        curveTo(16.7171f, 9.77367f, 17f, 10.3623f, 17f, 11.9225f)
        verticalLineTo(22f)
        horizontalLineTo(7f)
        verticalLineTo(11.9225f)
        curveTo(7f, 10.3623f, 7.28291f, 9.77367f, 8.50122f, 8.79902f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        lineTo(18.7889f, 12.8944f)
        curveTo(19.8647f, 13.4323f, 20.4026f, 13.7013f, 20.7013f, 14.1846f)
        curveTo(21f, 14.6679f, 21f, 15.2693f, 21f, 16.4721f)
        verticalLineTo(20f)
        curveTo(21f, 20.9428f, 21f, 21.4142f, 20.7071f, 21.7071f)
        curveTo(20.4142f, 22f, 19.9428f, 22f, 19f, 22f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        lineTo(5.21114f, 12.8944f)
        curveTo(4.13531f, 13.4323f, 3.5974f, 13.7013f, 3.2987f, 14.1846f)
        curveTo(3f, 14.6679f, 3f, 15.2693f, 3f, 16.4721f)
        verticalLineTo(20f)
        curveTo(3f, 20.9428f, 3f, 21.4142f, 3.29289f, 21.7071f)
        curveTo(3.58579f, 22f, 4.05719f, 22f, 5f, 22f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22f)
        verticalLineTo(18f)
        curveTo(10f, 16.8954f, 10.8954f, 16f, 12f, 16f)
        curveTo(13.1046f, 16f, 14f, 16.8954f, 14f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.008f, 11f)
        lineTo(11.999f, 11f)
        }
        }.build()

        return _church!!
    }

private var _church: ImageVector? = null
