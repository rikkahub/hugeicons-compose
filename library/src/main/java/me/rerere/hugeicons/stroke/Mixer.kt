package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mixer: ImageVector
    get() {
        if (_mixer != null) {
            return _mixer!!
        }
        _mixer = ImageVector.Builder(
            name = "Mixer",
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
        moveTo(6f, 8.5f)
        horizontalLineTo(4.75f)
        curveTo(3.57721f, 8.5f, 2.99082f, 8.5f, 2.58686f, 8.19003f)
        curveTo(2.48286f, 8.11023f, 2.38977f, 8.01714f, 2.30997f, 7.91314f)
        curveTo(2f, 7.50918f, 2f, 6.92279f, 2f, 5.75f)
        curveTo(2f, 4.57721f, 2f, 3.99082f, 2.30997f, 3.58686f)
        curveTo(2.38977f, 3.48286f, 2.48286f, 3.38977f, 2.58686f, 3.30997f)
        curveTo(2.99082f, 3f, 3.57721f, 3f, 4.75f, 3f)
        horizontalLineTo(17f)
        curveTo(18.4142f, 3f, 19.1213f, 3f, 19.5607f, 3.43934f)
        curveTo(20f, 3.87868f, 20f, 4.58579f, 20f, 6f)
        verticalLineTo(8.37217f)
        curveTo(20f, 9.42821f, 20f, 9.95623f, 19.746f, 10.3352f)
        curveTo(19.6371f, 10.4976f, 19.4976f, 10.6371f, 19.3352f, 10.746f)
        curveTo(18.9562f, 11f, 18.4282f, 11f, 17.3722f, 11f)
        horizontalLineTo(16.7951f)
        curveTo(16.3714f, 11f, 16.1596f, 11f, 15.9688f, 10.9625f)
        curveTo(15.4366f, 10.8581f, 14.9696f, 10.5419f, 14.675f, 10.0865f)
        curveTo(14.5693f, 9.92331f, 14.4907f, 9.72663f, 14.3333f, 9.33333f)
        curveTo(14.2547f, 9.13667f, 14.2153f, 9.03835f, 14.1625f, 8.95673f)
        curveTo(14.0152f, 8.72904f, 13.7817f, 8.57096f, 13.5156f, 8.51873f)
        curveTo(13.4202f, 8.5f, 13.3143f, 8.5f, 13.1025f, 8.5f)
        horizontalLineTo(12f)
        curveTo(11.0572f, 8.5f, 10.5858f, 8.5f, 10.2929f, 8.79289f)
        curveTo(10f, 9.08579f, 10f, 9.55719f, 10f, 10.5f)
        verticalLineTo(17f)
        curveTo(10f, 19.2091f, 11.7909f, 21f, 14f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 8.5f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.9813f, 15f)
        horizontalLineTo(15.0187f)
        curveTo(13.7463f, 15f, 14.0261f, 16.6634f, 14.0261f, 17.5f)
        curveTo(14.0261f, 19.433f, 15.5814f, 21f, 17.5f, 21f)
        curveTo(19.4186f, 21f, 20.9739f, 19.433f, 20.9739f, 17.5f)
        curveTo(20.9739f, 16.6634f, 21.2537f, 15f, 19.9813f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 11f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.008f, 6f)
        lineTo(16.999f, 6f)
        }
        }.build()

        return _mixer!!
    }

private var _mixer: ImageVector? = null
