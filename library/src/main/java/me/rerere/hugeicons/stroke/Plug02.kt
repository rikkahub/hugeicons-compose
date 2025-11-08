package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plug02: ImageVector
    get() {
        if (_plug02 != null) {
            return _plug02!!
        }
        _plug02 = ImageVector.Builder(
            name = "Plug02",
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
        moveTo(14f, 8f)
        verticalLineTo(11f)
        moveTo(10f, 11f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00297f, 12.0267f)
        curveTo(7.95812f, 11.4726f, 8.42638f, 11f, 9.02009f, 11f)
        horizontalLineTo(14.9799f)
        curveTo(15.5736f, 11f, 16.0419f, 11.4726f, 15.997f, 12.0267f)
        lineTo(15.8745f, 13.5403f)
        curveTo(15.7864f, 14.6285f, 15.4008f, 15.6771f, 14.7546f, 16.5856f)
        lineTo(14.3541f, 17.1487f)
        curveTo(13.9759f, 17.6805f, 13.3385f, 18f, 12.6558f, 18f)
        horizontalLineTo(11.3442f)
        curveTo(10.6615f, 18f, 10.0241f, 17.6805f, 9.64588f, 17.1487f)
        lineTo(9.24535f, 16.5856f)
        curveTo(8.59923f, 15.6771f, 8.2136f, 14.6285f, 8.12551f, 13.5403f)
        lineTo(8.00297f, 12.0267f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21.2109f)
        curveTo(19.5318f, 19.6644f, 22f, 16.1323f, 22f, 12.0224f)
        curveTo(22f, 6.4872f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.4872f, 2f, 12.0224f)
        curveTo(2f, 17.2199f, 5.94741f, 21.4933f, 11.0014f, 21.9955f)
        curveTo(11.551f, 22.0501f, 12f, 21.5962f, 12f, 21.0426f)
        verticalLineTo(18.0359f)
        }
        }.build()

        return _plug02!!
    }

private var _plug02: ImageVector? = null
