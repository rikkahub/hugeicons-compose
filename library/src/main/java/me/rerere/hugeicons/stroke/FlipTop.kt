package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipTop: ImageVector
    get() {
        if (_flipTop != null) {
            return _flipTop!!
        }
        _flipTop = ImageVector.Builder(
            name = "FlipTop",
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
        moveTo(9.66676f, 22f)
        lineTo(14.3334f, 22f)
        moveTo(3.01509f, 16.5f)
        curveTo(2.99793f, 16.0004f, 2.99705f, 15.5001f, 2.99855f, 15f)
        moveTo(20.9849f, 16.5f)
        curveTo(21.0021f, 16.0004f, 21.003f, 15.5001f, 21.0015f, 15f)
        moveTo(3.53709f, 19.2547f)
        curveTo(4.02122f, 20.213f, 4.80249f, 20.9914f, 5.76305f, 21.4718f)
        moveTo(18.1797f, 21.5f)
        curveTo(19.1665f, 21.0221f, 19.9692f, 20.232f, 20.4629f, 19.2547f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.50502f, 12f)
        curveTo(3.64422f, 12f, 3.00695f, 11.4596f, 3.00695f, 9.5f)
        curveTo(3.00695f, 6.96832f, 2.75702f, 4.04633f, 5.25521f, 2.60289f)
        curveTo(6.29863f, 2f, 7.69947f, 2f, 10.5012f, 2f)
        lineTo(13.4988f, 2f)
        curveTo(16.3005f, 2f, 17.7014f, 2f, 18.7448f, 2.60289f)
        curveTo(21.243f, 4.04633f, 20.9931f, 6.96832f, 20.9931f, 9.5f)
        curveTo(20.9931f, 11.3622f, 20.453f, 12f, 18.495f, 12f)
        lineTo(5.50502f, 12f)
        }
        }.build()

        return _flipTop!!
    }

private var _flipTop: ImageVector? = null
