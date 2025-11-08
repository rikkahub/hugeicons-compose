package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDataTransferHorizontal: ImageVector
    get() {
        if (_arrowDataTransferHorizontal != null) {
            return _arrowDataTransferHorizontal!!
        }
        _arrowDataTransferHorizontal = ImageVector.Builder(
            name = "ArrowDataTransferHorizontal",
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
        moveTo(19f, 9f)
        horizontalLineTo(6.65856f)
        curveTo(5.65277f, 9f, 5.14987f, 9f, 5.02472f, 8.69134f)
        curveTo(4.89957f, 8.38268f, 5.25517f, 8.01942f, 5.96637f, 7.29289f)
        lineTo(8.21091f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        horizontalLineTo(17.3414f)
        curveTo(18.3472f, 15f, 18.8501f, 15f, 18.9753f, 15.3087f)
        curveTo(19.1004f, 15.6173f, 18.7448f, 15.9806f, 18.0336f, 16.7071f)
        lineTo(15.7891f, 19f)
        }
        }.build()

        return _arrowDataTransferHorizontal!!
    }

private var _arrowDataTransferHorizontal: ImageVector? = null
