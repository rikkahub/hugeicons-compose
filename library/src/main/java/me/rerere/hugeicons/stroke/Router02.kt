package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Router02: ImageVector
    get() {
        if (_router02 != null) {
            return _router02!!
        }
        _router02 = ImageVector.Builder(
            name = "Router02",
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
        moveTo(18f, 22f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 22f, 3.17157f, 22f, 2.58579f, 21.4142f)
        curveTo(2f, 20.8284f, 2f, 19.8856f, 2f, 18f)
        curveTo(2f, 16.1144f, 2f, 15.1716f, 2.58579f, 14.5858f)
        curveTo(3.17157f, 14f, 4.11438f, 14f, 6f, 14f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 14f, 20.8284f, 14f, 21.4142f, 14.5858f)
        curveTo(22f, 15.1716f, 22f, 16.1144f, 22f, 18f)
        curveTo(22f, 19.8856f, 22f, 20.8284f, 21.4142f, 21.4142f)
        curveTo(20.8284f, 22f, 19.8856f, 22f, 18f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 14f)
        lineTo(9f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9908f, 18f)
        horizontalLineTo(13.9998f)
        moveTo(9.99533f, 18f)
        horizontalLineTo(10.0043f)
        moveTo(5.99982f, 18f)
        horizontalLineTo(6.00879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.47776f, 10f)
        curveTo(2.54314f, 8.85117f, 2f, 7.47913f, 2f, 6.00543f)
        curveTo(2f, 4.52709f, 2.54657f, 3.15104f, 3.48661f, 2f)
        moveTo(6f, 3.82574f)
        curveTo(5.59087f, 4.48184f, 5.36068f, 5.22209f, 5.36068f, 6.00543f)
        curveTo(5.36068f, 6.78484f, 5.58856f, 7.52159f, 5.99385f, 8.17523f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.99609f, 5.99683f)
        horizontalLineTo(9.00245f)
        }
        }.build()

        return _router02!!
    }

private var _router02: ImageVector? = null
