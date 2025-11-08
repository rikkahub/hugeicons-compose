package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hold01: ImageVector
    get() {
        if (_hold01 != null) {
            return _hold01!!
        }
        _hold01 = ImageVector.Builder(
            name = "Hold01",
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
        moveTo(14f, 5.5f)
        curveTo(14f, 4.67157f, 14.6716f, 4f, 15.5f, 4f)
        curveTo(16.3284f, 4f, 17f, 4.67157f, 17f, 5.5f)
        verticalLineTo(12f)
        moveTo(14f, 5.5f)
        verticalLineTo(3.5f)
        curveTo(14f, 2.67157f, 13.3284f, 2f, 12.5f, 2f)
        curveTo(11.6716f, 2f, 11f, 2.67157f, 11f, 3.5f)
        lineTo(11.0002f, 5f)
        moveTo(14f, 5.5f)
        verticalLineTo(11f)
        moveTo(11.0002f, 5f)
        curveTo(10.9999f, 4.17187f, 10.3284f, 3.50064f, 9.50021f, 3.50064f)
        curveTo(8.67178f, 3.50064f, 8.00021f, 4.17221f, 8.00021f, 5.00064f)
        lineTo(8f, 13.4624f)
        lineTo(6.3797f, 11.837f)
        curveTo(5.66877f, 11.1239f, 4.49772f, 11.1889f, 3.86965f, 11.9765f)
        curveTo(3.38907f, 12.5791f, 3.3758f, 13.4315f, 3.83738f, 14.0489f)
        lineTo(7.43707f, 18.6471f)
        curveTo(8.12579f, 19.5269f, 8.5f, 20.8829f, 8.5f, 22.0002f)
        moveTo(11.0002f, 5f)
        verticalLineTo(10f)
        moveTo(18f, 22.0002f)
        verticalLineTo(20.8356f)
        curveTo(18f, 20.3038f, 18.2148f, 19.7964f, 18.5652f, 19.3964f)
        curveTo(18.9703f, 18.9339f, 19.4769f, 18.2939f, 19.6689f, 17.792f)
        curveTo(20f, 16.9269f, 20f, 15.8402f, 20f, 13.6668f)
        lineTo(20.0004f, 12.1943f)
        lineTo(20f, 7.5f)
        curveTo(20f, 6.67157f, 19.3284f, 6f, 18.5f, 6f)
        curveTo(17.6716f, 6f, 17f, 6.67157f, 17f, 7.5f)
        }
        }.build()

        return _hold01!!
    }

private var _hold01: ImageVector? = null
