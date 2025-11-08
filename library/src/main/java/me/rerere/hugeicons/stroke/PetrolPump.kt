package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PetrolPump: ImageVector
    get() {
        if (_petrolPump != null) {
            return _petrolPump!!
        }
        _petrolPump = ImageVector.Builder(
            name = "PetrolPump",
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
        moveTo(3.5f, 21.5f)
        verticalLineTo(8.5f)
        curveTo(3.5f, 5.67157f, 3.5f, 4.25736f, 4.37868f, 3.37868f)
        curveTo(5.25736f, 2.5f, 6.67157f, 2.5f, 9.5f, 2.5f)
        curveTo(12.3284f, 2.5f, 13.7426f, 2.5f, 14.6213f, 3.37868f)
        curveTo(15.5f, 4.25736f, 15.5f, 5.67157f, 15.5f, 8.5f)
        lineTo(15.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 10.5f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 21.5f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 14.5f)
        horizontalLineTo(16.5f)
        curveTo(17.6046f, 14.5f, 18.5f, 15.3954f, 18.5f, 16.5f)
        verticalLineTo(17f)
        curveTo(18.5f, 17.8284f, 19.1716f, 18.5f, 20f, 18.5f)
        curveTo(20.8284f, 18.5f, 21.5f, 17.8284f, 21.5f, 17f)
        verticalLineTo(11.5f)
        moveTo(20.5f, 7.5f)
        lineTo(20.9142f, 7.91421f)
        curveTo(21.2893f, 8.28929f, 21.5f, 8.79799f, 21.5f, 9.32843f)
        verticalLineTo(11.5f)
        moveTo(20.5f, 7.5f)
        lineTo(18.5f, 5.5f)
        moveTo(20.5f, 7.5f)
        verticalLineTo(9.67157f)
        curveTo(20.5f, 10.202f, 20.7107f, 10.7107f, 21.0858f, 11.0858f)
        lineTo(21.5f, 11.5f)
        }
        }.build()

        return _petrolPump!!
    }

private var _petrolPump: ImageVector? = null
