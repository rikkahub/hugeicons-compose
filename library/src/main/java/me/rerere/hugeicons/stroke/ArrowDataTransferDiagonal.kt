package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDataTransferDiagonal: ImageVector
    get() {
        if (_arrowDataTransferDiagonal != null) {
            return _arrowDataTransferDiagonal!!
        }
        _arrowDataTransferDiagonal = ImageVector.Builder(
            name = "ArrowDataTransferDiagonal",
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
        moveTo(9f, 19f)
        lineTo(18.1795f, 9.9942f)
        curveTo(18.9276f, 9.26025f, 19.3016f, 8.89327f, 19.6243f, 9.02718f)
        curveTo(19.9469f, 9.16108f, 19.9526f, 9.68566f, 19.964f, 10.7348f)
        lineTo(20f, 14.0459f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5f)
        lineTo(5.82055f, 14.0058f)
        curveTo(5.07244f, 14.7398f, 4.69839f, 15.1067f, 4.37573f, 14.9728f)
        curveTo(4.05306f, 14.8389f, 4.04736f, 14.3143f, 4.03597f, 13.2652f)
        lineTo(4f, 9.95414f)
        }
        }.build()

        return _arrowDataTransferDiagonal!!
    }

private var _arrowDataTransferDiagonal: ImageVector? = null
