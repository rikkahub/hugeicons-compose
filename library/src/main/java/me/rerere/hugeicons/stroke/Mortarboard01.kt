package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mortarboard01: ImageVector
    get() {
        if (_mortarboard01 != null) {
            return _mortarboard01!!
        }
        _mortarboard01 = ImageVector.Builder(
            name = "Mortarboard01",
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
        moveTo(1.99805f, 7.99928f)
        curveTo(1.99805f, 9.34126f, 10.0943f, 13f, 11.9857f, 13f)
        curveTo(13.8772f, 13f, 21.9734f, 9.34126f, 21.9734f, 7.99928f)
        curveTo(21.9734f, 6.6573f, 13.8772f, 2.99854f, 11.9857f, 2.99854f)
        curveTo(10.0943f, 2.99854f, 1.99805f, 6.6573f, 1.99805f, 7.99928f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.99219f, 11f)
        lineTo(7.24348f, 16.8002f)
        curveTo(7.32919f, 17.1975f, 7.52703f, 17.5687f, 7.85696f, 17.8054f)
        curveTo(10.0787f, 19.3998f, 13.8908f, 19.3998f, 16.1126f, 17.8054f)
        curveTo(16.4426f, 17.5687f, 16.6404f, 17.1975f, 16.7261f, 16.8002f)
        lineTo(17.9774f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.4774f, 9.49951f)
        verticalLineTo(16.5006f)
        moveTo(20.4774f, 16.5006f)
        curveTo(19.6864f, 17.9471f, 19.3366f, 18.7221f, 18.9813f, 20.0011f)
        curveTo(18.9042f, 20.4562f, 18.9654f, 20.6855f, 19.2786f, 20.8891f)
        curveTo(19.4059f, 20.9718f, 19.5588f, 21.0012f, 19.7104f, 21.0012f)
        horizontalLineTo(21.229f)
        curveTo(21.3904f, 21.0012f, 21.5533f, 20.9675f, 21.6863f, 20.8757f)
        curveTo(21.9774f, 20.6747f, 22.0523f, 20.4541f, 21.9734f, 20.0011f)
        curveTo(21.662f, 18.8135f, 21.2653f, 18.0016f, 20.4774f, 16.5006f)
        }
        }.build()

        return _mortarboard01!!
    }

private var _mortarboard01: ImageVector? = null
