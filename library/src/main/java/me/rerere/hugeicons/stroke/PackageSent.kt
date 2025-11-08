package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PackageSent: ImageVector
    get() {
        if (_packageSent != null) {
            return _packageSent!!
        }
        _packageSent = ImageVector.Builder(
            name = "PackageSent",
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
        moveTo(3f, 7.54234f)
        curveTo(3f, 8.15478f, 3.80157f, 8.54152f, 5.40472f, 9.315f)
        lineTo(8.32592f, 10.7244f)
        curveTo(10.1288f, 11.5943f, 11.0303f, 12.0292f, 12f, 12.0292f)
        moveTo(3f, 7.54234f)
        curveTo(3f, 6.9299f, 3.80157f, 6.54317f, 5.40472f, 5.76969f)
        lineTo(7f, 5f)
        moveTo(21f, 7.54234f)
        curveTo(21f, 8.15478f, 20.1984f, 8.54152f, 18.5953f, 9.315f)
        lineTo(15.6741f, 10.7244f)
        curveTo(13.8712f, 11.5943f, 12.9697f, 12.0292f, 12f, 12.0292f)
        moveTo(21f, 7.54234f)
        curveTo(21f, 6.9299f, 20.1984f, 6.54316f, 18.5953f, 5.76969f)
        lineTo(17.0446f, 5.02151f)
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
        moveTo(11.9963f, 9f)
        lineTo(11.9963f, 2.00005f)
        moveTo(11.9963f, 2.00005f)
        curveTo(11.7332f, 1.99649f, 11.4737f, 2.18028f, 11.2822f, 2.40466f)
        lineTo(10f, 3.93826f)
        moveTo(11.9963f, 2.00005f)
        curveTo(12.2501f, 2.00348f, 12.5071f, 2.18632f, 12.7103f, 2.40466f)
        lineTo(14f, 3.93826f)
        }
        }.build()

        return _packageSent!!
    }

private var _packageSent: ImageVector? = null
