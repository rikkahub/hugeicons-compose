package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BoxingBag: ImageVector
    get() {
        if (_boxingBag != null) {
            return _boxingBag!!
        }
        _boxingBag = ImageVector.Builder(
            name = "BoxingBag",
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
        moveTo(18f, 17.5f)
        curveTo(14f, 18.8333f, 10f, 18.8333f, 6f, 17.5f)
        moveTo(18f, 10.5f)
        curveTo(14f, 9.16667f, 10f, 9.16667f, 6f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6.5f)
        lineTo(13.4948f, 3.68167f)
        curveTo(12.7977f, 2.89736f, 12.4491f, 2.5052f, 12f, 2.5052f)
        curveTo(11.5509f, 2.5052f, 11.2023f, 2.89736f, 10.5052f, 3.68167f)
        lineTo(8f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 2f)
        lineTo(6f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.1114f, 21.7682f)
        curveTo(11.0371f, 22.0773f, 12.9629f, 22.0773f, 14.8886f, 21.7682f)
        curveTo(17.517f, 21.3464f, 18f, 20.4678f, 18f, 18.2919f)
        verticalLineTo(9.70813f)
        curveTo(18f, 7.53225f, 17.517f, 6.65357f, 14.8886f, 6.23178f)
        curveTo(12.9629f, 5.92274f, 11.0371f, 5.92274f, 9.1114f, 6.23178f)
        curveTo(6.48303f, 6.65357f, 6f, 7.53225f, 6f, 9.70813f)
        verticalLineTo(18.2919f)
        curveTo(6f, 20.4678f, 6.48303f, 21.3464f, 9.1114f, 21.7682f)
        }
        }.build()

        return _boxingBag!!
    }

private var _boxingBag: ImageVector? = null
