package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cards02: ImageVector
    get() {
        if (_cards02 != null) {
            return _cards02!!
        }
        _cards02 = ImageVector.Builder(
            name = "Cards02",
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
        moveTo(3f, 11f)
        curveTo(3f, 8.17157f, 3f, 6.75736f, 3.87868f, 5.87868f)
        curveTo(4.75736f, 5f, 6.17157f, 5f, 9f, 5f)
        horizontalLineTo(11f)
        curveTo(13.8284f, 5f, 15.2426f, 5f, 16.1213f, 5.87868f)
        curveTo(17f, 6.75736f, 17f, 8.17157f, 17f, 11f)
        verticalLineTo(16f)
        curveTo(17f, 18.8284f, 17f, 20.2426f, 16.1213f, 21.1213f)
        curveTo(15.2426f, 22f, 13.8284f, 22f, 11f, 22f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 22f, 4.75736f, 22f, 3.87868f, 21.1213f)
        curveTo(3f, 20.2426f, 3f, 18.8284f, 3f, 16f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9244f, 19f)
        curveTo(18.0202f, 18.3874f, 18.3929f, 17.0406f, 19.1383f, 14.3469f)
        lineTo(20.1925f, 10.5375f)
        curveTo(20.938f, 7.84378f, 21.3107f, 6.49694f, 20.678f, 5.4359f)
        curveTo(20.0453f, 4.37485f, 18.6543f, 4.01397f, 15.8724f, 3.2922f)
        lineTo(13.9052f, 2.78183f)
        curveTo(11.1232f, 2.06006f, 9.73225f, 1.69918f, 8.63642f, 2.31177f)
        curveTo(7.85623f, 2.74792f, 7.44258f, 3.55626f, 7f, 4.95786f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.76123f, 11.2762f)
        curveTo(8.56573f, 10.8192f, 9.26789f, 11.0034f, 9.68969f, 11.2967f)
        curveTo(9.86265f, 11.4169f, 9.94912f, 11.4771f, 10f, 11.4771f)
        curveTo(10.0509f, 11.4771f, 10.1374f, 11.4169f, 10.3103f, 11.2967f)
        curveTo(10.7321f, 11.0034f, 11.4343f, 10.8192f, 12.2388f, 11.2762f)
        curveTo(13.2946f, 11.8758f, 13.5335f, 13.8541f, 11.0981f, 15.5232f)
        curveTo(10.6343f, 15.8411f, 10.4024f, 16f, 10f, 16f)
        curveTo(9.59764f, 16f, 9.36572f, 15.8411f, 8.90186f, 15.5232f)
        curveTo(6.46652f, 13.8541f, 6.70542f, 11.8758f, 7.76123f, 11.2762f)
        }
        }.build()

        return _cards02!!
    }

private var _cards02: ImageVector? = null
