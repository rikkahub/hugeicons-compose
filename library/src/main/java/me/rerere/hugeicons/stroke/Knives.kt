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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        lineTo(18.6025f, 7.39117f)
        curveTo(19.3659f, 7.49623f, 20.1693f, 7.26445f, 20.7565f, 6.69585f)
        curveTo(21.7478f, 5.73599f, 21.7478f, 4.17975f, 20.7565f, 3.21989f)
        curveTo(19.7652f, 2.26004f, 18.158f, 2.26004f, 17.1667f, 3.21989f)
        lineTo(12.5f, 7.73864f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 12f)
        lineTo(18.9252f, 10.5448f)
        curveTo(19.7397f, 10.663f, 20.5968f, 10.4023f, 21.2233f, 9.76257f)
        curveTo(22.2376f, 8.72688f, 22.2345f, 7.0592f, 21.3538f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.1509f, 18.4629f)
        lineTo(16.1415f, 16.4928f)
        curveTo(17.3805f, 15.2666f, 18f, 14.6534f, 18f, 13.8916f)
        curveTo(18f, 13.1297f, 17.3805f, 12.5165f, 16.1415f, 11.2903f)
        lineTo(14.1703f, 9.33936f)
        curveTo(12.9313f, 8.11312f, 12.3118f, 7.5f, 11.542f, 7.5f)
        curveTo(10.7722f, 7.5f, 10.1527f, 8.11312f, 8.91368f, 9.33936f)
        lineTo(4.08868f, 14.1147f)
        curveTo(3.55152f, 14.6463f, 3.28294f, 14.9122f, 3.14147f, 15.2502f)
        curveTo(3f, 15.5882f, 3f, 15.9641f, 3f, 16.716f)
        verticalLineTo(17.821f)
        curveTo(3f, 19.5552f, 3f, 20.4222f, 3.54434f, 20.961f)
        curveTo(4.08867f, 21.4997f, 4.9648f, 21.4997f, 6.71698f, 21.4997f)
        lineTo(13.1887f, 21.5f)
        curveTo(14.9565f, 21.5f, 15.8403f, 21.5f, 16.3895f, 20.9622f)
        curveTo(16.9387f, 20.4244f, 16.9387f, 19.5589f, 16.9387f, 17.8277f)
        verticalLineTo(15.6928f)
        }
        }.build()

        return _knives!!
    }

private var _knives: ImageVector? = null
