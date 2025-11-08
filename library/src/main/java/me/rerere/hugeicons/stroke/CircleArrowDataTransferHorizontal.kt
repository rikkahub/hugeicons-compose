package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowDataTransferHorizontal: ImageVector
    get() {
        if (_circleArrowDataTransferHorizontal != null) {
            return _circleArrowDataTransferHorizontal!!
        }
        _circleArrowDataTransferHorizontal = ImageVector.Builder(
            name = "CircleArrowDataTransferHorizontal",
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
        moveTo(16.5f, 10.2857f)
        horizontalLineTo(8.56622f)
        curveTo(7.91964f, 10.2857f, 7.59635f, 10.2857f, 7.51589f, 10.1093f)
        curveTo(7.43543f, 9.93296f, 7.66404f, 9.72538f, 8.12124f, 9.31022f)
        lineTo(9.56415f, 8f)
        moveTo(7.5f, 13.7143f)
        horizontalLineTo(15.4338f)
        curveTo(16.0804f, 13.7143f, 16.4037f, 13.7143f, 16.4841f, 13.8907f)
        curveTo(16.5646f, 14.067f, 16.336f, 14.2746f, 15.8788f, 14.6898f)
        lineTo(14.4358f, 16f)
        }
        }.build()

        return _circleArrowDataTransferHorizontal!!
    }

private var _circleArrowDataTransferHorizontal: ImageVector? = null
