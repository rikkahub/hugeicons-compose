package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SignalFull01: ImageVector
    get() {
        if (_signalFull01 != null) {
            return _signalFull01!!
        }
        _signalFull01 = ImageVector.Builder(
            name = "SignalFull01",
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
        moveTo(5f, 10f)
        lineTo(5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.80844f, 9.28111f)
        curveTo(5.43534f, 9.76037f, 5.2488f, 10f, 5f, 10f)
        curveTo(4.7512f, 10f, 4.56466f, 9.76037f, 4.19156f, 9.28112f)
        lineTo(3.44578f, 8.32312f)
        curveTo(2.37255f, 6.94451f, 1.83594f, 6.25521f, 2.04429f, 5.68812f)
        curveTo(2.06552f, 5.63034f, 2.0916f, 5.57458f, 2.12224f, 5.52145f)
        curveTo(2.423f, 5f, 3.282f, 5f, 5f, 5f)
        curveTo(6.718f, 5f, 7.577f, 5f, 7.87776f, 5.52145f)
        curveTo(7.9084f, 5.57458f, 7.93448f, 5.63034f, 7.95571f, 5.68812f)
        curveTo(8.16406f, 6.25521f, 7.62745f, 6.94451f, 6.55422f, 8.32312f)
        lineTo(5.80844f, 9.28111f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 14f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 11f)
        lineTo(13f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10f)
        lineTo(17f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 7f)
        lineTo(21f, 19f)
        }
        }.build()

        return _signalFull01!!
    }

private var _signalFull01: ImageVector? = null
