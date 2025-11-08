package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Medal01: ImageVector
    get() {
        if (_medal01 != null) {
            return _medal01!!
        }
        _medal01 = ImageVector.Builder(
            name = "Medal01",
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
        moveTo(8.5f, 2f)
        verticalLineTo(10.5f)
        moveTo(15.5f, 2f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9162f, 2.01166f)
        horizontalLineTo(6.0838f)
        curveTo(5.17286f, 2.01166f, 3.96696f, 1.85424f, 3.34398f, 2.69602f)
        curveTo(3f, 3.1608f, 3f, 3.83334f, 3f, 5.17844f)
        curveTo(3f, 6.32524f, 3f, 6.89864f, 3.23194f, 7.38174f)
        curveTo(3.62807f, 8.20684f, 4.51377f, 8.56526f, 5.27291f, 8.95504f)
        lineTo(8.98131f, 10.8591f)
        curveTo(10.4626f, 11.6197f, 11.2033f, 12f, 12f, 12f)
        curveTo(12.7967f, 12f, 13.5374f, 11.6197f, 15.0187f, 10.8591f)
        lineTo(18.7271f, 8.95504f)
        curveTo(19.4862f, 8.56526f, 20.3719f, 8.20684f, 20.7681f, 7.38174f)
        curveTo(21f, 6.89864f, 21f, 6.32524f, 21f, 5.17844f)
        curveTo(21f, 3.83334f, 21f, 3.1608f, 20.656f, 2.69602f)
        curveTo(20.033f, 1.85424f, 18.8271f, 2.01166f, 17.9162f, 2.01166f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5292f, 13.6376f)
        curveTo(11.2478f, 13.2125f, 11.6071f, 13f, 12f, 13f)
        curveTo(12.3929f, 13f, 12.7522f, 13.2125f, 13.4708f, 13.6376f)
        lineTo(14.4708f, 14.2292f)
        curveTo(15.2167f, 14.6704f, 15.5896f, 14.891f, 15.7948f, 15.26f)
        curveTo(16f, 15.6289f, 16f, 16.0789f, 16f, 16.979f)
        verticalLineTo(18.021f)
        curveTo(16f, 18.9211f, 16f, 19.3711f, 15.7948f, 19.74f)
        curveTo(15.5896f, 20.109f, 15.2167f, 20.3296f, 14.4708f, 20.7708f)
        lineTo(13.4708f, 21.3624f)
        curveTo(12.7522f, 21.7875f, 12.3929f, 22f, 12f, 22f)
        curveTo(11.6071f, 22f, 11.2478f, 21.7875f, 10.5292f, 21.3624f)
        lineTo(9.52922f, 20.7708f)
        curveTo(8.78332f, 20.3296f, 8.41037f, 20.109f, 8.20519f, 19.74f)
        curveTo(8f, 19.3711f, 8f, 18.9211f, 8f, 18.021f)
        verticalLineTo(16.979f)
        curveTo(8f, 16.0789f, 8f, 15.6289f, 8.20519f, 15.26f)
        curveTo(8.41037f, 14.891f, 8.78332f, 14.6704f, 9.52922f, 14.2292f)
        lineTo(10.5292f, 13.6376f)
        }
        }.build()

        return _medal01!!
    }

private var _medal01: ImageVector? = null
