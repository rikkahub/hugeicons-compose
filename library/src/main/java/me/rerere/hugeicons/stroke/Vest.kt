package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = ImageVector.Builder(
            name = "Vest",
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
        moveTo(4.51046f, 10.8307f)
        curveTo(6.9018f, 9.18607f, 7.10283f, 6.5528f, 6.37584f, 4.78313f)
        curveTo(6.07534f, 4.05166f, 5.92509f, 3.68592f, 6.00595f, 3.4945f)
        curveTo(6.29496f, 2.81042f, 8.36823f, 2.2903f, 9.00002f, 2f)
        lineTo(13.1722f, 11.7263f)
        curveTo(13.7687f, 13.1852f, 14.067f, 13.9147f, 13.9873f, 14.6637f)
        curveTo(13.9076f, 15.4127f, 13.4621f, 16.0664f, 12.571f, 17.3738f)
        lineTo(10.1303f, 20.9552f)
        curveTo(9.34647f, 22.1053f, 8.9197f, 22.2198f, 7.62956f, 21.715f)
        lineTo(5.30629f, 20.8059f)
        curveTo(4.23506f, 20.3867f, 4.00004f, 20.0761f, 4.00004f, 18.9185f)
        verticalLineTo(11.7372f)
        curveTo(4.00004f, 11.1831f, 3.98581f, 11.1916f, 4.51046f, 10.8307f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.009f, 14f)
        lineTo(11f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.99367f)
        lineTo(15f, 2f)
        curveTo(15.6318f, 2.2903f, 17.705f, 2.81042f, 17.994f, 3.4945f)
        curveTo(18.0749f, 3.68592f, 17.9247f, 4.05166f, 17.6242f, 4.78313f)
        curveTo(16.8972f, 6.5528f, 17.0982f, 9.18607f, 19.4895f, 10.8307f)
        curveTo(20.0142f, 11.1916f, 20f, 11.1831f, 20f, 11.7372f)
        verticalLineTo(18.9185f)
        curveTo(20f, 20.0761f, 19.7649f, 20.3867f, 18.6937f, 20.8059f)
        lineTo(16.3704f, 21.715f)
        curveTo(15.0803f, 22.2198f, 14.6535f, 22.1053f, 13.8697f, 20.9552f)
        lineTo(12f, 18.2117f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2f)
        lineTo(15f, 2f)
        }
        }.build()

        return _vest!!
    }

private var _vest: ImageVector? = null
