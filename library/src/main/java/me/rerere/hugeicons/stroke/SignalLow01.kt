package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SignalLow01: ImageVector
    get() {
        if (_signalLow01 != null) {
            return _signalLow01!!
        }
        _signalLow01 = ImageVector.Builder(
            name = "SignalLow01",
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
        moveTo(6f, 10f)
        lineTo(6f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.80844f, 9.28111f)
        curveTo(6.43534f, 9.76037f, 6.2488f, 10f, 6f, 10f)
        curveTo(5.7512f, 10f, 5.56466f, 9.76037f, 5.19156f, 9.28112f)
        lineTo(4.44578f, 8.32312f)
        curveTo(3.37255f, 6.94451f, 2.83594f, 6.25521f, 3.04429f, 5.68812f)
        curveTo(3.06552f, 5.63034f, 3.0916f, 5.57458f, 3.12224f, 5.52145f)
        curveTo(3.423f, 5f, 4.282f, 5f, 6f, 5f)
        curveTo(7.718f, 5f, 8.577f, 5f, 8.87776f, 5.52145f)
        curveTo(8.9084f, 5.57458f, 8.93448f, 5.63034f, 8.95571f, 5.68812f)
        curveTo(9.16406f, 6.25521f, 8.62745f, 6.94451f, 7.55422f, 8.32312f)
        lineTo(6.80844f, 9.28111f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 13f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        lineTo(14f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 19f)
        lineTo(18f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 19f)
        lineTo(22f, 19f)
        }
        }.build()

        return _signalLow01!!
    }

private var _signalLow01: ImageVector? = null
