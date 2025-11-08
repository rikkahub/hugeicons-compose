package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TestTube01: ImageVector
    get() {
        if (_testTube01 != null) {
            return _testTube01!!
        }
        _testTube01 = ImageVector.Builder(
            name = "TestTube01",
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
        moveTo(14.5405f, 2f)
        verticalLineTo(4.48622f)
        curveTo(14.5405f, 6.23417f, 14.5405f, 7.10814f, 14.7545f, 7.94715f)
        curveTo(14.9685f, 8.78616f, 15.3879f, 9.55654f, 16.2267f, 11.0973f)
        lineTo(17.3633f, 13.1852f)
        curveTo(19.5008f, 17.1115f, 20.5696f, 19.0747f, 19.6928f, 20.53f)
        lineTo(19.6792f, 20.5522f)
        curveTo(18.7896f, 22f, 16.5264f, 22f, 12f, 22f)
        curveTo(7.47357f, 22f, 5.21036f, 22f, 4.3208f, 20.5522f)
        lineTo(4.30725f, 20.53f)
        curveTo(3.43045f, 19.0747f, 4.49918f, 17.1115f, 6.63666f, 13.1852f)
        lineTo(7.7733f, 11.0973f)
        curveTo(8.61209f, 9.55654f, 9.03149f, 8.78616f, 9.24548f, 7.94715f)
        curveTo(9.45947f, 7.10814f, 9.45947f, 6.23417f, 9.45947f, 4.48622f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16.002f)
        lineTo(9.00868f, 15.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 18.002f)
        lineTo(15.0087f, 17.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 2f)
        lineTo(16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 11.5563f)
        curveTo(8.5f, 10.4029f, 10.0994f, 11.2343f, 12f, 12.3182f)
        curveTo(14.5f, 13.7439f, 16f, 12.65f, 16.5f, 11.6152f)
        }
        }.build()

        return _testTube01!!
    }

private var _testTube01: ImageVector? = null
