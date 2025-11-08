package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SelfTransfer: ImageVector
    get() {
        if (_selfTransfer != null) {
            return _selfTransfer!!
        }
        _selfTransfer = ImageVector.Builder(
            name = "SelfTransfer",
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
        moveTo(9f, 14.998f)
        lineTo(5f, 21.498f)
        moveTo(7.87727f, 16.5656f)
        lineTo(6.40433f, 15.6455f)
        curveTo(5.94859f, 15.3608f, 5.3499f, 15.5008f, 5.06561f, 15.9586f)
        lineTo(3.64806f, 18.2413f)
        curveTo(3.3688f, 18.691f, 3.49579f, 19.2827f, 3.93458f, 19.5763f)
        lineTo(5.50721f, 20.6285f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0001f, 12.998f)
        lineTo(11.6709f, 9.65641f)
        curveTo(12.1791f, 8.64006f, 13.2179f, 7.99805f, 14.3542f, 7.99805f)
        horizontalLineTo(14.8946f)
        curveTo(15.8976f, 7.99805f, 16.8343f, 8.49935f, 17.3907f, 9.33395f)
        lineTo(18.5001f, 10.998f)
        lineTo(20.5001f, 12.498f)
        moveTo(16.0001f, 8.49805f)
        verticalLineTo(13.867f)
        curveTo(16.0001f, 13.954f, 16.0115f, 14.0406f, 16.0339f, 14.1247f)
        lineTo(18.0001f, 21.498f)
        lineTo(13.504f, 14.7538f)
        curveTo(13.1754f, 14.261f, 13.0001f, 13.682f, 13.0001f, 13.0897f)
        verticalLineTo(8.49805f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 16.9531f)
        lineTo(12f, 21.5f)
        lineTo(15.5f, 17.4994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 5.49805f)
        curveTo(15.3284f, 5.49805f, 16f, 4.82647f, 16f, 3.99805f)
        curveTo(16f, 3.16962f, 15.3284f, 2.49805f, 14.5f, 2.49805f)
        curveTo(13.6716f, 2.49805f, 13f, 3.16962f, 13f, 3.99805f)
        curveTo(13f, 4.82647f, 13.6716f, 5.49805f, 14.5f, 5.49805f)
        }
        }.build()

        return _selfTransfer!!
    }

private var _selfTransfer: ImageVector? = null
