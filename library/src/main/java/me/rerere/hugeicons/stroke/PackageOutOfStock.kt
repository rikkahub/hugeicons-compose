package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageOutOfStock: ImageVector
    get() {
        if (_packageOutOfStock != null) {
            return _packageOutOfStock!!
        }
        _packageOutOfStock = ImageVector.Builder(
            name = "PackageOutOfStock",
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
        moveTo(12f, 22f)
        curveTo(11.1818f, 22f, 10.4002f, 21.6708f, 8.83693f, 21.0123f)
        curveTo(4.94564f, 19.3734f, 3f, 18.5539f, 3f, 17.1754f)
        verticalLineTo(7.54234f)
        moveTo(12f, 22f)
        curveTo(12.8182f, 22f, 13.5998f, 21.6708f, 15.1631f, 21.0123f)
        curveTo(19.0544f, 19.3734f, 21f, 18.5539f, 21f, 17.1754f)
        verticalLineTo(7.54234f)
        moveTo(12f, 22f)
        verticalLineTo(12.0292f)
        moveTo(21f, 7.54234f)
        curveTo(21f, 8.15478f, 20.1984f, 8.54152f, 18.5953f, 9.315f)
        lineTo(15.6741f, 10.7244f)
        curveTo(13.8712f, 11.5943f, 12.9697f, 12.0292f, 12f, 12.0292f)
        moveTo(21f, 7.54234f)
        curveTo(21f, 6.9299f, 20.1984f, 6.54316f, 18.5953f, 5.76969f)
        lineTo(17f, 5f)
        moveTo(3f, 7.54234f)
        curveTo(3f, 8.15478f, 3.80157f, 8.54152f, 5.40472f, 9.315f)
        lineTo(8.32592f, 10.7244f)
        curveTo(10.1288f, 11.5943f, 11.0303f, 12.0292f, 12f, 12.0292f)
        moveTo(3f, 7.54234f)
        curveTo(3f, 6.9299f, 3.80157f, 6.54317f, 5.40472f, 5.76969f)
        lineTo(7f, 5f)
        moveTo(6f, 13.0263f)
        lineTo(8f, 14.0234f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        lineTo(12f, 4f)
        moveTo(12f, 4f)
        lineTo(14f, 6f)
        moveTo(12f, 4f)
        lineTo(10f, 6f)
        moveTo(12f, 4f)
        lineTo(14f, 2f)
        }
        }.build()

        return _packageOutOfStock!!
    }

private var _packageOutOfStock: ImageVector? = null
