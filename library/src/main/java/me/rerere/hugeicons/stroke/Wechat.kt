package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wechat: ImageVector
    get() {
        if (_wechat != null) {
            return _wechat!!
        }
        _wechat = ImageVector.Builder(
            name = "Wechat",
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
        moveTo(7f, 7f)
        horizontalLineTo(7.00897f)
        moveTo(12.991f, 7f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.991f, 14.5f)
        horizontalLineTo(18f)
        moveTo(14f, 14.5f)
        horizontalLineTo(14.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        curveTo(10f, 18.7614f, 12.6863f, 21f, 16f, 21f)
        curveTo(16.9072f, 21f, 17.7673f, 20.8322f, 18.5382f, 20.5319f)
        curveTo(18.7266f, 20.4585f, 18.9312f, 20.4321f, 19.13f, 20.4689f)
        lineTo(22f, 21f)
        lineTo(21.3483f, 18.9702f)
        curveTo(21.2531f, 18.6738f, 21.3075f, 18.3533f, 21.4575f, 18.0805f)
        curveTo(21.8058f, 17.447f, 22f, 16.7424f, 22f, 16f)
        curveTo(22f, 13.2386f, 19.3137f, 11f, 16f, 11f)
        curveTo(12.6863f, 11f, 10f, 13.2386f, 10f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.8731f, 11.2485f)
        curveTo(17.9565f, 10.8434f, 18f, 10.4261f, 18f, 10f)
        curveTo(18f, 6.13401f, 14.4183f, 3f, 10f, 3f)
        curveTo(5.58172f, 3f, 2f, 6.13401f, 2f, 10f)
        curveTo(2f, 11.1124f, 2.29653f, 12.1641f, 2.8242f, 13.0981f)
        curveTo(2.97102f, 13.358f, 3.01971f, 13.6653f, 2.93243f, 13.9507f)
        lineTo(2f, 17f)
        lineTo(5.91414f, 16.2394f)
        curveTo(6.12183f, 16.199f, 6.33621f, 16.2273f, 6.53119f, 16.3094f)
        curveTo(7.61561f, 16.7662f, 8.84138f, 17.0157f, 10.1198f, 16.9992f)
        }
        }.build()

        return _wechat!!
    }

private var _wechat: ImageVector? = null
