package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Copy01: ImageVector
    get() {
        if (_copy01 != null) {
            return _copy01!!
        }
        _copy01 = ImageVector.Builder(
            name = "Copy01",
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
        moveTo(9f, 15f)
        curveTo(9f, 12.1716f, 9f, 10.7574f, 9.87868f, 9.87868f)
        curveTo(10.7574f, 9f, 12.1716f, 9f, 15f, 9f)
        lineTo(16f, 9f)
        curveTo(18.8284f, 9f, 20.2426f, 9f, 21.1213f, 9.87868f)
        curveTo(22f, 10.7574f, 22f, 12.1716f, 22f, 15f)
        verticalLineTo(16f)
        curveTo(22f, 18.8284f, 22f, 20.2426f, 21.1213f, 21.1213f)
        curveTo(20.2426f, 22f, 18.8284f, 22f, 16f, 22f)
        horizontalLineTo(15f)
        curveTo(12.1716f, 22f, 10.7574f, 22f, 9.87868f, 21.1213f)
        curveTo(9f, 20.2426f, 9f, 18.8284f, 9f, 16f)
        lineTo(9f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9999f, 9f)
        curveTo(16.9975f, 6.04291f, 16.9528f, 4.51121f, 16.092f, 3.46243f)
        curveTo(15.9258f, 3.25989f, 15.7401f, 3.07418f, 15.5376f, 2.90796f)
        curveTo(14.4312f, 2f, 12.7875f, 2f, 9.5f, 2f)
        curveTo(6.21252f, 2f, 4.56878f, 2f, 3.46243f, 2.90796f)
        curveTo(3.25989f, 3.07417f, 3.07418f, 3.25989f, 2.90796f, 3.46243f)
        curveTo(2f, 4.56878f, 2f, 6.21252f, 2f, 9.5f)
        curveTo(2f, 12.7875f, 2f, 14.4312f, 2.90796f, 15.5376f)
        curveTo(3.07417f, 15.7401f, 3.25989f, 15.9258f, 3.46243f, 16.092f)
        curveTo(4.51121f, 16.9528f, 6.04291f, 16.9975f, 9f, 16.9999f)
        }
        }.build()

        return _copy01!!
    }

private var _copy01: ImageVector? = null
