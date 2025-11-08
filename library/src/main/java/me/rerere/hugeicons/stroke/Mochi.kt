package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mochi: ImageVector
    get() {
        if (_mochi != null) {
            return _mochi!!
        }
        _mochi = ImageVector.Builder(
            name = "Mochi",
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
        moveTo(19f, 21f)
        curveTo(20.7514f, 20.3192f, 22f, 19.0219f, 22f, 16.7771f)
        curveTo(22f, 13.0188f, 18.5f, 9f, 15f, 9f)
        curveTo(11.5f, 9f, 8f, 13.0188f, 8f, 16.7771f)
        curveTo(8f, 19.0219f, 9.24858f, 20.3192f, 11f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9.00935f)
        curveTo(15.4708f, 5.45852f, 12.2544f, 2f, 9.03788f, 2f)
        curveTo(5.51894f, 2f, 2f, 6.13953f, 2f, 10.0107f)
        curveTo(2f, 13.61f, 5.04202f, 14.8444f, 8.29768f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 5f)
        lineTo(6.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 5f)
        lineTo(11.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(17f, 12f, 19f, 14.226f, 19f, 16.3077f)
        curveTo(19f, 17.5561f, 18.1523f, 18.2754f, 17.0951f, 18.6513f)
        curveTo(16.6449f, 18.8113f, 16.3021f, 19.2104f, 16.3021f, 19.6882f)
        verticalLineTo(20.718f)
        curveTo(16.3021f, 21.426f, 15.7281f, 22f, 15.0201f, 22f)
        curveTo(14.312f, 22f, 13.7381f, 21.426f, 13.7381f, 20.718f)
        verticalLineTo(19.6882f)
        curveTo(13.7381f, 19.2104f, 13.3955f, 18.8109f, 12.9447f, 18.6526f)
        curveTo(11.8758f, 18.2771f, 11f, 17.5575f, 11f, 16.3077f)
        curveTo(11f, 14.226f, 13f, 12f, 15f, 12f)
        }
        }.build()

        return _mochi!!
    }

private var _mochi: ImageVector? = null
