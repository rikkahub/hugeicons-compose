package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDataTransferVertical: ImageVector
    get() {
        if (_arrowDataTransferVertical != null) {
            return _arrowDataTransferVertical!!
        }
        _arrowDataTransferVertical = ImageVector.Builder(
            name = "ArrowDataTransferVertical",
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
        moveTo(15f, 19f)
        lineTo(15f, 6.65856f)
        curveTo(15f, 5.65277f, 15f, 5.14987f, 15.3087f, 5.02472f)
        curveTo(15.6173f, 4.89956f, 15.9806f, 5.25517f, 16.7071f, 5.96637f)
        lineTo(19f, 8.21091f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 5f)
        lineTo(9f, 17.3414f)
        curveTo(9f, 18.3472f, 9f, 18.8501f, 8.69134f, 18.9753f)
        curveTo(8.38268f, 19.1004f, 8.01942f, 18.7448f, 7.29289f, 18.0336f)
        lineTo(5f, 15.7891f)
        }
        }.build()

        return _arrowDataTransferVertical!!
    }

private var _arrowDataTransferVertical: ImageVector? = null
