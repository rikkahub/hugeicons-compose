package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SeatSelector: ImageVector
    get() {
        if (_seatSelector != null) {
            return _seatSelector!!
        }
        _seatSelector = ImageVector.Builder(
            name = "SeatSelector",
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
        moveTo(7f, 18f)
        verticalLineTo(11.5f)
        curveTo(7f, 10.6716f, 6.32843f, 10f, 5.5f, 10f)
        curveTo(4.67157f, 10f, 4f, 10.6716f, 4f, 11.5f)
        verticalLineTo(16f)
        curveTo(4f, 17.1046f, 4.89543f, 18f, 6f, 18f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 16f)
        verticalLineTo(11.5f)
        curveTo(20f, 10.6716f, 19.3284f, 10f, 18.5f, 10f)
        curveTo(17.6716f, 10f, 17f, 10.6716f, 17f, 11.5f)
        verticalLineTo(18f)
        horizontalLineTo(18f)
        curveTo(19.1046f, 18f, 20f, 17.1046f, 20f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        horizontalLineTo(7f)
        verticalLineTo(18f)
        horizontalLineTo(17f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 22f)
        horizontalLineTo(9.5f)
        verticalLineTo(18f)
        horizontalLineTo(14.5f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 10f)
        verticalLineTo(8f)
        curveTo(18.5f, 5.17157f, 18.5f, 3.75736f, 17.6213f, 2.87868f)
        curveTo(16.7426f, 2f, 15.3284f, 2f, 12.5f, 2f)
        horizontalLineTo(11.5f)
        curveTo(8.67157f, 2f, 7.25736f, 2f, 6.37868f, 2.87868f)
        curveTo(5.5f, 3.75736f, 5.5f, 5.17157f, 5.5f, 8f)
        verticalLineTo(10f)
        }
        }.build()

        return _seatSelector!!
    }

private var _seatSelector: ImageVector? = null
