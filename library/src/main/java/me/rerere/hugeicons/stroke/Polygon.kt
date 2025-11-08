package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = ImageVector.Builder(
            name = "Polygon",
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
        moveTo(2f, 14.0147f)
        verticalLineTo(9.98528f)
        curveTo(2f, 8.75903f, 2f, 8.1459f, 2.22836f, 7.59459f)
        curveTo(2.45672f, 7.04328f, 2.89027f, 6.60973f, 3.75736f, 5.74264f)
        lineTo(5.74264f, 3.75736f)
        curveTo(6.60973f, 2.89027f, 7.04328f, 2.45672f, 7.59459f, 2.22836f)
        curveTo(8.1459f, 2f, 8.75903f, 2f, 9.98528f, 2f)
        horizontalLineTo(14.0147f)
        curveTo(15.241f, 2f, 15.8541f, 2f, 16.4054f, 2.22836f)
        curveTo(16.9567f, 2.45672f, 17.3903f, 2.89027f, 18.2574f, 3.75736f)
        lineTo(20.2426f, 5.74264f)
        curveTo(21.1097f, 6.60973f, 21.5433f, 7.04328f, 21.7716f, 7.59459f)
        curveTo(22f, 8.1459f, 22f, 8.75903f, 22f, 9.98528f)
        verticalLineTo(14.0147f)
        curveTo(22f, 15.241f, 22f, 15.8541f, 21.7716f, 16.4054f)
        curveTo(21.5433f, 16.9567f, 21.1097f, 17.3903f, 20.2426f, 18.2574f)
        lineTo(18.2574f, 20.2426f)
        curveTo(17.3903f, 21.1097f, 16.9567f, 21.5433f, 16.4054f, 21.7716f)
        curveTo(15.8541f, 22f, 15.241f, 22f, 14.0147f, 22f)
        horizontalLineTo(9.98528f)
        curveTo(8.75903f, 22f, 8.1459f, 22f, 7.59459f, 21.7716f)
        curveTo(7.04328f, 21.5433f, 6.60973f, 21.1097f, 5.74264f, 20.2426f)
        lineTo(3.75736f, 18.2574f)
        curveTo(2.89027f, 17.3903f, 2.45672f, 16.9567f, 2.22836f, 16.4054f)
        curveTo(2f, 15.8541f, 2f, 15.241f, 2f, 14.0147f)
        }
        }.build()

        return _polygon!!
    }

private var _polygon: ImageVector? = null
