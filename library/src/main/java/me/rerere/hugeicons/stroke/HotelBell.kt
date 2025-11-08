package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HotelBell: ImageVector
    get() {
        if (_hotelBell != null) {
            return _hotelBell!!
        }
        _hotelBell = ImageVector.Builder(
            name = "HotelBell",
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
        moveTo(2f, 20.5f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.05228f, 14.7749f)
        curveTo(3.51867f, 14.4791f, 3.99344f, 14.05f, 4.06165f, 13.502f)
        curveTo(4.55286f, 9.55471f, 7.9197f, 6.5f, 12f, 6.5f)
        curveTo(16.0803f, 6.5f, 19.4471f, 9.55471f, 19.9384f, 13.502f)
        curveTo(20.0066f, 14.05f, 20.4813f, 14.4791f, 20.9477f, 14.7749f)
        curveTo(21.3611f, 15.0371f, 21.6612f, 15.4673f, 21.7466f, 15.9796f)
        lineTo(22f, 17f)
        horizontalLineTo(2f)
        lineTo(2.2534f, 15.9796f)
        curveTo(2.33878f, 15.4673f, 2.63889f, 15.0371f, 3.05228f, 14.7749f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6.5f)
        verticalLineTo(3.5f)
        moveTo(12f, 3.5f)
        horizontalLineTo(9.5f)
        moveTo(12f, 3.5f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5.5f)
        lineTo(18.5f, 6.5f)
        moveTo(21.5f, 8f)
        lineTo(20.5009f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5.5f)
        lineTo(5.5f, 6.5f)
        moveTo(3.49913f, 8.5f)
        lineTo(2.5f, 8f)
        }
        }.build()

        return _hotelBell!!
    }

private var _hotelBell: ImageVector? = null
