package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse02: ImageVector
    get() {
        if (_mouse02 != null) {
            return _mouse02!!
        }
        _mouse02 = ImageVector.Builder(
            name = "Mouse02",
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
        lineTo(12f, 6f)
        moveTo(12f, 10f)
        lineTo(12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.74061f, 17.0888f)
        curveTo(4.93047f, 19.4803f, 6.82417f, 21.511f, 9.26502f, 21.8118f)
        curveTo(10.1626f, 21.9223f, 11.0752f, 22f, 12f, 22f)
        curveTo(12.9247f, 22f, 13.8373f, 21.9223f, 14.7349f, 21.8118f)
        curveTo(17.1758f, 21.511f, 19.0694f, 19.4803f, 19.2593f, 17.0888f)
        curveTo(19.3909f, 15.4317f, 19.5f, 13.732f, 19.5f, 12f)
        curveTo(19.5f, 10.268f, 19.3909f, 8.56832f, 19.2593f, 6.91118f)
        curveTo(19.0694f, 4.51965f, 17.1758f, 2.48893f, 14.7349f, 2.1882f)
        curveTo(13.8373f, 2.07762f, 12.9247f, 2f, 12f, 2f)
        curveTo(11.0752f, 2f, 10.1626f, 2.07762f, 9.26502f, 2.1882f)
        curveTo(6.82417f, 2.48893f, 4.93047f, 4.51965f, 4.74061f, 6.91118f)
        curveTo(4.60903f, 8.56832f, 4.5f, 10.268f, 4.5f, 12f)
        curveTo(4.5f, 13.732f, 4.60903f, 15.4317f, 4.74061f, 17.0888f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 7.5f)
        curveTo(10.5f, 7.03406f, 10.5f, 6.80109f, 10.5761f, 6.61732f)
        curveTo(10.6776f, 6.37229f, 10.8723f, 6.17761f, 11.1173f, 6.07612f)
        curveTo(11.3011f, 6f, 11.5341f, 6f, 12f, 6f)
        curveTo(12.4659f, 6f, 12.6989f, 6f, 12.8827f, 6.07612f)
        curveTo(13.1277f, 6.17761f, 13.3224f, 6.37229f, 13.4239f, 6.61732f)
        curveTo(13.5f, 6.80109f, 13.5f, 7.03406f, 13.5f, 7.5f)
        verticalLineTo(8.5f)
        curveTo(13.5f, 8.96594f, 13.5f, 9.19891f, 13.4239f, 9.38268f)
        curveTo(13.3224f, 9.62771f, 13.1277f, 9.82239f, 12.8827f, 9.92388f)
        curveTo(12.6989f, 10f, 12.4659f, 10f, 12f, 10f)
        curveTo(11.5341f, 10f, 11.3011f, 10f, 11.1173f, 9.92388f)
        curveTo(10.8723f, 9.82239f, 10.6776f, 9.62771f, 10.5761f, 9.38268f)
        curveTo(10.5f, 9.19891f, 10.5f, 8.96594f, 10.5f, 8.5f)
        verticalLineTo(7.5f)
        }
        }.build()

        return _mouse02!!
    }

private var _mouse02: ImageVector? = null
