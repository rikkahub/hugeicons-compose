package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlimSlate: ImageVector
    get() {
        if (_flimSlate != null) {
            return _flimSlate!!
        }
        _flimSlate = ImageVector.Builder(
            name = "FlimSlate",
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
        moveTo(3.5f, 10.5f)
        horizontalLineTo(17.9118f)
        curveTo(19.3676f, 10.5f, 20.0955f, 10.5f, 20.5477f, 10.9393f)
        curveTo(21f, 11.3787f, 21f, 12.0858f, 21f, 13.5f)
        verticalLineTo(15f)
        curveTo(21f, 18.2998f, 21f, 19.9497f, 19.9447f, 20.9749f)
        curveTo(18.8894f, 22f, 17.191f, 22f, 13.7941f, 22f)
        horizontalLineTo(10.7059f)
        curveTo(7.309f, 22f, 5.61055f, 22f, 4.55528f, 20.9749f)
        curveTo(3.5f, 19.9497f, 3.5f, 18.2998f, 3.5f, 15f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.49827f, 10.5f)
        curveTo(3.14118f, 9.14207f, 2.96264f, 8.46311f, 3.00654f, 7.86611f)
        curveTo(3.08518f, 6.79682f, 3.63742f, 5.82221f, 4.50691f, 5.21816f)
        curveTo(4.99236f, 4.88092f, 5.6587f, 4.69899f, 6.99138f, 4.33514f)
        lineTo(14.7321f, 2.22172f)
        curveTo(15.0767f, 2.12763f, 15.2491f, 2.08058f, 15.3977f, 2.05386f)
        curveTo(17.0504f, 1.75694f, 18.6737f, 2.71192f, 19.2477f, 4.31874f)
        curveTo(19.2993f, 4.4633f, 19.3455f, 4.63888f, 19.4378f, 4.99006f)
        curveTo(19.4642f, 5.09039f, 19.4774f, 5.14056f, 19.4849f, 5.18385f)
        curveTo(19.5682f, 5.66498f, 19.3004f, 6.13757f, 18.8498f, 6.30467f)
        curveTo(18.8093f, 6.3197f, 18.7601f, 6.33314f, 18.6616f, 6.36003f)
        lineTo(3.49827f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10f)
        lineTo(9f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 8f)
        lineTo(16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18f)
        horizontalLineTo(11f)
        }
        }.build()

        return _flimSlate!!
    }

private var _flimSlate: ImageVector? = null
