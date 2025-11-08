package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDataTransferVertical: ImageVector
    get() {
        if (_circleArrowDataTransferVertical != null) {
            return _circleArrowDataTransferVertical!!
        }
        _circleArrowDataTransferVertical = ImageVector.Builder(
            name = "CircleArrowDataTransferVertical",
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
        moveTo(10.2857f, 7.5f)
        lineTo(10.2857f, 15.4338f)
        curveTo(10.2857f, 16.0804f, 10.2857f, 16.4037f, 10.1093f, 16.4841f)
        curveTo(9.93296f, 16.5646f, 9.72538f, 16.336f, 9.31022f, 15.8788f)
        lineTo(8f, 14.4358f)
        moveTo(13.7143f, 16.5f)
        lineTo(13.7143f, 8.56622f)
        curveTo(13.7143f, 7.91964f, 13.7143f, 7.59635f, 13.8907f, 7.51589f)
        curveTo(14.067f, 7.43543f, 14.2746f, 7.66404f, 14.6898f, 8.12124f)
        lineTo(16f, 9.56415f)
        }
        }.build()

        return _circleArrowDataTransferVertical!!
    }

private var _circleArrowDataTransferVertical: ImageVector? = null
