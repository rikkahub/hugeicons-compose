package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Knives: ImageVector
    get() {
        if (_knives != null) {
            return _knives!!
        }
        _knives = ImageVector.Builder(
            name = "Knives",
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
        moveTo(15.5f, 10f)
        lineTo(18.1025f, 7.39117f)
        curveTo(18.8659f, 7.49623f, 19.6693f, 7.26445f, 20.2565f, 6.69585f)
        curveTo(21.2478f, 5.73599f, 21.2478f, 4.17975f, 20.2565f, 3.21989f)
        curveTo(19.2652f, 2.26004f, 17.658f, 2.26004f, 16.6667f, 3.21989f)
        lineTo(12f, 7.73864f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        lineTo(18.4252f, 10.5448f)
        curveTo(19.2397f, 10.663f, 20.0968f, 10.4023f, 20.7233f, 9.76257f)
        curveTo(21.7376f, 8.72688f, 21.7345f, 7.0592f, 20.8538f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6509f, 18.4629f)
        lineTo(15.6415f, 16.4928f)
        curveTo(16.8805f, 15.2666f, 17.5f, 14.6534f, 17.5f, 13.8916f)
        curveTo(17.5f, 13.1297f, 16.8805f, 12.5165f, 15.6415f, 11.2903f)
        lineTo(13.6703f, 9.33936f)
        curveTo(12.4313f, 8.11312f, 11.8118f, 7.5f, 11.042f, 7.5f)
        curveTo(10.2722f, 7.5f, 9.65267f, 8.11312f, 8.41368f, 9.33936f)
        lineTo(3.58868f, 14.1147f)
        curveTo(3.05152f, 14.6463f, 2.78294f, 14.9122f, 2.64147f, 15.2502f)
        curveTo(2.5f, 15.5882f, 2.5f, 15.9641f, 2.5f, 16.716f)
        verticalLineTo(17.821f)
        curveTo(2.5f, 19.5552f, 2.5f, 20.4222f, 3.04434f, 20.961f)
        curveTo(3.58867f, 21.4997f, 4.4648f, 21.4997f, 6.21698f, 21.4997f)
        lineTo(12.6887f, 21.5f)
        curveTo(14.4565f, 21.5f, 15.3403f, 21.5f, 15.8895f, 20.9622f)
        curveTo(16.4387f, 20.4244f, 16.4387f, 19.5589f, 16.4387f, 17.8277f)
        verticalLineTo(15.6928f)
        }
        }.build()

        return _knives!!
    }

private var _knives: ImageVector? = null
